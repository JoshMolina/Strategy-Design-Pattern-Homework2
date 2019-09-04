//Joshua Molina
public abstract class Character implements WeaponBehavior{
	//Protected property variables that define important parts of the class
	protected String name;
	protected WeaponBehavior weaponBehavior;
	
	public Character(String aName)
	{
		//Sets name to the sent-in value of aName
		name = aName;
	}
	
	public void attack()
	{
		//Calls the attack method of the character's weapon behavior
		weaponBehavior.attack();
	}
	
	public void setWeaponBehavior(WeaponBehavior wb)
	{
		//Sets the character's weapon behavior to the sent-in value of wb
		weaponBehavior = wb;
	}
	
	//Public abstract void method called display that all classes that extend Character must have
	public abstract void display();
}