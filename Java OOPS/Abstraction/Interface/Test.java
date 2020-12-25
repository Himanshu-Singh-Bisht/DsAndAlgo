interface I1
{
    public abstract void show();     // only public can be present
}

interface I2
{
    public abstract void display();

    default void run()                  // default concrete methods are also accepted
    {

    }

    static void jump()                  // static concrete methods are also accepted
    {

    }
}

class Test implements I1 , I2
{
    public void show()
    {
        System.out.println("1");
    }

    public void display()
    {
        System.out.println("2");
    }


    public static void main(String[] args) 
    {
        // I1 i = new I1();        // interface can't be instantiated
        
        Test t = new Test();
        t.show();
        t.display();
    }
}