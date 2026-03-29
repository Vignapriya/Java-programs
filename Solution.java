
import java.util.Scanner;
class Solution {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int original=0;
        while(num>0)
        {
            int rem=num%10;
            original=original*10+rem;
            num=num/10;
        }
        System.out.println(original);

        
    }
}