public class heapSort
{
    public static void main(String[] args)
    {
        int[] arr = {10 , 20 , 30 , -2, -3 , -4 , 5 , 6, 7 , 8 , 9 , 22 , 11 , 13};

        boolean isMax = true;     // true = maxHeap (increasing sorting), 
        // boolean isMax = false ;   // false = minHeap (decreasing sorting)
        for(int i = arr.length / 2 - 1 ; i >= 0 ; i--)
        {
            downheapify(arr, i, arr.length -1 , isMax);
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int ele : arr)
            {
                System.out.print(ele + " ");
            }
            System.out.println();
            swap(arr , 0 , arr.length - 1 - i);
            downheapify(arr, 0, arr.length - 1 - i - 1 , isMax);
        }

        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }


    public static void downheapify(int[] arr ,int pi , int lidx , boolean isMax)
    {
        int idx = pi;
        int lci = 2 * pi + 1;

        if(lci <= lidx && compareTo(arr , lci , idx , isMax) > 0)
        {
            idx = lci;
        }

        int rci = 2 * pi + 2;
        if(rci <= lidx && compareTo(arr , rci , idx , isMax) > 0)
        {
            idx = rci;
        }

        if(idx != pi)
        {
            swap(arr , idx , pi);
            downheapify(arr , idx , lidx , isMax);
        }
    }

    public static int compareTo(int[] arr , int child , int par , boolean isMax)
    {
        if(isMax)
        {
            return arr[child] - arr[par];
        }
        else
        {
            return arr[par] - arr[child];
        }
    }

    public static void swap(int[] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}