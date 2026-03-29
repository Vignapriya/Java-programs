import java.util.Scanner;

class fibo
{
    public static void main (String args[])
    {
        
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.print("invalid");
        }
        else if(n==1)
        {
            System.out.print("series:0");
        }
        else if(n==2)
        {
            System.out.print("series:0,1");

        }
        else{
            int a,b,c;
            a=0;
            b=1;
            for(i=3;i<=n;i++)
            {
                
                c=a+b;
                a=b;
                b=c;


            
            System.out.println(c);
            }
        }
        
    }
}