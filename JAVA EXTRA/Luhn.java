import java.util.Scanner;
public class Luhn
{

    public static void main(String[] args)
    {
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student number");
        String sNumber = input.nextLine();
        for (int i = 7;i >= 0;i--)
        {
            int in = sNumber.charAt(i) - '0';
            sum += in * (i-8)*-1;
        }
        if (sum % 11 != 0)
        {
            System.out.println("Invalid");
        }
        else
        {
            System.out.println("Valid");
        }
        System.out.println("Sum = "+ sum % 11);
    }
}
