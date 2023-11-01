//Bernard Swanepoel 39909476
//THIS IS THE SUPER CLASS
public abstract class Mage implements Comparable<Mage>//IMPLEMENT COMPARABLE TO WRITE THE COMPARETO METHOD
{
    private String name;
    private String lastName;
    private double level;

    protected Mage()
    {

    }

    protected Mage(String name, String lastName, double level)
    {
        setName(name);
        setLastName(lastName);
        setLevel(level);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setLevel(double level)
    {
        this.level = level;
    }

	public String getName()
	{
		return name;
	}

	public String getLastName()
	{
		return lastName;
	}

    public double getLevel()
    {
        return level;
    }

    @Override public int compareTo(Mage g) //COMPARETO METHOD THAT COMPARES THE VALUES OF THE GETDAMAGE ABSTRACT METHOD WIH TYPE DOUBLE
    {  
        if (this.getDamage() == g.getDamage())
            return 0;
        else if (this.getDamage() < g.getDamage())
            return -1;
        else
            return 1;        
      }

	public String toString()
	{
		return "The name of the mage is: "+getName()+", the surname of the mage is: "+getLastName()+", the mage level is: "+getLevel()+".";
	}

    public abstract double getDamage();//
    public abstract String getRealm();
}
