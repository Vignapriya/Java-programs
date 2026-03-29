class arithmetic
{
    void add(int a, int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    void sub(int a,int b)
    {
        int c=a-b;
        System.out.println(c);
    }
    void multiply(int a,int b)
    {
        int c=a*b;
        System.out.println(c);
    
    }
    void divide(int a,int b)
    {
        int c=a/b;
        System.out.println(c);
    }
    public static void main (String args[])
    {
        arithmetic obj1=new arithmetic();
        obj1.add(10,20);
        obj1.sub(15,5);
        obj1.multiply(2,3);
        obj1.divide(100,10);


    }
}