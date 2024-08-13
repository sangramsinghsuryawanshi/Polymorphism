package methodOveriding;
class AnimalFamily1
{
	void move()
	{
		System.out.println("Animal moving..");
	}
	void sound()
	{
		System.out.println("Animal family class invoked..");
	}
}
class Bird extends AnimalFamily1
{
	void move()
	{
		System.out.println("Bird Moving..");
	}
	void sound()
	{
		System.out.println("Bird making sound..");
	}
}
class Panthera extends AnimalFamily1
{
	void move()
	{
		System.out.println("Panthera Moving..");
	}
	void sound()
	{
		System.out.println("Panthera making sound..");
	}
}
public class AnimalMoveAndSound 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AnimalFamily1 a = new Bird();
		AnimalFamily1 a1 = new Panthera();
		Bird c = (Bird)a;
		c.sound();
		c.move();
		Panthera d = (Panthera)a1;
		d.sound();
		d.move();
	}

}
