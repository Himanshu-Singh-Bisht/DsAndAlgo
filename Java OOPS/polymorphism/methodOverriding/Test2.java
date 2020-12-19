class Test2 extends Test1
{
    public void show()
    {
        System.out.println("2");
    }

    public static void main(String[] args) 
    {
        Test1 t1 = new Test1();
        t1.show();

        Test2 t2 = new Test2();
        t2.show();
    }
}