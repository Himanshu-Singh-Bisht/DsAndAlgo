class Test extends Demo
{
    public void A()
    {
        System.out.println("A In Test Class");
    }

    public void B()         
    {
        System.out.println("B in Test");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.A();
        obj.B();    // this method will be give error as B() in Demo is final so it can't be overriden
    }
}