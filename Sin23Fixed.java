
//this is a call to show that at some point in the code, the handshake was completed
public void handshakeCompleted(HandShakeCompletedEvent event);

//this calls the program to check the certificates to ensure validity. 
event.getPeerCertificates();


private static getPeerCertificates(){
    try {
        ((X509Extension)(certificates[0])).checkValidity();
    }catch (CertificateExpiredException e1){
        //validation failed
    }catch (CertificateNotYetValidException e2){
        //validation failed
    }
}