package code;
import java.util.Scanner;

public class ArrayMain {
	public static void populateRandom(int[] manta)
	{
		for(int x=0;x<manta.length;x++)
		{
			manta[x]=(int) (Math.random()*100+1);
		}
	}
	public static void populateSeq(int[] num)
	{
		for(int x=0; x<num.length;x++)
		{
			num[x]=x+1;
		}
	}
	public static void printArray(int[] num)
	{

		for(int x=0;x<num.length;x++)
		{
			if(x%10==0 && x!=0)
				System.out.println("");
			else if(x!=0)
				System.out.print(" ");
			System.out.print(num[x]);
		}
		System.out.println();

	}
	public static void shuffle(int[] num)
	{
		int tempSwap=0;
		for(int x= 0; x<num.length;x++)
		{
			int rand=(int) (Math.random()*num.length);
			tempSwap=num[x];
			num[x]=num[rand];
			num[rand]=tempSwap;
		}
	}
	public static int find(int[] array, int n)
	{
		int index=-1;
		for(int x=0;x<array.length;x++)
		{
			if(array[x]==n)
			{
				index=x;
				break;
			}
		}
		return index;
	}
	public static boolean ascending(int[] array)
	{
		boolean inOrder=true;
		for(int x=0;x<array.length;x++)
		{
			try
			{		
				if(array[x]>array[x+1])
				{				
					inOrder=false;
					break;
				}
			}
			catch(Exception e)
			{
				
			}
			
		}
		return inOrder;
	}
	public static boolean shuffleSort(int[] array)
	{
		int x=0;
		boolean success=false;
		for(x=0;x<1000;x++)
		{
			success=ascending(array);
			if(ascending(array))
			{
				break;
			}
			shuffle(array);
		}
		System.out.println("Attempts: "+ x);
		return success;
	}
	public static int lowest(int[] array)
	{
		int lowest =array[0];
		for(int x=0; x<array.length;x++)
		{
			if (array[x]<lowest)
				lowest=array[x];
		}
		return lowest;
	}
	public static int highest(int[] array)
	{
		int high =array[0];
		for(int x=0; x<array.length;x++)
		{
			if (array[x]>high)
				high=array[x];
		}
		return high;
	}
	public static int occurences(int[] array, int n)
	{
		int count=0;
		for(int x=0;x<array.length;x++)
		{
			if(array[x]==n)
			{
				count++;
			}
		}
		return count;
	}
	public static void findReplace(int[] array, int n, int r)
	{
		for(int x=0;x<array.length;x++)
		{
			if(array[x]==n)
				array[x]=r;	
		}
	}
	public static void consecTen(int[]array)
	{
		int largestSum=0;
		int largestSumIndex=0;
		int sum=0;
		for(int x=0;x<array.length-10;x++)
		{
			for(int y=x;y<x+10;y++)
			{
				sum+=array[y];
			}
			if(sum>largestSum)
			{
				largestSumIndex=x;
				largestSum=sum;
			}
			sum=0;
		}
		System.out.println("Largest Sum: "+largestSum);
		System.out.println("Index: "+largestSumIndex+"-"+(largestSumIndex+10));
	}
	//MAIN
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numbers[]=new int[100];
		int inp=-1;
		String border="=============================";
		while(inp!=0)
		{	
			System.out.println(border);
			System.out.println("0. Exit");
			System.out.println("1. Populate Random");
			System.out.println("2. Populate Sequential");
			System.out.println("3. Display");
			System.out.println("4. Shuffle");
			System.out.println("5. Find");
			System.out.println("6. Check if Ascending Order");
			System.out.println("7. Shuffle Sort");
			System.out.println("8. Lowest Number");
			System.out.println("9. Highest Number");
			System.out.println("10. Occurences of Number 'n'");
			System.out.println("11. Find and Replace");
			System.out.println("12. Find 10 Consecutive Indexes with Greatest Sum");
			System.out.println(border);
			do
			{	
				try
				{
					inp=input.nextInt();
					if(inp<0 || inp>12)
					{
						System.out.println("between 1-12");
					}
				}
				catch(Exception e)
				{
					System.out.println("invalid input");
				}
			}while(inp<=-1);
			if(inp==1)
			{
				populateRandom(numbers);
				System.out.println("Populated randomly.");
			}
			else if(inp==2)
			{			
				populateSeq(numbers);
				System.out.println("Populated sequentially.");
			}
			else if(inp==3)
			{
				printArray(numbers);
			}
			else if(inp==4)
			{
				shuffle(numbers);
				System.out.println("Shuffled.");
			}
			else if(inp==5)
			{
				System.out.println("What number would you like to find?");
				inp=input.nextInt();
				
				System.out.println("Index:"+find(numbers,inp));
			}
			else if(inp==6)
			{
				System.out.println("Checking if in order...");
				System.out.println("Ascending order: "+ascending(numbers));
			}
			else if(inp==7)
			{
				System.out.println("Ascending: "+shuffleSort(numbers));
			}
			else if(inp==8)
			{
				System.out.println("Lowest: "+lowest(numbers));
			}
			else if(inp==9)
			{
				System.out.println("Highest: "+ highest(numbers));
			}
			else if(inp==10)
			{
				System.out.println("What number to find?");
				int n=input.nextInt();
				System.out.print("Occurences: ");
				System.out.println(occurences(numbers,n));
			}
			else if(inp==11)
			{
				System.out.println("What number to find?");
				int n=input.nextInt();
				System.out.println("What number replaces?");
				int r=input.nextInt();
				findReplace(numbers,n,r);
				System.out.println("Replaced "+n+" with "+r);
			}
			else if(inp==12)
			{
				consecTen(numbers);
			}
			
			
		}
		
	}

}
