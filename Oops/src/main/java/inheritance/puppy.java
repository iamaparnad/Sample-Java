package inheritance;

public class puppy extends Dog
{
	String pup="Bruno";
	public void display1()
	
	{
		System.out.println("Final class");
	}
	public static void main(String[] args) {
		
puppy obj=new puppy();
obj.display();
obj.dis();
obj.display1();
	}

}
