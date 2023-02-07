public class TransferLogger{
    private Logger log;
    public TransferLogger(String bankFile){
        log = Logger.getInstance(bankFile);
    }

    public void transfer(int accountSender,int accountReceiver, int amount){
        log.write("Account " + accountSender + " sent " + amount + "$ to account " + accountReceiver);
    }
}