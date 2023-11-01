//Bernard Swanepoel 39909476
public class Test
{
    public static void main(String args[])
    {
        StackAsMyArrayList<Character> myStack = new StackAsMyArrayList<Character>();
        System.out.println("The tower:" + myStack.toString());
        System.out.println("Size:" + myStack.getStackSize());
        if((myStack.checkStackUniform() == false) & (myStack.getStackSize() < 5))
        {
            System.out.println("The tower is not full");
        }
        System.out.println();
        myStack.push('r');// Push new elements into the myStack
        myStack.push('r');
        myStack.push('r');
        myStack.push('b');
        myStack.push('b');
        System.out.println("The tower:" + myStack.toString());
        System.out.println("Size:" + myStack.getStackSize());
        System.out.println("Correct?  " + myStack.checkStackUniform());
        System.out.println();
        if(myStack.getStackSize() != 0)
        {
            myStack.pop();//Pop elements but firstly check if the stack is not empty
        }
        if(myStack.getStackSize() != 0)
        {
            myStack.pop();
        }
        System.out.println("The tower:" + myStack.toString());
        System.out.println("Size:" + myStack.getStackSize());
        if((myStack.checkStackUniform() == false) & (myStack.getStackSize() < 5))
        {
            System.out.println("The tower is not full");
        }
        System.out.println();
        myStack.push('r');
        myStack.push('r');
        System.out.println("The tower:" + myStack.toString());
        System.out.println("Size:" + myStack.getStackSize());
        System.out.println("Correct?  " + myStack.checkStackUniform());
    }    
}