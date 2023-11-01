//Bernard Swanepoel 39909476
//THIS IS SUBCLASS2
public class Firespell extends Mage 
{
    private String fireSpellType;
    private double fireDamageMultiplier;
    public Firespell()
    {
       
    }

    public Firespell(String mageName, String mageLastName, int mageLevel, String fireSpellType, double fireDamageMultiplier)
    {
        super(mageName, mageLastName , mageLevel);
        setFireSpellType(fireSpellType);
        setFireDamageMultiplier(fireDamageMultiplier);
    }  

    public void setFireSpellType(String fireSpellType)
    {
        this.fireSpellType = fireSpellType;
    }

    public void setFireDamageMultiplier(double fireDamageMultiplier)
    {
        this.fireDamageMultiplier = fireDamageMultiplier;
    }

    public String getFireSpellType()
	{
		return fireSpellType;
	}

    public double getFireDamageMultiplier()
	{
		return fireDamageMultiplier;
	}

    public double getDamage()
    {
        return ((getLevel() * getFireDamageMultiplier())*2)/3;
    }

    public String getRealm()
    {
        if(getLevel()>=10 && getLevel()<20)
        {
            return "The Nether";
        }
        else if(getLevel()>=20 && getLevel()<=30)
        {
            return "Land of the Dead";
        }
        else if(getLevel()>=30 && getLevel()<=40)
        {
            return "Hell";           
        }
        else if(getLevel()>=40 && getLevel()<=50)
        {
            return "Hades";           
        }
        else if(getLevel()>=50 && getLevel()<=60)
        {
            return "The Seven Circles";           
        }
        else
        {
            return "The Basement";
        }
    }

    public String toString()
	{
		return super.toString()+", the fire element spell chosen is: "+getFireSpellType()+", the damage multiplayer for this realm is: "+getFireDamageMultiplier();
	}

}
