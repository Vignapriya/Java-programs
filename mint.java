import java.util.Scanner;
public class mint
{
	public static void main(String[] args) 
	{
	    int temp;
	    Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
		    }
		}
		int min=a[1]-a[0];
		for(int i=0;i<n-1;i++)
		{
		    int diff=a[i+1]-a[i];
		    if(diff<min)
		    {
		        min=diff;
		    }
		}
		for(int i=0;i<n-1;i++)
		{
		    if(a[i+1]-a[i]==min)
		    {
		        System.out.print(a[i]+" "+a[i+1]+" ");
		    }
		}
	}
}