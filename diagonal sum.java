import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int sum=0;
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                if(i==j)
                {
                sum=sum+a[i][j];
                }
                
            }
        }
        System.out.print(sum);
}
}
