package methodOveriding;
class Area1
{
	double calculateArea()
	{
		System.out.println("Class area is invoked..");
		return 0;
	}
	double calculateperimeter()
	{
		System.out.println("Class area is invoked..");
		return 1;
	}
}
class Circle1 extends Area1
{
	double calculateArea()
	{
		double pi=3.14;
		int r=2;
		double area=pi*(r*r);
		return area;
	}
	double calculateperimeter()
	{
		double pi=3.14;
		int r=4;
		double p=pi*r;
		return p;
	}
}
class Rectangle1 extends Area1
{
	double calculateArea()
	{
		int l=21,w=2;
		double area=l*w;
		return area;
	}
	double calculateperimeter()
	{
		int l=21,w=2;
		double p=2*(l+w);
		return p;
	}
}
class Triangle1 extends Area1
{
	double calculateArea()
	{
		int b=24,h=21;
		double area=0.5*(b*h);
		return area;
	}
	double calculateperimeter()
	{
		int a=3,b=2,c=9;
		double p=a+b+c;
		return p;
	}
}
public class CalculateAreaAndParameter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Area1 a = new Circle1();
		Area1 a1 = new Rectangle1();
		Area1 a2 = new Triangle1();
		Circle1 c =(Circle1)a;
		double d=c.calculateArea();
		System.out.println("Area of circle: "+d);
		double d1=c.calculateperimeter();
		System.out.println("Perimeter of circle: "+d1);
		Rectangle1 r = (Rectangle1)a1;
		double i=r.calculateArea();
		System.out.println("Area of rectangle: "+i);
		double i1=c.calculateperimeter();
		System.out.println("Perimeter of rectangle: "+i1);
		Triangle1 t =(Triangle1)a2;
		double d3=t.calculateArea();
		System.out.println("Area of triangle: "+d3);
		double d2=c.calculateperimeter();
		System.out.println("Perimeter of triangle: "+d2);

	}

}
