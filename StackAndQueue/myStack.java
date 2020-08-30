import java.util.Scanner;
import java.util.ArrayList;

public class myStack
{
    public static Scanner scn = new Scanner(System.in);

    protected int[] st;
    protected int tos = -1;     // by index
    // protected int tos = 0;    // by size

    public myStack()
    {
        this.st = new int[10];
    }

    public myStack(int size)
    {
        this.st = new int[size];
    }

    public myStack(int[] arr)
    {
        this.st = new int[2 * arr.length];
        for(int i = 0 ; i < arr.length ; i++)
        {
            this.st[i] = arr[i];
        }

        this.tos = arr.length - 1;
    }


    public void pushData(int data)
    {
        if(tos + 1 == st.length)
        {
            System.out.println("Stack Overflow :" + (tos + 1));
            return;
        }
        tos++;
        st[tos] = data;
    }

    public int topData()
    {
        if(tos == -1)
        {
            System.out.println("Stack Is Empty");
            return -1;
        }
        return st[tos];
    }

    public int size()
    {
        return tos + 1;
    }

    public int popData()
    {
        if(tos == -1)
        {
            System.out.println("Stack Is Empty");
            return -1;
        }

        int rdata = st[tos];
        st[tos] = 0;
        tos--; 
        return rdata;
    }

    
    public boolean isEmptyStack()
    {
        return tos > -1 ? true : false;
    }

    public void display()
    {
        for(int i = tos ; i >= 0 ; i--)
        {
            System.out.print(st[i] + " ");
        }
        System.out.println();
    }


    int a = 10;
    int b = 20;

    public void fun()
    {
        System.out.println(b);
        System.out.println("Hello, myStack");
    }

    public void fun1()
    {
        System.out.println("hi");
    }
}