package inheritance;

public class Car extends Vehicle 
{
	int milage=50;
	public void ev()
	{
		System.out.println("Shows the distance of car");
	}
public static void main(String[] args) 
{
	Car ob1=new Car();
	ob1.dist();
	ob1.ev();
	System.out.println(ob1.milage);
	System.out.println(ob1.speed);
	
}
}
