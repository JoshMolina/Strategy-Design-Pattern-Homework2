//Joshua Molina
public class Knight extends Character{

	public Knight(String name)
	{
		//Call to Character with aName as the name the Knight will be created with
		super(name);
		//Call to the setWeaponBehavior in Character with an instance of WeaponBow sent in as the weapon
		super.setWeaponBehavior(new WeaponBow());
	}
	
	public void display()
	{
		//Prints out the information of the Knight calling super for his name and printing out the rest of the line
		System.out.println(super.name + " is a valiant knight");
	}
}
