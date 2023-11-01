public class Cheque extends Account
{
    private int OverdraftLimit;
    public Cheque()
    {
        this("12345679",-500,-10000);
    }

    public Cheque(String no,int bal,int lim)
    {
        super(no,bal);
        setOverdraftLimit(lim);
    }

    public void setOverdraftLimit(int lim)
    {
        OverdraftLimit = lim;
    }

    public int getOverdraftLimit()
    {
        return OverdraftLimit;
    }

    public int calculateInterest(int rate)
    {
        if (getBalance()<getOverdraftLimit())
            return getBalance() * 4 * rate /100;
        else if (getBalance() < 0 && getBalance() >=getOverdraftLimit())
            return getBalance() * 2 * rate /100;
        else if (getBalance()>=0)
            return getBalance() * rate / 100;
        return 0;
    }

    public String toString()
    {
        return "Cheque{" +
                " Account no = " + getAccNo() +
                " Balance = " + getBalance() +
                " Overdraft Limit = " + getOverdraftLimit() +
                '}';
    }
}
