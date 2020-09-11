import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.HashMap;

public class leetcode
{
    public static void main(String[] args) 
    {
        // LEETCODE - 1046 , LAST STONE WEIGHT ________________________________________
        int[] arr = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));
    }


    // LEETCODE - 1046 , LAST STONE WEIGHT ________________________________________
    public static int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : stones)
        {
            pq.add(ele);
        }

        while(pq.size() > 1)
        {
            int a = pq.remove();
            int b = pq.remove();

            int diff = Math.abs(a - b);
            if(diff != 0)
            {
                pq.add(diff);
            }
        }

        return pq.size() == 0 ? 0 : pq.peek();
    }


    // LEETCODE - 703 , LARGEST ELEMENT IN A STREAM ________________________________________________
    class KthLargest {

        public PriorityQueue<Integer> pq;
        public int k;
        public KthLargest(int k, int[] nums) 
        {
            this.pq = new PriorityQueue<>();
            this.k = k;
            
            for(int ele : nums)
            {
                pq.add(ele);
                if(pq.size() > k)
                {
                    pq.remove();
                }
            }
        }
        
        public int add(int val) 
        {
            pq.add(val);
            
            if(pq.size() > k)
            {
                pq.remove();
            }
            return pq.peek();
        }
    }
    


    // LEETCODE - 973 , KTH CLOSEST POINT TO THE ORIGIN______________________________________________
    // using comparable _____________________
    public static int[][] kClosest1(int[][] points, int K)
    {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i = 0 ; i < points.length ; i++)
        {
            pq.add(new Point(points[i][0] , points[i][1]));
            
            if(pq.size() > K)
            {
                pq.remove();
            }
        }
        
        int[][] arr = new int[pq.size()][2];
        int i = 0;
        while(pq.size() != 0)
        {
            Point rval = pq.remove();
            arr[i][0] = rval.x;
            arr[i][1] = rval.y;
            i++;
        }
        
        return arr;
    }
    
    public static class Point implements Comparable<Point>
    {
        int x ;
        int y ;
        
        public Point(int x , int y)
        {
            this.x = x;
            this.y = y;
        }
        
        public int compareTo(Point obj)
        {
            int a = (this.x) * (this.x) + (this.y) * (this.y);
            int b = (obj.x) * (obj.x) + (obj.y) * (obj.y);
            
            return b - a;
        }
    }



    // using lamda function _______________
    public static int[][] kClosest2(int[][] points, int K)
    {
        PriorityQueue<Point2> pq = new PriorityQueue<>((a,b) ->
        {
            int aval = (a.x) * (a.x) + (a.y) * (a.y);
            int bval = (b.x) * (b.x) + (b.y) * (b.y);
            
            return bval - aval;     // decreasing order (Greater Value , high Priority)
        });
        for(int i = 0 ; i < points.length ; i++)
        {
            pq.add(new Point2(points[i][0] , points[i][1]));
            
            if(pq.size() > K)
            {
                pq.remove();
            }
        }
        
        int[][] arr = new int[pq.size()][2];
        int i = 0;
        while(pq.size() != 0)
        {
            Point2 rval = pq.remove();
            arr[i][0] = rval.x;
            arr[i][1] = rval.y;
            i++;
        }
        
        return arr;
    }
    
    public static class Point2
    {
        int x ;
        int y ;
        
        public Point2(int x , int y)
        {
            this.x = x;
            this.y = y;
        }
    }


    // using arrays sort and not using extra class
    public static int[][] kClosest3(int[][] points, int K)
    {
        Arrays.sort(points, (p1, p2) -> {  // comparator
            return dist(p1) - dist(p2); // <
        });
        
        int[][] result = new int[K][2];
        
        for (int i = 0; i < K; ++i) 
        {
            result[i] = new int[] { points[i][0], points[i][1] };
        }
        return result;
    }
    
    
    public static int dist(int[] p)
    {
        return p[0] * p[0] + p[1] * p[1];
    }


    // Using priority queue and not using extra class
    public static int[][] kClosest4(int[][] points, int K)
    {
        Arrays.sort(points, (p1, p2) -> {  // comparator
            return dist(p1) - dist(p2); // <
        });
        
        int[][] result = new int[K][2];
        
        for (int i = 0; i < K; ++i) 
        {
            result[i] = new int[] { points[i][0], points[i][1] };
        }
        return result;
    }
    
    


    // LEETCODE - 451 , SORT CHARACTERS BY FREQUENCY _______________________________________________
    public static String frequencySort(String s) 
    {
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray())
        {
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a , b) ->
        {
            return map.get(b) - map.get(a);         // decreasing order
        });
    
        
        // CAN BE USED TO TRAVERSE MAP    
        // for (Map.Entry mapElement : map.entrySet()) 
        // { 
        //     char key = (char)mapElement.getKey(); 
  
        //     pq.add(key);
        // } 
        
        for(char key : map.keySet())
        {
            pq.add(key);
        }
        
        StringBuilder sb = new StringBuilder();
        while(pq.size() != 0)
        {
            char key = pq.remove();
            int count = map.get(key);
            
            while(count > 0)
            {
                sb.append(key);
                count--;
            }
        }
        
        return sb.toString();
    }



    // LEETCODE - 347 , TOP K FREQUENT ELEMENTS_____________________________________________
    public static int[] topKFrequent(int[] nums, int k)
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int ele : nums)
        {
            map.put(ele , map.getOrDefault(ele , 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->                                                             {
            return map.get(a) - map.get(b);                                                    
        });
        
        for(Integer key : map.keySet())
        {
            pq.add(key);
            if(pq.size() > k)
            {
                pq.remove();
            }
        }
        
        int[] ans = new int[pq.size()];
        int i = ans.length - 1;
        while(pq.size() != 0)
        {
            ans[i] = pq.remove();
            i--;
        }
        
        return ans;
    }
}