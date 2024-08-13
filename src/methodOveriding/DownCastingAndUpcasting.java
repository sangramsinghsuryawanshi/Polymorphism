package methodOveriding;
class Parent
{
	int age;
	void disp()
	{
		System.out.println("Parent class invoked..");
	}
}
class Child extends Parent
{
	String name;
	void disp()
	{
		System.out.println("Child class invoked..");
	}
}
public class DownCastingAndUpcasting 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();//upcastig
		Child c =(Child)p;//doowncasting
		c.age=22;
		c.name="sangram";
		System.out.println((c.age)+" "+(c.name));
		c.disp();
	}

}
