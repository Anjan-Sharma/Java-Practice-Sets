import java.util.*;
class Vehicle
{
	protected int pricee;
	public void price()
	{
      Scanner sn=new Scanner(System.in);
      System.out.println("Enter the price ");
      pricee=sn.nextInt();

     }
     public void output()
     {

     	System.out.println("The price is "+pricee);
     }

	}
class bike extends Vehicle
{ 
	protected String namee;
	public void bikee()
	{
		System.out.println("Name of bike");
		Scanner sn=new Scanner(System.in);
		namee=sn.next();
		System.out.println("Name of bike is "+namee);
		
	}

}
class car extends  Vehicle
{

  protected String name;
	public void carr()
	{
		System.out.println("Name of car");
		Scanner sn=new Scanner(System.in);
		name=sn.next();
		System.out.println("Name of car is"+name);
		
		
		
		
}

    }


public class Inheritanc
{

public  static void main(String[] args) 
{ 

bike b=new bike();
car c=new car();
b.bikee();
b.price();
b.output();
c.carr();
c.price();
c.output();
}
}