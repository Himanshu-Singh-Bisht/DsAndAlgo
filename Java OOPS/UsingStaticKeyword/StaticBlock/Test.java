class Test
{
    static 
    {
        System.out.println("1st static block");
    }

    public static void main(String[] args) {
        System.out.println("In main");
    }

    static
    {
        System.out.println("2nd static block");
    }
}