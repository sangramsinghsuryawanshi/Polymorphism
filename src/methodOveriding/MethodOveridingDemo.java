package methodOveriding;
class FirstOveriding
{

	public void add(int a)
	{
		System.out.println("Addition :"+(a+a));
	}
}
class SecondOverinding extends FirstOveriding
{

	public void add(int a)
	{
		System.out.println("Addition :"+(a+a));
	}
}
public class MethodOveridingDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FirstOveriding f = new SecondOverinding();
		f.add(2);

	}

}
