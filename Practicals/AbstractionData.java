package corejava;

public class AbstractionData extends abstractionexample 
{
private double salary;

public AbstractionData(int id, String name, String address, double salary) {
	super(id, name, address);
	this.salary = salary;
}
	
public void mailcheck()
{
	System.out.println("mailing check to:+get name()");
}
}
