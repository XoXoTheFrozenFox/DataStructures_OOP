import java.util.*;
public class Test
{
    public static void main(String args[])
    {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();
        list.append(6);
        list.append(5);
        list.append(5);
        list.append(4);
        list.append(3);
        list2.append(6);
        list2.append(5);
        list.append(5);
        list2.append(4);
        list2.append(3);
        list = list.merge(list2);
        System.out.println(list);
    }
}