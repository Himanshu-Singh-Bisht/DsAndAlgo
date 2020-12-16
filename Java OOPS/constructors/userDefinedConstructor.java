public class userDefinedConstructor
{
    int a;
    String b;
    public userDefinedConstructor()
    {
        a = 10;
        b = "abc";
    }

    public static void main(String[] args) 
    {
        userDefinedConstructor obj = new userDefinedConstructor();
        System.out.println(obj.a + " " + obj.b);        // here , all objects of this class will be initialized
                                                        // with the values given in the constructor    
    }
}