//Joshua Molina
public class King extends Character {

	public King(String aName)
	{
		//Call to Character with aName as the name the King will be created with
		super(aName);
		//Call to the setWeaponBehavior in Character with an instance of WeaponSword sent in as the weapon
		super.setWeaponBehavior(new WeaponSword());
	}
	
	public void display()
	{
		//Prints out the information of the King calling super for his name and printing out the rest of the line
		System.out.println(super.name + " is a Noble King");
	}
}
