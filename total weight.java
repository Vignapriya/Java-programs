import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        int sum=0;
        for(int i=0;i<=n-1;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<=n-1;i++)
        {
            sum=sum+a[i];
        }
        System.out.print(sum);
    }// You are using Java
}
