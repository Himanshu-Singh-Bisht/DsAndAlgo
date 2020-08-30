public class dynamicStack extends myStack
{
    public dynamicStack()
    {
        super();
    }

    public dynamicStack(int size)
    {
        super(size);
    }

    public dynamicStack(int[] arr)
    {
        super(arr);
    }


    @Override
    public void pushData(int data)
    {
        if(tos + 1 == st.length)
        {
            int[] temp = st;
            st = new int[2 * temp.length];

            for(int i = 0; i < temp.length ; i++)
            {
                st[i] = temp[i];
            }
        }

        super.pushData(data);
    }


    int b = 30;
    int c = 40;

    public void fun()
    {
        System.out.println(b);
        System.out.println("Hello, Dynamic Stack");
    }

    public void fun2()
    {
        System.out.println("hi!!!!!!!!!!!!!!!!!!!");
    }
}