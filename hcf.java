 import java.util.Scanner;

  public class hcf {
      public static void main(String[] args) 
      {
         Scanner scan= new Scanner(System.in);
         System.out.print("enter a number:");
         int a=scan.nextInt();
         int sum=0;
         for(int i=1;i<a;i++)
         {
            if(a%i==0)
            {
                System.out.println("divisors="+i);
                sum=sum+i;
            }
         }
         System.out.println("sum of divisors="+sum);
         if(sum==a)
         {
            System.out.println("the given number "+a +" is a perfect number.");
         }
         else{
            System.out.println("the given number "+a+ " is not a perfect number.");
         }
         
      }
  }


    
          