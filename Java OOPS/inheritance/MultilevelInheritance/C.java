public class C extends B
{
    public void showC()
    {
        System.out.println("This is C class.");
    }

    public static void main(String[] args) 
    {
        A obj1 = new A();
        obj1.showA();
        // obj1.showB();   // not possible
        // obj1.showC();       // not possible
        System.out.println("----------------------------------");
        
        B obj2 = new B();
        obj2.showA();
        obj2.showB();
        // obj2.showC();   // not possible
        System.out.println("----------------------------------");

        C obj3 = new C();
        obj3.showA();
        obj3.showB();
        obj3.showC();
    }
}