public class BankDemo {
    public static void main(String[] args){
        Account acc1 = new Account(100);
        Account acc2 = new Account(101);
        Account acc3 = new Account(102);

        acc1.deposit(10000);

        acc2.withdraw(200);

        acc3.deposit(5000);
        acc3.transfer(500, acc2);

        acc2.withdraw(500);

        acc1.withdraw(5000);

        Logger logger = acc1.getLogger();

        System.out.println("Transactions of the day");
        System.out.print(logger);
    }
}