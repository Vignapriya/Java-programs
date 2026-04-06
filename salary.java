import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sal=0;
        for(int i=1;i<=n;i++)
        {
            sal=(2*sal)+10;

        }
        System.out.print(sal);
    }
}// You are using Java
