import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        double d=scan.nextDouble();
        double total=a+b+c+d;
        System.out.println("Total expenses: Rs."+total);
        double brand=(a/total)*100;
        double travel=(b/total)*100;
        double food=(c/total)*100;
        double logi=(d/total)*100;
        System.out.println("Branding expenses percentage: "+brand+"%");
        System.out.println("Travel expenses percentage: "+travel+"%");
        System.out.println("Food expenses percentage: "+food+"%");
        System.out.println("Logistics expenses percentage: "+logi+"%");
    }
}

