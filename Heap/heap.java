import java.util.ArrayList;

public class heap
{
    ArrayList<Integer> arr ;

    // MAX HEAP _________
    public heap()
    {
        this.arr = new ArrayList<>();
    }

    public heap(int[] ar)           // in O(n)
    {
        this.arr = new ArrayList<>();

        for(int ele : ar)
  
        {
            arr.add(ele);
        }

        for(int i = arr.size() / 2 - 1 ; i >= 0 ; i--)      // appears to be O(nlog(n)) but it is O(n) 
        {
            downheapify(i);         // log(n)
        }
    }


    // to add in heap ________________
    public void add(int data)
    {
        arr.add(data);
        upheapify(arr.size() - 1);
    }

    public void upheapify(int idx)
    {
        if(idx == 0)
        {
            return;
        }

        int pi = (idx - 1) / 2;

        if(arr.get(idx) > arr.get(pi))
        {
            swap(idx , pi);
            upheapify(pi);
        }
    }

    public void swap(int i , int j)
    {
        int temp = arr.get(i);
        arr.set(i , arr.get(j));
        arr.set(j , temp);
    }


    // to remove from heap ___________
    public int remove()
    {
        if(arr.size() == 0)
        {
            System.out.println("Underflow");
            return -1;
        }

        swap(0 , arr.size() - 1);

        int val = arr.remove(arr.size() - 1);
        downheapify(0);

        return val;
    }

    public void downheapify(int pi)
    {
        int maxIdx = pi;

        int lci = 2 * pi + 1;
        if(lci < arr.size() && arr.get(lci) > arr.get(maxIdx))
        {
            maxIdx = lci;
        }

        int rci = 2 * pi + 2;
        if(rci < arr.size() && arr.get(rci) > arr.get(maxIdx))
        {
            maxIdx = rci;
        }

        if(maxIdx != pi)
        {
            swap(maxIdx , pi);
            downheapify(maxIdx);
        }
    }

    // to update in heap ___________________
    public void update(int idx , int data)
    {
        if(idx >= arr.size())
        {
            return;
        }
        arr.set(idx , data);

        upheapify(idx); // as the value updated can be bigger than the parent idx (for Max Heap)
        downheapify(idx);  // as the value updated can be smaller than the child idx (for Max Heap)
    }


    // to get peek value 
    public int peek()
    {
        if(arr.size() == 0)
        {
            System.out.println("Underflow");
            return -1;
        }

        return arr.get(0);
    }


    // to get size ___________
    public int size()
    {
        return arr.size();
    }
}