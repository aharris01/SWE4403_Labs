public class WithdrawalLogger{
    private Logger log;
    public WithdrawalLogger(String bankFile){
        log = Logger.getInstance(bankFile);
    }

    public void withdraw(int accountNumber, int amount){
        log.write("Account " + accountNumber + " withdrew " + amount + "$");
    }
}
