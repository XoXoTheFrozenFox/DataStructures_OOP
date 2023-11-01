//Bernard Swanepoel 39909476
//THIS IS SUBCLASS1
public class Icespell extends Mage
{
    private String iceSpellType;
    private double iceDamageMultiplier;

    public Icespell()
    {
       
    }

    public Icespell(String mageName, String mageLastName, int mageLevel, String iceSpellType, double damageMultiplier)
    {
        super(mageName, mageLastName , mageLevel);
        setIceSpellType(iceSpellType);
        setDamageMultiplier(damageMultiplier);
    }

    public void setIceSpellType(String iceSpellType)
    {
        this.iceSpellType = iceSpellType;
    }

    public void setDamageMultiplier(double damageMultiplier)
    {
        this.iceDamageMultiplier = damageMultiplier;
    }

    public String getIceSpellType()
	{
		return iceSpellType;
	}

    public double getIceDamageMultiplier()
	{
		return iceDamageMultiplier;
	}
    //Abstract method 
    public double getDamage()
    {
        return (getLevel() * getIceDamageMultiplier())*Math.PI;
    }

    public String getRealm()
    {
        if(getLevel()>=10 && getLevel()<20)
        {
            return "Lakeside Resort";
        }
        else if(getLevel()>=20 && getLevel()<=30)
        {
            return "Snowhead Temple";
        }
        else if(getLevel()>=30 && getLevel()<=40)
        {
            return "Phendrana Drifts";           
        }
        else if(getLevel()>=40 && getLevel()<=50)
        {
            return "Icicle Inn Village";           
        }
        else if(getLevel()>=50 && getLevel()<=60)
        {
            return "Freezeezy Peak";           
        }
        else
        {
            return "Hoth";
        }
    }

    public String toString()
	{
		return super.toString()+", the ice element spell chosen is: "+getIceSpellType()+", the damage multiplayer for this realm is: "+getIceDamageMultiplier();
	}
}
