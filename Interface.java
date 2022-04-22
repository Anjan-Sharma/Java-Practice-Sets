
import java.util.*;//interface bhaneko java le multiple inheritance handle garna lai banako auta conceptho 
interface a 
{

	void show();//interface ma khali declare matra garnne ho autai function name huncha 
}
interface b 
{

	void show();//declaration with same function name as above
}

class c implements a,b
{
public void show()
{
	System.out.println("Anjan");
}

}

public class Interface
{
	public static void main(String[] args)
	{
		
	c anj=new c();
	anj.show();



     }

}