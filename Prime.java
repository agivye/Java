package assignment;

import java.util.Scanner;

/**
 *
 * @author Agivye
 */
public class Prime {
    
    
    public static void main(String[] args){
      
	boolean IsPrime=true;
	Scanner prime= new Scanner(System.in);
	System.out.println("Enter a number for check:");
	
	int num=prime.nextInt();
	for(int i=2; i<=num/2; i++)
	{
          int fill=num%i;
	   if(fill==0)
	   {
	      IsPrime=false;
	      break;
	   }
	}
	
	if(IsPrime)
	   System.out.println(num + " is Prime Number");
	else
	   System.out.println(num + " is not Prime Number");
    }
    
    
}
