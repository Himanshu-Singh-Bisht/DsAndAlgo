// static variables are present in class / method space and are only given value at the time of class loading.
// as static variable are for class not for object.

class CounterDemo
{
    int count = 0;
    static int totalCount = 0;

    public CounterDemo()
    {
        count++;
        totalCount++;
        System.out.println(count + " - " + totalCount);
    }

    public static void main(String[] args) {
        CounterDemo c1 = new CounterDemo();     // o/p = 1 - 1
        CounterDemo c2 = new CounterDemo();     // o/p = 1 - 2
        CounterDemo c3 = new CounterDemo();     // o/p = 1 - 3
    }
}