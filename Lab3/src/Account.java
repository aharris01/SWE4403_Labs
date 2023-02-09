public class Account{
    private final static String fileName = "BankLog.txt";
    private final int accountNo;
    private Logger logger;

    public Account(int accountNo){
        this.accountNo = accountNo;
        logger = Logger.getLogger(fileName);
    }

    public void withdraw(int amount){
        logger.write("Account: " + accountNo + " withdrew " + amount);
    }

    public void deposit(int amount){
        logger.write("Account: " + accountNo + " deposited " + amount);
    }

    public void transfer(int amount, Account receiver){
        logger.write("Account: " + accountNo + " sent " + amount + " to Account: " + receiver.accountNo);
    }

    public Logger getLogger(){
        return logger;
    }
}
