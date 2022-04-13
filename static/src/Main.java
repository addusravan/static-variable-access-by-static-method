
 class Test
{
    static int x = 100;
    int y = 100;
    public void increment()
    {
        x++; y++;
    }
    public static void main( String[] args )
    {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3= new Test();

        t1.increment();
        t2.increment();
        t3.increment();


        System.out.println(t3.y);
        System.out.println(Test.x);
    }
}
