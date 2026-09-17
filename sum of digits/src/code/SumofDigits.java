package code;
import java.util.Scanner;
public class SumofDigits {

	public static int sumDig(int n)
	{
		if(n>=10)
		{
			return n%10 + sumDig(n/10);
		}
		else
			return n;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		System.out.println(sumDig(inp));
	}

}
