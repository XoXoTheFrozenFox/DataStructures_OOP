public class TestAccounts
{
    public static void main(String[] args)
    {
        try
        {
            Account accS1 = new Savings("12345678", 500, 450);
            Account accC1 = new Cheque("12345674", -500, -10000);
            System.out.println("accS1 = " + accS1);
            System.out.println("The interest for " + accS1.getAccNo() + " is: " + accS1.calculateInterest(10));

            System.out.println("accC1 = " + accC1);
            System.out.println("The interest for " + accC1.getAccNo() + " is: " + accC1.calculateInterest(10));

            int i = 0;
            int a = 6/0;
        }
        catch (InvalidNumberException e)
        {
            System.out.println("There was an exception. Message = " + e);
        }
        catch (Exception e)
        {
            System.out.println("THere is a BIG problem " + e);
        }
    }
}