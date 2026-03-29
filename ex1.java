import java.util.Scanner;
class ex1
{
    public static void main (String args[])
    {
        Scanner great = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = great.nextInt();
        int b = great.nextInt();
        int c=great.nextInt();
        if(a>b) && (a>c)
        {
            System.out.print(a "is greatest among three");
        elseif(b>c)
        {
            System.out.print(b "is greatest among three");
        else 
        {
            System.out.print(c "is greatest among three");
        }
        }
        }



    }
}