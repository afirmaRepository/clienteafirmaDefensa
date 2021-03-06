package es.gob.afirma.standalone.chain.verify;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
 

 
public class CertChainValidator {

	private static final String JKS_FILE = "src/test/resources/chain/PSSDEF_Autofirma.jks";
	private static final String CERT_FILE = "src/test/resources/chain/firmaMMarPrueba170118.cer";

	/**
     * Validate keychain
     * @param client is the client X509Certificate
     * @param keyStore containing all trusted certificate
     * @return true if validation until root certificate success, false otherwise
     * @throws KeyStoreException
     * @throws CertificateException
     * @throws InvalidAlgorithmParameterException
     * @throws NoSuchAlgorithmException
     * @throws NoSuchProviderException
     */
    public static boolean validateKeyChain(X509Certificate client,
            KeyStore keyStore) throws KeyStoreException, CertificateException,
            InvalidAlgorithmParameterException, NoSuchAlgorithmException,
            NoSuchProviderException {
        X509Certificate[] certs = new X509Certificate[keyStore.size()];
        int i = 0;
        Enumeration<String> alias = keyStore.aliases();
 
        while (alias.hasMoreElements()) {
            certs[i++] = (X509Certificate) keyStore.getCertificate(alias
                    .nextElement());
        }
 
        return validateKeyChain(client, certs);
    }
 
    /**
     * Validate keychain
     * @param client is the client X509Certificate
     * @param trustedCerts is Array containing all trusted X509Certificate
     * @return true if validation until root certificate success, false otherwise
     * @throws CertificateException
     * @throws InvalidAlgorithmParameterException
     * @throws NoSuchAlgorithmException
     * @throws NoSuchProviderException
     */
    public static boolean validateKeyChain(X509Certificate client,
            X509Certificate... trustedCerts) throws CertificateException,
            InvalidAlgorithmParameterException, NoSuchAlgorithmException,
            NoSuchProviderException {
        boolean found = false;
        int i = trustedCerts.length;
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        TrustAnchor anchor;
        Set anchors;
        CertPath path;
        List list;
        PKIXParameters params;
        CertPathValidator validator = CertPathValidator.getInstance("PKIX");
 
        while (!found && i > 0) {
            anchor = new TrustAnchor(trustedCerts[--i], null);
            anchors = Collections.singleton(anchor);
 
            list = Arrays.asList(new Certificate[] { client });
            path = cf.generateCertPath(list);
 
            params = new PKIXParameters(anchors);
            params.setRevocationEnabled(false);
 
            if (client.getIssuerDN().equals(trustedCerts[i].getSubjectDN())) {
                try {
                    validator.validate(path, params);
                    if (isSelfSigned(trustedCerts[i])) {
                        // found root ca
                        found = true;
                        System.out.println("validating root" + trustedCerts[i].getSubjectX500Principal().getName());
                    } else if (!client.equals(trustedCerts[i])) {
                        // find parent ca
                        System.out.println("validating via:" + trustedCerts[i].getSubjectX500Principal().getName());
                        found = validateKeyChain(trustedCerts[i], trustedCerts);
                    }
                } catch (CertPathValidatorException e) {
                    // validation fail, check next certifiacet in the trustedCerts array
                }
            }
        }
 
        return found;
    }
 
    /**
     *
     * @param cert is X509Certificate that will be tested
     * @return true if cert is self signed, false otherwise
     * @throws CertificateException
     * @throws NoSuchAlgorithmException
     * @throws NoSuchProviderException
     */
    public static boolean isSelfSigned(X509Certificate cert)
            throws CertificateException, NoSuchAlgorithmException,
            NoSuchProviderException {
        try {
            PublicKey key = cert.getPublicKey();
 
            cert.verify(key);
            return true;
        } catch (SignatureException sigEx) {
            return false;
        } catch (InvalidKeyException keyEx) {
            return false;
        }
    }
 
    public static void main(String... args) throws KeyStoreException,
            NoSuchAlgorithmException, CertificateException, IOException,
            InvalidAlgorithmParameterException, NoSuchProviderException {
        String storename = "keystore.jks";
        char[] storepass = "Autofirma".toCharArray();
 
        KeyStore ks = KeyStore.getInstance("JKS");
        FileInputStream fin = null;
        FileInputStream finCertSource = null;
    	finCertSource = new FileInputStream(CERT_FILE);
        X509Certificate validCer = recuperaCertificado (finCertSource);
        try {
            //fin = new FileInputStream(storename);
        	fin = new FileInputStream(JKS_FILE);
            ks.load(fin, storepass);
//            if (validateKeyChain(
//                    (X509Certificate) ks.getCertificate("clientint21int2"), ks)) {
            if (validateKeyChain(validCer, ks)) {            
                System.out.println("validate success");
            } else {
                System.out.println("validate fail");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
//        } finally {
//            IOUtils.closeQuietly(fin);
        }
 
    }
    
	private static X509Certificate recuperaCertificado(FileInputStream file){
		try {
			return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(file);
		} catch (CertificateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
		
	}    
 
}