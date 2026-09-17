package coins;

import java.util.Scanner;


public class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    float inp = input.nextFloat();
    int count = 0;
    int amt=0;
    amt = (int) (inp/2);
    inp-=amt*2;
    count+=amt;
    
    amt = (int) (inp/1);
    inp-=amt*1;
    count+=amt;
    
    amt = (int) (inp/0.5);
    inp-=amt*0.5;
    count+=amt;
    
    amt = (int) (inp/0.25);
    inp-=amt*0.25;
    count+=amt;
    
    amt = (int) (inp/0.1);
    inp-=amt*0.1;
    count+=amt;

    amt = (int) (inp/0.05);
    inp-=amt*0.05;
    count+=amt;
    // if(count==7)
    // count=8;
    
    
    
    
    System.out.println(count);
  } 
}