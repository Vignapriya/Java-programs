import java.util.Scanner;
class factorial
{
    public static void main (String args[])
    {
        int a,i,fact=1;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        for(i=1;i<=a;i++)
        {
            fact=fact*i;

        }
        System.out.print("the factorial is "+fact);
    }
    
}