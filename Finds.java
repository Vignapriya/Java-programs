import java.util.Scanner;

public class Finds
{
    void evenorodd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        Finds obj = new Finds();
        obj.evenorodd(a);
    }
}
