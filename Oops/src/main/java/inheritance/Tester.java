package inheritance;

public class Tester extends Employee
{
public void display1()
{
	System.out.println("Tester Details");
}
public static void main(String[] args) {
	Tester ob=new Tester();
	ob.display();
	ob.display1();
	Developer ob1=new Developer();
	ob1.display();
	ob1.display2();
}
}
