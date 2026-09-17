package main;
import java.util.Scanner;

public class RomanNumMain {
	public static String romanNum(int num)
	{
		String romNum="";
		if(num>=90)
			romNum="XC";
		else if(num>=50)
		{
			romNum+="L";
			for(int x = num-50;x>=10;x-=10)
			{
				romNum+="X";
			}
		}
		else if(num>=40)
		{
			romNum+="XL";
		}
		else if(num>=10)
		{
			for(int x=num; x>=10; x-=10)
			{
				romNum+="X";
			}
		}
		if(num%10<=3)
		{
			for(int x = num%10; x>0; x--)
			{
				romNum+="I";
			}
		}
		else if(num%10==4)
			romNum+="IV";
		else if(num%10<=8)
		{
			romNum+="V";
			for(int x = num%10-5;x>0;x--)
			{
				romNum+="I";
			}
		}
		else if(num%10==9)
			romNum+="IX";
		if(num==100)
			romNum="C";
		return romNum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insert number");
		int inp=input.nextInt();
		System.out.println(inp);
//		for(int x = 1;x<=100;x++)
//		{
//			System.out.println(romanNum(x));
//			
//		}
	}

}
