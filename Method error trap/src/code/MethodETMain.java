package code;
import java.util.Scanner;

public class MethodETMain {
	public static int Call(int n1,int n2)
	{	
		Scanner input = new Scanner(System.in);
		int min=0;
		int max=0;
		int n=0;
		if(n2>n1)
		{
			max=n2;
			min=n1;
		}
		else
			
		{
			max=n1;
			min=n2;
		}
		do
		{
			System.out.println("insert number between "+min+" to "+max);
			try
			{
				n = input.nextInt();
				if(n<min||n>max)
					System.out.println("Invalid Input");
			}
			catch(Exception e)
			{
				System.out.println("Invalid Input");
				input.nextLine();
				n=min-1;
			}
		}while(n<min||n>max);
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2=0;
		Scanner input = new Scanner(System.in);
		n1 = input.nextInt();
		n2 = input.nextInt();
		System.out.println(Call(n1,n2));
	}

}
