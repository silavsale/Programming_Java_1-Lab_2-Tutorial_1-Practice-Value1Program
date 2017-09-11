import java.util.Scanner;

public class Value1Program
{
	 static Scanner scan = new Scanner(System.in);

		int x = 10;
		char ch = 'G';
		static char val;
		
	public static void printValues(){
		val = scan.next().charAt(0);
		if (val == 'n' ){
		System.out.println("The value of X variable is 10");}
		else{	
		System.out.println("The value of variable ch of type char is \t G");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Do you like numbers or letters? ");
		System.out.print("Please enter your char: ");
		
		printValues();
	}
}
