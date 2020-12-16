public class defaultConstructor
{
    int a;
    String b;

    public static void main(String[] args)
    {
        defaultConstructor obj = new defaultConstructor();
        System.out.println(obj.a + " " + obj.b);        // here compiler makes a default constructor where
                                                        // it gives default values to all the data members
                                                        
    }
}