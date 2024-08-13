package methodOveriding;
class Area2
{
	void calculateArea()
	{
		System.out.println("Class area is invoked..");
	}
}
class Circle2 extends Area2
{
	void calculateArea()
	{
		double pi=3.14;
		int r=2;
		System.out.println("Area of circle is: "+(pi*(r*r)));
	}
	void draw()
	{
		System.out.println("Drwaing a circle..");
	}
}
class Rectangle2 extends Area2
{
	void calculateArea()
	{
		int l=2,w=8;
		System.out.println("Area of rectangle is: "+(l*w));
	}
	void draw()
	{
		System.out.println("Drwaing a rectangle..");
	}
}
class Triangle2 extends Area2
{
	void calculateArea()
	{
		int b=2,h=8;
		System.out.println("Area of triangle is: "+(0.5*(b*h)));
	}
	void draw()
	{
		System.out.println("Drwaing a triangle..");
	}
}
public class CalculateAreaAndDraw 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Area2 a = new Circle2();
		Area2 a1 = new Rectangle2();
		Area2 a2 = new Triangle2();
		Circle2 c =(Circle2)a;
		c.calculateArea();
		c.draw();
		Rectangle2 r = (Rectangle2)a1;
		r.calculateArea();
		r.draw();
		Triangle2 t =(Triangle2)a2;
		t.calculateArea();
		r.draw();

	}

}
