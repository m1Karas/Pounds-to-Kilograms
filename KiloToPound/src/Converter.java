
import java.util.Scanner; 
public class Converter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int kilo = 0, pound = 0;
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println ("Please input wether you are econverting kilos (k) or pounds (p).");
		
		char Input1 = Input.next().charAt(0);
		
		if(Input1 == 'k')//kilos to pounds
		{
			System.out.println("please enter the ammount to convert:");
			int Input2 = Input.nextInt();
			
			double outPut = Input2 * 2.2046;
			
			System.out.println( outPut + " pounds");
			
		}
		else if(Input1 == 'p')//Pounds to kilos
		{
			System.out.println("please enter the ammount to convert:");
			int Input2 = Input.nextInt();		
			
			double outPut = Input2 / 2.2046;
			
			System.out.println(outPut + " kilograms");
		}
		else//error message
		{
			System.out.println("You entered an incorrect value.");
						
		}		
	}

}
