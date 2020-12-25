class Test
{
    public static void main(String[] args) {
        int a = 10;
        a = a + 10;
        System.out.println(a);      // o/p = 20

        final int b = 10;
        b = b + 10;                 // gives error as b is final so it's value can't change
        System.out.println(b);
    }
}