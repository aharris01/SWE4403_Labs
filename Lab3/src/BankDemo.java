public class BankDemo {
    public static void main(String[] args){
        Logger withdrawals = Logger.getLogger("TransactionLog");
        Logger deposits = Logger.getLogger("TransactionLog");
        Logger transfers = Logger.getLogger("TransactionLog");

        withdrawals.write("Account 002 withdraws 100$");
        deposits.write("Account 002 deposits 450$");
        withdrawals.write("Account 001 withdraws 1$");
        transfers.write("Account 002 sends 100$ to Account 003");

        System.out.print("Is the withdrawal file the same as the deposits file: ");
        System.out.println(withdrawals == deposits);

        System.out.print("Is the withdrawal file the same as the transfers file: ");
        System.out.println(withdrawals == transfers);

        System.out.print("Is the deposit file the same as the transfers file: ");
        System.out.println(deposits == transfers);

        System.out.println("Withdrawal file: " + withdrawals);
        System.out.println("Deposits file: " + deposits);
        System.out.println("Transfer file: " + transfers);
    }
}
