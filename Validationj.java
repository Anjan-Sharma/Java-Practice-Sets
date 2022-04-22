
import java.util.Scanner;
public class Anjan
{

public  static void main(String[] args) 
{ String username1,password1;
  String username="anjan";
  String password="engineer";//password vanne string type variable ma engineer store garcha
  System.out.println("Enter the username");
  Scanner sn=new Scanner(System.in);
  username1=sn.next();
   System.out.println("Enter the password");

  password1=sn.next();

  if(username1.equals(username) && password1.equals(password))  //esma chai e.eqauals vaneko == jasto c++ ma
  {

     System.out.println("valid");



  }

  
  else 
  {

  	System.out.println("invalid");
  }
   

  


	
}





}