package code;
import java.util.Scanner;
public class Main_bonegame {
	
	public static float calcProb(int n)
	{
		int tempRec=0;
		float higher = 0;
		for(int r=0;r<=1;r++)
		{
			for(int s=0;s<=1;s++)
			{
				for(int t=0;t<=1;t++)
				{
					for(int c=0;c<=1;c++)
					{
						for(int d=0;d<=1;d++)
						{
							tempRec=r+s+t*2+c*3+d*4;
							if(tempRec>n)
								higher++;
						}
					}
				}
			}
		}
		return(higher/32);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pointPl = 0,pointCPU=0;
		int Attempt = 1;
		int rec=0,squ=0,tri=0,cir=0, dia=0;
		int tempPoint = 0;
		
		
		String inp = "";
		String border = "=====================";
		System.out.println(calcProb(2));
		System.out.println("Welcome to Bone Game");
		System.out.println(border);
		System.out.println("Player: "+pointPl+"    CPU: "+pointCPU);
		System.out.println("Points:");
		System.out.println("Rectangles: 1, Squares: 1, Triangles: 2, Circles: 3, Diamonds: 4\n");
		while(pointPl<20&&pointCPU<20)
		{
			while(Attempt<=3)
			{
				System.out.println("Player throw: " + Attempt);
				rec=(int)(Math.random()*2);
				squ =(int)(Math.random()*2);
				tri =(int)(Math.random()*2)*2;
				cir =(int)(Math.random()*2)*3;
				dia =(int)(Math.random()*2)*4;
				System.out.println("Roll: " + " Rec: "+rec+" squ: "+squ+" tri: "+tri+" cir: "+cir+" Dia: "+dia);
				tempPoint = rec+squ+tri+cir+dia;
				System.out.println("Points rolled: "+tempPoint);
				System.out.println("Player total: "+(tempPoint+pointPl) +"   CPU total: " +pointCPU);
				if(Attempt<3)
				{
					System.out.println("Roll again? (y/n)");
					inp=input.next();
					while(!inp.equals("y")&&!inp.equals("n"))
					{
						System.out.println("Roll again? (y/n)");
						inp=input.next();
					}
				}
				if(inp.equals("n") || Attempt>=3)
				{
					Attempt=10;
					pointPl+=tempPoint;
					System.out.println("Player turn finished.\n");
				}
				Attempt++;
//				inp=input.nextLine();
			}
			System.out.println("Type anything to continue.");
			inp=input.next();
			Attempt=1;
			while(Attempt<=3)
			{
				System.out.println("CPU throw: " + Attempt);
				rec=(int)(Math.random()*2);
				squ =(int)(Math.random()*2);
				tri =(int)(Math.random()*2)*2;
				cir =(int)(Math.random()*2)*3;
				dia =(int)(Math.random()*2)*4;
				System.out.println("Roll: " + " Rec: "+rec+" squ: "+squ+" tri: "+tri+" cir: "+cir+" Dia: "+dia+"\n");
				tempPoint = rec+squ+tri+cir+dia;
				System.out.println("Points rolled: "+tempPoint);
				System.out.println("Player total: "+(pointPl) +"   CPU total: " +(tempPoint+pointCPU));
				if(Attempt<3)
				{
					if(pointPl>=20 && tempPoint+pointCPU<pointPl)
					{
						System.out.println("Player is higher... Roll again.");
					}
						
					else if(calcProb(tempPoint)<0.5 || ((pointCPU+tempPoint)>=20 && (pointCPU+tempPoint>=pointPl)))
					{
						Attempt+=10;
						pointCPU+=tempPoint;
					}
					System.out.println("Probability of getting higher: "+(calcProb(tempPoint))+"\nCPU turn finished.");
				}
				else
				{					
					pointCPU+=tempPoint;
					Attempt=10;
				}
				Attempt++;
				System.out.println(border);
			}
			System.out.println("CPU turn finished.");
			System.out.println(border);
			Attempt=1;
		}
		System.out.println(border);
		if(pointPl>pointCPU)
			System.out.println("Player wins!");
		else if(pointCPU>pointPl)
			System.out.println("CPU wins!");
		else
			System.out.println("Tie!");
		System.out.println(border);
	}

}
