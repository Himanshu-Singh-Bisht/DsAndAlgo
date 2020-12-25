class Xyz
{
    int a;
    int b;
    int c;

    public void setValues(int i , int b , int c)
    {
        a = i;
        b = b;       // both will be considered as local variable so no change will occur to instance variable
        this.c = c;
    }

    public void show()
    {
        System.out.println(a + ", " + b + ", " + c);
    }
}