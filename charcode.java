import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        char code=scan.next().charAt(0);
        if(n<=500)
        {
            int sum=n+code;
            System.out.print(sum);
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}// You are using Java
