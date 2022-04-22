import java.util.*;
enum Resturant
{
	kkfc,syanko,npp,bajekosekuwa
}

public class Enum
{

public  static void main(String[] args) 
{ 
	Resturant r;
	r=Resturant.kkfc;      //esma kkfc select vacha ani switch ko kkfc wala print huncha

	
	 switch(r)
       { 
       	case kkfc:
       	       System.out.println("this is kkfc");
       	       break;

       	      case syanko:
       	      System.out.println("this is syanko");
       	       break;
       	       case npp:
       	       System.out.println("this is npp");
       	       break;
       	       case bajekosekuwa:
       	       System.out.println("this is bajekosekuwa");
       	       break;
       	       default:
       	   }





     }
 }







 /*.for each loop vanne huncha 
   .tesma initial ra final condition kei dinu pardaina kunai array print garnu cha vane 
   .eg:
   int[]a={20,25,73};
   for(int i:a)
   System.out.println(a);
   output:
   20
   25
   73
   */