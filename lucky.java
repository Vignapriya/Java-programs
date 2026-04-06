import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int rem=n%10;
        if((rem==3)||(rem==8))
        {
            System.out.print("Lucky Winner");
        }
        else
        {
            System.out.print("Not a Lucky Winner.");
        }
    }// You are using Java
}
