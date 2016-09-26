package testVerifier;


import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Certificate[][] allSignersCerts = null;
        //String path = new String("d:/temp/sig/sig23.apk");
        //String path = new String("d:/temp/sig/sig2.apk");
        String path = new String("d:\\luna\\testVerifier\\apk\\app\\talkback\\talkback.apk");
        try {
        allSignersCerts = ApkSignatureSchemeV2Verifier.verify(path);
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}

}

/*

java.lang.SecurityException: Failed to parse/verify signer #1 block
	at testVerifier.ApkSignatureSchemeV2Verifier.verify(ApkSignatureSchemeV2Verifier.java:252)
	at testVerifier.ApkSignatureSchemeV2Verifier.verify(ApkSignatureSchemeV2Verifier.java:126)
	at testVerifier.ApkSignatureSchemeV2Verifier.verify(ApkSignatureSchemeV2Verifier.java:110)
	at testVerifier.Main.main(Main.java:14)
Caused by: java.lang.SecurityException: SHA256withRSA signature did not verify
	at testVerifier.ApkSignatureSchemeV2Verifier.verifySigner(ApkSignatureSchemeV2Verifier.java:391)
	at testVerifier.ApkSignatureSchemeV2Verifier.verify(ApkSignatureSchemeV2Verifier.java:248)
	... 3 more


*/