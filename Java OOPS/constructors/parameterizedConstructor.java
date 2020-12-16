public class parameterizedConstructor
{
    int a;
    String b;

    public parameterizedConstructor(int c , String d)
    {
        a = c;
        b = d;
    }

    public static void main(String[] args) 
    {   
        parameterizedConstructor obj = new parameterizedConstructor(20, "jkl");
        System.out.println(obj.a + " " + obj.b);


        // parameterizedConstructor obj2 = new parameterizedConstructor(); // gives error bcoz if constructor 
                                                // is defined then it will not create any default constructor.
    }
}