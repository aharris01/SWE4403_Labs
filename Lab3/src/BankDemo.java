public class BankDemo {
    public static void main(String[] args){
        String bankFile = "src\\BankLog.txt";
        WithdrawalLogger withdraws = new WithdrawalLogger(bankFile);
        DepositLogger deposits = new DepositLogger(bankFile);
        TransferLogger transfers = new TransferLogger(bankFile);

        withdraws.withdraw(001, 100);
        deposits.deposit(002, 250);
        withdraws.withdraw(002, 5);

        transfers.transfer(002, 001, 50);
        transfers.transfer(003, 002, 1000);
    }
}
