public class B extends A
{
    public void showB()
    {
        System.out.println("This is B class.");
    }

    public static void main(String[] args) 
    {
        A obj1 = new A();
        obj1.showA();
        // obj1.showB();       // This is not possible  (as A class doesn't inherit the B class)

        B obj = new B();
        obj.showB();
        obj.showA();   
    }
}