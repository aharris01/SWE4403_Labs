public class DepositLogger{
    private Logger log;
    public DepositLogger(String bankFile){
        log = Logger.getInstance(bankFile);
    }

    public void deposit(int accountNumber, int amount){
        log.write("Account " + accountNumber + " deposited " + amount + "$");
    }
}