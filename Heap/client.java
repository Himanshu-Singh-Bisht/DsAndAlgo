import java.util.ArrayList;

public class client
{
    public static void main(String[] args)
    {

        // My Heap with Max Heap ________________________________________
        // heap pq = new heap();
        // pq.add(100);
        // pq.add(10);
        // pq.add(90);
        // pq.add(200);
        // System.out.println(pq.peek());
        // System.out.println(pq.remove());
        // System.out.println(pq.peek());

        // int[] ar = {10 , 2 , 30 , -2 , -3, -4, 5 , 6 , 8 , 7 , 22 , 11 , 13 , 40 , 1};
        // heap pq2 = new heap(ar);
        // System.out.println(pq2.remove());



        // My Heap having both max and min using boolean operator _____________________
        heap2 pq3 = new heap2(true);  // to make MaxHeap
        pq3.add(100);
        pq3.add(10);
        pq3.add(90);
        pq3.add(200);
        System.out.println(pq3.peek());
        System.out.println(pq3.remove());
        System.out.println(pq3.peek());


        heap2 pq4 = new heap2(false);       // to make MinHeap
        pq4.add(100);
        pq4.add(10);
        pq4.add(90);
        pq4.add(200);
        System.out.println(pq4.peek());
        System.out.println(pq4.remove());
        System.out.println(pq4.peek());


        int[] ar = {10 , 2 , 30 , -2 , -3, -4, 5 , 6 , 8 , 7 , 22 , 11 , 13 , 40 , 1};
        heap2 pq5 = new heap2(ar , true);    // max Heap
        System.out.println(pq5.remove()); 

        heap2 pq6 = new heap2(ar , false);     // min heap
        System.out.println(pq6.remove());

        
    }


    public static class heap2
    {
        private ArrayList<Integer> arr;
        private boolean isMax = false;

        public heap2(boolean isMax)         // isMax = true -> Max Heap  ;  isMax = false -> Min Heap
        {
            arr = new ArrayList<>();
            this.isMax = isMax;
        }

        public heap2(int[] ar,boolean isMax)
        {
            this.isMax = isMax;
            this.arr = new ArrayList<>();

            for(int ele : ar)
            {
                arr.add(ele);
            }

            for(int i = arr.size()/ 2 - 1 ; i >= 0 ; i--)
            {
                downheapify(i);
            }
        }


        public void add(int data)
        {
            this.arr.add(data);
            upheapify(arr.size() - 1);
        }

        public void upheapify(int i)
        {
            if(i == 0)
            {
                return;
            }

            int pi = (i - 1) / 2;
            if(compareTo(i , pi) > 0)
            {
                swap(i , pi);
                upheapify(pi);
            }
        }


        public int remove()
        {
            if(this.size() == 0)
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
            int idx = pi;

            int lci = (2 * pi) + 1;
            if(lci < arr.size() && compareTo(lci , idx) > 0)
            {
                idx = lci;
            }
            
            int rci = 2 * pi + 2;
            if(rci < arr.size() && compareTo(rci , idx) > 0)
            {
                idx = rci;
            }

            if(idx != pi)
            {
                swap(pi , idx);
                downheapify(idx);
            }
        }


        public int compareTo(int child , int par)
        {
            if(this.isMax)      // for max heap
            {
                return arr.get(child) - arr.get(par);
            }
            else                // for min heap
            {
                return arr.get(par) - arr.get(child);
            }
        }


        public int peek()
        {
            if(this.arr.size() == 0)
            {
                System.out.println("Underflow");
                return -1;
            }

            return arr.get(0);
        }

        public int size()
        {
            return this.arr.size();
        }


        public void update(int i , int val)
        {
            if(i >= this.arr.size())
            {
                return;
            }
            arr.set(i , val);
            upheapify(i);
            downheapify(i);
        }
        public void swap(int i , int j)
        {
            int ith = arr.get(i);
            int jth = arr.get(j);

            arr.set(i , jth);
            arr.set(j , ith);
        }
    }
}