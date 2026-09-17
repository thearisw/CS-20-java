package code;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean gameOver=false;
		int wins = 0;
		int losses = 0;
		int max = 0;
		int inp = 0;
		int dif = 0;
		String tryAgain = "";
		boolean goodInput=false;
		
		do
		{
			System.out.println("Pick difficulty (1/2/3)");
			do
			{
				try
				{
					dif = input.nextInt();
				}
				catch(Exception e)
				{
					input.nextLine();
				}
				if(dif<1||dif>3)
					System.out.println("Insert 1,2 or 3");
			}while(dif<1||dif>3);
			max = dif*5;
			int number = (int)(Math.random()*max+1);
			System.out.println("Guess a number between 1-" + max + ", 3 attemtps remaing...");
			for(int x=2;x>=0;x--)
			{
				do
				{
					try
					{
						inp = input.nextInt();
						if(inp<1||inp>max)
							System.out.println("Insert a number between 1-"+max+": ");
					}
					catch(Exception e)
					{
						System.out.println("Insert a number between 1-"+max+": ");
						input.nextLine();
						inp = -1;
					}
					
				}while(inp<1||inp>max);
				
				if(inp==number)
				{
					System.out.println("yay. That was correct.");
					wins+=1;
					break;
				}
				else if (Math.abs(inp-number)<=dif)
					System.out.print("Hot! ");
				else if (Math.abs(inp-number)<=dif*2)
					System.out.print("Warm! ");
				else
					System.out.print("cold! ");
				System.out.println( x + " Attempts left!");
			}
			if(inp!=number)
			{
				System.out.println("You lost... lol. The correct answer was " + number);
				losses+=1;
			}
			System.out.println("wins: " + wins);
			System.out.println("losses: " + losses);
			do
			{
				System.out.println("try again? (y/n)");
				tryAgain = input.next();
				if(tryAgain.equals("no") || tryAgain.equals("n"))
				{
					gameOver = true;
					goodInput = true;
				}
				else if(tryAgain.equals("yes") || tryAgain.equals("y"))
				{
					gameOver = false; 
					goodInput = true;
				}
			}while(!goodInput);
			goodInput=false;
		}while(gameOver==false);
		
		
	}

}
