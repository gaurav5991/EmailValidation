import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Email Validation Program");

		/* In Email i.e abc.xyz@bridgelabz.co.in --> abc,bridgelabz and co are mandatory parts, .xyz and in are optional and @ and . are mandatory respectively*/
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first and second and third mandatory part to be validated");
		String patternToBeValidated = scan.nextLine();

		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}");
		Matcher match = pattern.matcher(patternToBeValidated);
		
		if(match.matches())
		{
			System.out.println("Pattern is valid");
		}
		else
		{
			System.out.println("Pattern is Invalid");
		}
	}
}