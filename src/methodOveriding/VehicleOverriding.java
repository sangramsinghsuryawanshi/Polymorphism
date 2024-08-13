package methodOveriding;
class Vehical
{
	void speedUp()
	{
		System.out.println("Vehical class invoked..");
	}
}
class Car extends Vehical
{
	void speedup()
	{
		System.out.println("Car speed is 200 Km/hr");
	}
}
class Bike extends Vehical
{
	void speedup()
	{
		System.out.println("Bike speed is 100 Km/hr");
	}
}
public class VehicleOverriding 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vehical v = new Bike();
		Vehical v1 = new Car();
		Bike b =(Bike)v;
		b.speedup();
		v.speedUp();
		Car c = (Car)v1;
		c.speedup();
		c.speedUp();

	}

}
