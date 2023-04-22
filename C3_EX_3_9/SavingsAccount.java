package C3_EX_3_9;
public class SavingsAccount {
    public float balance;
    public float interest;

    public SavingsAccount(float b, float i)
    {
        balance = b;
        interest = i;
    }
    public void addInterest()
    {
        balance += (balance * interest);
    }
    public float getBalance()
    {
        return balance;
    }
}
