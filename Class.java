import java.util.*;
class Student
{ 
	private String name;
	private int fee;

	public void input()
	{
      
      System.out.println("Enter the name and fee of the studet");
         Scanner sn=new Scanner(System.in);
       	name=sn.next();
         fee=sn.nextInt();



	}

	public void output()
	{   


		System.out.println(name);
		System.out.println(fee);
	}
}



 


public class Class
{

public  static void main(String[] args) 
{

  Student obj=new Student();
  obj.input();
  obj.output();

 

}
	}