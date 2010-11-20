import java.util.Scanner;

public class HelloWorld 
{
	public static void main(String[] args) 
	{
		System.out.println("What is your name?");
		String namn;
		Scanner inkommande = new Scanner(System.in);
		namn = inkommande.nextLine();
		System.out.println("Hello " + namn);
	}
}
