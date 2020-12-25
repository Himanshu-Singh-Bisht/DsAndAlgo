class Test
{
    static void display1()
    {
        System.out.println("1");
    }

    void show()
    {
        System.out.println("2");
    }

    public static void main(String[] args) 
    {
        display1();     // it is called as static method can be called directly from static method directly

        // show();      // gives error
        Test t = new Test();
        t.show();

        Demo.display();     //from other class static method is called so we will need class name as refernce
    }
}