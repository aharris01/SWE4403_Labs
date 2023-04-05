public class Exercuse1Demo {
    public static void main(String[] args){
        ChatClient client = new ChatClient(new AES());
        client.send("Hello World");

        System.out.println();
        
        client.setEncryption(new DES());
        client.send("Goodbye World");
    }
}
