import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        char c=scan.next().charAt(0);
        if((n<1)||(n>9))
        {
            System.out.print("Invalid Input");
        }
        else if((n>=1)&&(n<=9)&&(c=='r'))
        {
            System.out.print(n+5);
        }
        else
        {
            System.out.print(n);
        }
    }
}
