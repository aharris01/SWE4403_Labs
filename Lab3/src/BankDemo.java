public class BankDemo {
    public static void main(String[] args){
        Logger withdrawals = Logger.getLogger("TransactionLog");
        Logger deposits = Logger.getLogger("TransactionLog");
        Logger transfers = Logger.getLogger("TransactionLog");

        withdrawals.write("Account 002 withdraws 100$");
        deposits.write("Account 002 deposits 450$");
        withdrawals.write("Account 001 withdraws 1$");
        transfers.write("Account 002 sends 100$ to Account 003");

        System.out.println("Log history: \n" + withdrawals);
    }
}
