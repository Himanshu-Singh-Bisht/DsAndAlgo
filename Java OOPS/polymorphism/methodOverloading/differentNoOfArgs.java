class differentNoOfArgs
{
    public void show()
    {
        System.out.println("1");
    }

    public void show(int a)
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        differentNoOfArgs obj = new differentNoOfArgs();
        obj.show();
        obj.show(10);
    }
}