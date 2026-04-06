import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>=15)
        {
            System.out.print("Welcome to the show");
        }
        else
        {
            System.out.println("Welcome to the show");
            System.out.print("Please note that you should be accompanied by an adult");
        }
    }// You are using Java
}
