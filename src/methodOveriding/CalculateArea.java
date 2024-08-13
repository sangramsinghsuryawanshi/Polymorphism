package methodOveriding;
class Area
{
	void calculateArea()
	{
		System.out.println("Class area is invoked..");
	}
}
class Circle extends Area
{
	void calculateArea()
	{
		double pi=3.14;
		int r=2;
		System.out.println("Area of circle is: "+(pi*(r*r)));
	}
}
class Rectangle extends Area
{
	void calculateArea()
	{
		int l=2,w=8;
		System.out.println("Area of rectangle is: "+(l*w));
	}
}
class Triangle extends Area
{
	void calculateArea()
	{
		int b=2,h=8;
		System.out.println("Area of triangle is: "+(0.5*(b*h)));
	}
}
public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a = new Circle();
		Area a1 = new Rectangle();
		Area a2 = new Triangle();
		Circle c =(Circle)a;
		c.calculateArea();
		Rectangle r = (Rectangle)a1;
		r.calculateArea();
		Triangle t =(Triangle)a2;
		t.calculateArea();
	}

}
