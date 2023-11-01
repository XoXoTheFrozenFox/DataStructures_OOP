public abstract class Account implements InterestPayable
{
    private String accNo;
    private int balance;

    public Account()
    {
        this("12345679",500);
    }
    public Account(String accNo,int balance)
    {
        setAccNo(accNo);
        setBalance(balance);
    }

    public void setAccNo(String no)
    {
        if (no.length() == 8)
        {
            accNo = no;
        }
        else
            throw new InvalidNumberException("Length of number is invalid:. Length = " + no.length());
    }

    public String getAccNo()
    {
        return accNo;
    }

    public void setBalance(int bal)
    {
        this.balance = bal;
    }

    public int getBalance()
    {
        return balance;
    }

    public String toString() {
        return  "accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
