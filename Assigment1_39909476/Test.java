import java.util.Arrays;

//Bernard Swanepoel 39909476
//THIS IS THE TESTPROGRAM
public class Test 
{
    public static void main(String args[])
    { //15,19.27,32,37,43,48,72
        MyArrayList<Mage> list = new MyArrayList<>();//CREATE THE LIST 

        Icespell i1 = new Icespell("Roku","Kyoshi",27,"waterfall",2.7);//WHERE ALL THE VALUES ARE INSERTED
        Firespell f1 = new Firespell("Firelord","Ozai",15,"fireball",2.4);
        Mage i2 = new Icespell("Bernard","Swanepoel",32,"icethrow",3.7);
        Mage f2 = new Firespell("Frikkie","van Tonder",43,"firebreath",2.7);
        Mage i3 = new Icespell("Pieter","Swanepoel",48,"wishingwell",3.2);
        Mage f3 = new Firespell("Emmie","Croft",72,"firewall",5.2);
        Mage i4 = new Icespell("Albertus","van der Walt",19,"polandsymphony",4.2);
        Mage f4 = new Firespell("Ashton","du Plessis",37,"lavaland",2.2);

        list.add(0,i1);//WHERE THE VALUES ARE INSERTED INTO THE LIST
        list.add(1,f1);
        list.add(2,i2);
        list.add(3,f2); 
        list.add(4,i3);
        list.add(5,f3);
        list.add(6,i4);
        list.add(7,f4);

        Mage information[] = new Mage[8];//CREATED THIS TO MARK MY WORK EASIER(TO SEE THE DAMAGE VALUES OF MY MAGES)
        information[0] = i1;//
        information[1] = i2;//
        information[2] = i3;//
        information[3] = i4;//
        information[4] = f1;//
        information[5] = f2;//
        information[6] = f3;//
        information[7] = f4;//
        Arrays.sort(information);
        for(int i = 0; i<8 ; i++)//CREATED THIS TO MARK MY WORK EASIER(TO SEE THE DAMAGE VALUES OF MY MAGES)
        {//
            System.out.println(information[i].getName()+" The damage dealt per second is: "+information[i].getDamage());//
        }//

        System.out.println("");
        System.out.println("The list before it was sorted:");
        System.out.println(list.toString());
        System.out.println("");
        System.out.println("The list after it was sorted:");
        if (list.sortList())
        System.out.println(list.toString());
    }    
}
