//Bernard Swanepoel 39909476
import java.util.Objects;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {  
        
        QueueAsMyLinkedList<Character> palindroomQueue = new QueueAsMyLinkedList<Character>();
        StackAsMyLinkedList<Character> palindroomStack = new StackAsMyLinkedList<Character>();
        Scanner palindroomWord = new Scanner(System.in);
        String word = palindroomWord.next();
        char palindroomTemp;
        char palindroomHead;
        for (int i = 0;i<word.length();i++)
        {
            palindroomQueue.enqueue(word.charAt(i));
        }
        palindroomHead = palindroomQueue.dequeue();
        palindroomTemp = palindroomHead;
        do {
            palindroomStack.push(palindroomTemp);
            palindroomQueue.enqueue(palindroomTemp);
            palindroomTemp = palindroomQueue.dequeue();
        }while (palindroomHead != palindroomTemp);//Keep exucuting until the palindroomhead is not = palindroomtemp
        palindroomQueue.enqueue(palindroomTemp);
        palindroomStack.push(palindroomTemp);
        if (Objects.equals(palindroomQueue.toString(), palindroomStack.toString()))
        {
            System.out.println("This is a Palindrome");
        }
        else
        {
            palindroomStack.pop();
            if (Objects.equals(palindroomQueue.toString(), palindroomStack.toString()))
            {
                System.out.println("This is a Palindrome");
            }
            else
            {
                System.out.println("This is a Palindrome");
            }
        }
        System.out.println(palindroomStack);
        System.out.println(palindroomQueue);

    }
}