class Test
{
    public static void main(String[] args) {
        // static int b = 10;      // gives error because local variables can't be static
        System.out.println(Demo.a);     // no need of making object to access the static variable
    }
}