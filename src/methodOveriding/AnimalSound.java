package methodOveriding;
class AnimalFamily
{
	void sound()
	{
		System.out.println("Animal family class invoked..");
	}
}
class Dog extends AnimalFamily
{
	void sound()
	{
		super.sound();
		System.out.println("Dog barking..");
	}
}
class Cat extends AnimalFamily
{
	void sound()
	{
		super.sound();
		System.out.println("Cat memow..");
	}
}
public class AnimalSound 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AnimalFamily a = new Cat();
		AnimalFamily a1 = new Dog();
		Cat c = (Cat)a;
		c.sound();
		Dog d = (Dog)a1;
		d.sound();
	}

}
