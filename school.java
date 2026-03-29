import java.util.Scanner;
public class school
{
    
    String passorfail(int mark)
    {
        
        if(mark>=45)
        {
        return "pass";
        }
        else{
            return "fail";
        }
        
    }
    public static void main (String args[])
    {
        System.out.print("enter your mark:");
        Scanner scan=new Scanner(System.in);
        int mark=scan.nextInt();
        school obj1=new school();
        String a=obj1.passorfail(mark);
        System.out.print(a);

    }
}