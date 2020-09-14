import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class leetcode
{
    public static void main(String[] args) 
    {
        // LEETCODE - 1046 , LAST STONE WEIGHT ________________________________________
        // int[] arr = {2,7,4,1,8,1};
        // System.out.println(lastStoneWeight(arr));        // o/p = 1



        // LEETCODE - 703 , KTH LARGEST ELEMENT IN A STREAM ___________________________________
        // int k = 3;
        // int[] arr = {4,5,8,2};
        // KthLargest kthLargest = new KthLargest(k, arr);
        // System.out.println(kthLargest.add(3));   // returns 4
        // System.out.println(kthLargest.add(5));   // returns 5
        // System.out.println(kthLargest.add(10));  // returns 5
        // System.out.println(kthLargest.add(9));   // returns 8
        // System.out.println(kthLargest.add(4));   // returns 8



        // LEETCODE - 973 , KTH CLOSEST POINT TO ORIGIN ________________________________________
        // int[][] points = {{3,3} ,{5,-1},{-2,4}} ; 
        // int K = 2;

        // int[][] ans = kClosest1(points, K);
        // int[][] ans = kClosest2(points, K);
        // int[][] ans = kClosest3(points, K);
        // int[][] ans = kClosest4(points, K);
        // display2d(ans);



        // LEETCODE - 451 , SORT CHARACTERS BY FREQUENCY ______________________________
        // System.out.println(frequencySort("Aabb"));      // o/p = bbAa


        // LEETCODE - 347 , TOP K FREQUENT ELEMENTS ___________________________________
        // int[] nums = {1,1,1,2,2,3};
        // int k = 2;
        // int[] ans = topKFrequent(nums, k);
        // display(ans);


        // LEETCODE - 215 , KTH LARGEST ELEMENT IN AN ARRAY ____________________________________
        // int[] arr = {3,2,1,5,6,4};
        // int k = 2;
        // System.out.println(findKthLargest(arr, k));



        // LEETCODE - 378 , KTH SMALLEST ELEMENT IN A SORTED MATRIX ________________________________
        // int[][] matrix = {{ 1,  5,  9},
        //             {10, 11, 13},
        //             {12, 13, 15}};      
        // int k = 8;

        // System.out.println(kthSmallest(matrix, k));   // o/p - 13



        // LEETCODE - 692 , TOP K FREQUENT WORDS _____________________________________
        // String[] arr = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}; 
        // int k = 4;
        // Output: ["the", "is", "sunny", "day"]
        // System.out.println(topKFrequent(arr, k));
        

        // LEETCODE - 767 , REORGANIZE STRING ______________________________________________
        // String str = "aab";  //    "aba"   ,  "aaab" = ""
        // System.out.println(reorganizeString(str));



        // TO SORT K-SORTED LIST(NEARLY SORTED LIST) ______________________________________
        // int[] arr = {2 , 3 , 1 , 4 , 6 , 7 , 5 , 8 , 9};
        // int k = 2;
        // int[] ans = sortKSortedList(arr , k);
        // display(ans);


        // LEETCODE - 295 , FIND MEDIAN FROM DATA STREAM _________________________________________
        // MedianFinder mpq = new MedianFinder();
        // mpq.addNum(1);
        // mpq.addNum(2);
        // System.out.println(mpq.findMedian()); // -> 1.5
        // mpq.addNum(3); 
        // System.out.println(mpq.findMedian()); // -> 2


        // LEETCODE - 23 , MERGE K SORTED LIST______________________________________________
        // Input: lists = [[1,4,5],[1,3,4],[2,6]]
        // Output: [1,1,2,3,4,4,5,6]
        // mergeKLists(lists);
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
    public static class KthLargest 
    {
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



    // LEETCODE - 215 , KTH LARGEST ELEMENT IN AN ARRAY ________________________________
    public static int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int ele : nums)
        {
            pq.add(ele);
            if(pq.size() > k)
            {
                pq.remove();
            }
        }
        
        return pq.peek();
    }


    // LEETCODE - 378 , KTH SMALLEST ELEMENT IN A SORTED MATRIX ___________________________________
    public static int kthSmallest(int[][] matrix, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[0].length ; j++)
            {
                if(pq.size() < k)
                {
                    pq.add(matrix[i][j]);
                }
                else if(pq.peek() > matrix[i][j])
                {
                    pq.remove();
                    pq.add(matrix[i][j]);
                }
                else if(pq.peek() < matrix[i][j])
                {
                    break;
                }
            }
        }
        
        return pq.peek();
    }




    // LEETCODE - 692 , TOP K FREQUENT WORDS  __________________________________________________
    public static List<String> topKFrequent(String[] words, int k)
    {
        HashMap<String , Integer> map = new HashMap<>();
        for(String ele : words)
        {
            map.put(ele , map.getOrDefault(ele , 0) + 1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) ->                                                               {
            if(map.get(a) == map.get(b))
            {
                return b.compareTo(a);
            }
            return map.get(a) - map.get(b);                                                 
        });
        
        for(String key : map.keySet())
        {
            pq.add(key);
            if(pq.size() > k)
            {
                pq.remove();
            }
        }
        
        List<String> list = new ArrayList<>();
        while(pq.size() != 0)
        {
            list.add(pq.remove());
        }
        
        Collections.reverse(list);
        return list;
    }
    

    // LEETCODE - 767 , REORGANISE STRING ____________________________________________________
    public static String reorganizeString(String S)
    {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char c : S.toCharArray())
        {
            map.put(c , map.getOrDefault(c , 0) + 1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->                                                  
        {
             return map.get(b) - map.get(a);                                                
        });
        
        pq.addAll(map.keySet());
        
        StringBuilder ans = new StringBuilder();
        while(pq.size() > 1)
        {
            char curr = pq.remove();
            char next = pq.remove();
            
            ans.append(curr);
            ans.append(next);
            
            map.put(curr , map.get(curr) - 1);
            map.put(next , map.get(next) - 1);
            
            if(map.get(curr) > 0)
            {
                pq.add(curr);
            }
            if(map.get(next) > 0)
            {
                pq.add(next);
            }
        }
        
        while(!pq.isEmpty())
        {
            char last = pq.remove();
            if(map.get(last) > 1)
            {
                return "";
            }
            else
            {
                ans.append(last);
            }
        }
        
        return ans.toString();
    }



    // TO SORT K-SORTED LIST (NEARLY SORTED LIST) ____________________________________________
    public static int[] sortKSortedList(int[] arr , int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i <= k ; i++)
        {
            pq.add(arr[i]);
        }

        int[] ans = new int[arr.length];
        for(int i = k + 1 ; i < arr.length ; i++)
        {
            ans[i - k - 1] = pq.remove();
            pq.add(arr[i]);
        }

        int j = arr.length - 1 - k;
        while(pq.size() != 0)
        {
            ans[j] = pq.remove();
            j++;
        }

        return ans;
    }



    // LEETCODE - 295 , FIND MEDIAN FROM DATA STREAM ____________________________________________
    public static class MedianFinder {

        /** initialize your data structure here. */
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;
        public MedianFinder() 
        {
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }
        
        public void addNum(int num) 
        {
            if(right.size() > 0 && num >= right.peek())
            {
                right.add(num);
            }
            else
            {
                left.add(num);
            }
            
            if(left.size() - right.size() == 2)
            {
                right.add(left.remove());
            }
            else if(right.size() - left.size() == 2)
            {
                left.add(right.remove());
            }
        }
        
        public double findMedian() 
        {
            if(left.size() > right.size())
            {
                return (double)(left.peek());
            }
            else if(right.size() > left.size())
            {
                return (double)(right.peek());
            }
            else
            {
                double val = (double)(left.peek() + right.peek()) / 2;
                return val;
            }
        }
    }




    // LEETCODE - 23 , MERGE K SORTED LISTS ______________________________________________________
    public static class ListNode 
    {
        int val;
        ListNode next;
        ListNode(int x) 
        { 
            val = x;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists) 
    {
        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>((a,b) -> { 
                                                                return a.val - b.val;});
        for(ListNode l : lists){
            if(l != null)
            {
                q.add(l);
            }        
        }
        ListNode head = new ListNode(0);
        ListNode point = head;
        while(!q.isEmpty())
        { 
            point.next = q.poll();
            point = point.next; 
            ListNode next = point.next;
            if(next != null)
            {
                q.add(next);
            }
        }
        return head.next;
    }


    // HELPER FUNCTIONS _______________________________________________________
    public static void display2d(int[][] arr)
    {
        for(int[] ar : arr)
        {
            System.out.println("[" + ar[0] + "," + ar[1] + "]");
        }
    }

    public static void display(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }
}