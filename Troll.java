//Joshua Molina
public class Troll extends Character{

	public Troll(String name)
	{
		//Call to Character with aName as the name the Troll will be created with
		super(name);
		//Call to the setWeaponBehavior in Character with an instance of WeaponAxe sent in as the weapon
		super.setWeaponBehavior(new WeaponAxe());
	}
	
	public void display()
	{
		//Prints out the information of the Troll calling super for his name and printing out the rest of the line
		System.out.println(super.name + " is a funny troll");
	}
}
