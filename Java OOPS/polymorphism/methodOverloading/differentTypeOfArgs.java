class differentTypeOfArgs
{
    public void show(int a)
    {
        System.out.println(a);
    }

    public void show(String a)
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        differentTypeOfArgs obj = new differentTypeOfArgs();
        obj.show(10);
        obj.show("hello");
    }
}