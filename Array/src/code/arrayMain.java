package code;

public class arrayMain {
	public static void display(int[][] numbers)
	{
		for(int x=0;x<20;x++)
		{
			for(int y =0;y<20;y++)
			{
				if(numbers[x][y]<10)						
					System.out.print(numbers[x][y]+"  ");
				else
					System.out.print(numbers[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void find3x3(int[][] array)
	{
		int sum=0;
		int highest=0;
		int high[]=new int[2];
		for(int x =0;x<=17;x++)
		{
			for(int y=0;y<=17;y++)
			{
				
				for(int xs =0;xs<3;xs++)
				{
					for(int ys=0;ys<3;ys++)
					{
//						System.out.println(x+" "+y+" "+ (x+xs)+" "+(y+ys));
						
						sum+=array[x+xs][y+ys];
					}	
				}
				if(sum> highest)
				{
					high[0]=y;
					high[1]=x;
					highest=sum;
				}
				sum=0;
			}
				
		}
		System.out.println("Highest sum: " + highest);
		System.out.println("Index: "+high[0]+" "+high[1]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]numbers = new int[20][20];
		/*for(int x=0;x<20;x++)
		{
			for(int y =0;y<20;y++)
			{
				numbers[x][y]=(int)(Math.random()*100);
				 
			}
		}
		*/
		numbers [15][5] = 1;
		numbers [15][6] = 1;
		numbers [0][0] = 1;
		display(numbers);
		find3x3(numbers);
	}

}
