import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []arr=new int[size];
        int sum=0;
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                System.out.println("money robbed in house "+ (i+1) +" is " + arr[i]);
                sum=sum+arr[i];
            }
        }
        System.out.println("total money robbed="+sum);

    }
}