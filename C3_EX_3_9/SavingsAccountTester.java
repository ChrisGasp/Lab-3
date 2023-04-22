package C3_EX_3_9;
public class SavingsAccountTester {

    public static void main (String[] args)
    {
        float balance = 1000;
        float interestRate = 0.1f;

        SavingsAccount Account = new SavingsAccount(balance, interestRate);
        Account.addInterest();

        System.out.println("Account balance after interest: ");
        System.out.println("Expected " + (balance + (balance * interestRate)));
        System.out.println("Balance: " + Account.getBalance());
    }

}
