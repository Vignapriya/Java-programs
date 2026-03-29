import java.util.Scanner;
class prime
{
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int i=1;
        boolean is_prime=true;
        while(i<a)
        {
            if(a%i==0)
            {
                is_prime=false;
                i=i++;
            }
        }
        
            if(is_prime==true)
            {
                System.out.print("prime");
            }
          
            else{
                System.out.print("not prime");

            }
        
    }
}