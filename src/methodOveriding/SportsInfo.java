package methodOveriding;
class Sports
{
	void play()
	{
		System.out.println("Playing sports..");
	}
}
class Football extends Sports
{
	void play()
	{
		System.out.println("Playing Football..");
	}
}
class Basketball extends Sports
{
	void play()
	{
		System.out.println("Playing Basketball..");
	}
}
class Rugby extends Sports
{
	void play()
	{
		System.out.println("Playing Rugby..");
	}
}
public class SportsInfo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Sports a = new Football();
		Sports a1 = new Basketball();
		Sports a2 = new Rugby();
		Football c =(Football)a;
		c.play();
		Basketball r = (Basketball)a1;
		r.play();
		Rugby t =(Rugby)a2;
		t.play();
	}
}
