package methodOveriding;
class Employee
{
	long salary=90000;
	long calculateArea()
	{
		System.out.println("Class area is invoked..");
		return salary;
	}
	
}
class Manager extends Employee
{
	long calculateSalary()
	{
		super.salary+=3000;
		return salary;
	}
}
class Programmer extends Employee
{
	long calculateArea()
	{
		super.salary+=2000;
		return salary;
	}
	
}
public class CalculateSalary 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e = new Manager();
		Employee e1 = new Programmer();
		Manager m = (Manager)e;
		long l=m.calculateSalary();
		System.out.println("Manager salary: "+l);
		Programmer p = (Programmer)e1;
		long l1=p.calculateArea();
		System.out.println("Programmer salary: "+l1);

	}

}
