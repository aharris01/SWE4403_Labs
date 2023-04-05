public class AES implements Strategy{
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}
