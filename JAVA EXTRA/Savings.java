public class Savings extends Account
{
    private int minBalance;

    public Savings()
    {
        this("12345679",500,450);
    }

    public Savings(String no,int bal,int minBal)
    {
        super(no,bal);
        setMinBalance(minBal);
    }

    public void setMinBalance(int minBal)
    {
        this.minBalance = minBal;
    }

    public int getMinBalance()
    {
        return minBalance;
    }

    public int calculateInterest(int rate)
    {
        if (getBalance()<getMinBalance())
            return 0;
        return (getBalance() * rate/100);
    }

    public String toString()
    {
        return "Savings{" +
                " Account no = " + getAccNo() +
                " Balance = " + getBalance() +
                " minBalance = " + getMinBalance() +
                '}';
    }
}
