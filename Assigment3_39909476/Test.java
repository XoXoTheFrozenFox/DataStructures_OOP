//Bernard Swanepoel 39909476
import java.util.*;
public class Test 
{ 

    // public static char getCharFromString(String str, int index)
    // {
    //     return str.toCharArray()[index];
    // }
    // public static List<Character> checkChar(String s1, String s2)
    // {
    //     List<Character> list = new ArrayList<Character>();
    //     for(int i = 0; i < 5 ; i++)
    //     {
    //         if(getCharFromString(s1,i) == getCharFromString(s2,i))
    //         {
    //             list.add('A');
    //         }
    //         else if(getCharFromString(s1,i)!=getCharFromString(s2,i) & (getCharFromString(s2,i)==getCharFromString(s1,0)) || (getCharFromString(s2,i)==getCharFromString(s1,1)) || (getCharFromString(s2,i)==getCharFromString(s1,2)) || (getCharFromString(s2,i)==getCharFromString(s1,3)) || (getCharFromString(s2,i)==getCharFromString(s1,4)))    
    //         {
    //             list.add('B');
    //         } 
    //         else
    //         {
    //             list.add('C');
    //         }
    //     }
    //     return list;
    // }
	
	// public static Boolean checkWin(List<Character> list)
	// {
    //     boolean b1 = true;
    //     for(int i = 0 ; i < 5 ; i++)
    //     {
	// 		if(list.get(i)!='A')
	// 		{
	// 			b1 = false;
	// 		}
    //     }
    //     return b1;		
	// }
	
    public static void main(String args[])
    {
        String s1 = "admin";
        String s2 = "atlas";
        MyArrayList<Character> list = new MyArrayList();
        list = list.checkChar(s1, s2);
        System.out.println(list);
		System.out.println(list.checkWin());
    }
}
