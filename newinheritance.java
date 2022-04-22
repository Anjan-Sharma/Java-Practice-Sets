import java.util.*;
class Bank
{
    public int show=5;
	float getROI()
	{
		
		return (float) 4.5;
	}




}

class sbi extends Bank
{
 public int show=10;
 float getROI()
 {


 	return 6;
 }

}

class nbi extends Bank
{

 float getROI()
 {
 	return 5;
 }
}

class himalayan extends Bank
{

float getROI()
{
	return 7;
}


}
public class Newinheritance
{

public  static void main(String[] args) 
{ 
 sbi s=new sbi();
 nbi n=new nbi();
 himalayan h=new himalayan();
 Bank b=new sbi();
 System.out.println("Rate of interest of himalayan is"+h.getROI());
 System.out.println("Rate of interest of sbi is"+s.getROI());
 System.out.println("Rate of interest of nbi is"+n.getROI());
 System.out.println(b.show);

}
}