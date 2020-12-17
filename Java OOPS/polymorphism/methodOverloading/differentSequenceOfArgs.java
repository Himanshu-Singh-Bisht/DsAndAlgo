class differentSequenceOfArgs
{
    public void show(int a , String b)
    {
        System.out.println(a + " " + b);
    }

    public void show(String a , int b)
    {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        differentSequenceOfArgs obj = new differentSequenceOfArgs();
        obj.show(1 , "abc");
        obj.show("def" , 2);
    }
}