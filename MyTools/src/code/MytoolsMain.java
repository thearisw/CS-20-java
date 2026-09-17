package code;
import java.util.Scanner;
public class MytoolsMain {
public static int errorTrap()
{
	Scanner input = new Scanner(System.in);
	int n = 0;
	try
	{
		n = input.nextInt();
	}
	catch(Exception e)
	{
		input.nextLine();
	}
	return n;
}
public static int RNG(int n1, int n2)
{
	return n2;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
