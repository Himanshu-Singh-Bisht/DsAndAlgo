public class myQueue
{
    protected int[] que;
    protected int size = 0;
    protected int head = 0;
    protected int tail = -1;

    public myQueue()
    {
        this.que = new int[10];
    }

    public myQueue(int size)
    {
        this.que = new int[size];
    }

    public myQueue(int[] arr)
    {
        this.que = new int[2 * arr.length];
        for(int i = 0 ; i < arr.length ; i++)
        {
            que[i] = arr[i];
        }
        this.tail = arr.length - 1;
    }


    public void push(int data)
    {
        if(this.size == que.length)
        {
            System.out.println("Queue is full");
            return;
        }
        this.tail = (this.tail + 1) % que.length;
        que[this.tail] = data;
        this.size++;
    }

    public int pop()
    {
        if(size == 0)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int rvalue = que[this.head];
        que[this.head] = 0;
        this.head = (this.head + 1) % que.length;
        this.size--;
        return rvalue;
    }

    public int size()
    {
        return this.size;
    }

    public boolean isEmpty()
    {
        return this.size == 0;
    }

    public int front()
    {
        if(this.size == 0)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return que[this.head];
    }

    public void display()
    {
        for(int i = 0 ; i < this.size ; i++)
        {
            int val = que[(this.head + i) % que.length];
            System.out.print(val + " ");
        }
        System.out.println();
    }
}