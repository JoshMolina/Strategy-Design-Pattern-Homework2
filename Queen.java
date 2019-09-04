//Joshua Molina
public class Queen extends Character{

	public Queen(String name)
	{
		//Call to Character with aName as the name the Queen will be created with
		super(name);
		//Call to the setWeaponBehavior in Character with an instance of WeaponKnife sent in as the weapon
		super.setWeaponBehavior(new WeaponKnife());
	}
	
	public void display()
	{
		//Prints out the information of the Queen calling super for her name and printing out the rest of the line
		System.out.println(super.name + " is a beautiful queen");
	}
}
