package code;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String doAgain = "";
		boolean dead = false;
		Random rand = new Random();
		int shots = 6;
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println("hey");
			System.out.println("start canadian roulette?");
			doAgain = input.next();
		}while(!doAgain.equals("yes"));
		while(true)
		{
			System.out.println("You grab the maple syrup revolver with " + shots + " shots left.");
			if(rand.nextInt(shots)==0) {
				System.out.println("You press the trigger. Syrup shoots out and you suffocate on the sap");
				break;
			}
			else
				System.out.println("You press the trigger... Nothing happens.");
			shots--;
			System.out.println("Type anything to continue: ");
			input.next();
			
			System.out.println("The beaver grabs the maple syrup revolver with " + shots + " shots left.");
			if(rand.nextInt(shots)==0) {
				System.out.println("The beaver presses the trigger. Syrup shoots out and the beaver suffocate on the sap");
				break;
			}
			else
				System.out.println("The beaver presses the trigger... Nothing happens.");
			System.out.println("Type anything to continue: ");
			input.next();
			shots--;
		}
	}
		
}
