//Bernard Swanepoel 39909476
public class MyArrayList<E> 
{
  private int size; // Number of elements in the list
  private E[] data;
  /** Create an empty list */
  public MyArrayList() {
	   data = (E[])new Object[100];// cannot create array of generics
       size = 0; // Number of elements in the list
  }
  
  public void add(int index, E e) {   
    // Ensure the index is in the right range
    if (index < 0 || index > size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size); 
    // Move the elements to the right after the specified index
    for (int i = size - 1; i >= index; i--)
      data[i + 1] = data[i];
    // Insert new element to data[index]
    data[index] = e;
    // Increase size by 1
    size++;
  }

  public boolean contains(Object e) {
    for (int i = 0; i < size; i++)
      if (e.equals(data[i])) return true;
    return false;
  }

  public E get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    return data[index];
  }
  
  public E remove(int index) {
	if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    E e = data[index];
    // Shift data to the left
    for (int j = index; j < size - 1; j++)
      data[j] = data[j + 1];
    data[size - 1] = null; // This element is now null
    // Decrement size
    size--;
    return e;
  }

  public String toString() {
    String result=" ";
    for (int i = 0; i < size; i++) {
      result+= data[i];
      if (i < size - 1) result+=", ";
    }
    return result.toString() + "]";
  }

  
  public int size() {
    return size;
  }
  
 public boolean sortList() {
    E hold;
	for (int i = 0; i < size-1; i++)
	 {
	   for (int j = 0; j<size-1; j++)
	    {  	 
	     if(((Comparable)data[j]).compareTo(data[j+1])>0)
	      {
	       hold= data[j+1];
	       data[j+1]=data[j];
	       data[j]=hold;
	      }       
	   }
     } 
	 return true;	  	
  }

    private char getCharFromString(String str, int index)
    {
      return str.toCharArray()[index];
    }

    public MyArrayList<Character> checkChar(String s1, String s2)
    {
      s1 = s1.toLowerCase();
      s2 = s2.toLowerCase();
      if(s1.length()==5 & (s2.length()==5))
      {
        MyArrayList<Character> list = new MyArrayList<>();
        for(int i = 0; i < 5 ; i++)
        {
            if(getCharFromString(s1,i) == getCharFromString(s2,i))
            {
                list.add(i,'A');
            }
            else if(getCharFromString(s1,i)!=getCharFromString(s2,i) & (getCharFromString(s2,i)==getCharFromString(s1,0)) || (getCharFromString(s2,i)==getCharFromString(s1,1)) || (getCharFromString(s2,i)==getCharFromString(s1,2)) || (getCharFromString(s2,i)==getCharFromString(s1,3)) || (getCharFromString(s2,i)==getCharFromString(s1,4)))    
            {
                list.add(i,'B');
            } 
            else
            {
                list.add(i,'C');
            }
        }
        return list;
      }
      else
      {
        return null;
      }
    }
  
    public Boolean checkWin()
	  {
        boolean b1 = true;
        for(int i = 0 ; i < size ; i++)
        {
			      if((char)data[i]!='A')
			      {
			          b1 = false;
			      }
        }
      return b1;		
  	}
}