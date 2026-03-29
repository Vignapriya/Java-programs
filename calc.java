import java.util.Scanner;
public class calc
{
    
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter 1st no:");
        int a=scan.nextInt();
        System.out.print("enter 2nd no:");
        int b=scan.nextInt();
        System.out.print("enter case:");
        int ans=scan.nextInt();
        switch(ans)
        {
            case 1:
                System.out.print(a+b);
                break;
            case 2:
                System.out.print(a-b);
                break;
            case 3:
                System.out.print(a*b);
                break;
           case 4:
                System.out.print(a/b);
                break;
            
        }
    }
}