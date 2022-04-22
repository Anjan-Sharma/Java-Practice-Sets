import java.util.*;
abstract class Bank
{
   
	abstract float getROI();
	
}

class sbi extends Bank
{
 
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
 
 System.out.println("Rate of interest of himalayan is"+h.getROI());
 System.out.println("Rate of interest of sbi is"+s.getROI());
 System.out.println("Rate of interest of nbi is"+n.getROI());


}
}