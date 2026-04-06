import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    int y=scan.nextInt();
    int z=scan.nextInt();
    if((x<=0)||(y<=0)||(z<=0))
    {
        System.out.print("Invalid");
    }// You are using Java
    else
    {
        int exp=(-x+(y*z));
        System.out.print(exp);
    }
    }
}
