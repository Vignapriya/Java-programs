import java.util.Scanner;
class garden
{
    int amount,price,count;
    void total()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the quantity:");
        count=scan.nextInt();
        System.out.print("enter the price:");
        price=scan.nextInt();
        amount=price*count;
        System.out.print("total amount="+amount);


    }
    public static void main (String args[])
    {
        garden obj1=new garden();
        obj1.total();
    }
}