package arrayWordGame;
import java.util.Scanner;
public class WordGameMain {
	public static boolean check(String guess, String base)
	{
		boolean foundChar=false;
		boolean isAnag=true;
		char baseArray[] = base.toCharArray();
		char guessArray[] = guess.toCharArray();
		for(int x=0;x<guessArray.length;x++)
		{
			for(int y=0; y<baseArray.length; y++)
			{
				if(guessArray[x]==baseArray[y])
				{
					foundChar=true;
					baseArray[y]=(char)-1;
				}
			}
			if(!foundChar)
				isAnag=false;
			foundChar=false;
		}
		return isAnag;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Base word");
		String base = input.next();
		System.out.println("Anagram word");
		String guess = input.next();
		System.out.println("Is anagram: "+check(guess,base));
		

	}

}
