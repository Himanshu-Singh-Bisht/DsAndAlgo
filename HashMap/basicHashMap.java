import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

public class basicHashMap
{
    public static void main(String[] args)
    {
        // basicOperation1();
        // basicOperation2("absoxiocnankxen");
        // basicOperation3("absoxiocnankxen");


        // LEETCODE - 128 , LONGEST CONSECUTIVE SEQUENCE ____________________________________________
        // int[] nums = {1 , 14 , 2 , 13 , 4 , 8 , 9 , 10 , 11 , 12 , 5 , 6};
        // System.out.println(longestConsecutive(nums));


        // LEETCODE - 349 , INTERSECTION OF TWO ARRAYS ____________________________________________________
        // int[] nums1 = {1 , 2 , 2 , 1};
        // int[] nums2 = {2 , 2};
        // int[] ans = intersection(nums1, nums2);
        // display(ans);


        // LEETCODE - 350 , INTERSECTION OF TWO ARRAYS II ____________________________________________
        // int[] ans = intersect(nums1, nums2);
        // display(ans);



        // MY HASHMAP  WITH <INTEGER , INTEGER> 
        // MyHashMap map = new MyHashMap();
        // map.put(13 , 400);
        // map.put(23 , 800);
        // map.put(43 , 500);
        // map.put(33 , 500);
        // System.out.println(map);
        // System.out.println(map.containsKey(13));
        // System.out.println(map.get(13));
        // System.out.println(map.remove(43));
        // System.out.println(map.containsKey(14));
        // System.out.println(map.getOrDefault(15 , 78));
        // System.out.println(map.keySet());



        // MY GENERIC HASHMAP <K,V>
        MyHashMapGeneric<String , Integer> map = new MyHashMapGeneric<String , Integer>();
        map.put("himanshu" , 800);
        map.put("elon", 78);
        map.put("gate" , 8);
        map.put("anderson" , 890);
        System.out.println(map.get("anderson"));
        System.out.println(map);
        System.out.println(map.remove("himanshu"));
        System.out.println(map.containsKey("gate"));
        System.out.println(map.getOrDefault("vikas" , 900));
        System.out.println(map.keySet());
    }

    public static void basicOperation1()
    {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("India" , 135);
        map.put("China" , 180);
        map.put("USA" , 80);
        map.put("Australia" , 45);

        System.out.println(map);

        System.out.println(map.get("China"));
        map.put("Poland" , map.getOrDefault("Poland", 0) + 60);
        System.out.println(map);
    }

    public static void basicOperation2(String str)
    {
        HashMap<Character , Integer> map = new HashMap<>();

        for(char ch : str.toCharArray())
        {
            map.put(ch , map.getOrDefault(ch, 0) + 1);
        }

        for(Character ch : map.keySet())
        {
            System.out.println(ch + " -> " + map.get(ch));
        }
    }

    public static void basicOperation3(String str)
    {
        HashMap<Character , ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch , new ArrayList<>());
            }
            map.get(ch).add(i);
        }

        for(Character ch : map.keySet())
        {
            System.out.println(ch + " -> " + map.get(ch));
        }
    }


    // LEETCODE - 128 , LONGEST CONSECUTIVE SEQUENCE ___________________________________________
    public static int longestConsecutive(int[] nums) 
    {
        HashMap<Integer , Boolean> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i] , false);
        }
        
        for(Integer key : map.keySet())
        {
            if(!map.containsKey(key - 1))
            {
                map.put(key , true);
            }
        }
        
        int count = 0;
        int number = -1;
        
        for(Integer key : map.keySet())
        {
            if(map.get(key) == true)
            {
                int num = key + 1;
                int innerSize = 1;
                while(map.containsKey(num))
                {
                    innerSize++;
                    num = num + 1;
                }
                
                if(count < innerSize)
                {
                    count = innerSize;
                    number = key;
                }
            }
        }
        
        
        return count;
    }


    // LEETCODE - 349 ______________________________________________________________
    public static int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> set = new HashSet<>();
        
        for(int ele : nums1)
        {
            if(!set.contains(ele))
            {
                set.add(ele);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : nums2)
        {
            if(set.contains(ele))
            {
                list.add(ele);
                set.remove(ele);
            }
        }
        
        int[] arr = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }


    // LEETCODE - 350 ____________________________________________________________________________-
    public static int[] intersect(int[] nums1, int[] nums2) 
    {
         HashMap<Integer , Integer> map = new HashMap<>();
         
        
        for(int ele : nums1)
        {   
            map.put(ele , map.getOrDefault(ele , 0) + 1);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : nums2)
        {  
            if(map.containsKey(ele))
            {
                ans.add(ele);
                if(map.get(ele) == 1)
                {
                    map.remove(ele);
                }
                else
                {
                    map.put(ele , map.get(ele) - 1);
                }
            }
        }
        
        int[] k =new int[ans.size()];
        for(int i = 0 ;i<ans.size() ; i++)
        {
            k[i] = ans.get(i);
        }
        
        return k; 
    }








    public static void display(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }
}