class palindrome
{
    public static void main (String args[])
    {
    int num=122,rev=0,temp=num;
    
    while(num>0)
    {
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        
    }
    if(temp == rev)
    {
        System.out.print("palindrome");
        
    }
    else{
        System.out.print("not palindrome");
    }
}
}