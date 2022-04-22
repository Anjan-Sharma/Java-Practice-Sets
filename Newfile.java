import java.util.Scanner;
public class Newfile
{

public  static void main(String[] args) 
{

//java ma array banaune tarika int[]a=new int[10] dynamically banyo esma a vnya variable banyo
     
    int i,n;
    int []a;
	System.out.println("Wap to display the elements in an array");
	System.out.println("How many numbers do you want to insert");
	Scanner sn=new Scanner(System.in);
	n=sn.nextInt();
	a=new int [n];//esma n ko value magepachi a[n] jasto space banayo
	System.out.println("Insert the values");
	for(i=0;i<n;i++)
	{

     a[i]=sn.nextInt();
      

	}

	for(i=0;i<n;i++)
	{

		System.out.println(a[i]);
	}
    


    }
   }




