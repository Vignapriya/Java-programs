import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        while(n>0)
        {
            int rem=n%10;
            count=count+1;
            n=n/10;
        }
        System.out.print(count);
    }// You are using Java
}
