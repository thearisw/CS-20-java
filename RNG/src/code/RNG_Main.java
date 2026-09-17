package code;
import java.util.Scanner;
public class RNG_Main {

	public static int random(int n1, int n2)
	{
		return (int)(Math.random()*(n2-n1+1)+(n1));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2  = input.nextInt();
		while(true)
		{
			System.out.println(random(n1,n2));
			n1 = input.nextInt();
		}
	}

}
