class B extends A
{
    int a = 20;

    public B()
    {
        // super();                // here , we don't need super() , 
                                // bcoz it is automatically applied by compiler to call A constuctor
        System.out.println("In B class Constructor");  
    }

    public void show(int a)
    {
        System.out.println(a);          // local variable
        System.out.println(this.a);     // intance variable of this current class object
        System.out.println(super.a);    // instance variable of parent class of the current class object.
    }


    public void m1()
    {
        System.out.println("m1 in B");
    }
    public void show2()
    {
        m1();           // m1 method in B
        super.m1();     // m1 method in parent class A
    }
    public static void main(String[] args) 
    {
        
        // B obj = new B();
        // obj.show(30);  
        
        // B obj2 = new B();
        // obj2.show2();

        B obj3 = new B();      // to call constuctor , B()
    }
}