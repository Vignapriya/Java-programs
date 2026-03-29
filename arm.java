import java.util.Scanner;
class arm
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int original=a;
        int rev=0;
        while(a>0)
        {
            int r=a%10;
            rev=rev+r*r*r;
            a=a/10;


        }
        if(original==rev)
        {
            System.out.print("armstrong");
        }
        else{
            System.out.print("not armstrong");
        }
    }
}