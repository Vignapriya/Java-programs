import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if((n<=100)&&(n>=85))
        {
            System.out.print("A");
        }
        else if((n<=84)&&(n>=75))
        {
            System.out.print("B");
        }
        else if((n<=74)&&(n>=65))
        {
            System.out.print("C");
        }
        else if((n<=64)&&(n>=0))
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("Invalid");
        }
    }// You are using Java
}
