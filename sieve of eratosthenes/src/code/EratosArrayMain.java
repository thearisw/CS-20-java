package code;
import java.util.Scanner;
public class EratosArrayMain {
	public static void findPrime(int[] primes)
	{
		boolean prime=true;
		int primeCount=0;
		for(int x=1;x<200000;x++)
		{
			for(int y=2;y<(int)(x/2);y++)
			{
				if(x%y==0 && x!=y)
				{
					prime=false;
					y=x+10000;
				}
				
			}
			if(prime)
			{
				primes[primeCount]=x;
				primeCount++;
			}
			prime=true;
		}
		System.out.println("found primes");
	}
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int numbers[]= new int [200000];
		int primes [] = new int[100000];
		System.out.println("loading...");
		findPrime(primes);
		System.out.println("Insert number: ");
		int n = input.nextInt();
		for(int x=0; x<primes.length;x++)
		{
			if(primes[x]==n)
			{
				System.out.println("Prime");
				break;
			}
			else if(x==primes.length -1)
				System.out.println("not Prime");
		}
	}

}
