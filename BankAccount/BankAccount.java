/**
 A bank account has a balance that can be changed by
 deposits and withdrawals.
 */
public class BankAccount
{

    private int monthOfYear; //a number between 1 and 12
    private int LastMonthUsed; //stores the month the bank account was last accessed in
    private final int maxFeeless = 3;
    private int TUTM;

    private final double fee = 2.50f;
    private double balance;

    /**
     Constructs a bank account with a zero balance.
     */
    public BankAccount()
    {
        balance = 0;
        TUTM = 0;
    }

    /**
     Constructs a bank account with a given balance.
     @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    /**
     Deposits money into the bank account.
     @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance += amount;
        if (TUTM == maxFeeless && monthOfYear == LastMonthUsed)
        {
            balance -= fee;
        }
        LastMonthUsed = monthOfYear;
        TUTM++;
    }

    /**
     Withdraws money from the bank account.
     @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
        if (TUTM > maxFeeless && monthOfYear == LastMonthUsed) {
            balance -= fee;
        }
        LastMonthUsed = monthOfYear;
        TUTM++;
    }

    /**
     Gets the current balance of the bank account.
     @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
    public void setMonthOfYear(int m)
    {
        monthOfYear = m;
    }
    public void addMonth(int m)
    {
        monthOfYear += m;
        TUTM = 0;
    }
}
