import java.util.Scanner;
public class mains
{
    public static void main(String[] args)
    {
        int temp;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("sorted one:");
        for(int i=n-1;i>0;i--)
        {
            System.out.print(arr[i]+" ");
        }            
        
        System.out.print(arr[0]);
            
        }
}