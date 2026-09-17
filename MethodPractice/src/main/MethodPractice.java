package main;
import java.util.Scanner;

public class MethodPractice {
	public static boolean isEven(int n1)
	{
		return n1%2==0;
	}
	public static String generateGreeting(String name)
	{
		return "Hello " + name;
	}
	public static int calculateFactorial(int n)
	{
		if(n>1)
			return n*calculateFactorial(n-1);
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inp=1;
		String strInp="";
		
		System.out.println("isEven, generateGreeting, or calculateFactorial (1/2/3)");
		try {
			inp = input.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("invalid input, default set 1;");
		}
		if(inp==1)
		{
			System.out.println("insert number");
			inp = input.nextInt();
			System.out.println(isEven(inp));
		}
		else if(inp==2)
		{
			System.out.println("insert string");
			strInp = input.next();
			System.out.println(generateGreeting(strInp));
		}
		else if(inp==3)
		{
			System.out.println("insert number");
			inp = input.nextInt();
			System.out.println(calculateFactorial(inp));
		}
		
	}

}
