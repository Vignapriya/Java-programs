import java.util.Scanner;
public class find
{
        
    
    void evenorodd()
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        if(a%2==0)
        {
            System.out.print("even");
        }
        else
        {
            System.out.print("odd");
        }
    }
        public static void main (String args[])
        {
            find f1=new find();
            
            f1.evenorodd();

        }

    }
    
