package code;
import java.util.Scanner;
public class middle {
	public static int middleNum(int n1, int n2, int n3)
	{
		if(n1<=n2&&n2<=n3)
			return n2;
		else if(n2<=n1 && n1<=n3)
			return n1;
		else
			return n3;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2,n3=0;
		n1=input.nextInt();
		n2=input.nextInt();
		n3=input.nextInt();
		System.out.println(middleNum(n1,n2,n3));

	}

}
