public class ChatClient {
    private Strategy encryptionAlgorithm;
   
    public ChatClient(Strategy strategy){
        this.encryptionAlgorithm = strategy;
    }

    public void send(String message){
        encryptionAlgorithm.encrypt(message);
        System.out.println("Sending encrypted message...");
    }

    public void setEncryption(Strategy strategy){
        this.encryptionAlgorithm = strategy;
    }
}
