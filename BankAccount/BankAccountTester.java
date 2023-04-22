public class BankAccountTester {
    public static void main (String[] args)
    {
        int month = 0;
        BankAccount Account = new BankAccount(100);
        Account.setMonthOfYear(month);

        Account.deposit(100);
        Account.deposit(100);
        Account.deposit(100);


        System.out.println("Balance after 3 deposits of 100 dollars this month: " + Account.getBalance());


        Account.addMonth(1);
        Account.deposit(100);
        Account.deposit(100);
        Account.deposit(100);
        Account.deposit(100);
        Account.withdraw(50);
        System.out.println("Balance after 4 deposits of 100 dollars, and a withdrawal of 50 dollars this month: " + Account.getBalance());
    }
}
