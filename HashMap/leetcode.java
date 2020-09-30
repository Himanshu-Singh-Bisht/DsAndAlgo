import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class leetcode 
{
    public static void main(String[] args)
    {
        // LEETCODE - 1512 , NUMBER OF GOOD PAIRS __________________________________________________
        // int[] nums = {1,2,3,1,1,3};
        // System.out.println(numIdenticalPairs(nums));


        // LEETCODE - 771 , JEWELS AND STONES _____________________________________________________
        // System.out.println(numJewelsInStones("aA", "aAAbbbb"));



        // LEETCODE - 1365 , HOW MANY NUMBERS ARE SMALLER THAN THE CURRENT NUMBER ______________________
        // int[] nums = {8,1,2,2,3};
        // int[] ans = smallerNumbersThanCurrent(nums);
        // display1D(ans);     // o/p = {4,0,1,1,3}


        // LEETCODE - 961 , N - REPEATED ELEMENT IN SIZE 2N ARRAY _____________________________________
        // int[] arr = {2,1,2,5,3,2};  // o/p = 2
        // System.out.println(repeatedNTimes(arr));


        // LEETCODE - 1207 , UNIQUE NO. OF OCCURENCES _________________________________________________
        // int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};  // o/p = true
        // System.out.println(uniqueOccurrences(arr));  
        
        
        // LEETCODE - 811 , SUBDOMAIN VISIT COUNT ________________________________________________
        // String[] domains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        // System.out.println(subdomainVisits(domains));
        // o /p = ["901 mail.com","50 yahoo.com","900 google.mail.com",
        // "5 wiki.org","5 org","1 intel.mail.com","951 com"]



        // LEETCODE - 1002 , FIND COMMON CHARACTERS ______________________________________________
        // String[] A = {"cool","lock","cook"};        // o/p = ["c","o"]
        // System.out.println(commonChars(A));
        // System.out.println(commonChars2(A));


        // LEETCODE - 1160 , FIND WORDS THAT CAN BE FORMED BY CHARACTERS _____________________________________ 
        // String[] words = {"cat","bt","hat","tree"};
        // String chars = "atach";     // o/p = 6
        // System.out.println(countCharacters(words, chars));



        // LEETCODE = 136 , SINGLE NUMBER __________________________________________________
        // int[] arr = {7 , 8 , 6 , 8 , 7};        // o/p = 6
        // System.out.println(singleNumber(arr));
        // System.out.println(singleNumber2(arr));
    }

    // LEETCODE - 1512 , NUMBER OF GOOD PAIRS __________________________________________________
    public static int numIdenticalPairs(int[] nums) 
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        
        int goodPairs = 0;
        for(Integer key : map.keySet())
        {
            int val = map.get(key);
            while(val > 1)
            {
                goodPairs += (val - 1);
                val--;
            }
        }
        
        return goodPairs;
    }


    // LEETCODE - 771 , JEWELS AND STONES _____________________________________________________
    public static int numJewelsInStones(String J, String S) 
    {
        HashSet<Character> set = new HashSet<>();
        
        for(char ch : J.toCharArray())
        {
            set.add(ch);
        }
        
        int ans = 0;
        for(char ch : S.toCharArray())
        {
            if(set.contains(ch))
            {
                ans++;
            }
        }
        
        return ans;
    }


    // LEETCODE - 1365 , HOW MANY NUMBERS ARE SMALLER THAN THE CURRENT NUMBER ______________________
    public static int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] smaller = new int[101];       // limit for nums[i] <= 100
        for(int ele : nums)
        {
            smaller[ele]++;
        }
        
        int sum = 0;
        for(int i = 0 ; i < smaller.length ; i++)
        {
            sum += smaller[i];
            smaller[i] = sum - smaller[i];
        }
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = smaller[nums[i]];
        }
        
        return nums;
    }

    
    // LEETCODE - 961 , N - REPEATED ELEMENT IN SIZE 2N ARRAY _____________________________________
    public static int repeatedNTimes(int[] A) 
    {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0 ; i < A.length ; i++)
        {
            if(set.contains(A[i]))
            {
                return A[i];
            }
            else
            {
                set.add(A[i]);
            }
        }
        
        return -1;
    }


    // LEETCODE - 1207 , UNIQUE NO. OF OCCURENCES _________________________________________________
    public static boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(Integer key : map.keySet())
        {
            if(set.contains(map.get(key)))
            {
                return false;
            }
            set.add(map.get(key));
        }
        
        return true;
    }


    // LEETCODE - 811 , SUBDOMAIN VISIT COUNT ________________________________________________
    public static List<String> subdomainVisits(String[] cpdomains) 
    {
        HashMap<String , Integer> map = new HashMap<>();
        
        for(String str : cpdomains)
        {
            String[] numAndString = str.split("\\s+");      // to split accross space
            String[] fragment = numAndString[1].split("\\.");        // too split the string part by '.'
            
            int count = Integer.valueOf(numAndString[0]);
            String sb = "";
            
            for(int i = fragment.length - 1 ; i >= 0 ; i--)
            {
                sb = fragment[i] + (i < fragment.length - 1 ? "." : "") + sb;
                map.put(sb , map.getOrDefault(sb , 0) + count);
            }
        }
        
        List<String> ans = new ArrayList<>();
        for(String key : map.keySet())
        {
            ans.add(map.get(key) + " " + key);
        }
        return ans;                    
    }


    // LEETCODE - 1002 , FIND COMMON CHARACTERS ______________________________________________
    public static List<String> commonChars(String[] A) 
    {
        HashMap<Character , Integer>[] mapArray = new HashMap[A.length];
        
        for(int i = 0 ; i < A.length ; i++)
        {
            mapArray[i] = new HashMap<>();
            String str = A[i];
            for(char c : str.toCharArray())
            {
                mapArray[i].put(c , mapArray[i].getOrDefault(c , 0) + 1);
            }
        }
        
        List<String> ans = new ArrayList<>();
        for(Character key : mapArray[0].keySet())
        {
            int count = mapArray[0].get(key);
            boolean flag = false;
            for(int i = 1; i < mapArray.length ; i++)
            {
                if(mapArray[i].containsKey(key))
                {
                    count = Math.min(count , mapArray[i].get(key));
                }
                else
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                while(count-- > 0)
                {
                    ans.add(key + "");
                }
            }
        }
        
        
        return ans;
    }

    public static List<String> commonChars2(String[] A) 
    {
        int[][] arr = new int[A.length][26];
        
        for(int i = 0 ; i < A.length ; i++)
        {
            for(char ch : A[i].toCharArray())
            {
                arr[i][ch - 'a']++;
            }
        }
        
        List<String> ans = new ArrayList<>();
        for(int i = 0 ; i < 26 ; i++)
        {
            int count = Integer.MAX_VALUE;
            for(int j = 0 ; j < A.length ; j++)
            {
                count = Math.min(count , arr[j][i]);
            }
            
            char c = (char)('a' + i);
            while(count-- > 0)
            {
                ans.add(c + "");
            }
        }
        
        return ans;
    }


    // LEETCODE - 1160 , FIND WORDS THAT CAN BE FORMED BY CHARACTERS _____________________________________
    public static int countCharacters(String[] words, String chars) 
    {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char c : chars.toCharArray())
        {
            map.put(c , map.getOrDefault(c , 0) + 1);
        }

        int count = 0;
        for(String word : words)
        {
            HashMap<Character , Integer> temp = map;
            if(formedWord(temp , word))
            {
                count += word.length();
            }
        }
        
        return count;
    }
    
    public static boolean formedWord(HashMap<Character , Integer> map , String word)
    {
        HashMap<Character , Integer> temp = new HashMap<>();
        for(char c : word.toCharArray())
        {
            if(map.containsKey(c))
            {
                if(temp.containsKey(c))
                {
                    if(map.get(c) == temp.get(c))
                    {
                        return false;
                    }
                    else
                    {
                        temp.put(c , temp.get(c) + 1);
                    }
                }
                else
                {
                    temp.put(c , 1);
                }
            }
            else
            {
                return false;
            }
        }
        
        
        return true;
    }



    // LEETCODE - 136 , SINGLE NUMBER _____________________________________________________________
    public static int singleNumber(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums)
        {
            if(set.contains(ele))
            {
                set.remove(ele);
            }
            else
            {
                set.add(ele);
            }
        }
        
        Iterator<Integer> i = set.iterator();
        return i.next();
    }

    public static int singleNumber2(int[] nums) 
    {
        int a = 0;
        for(int ele : nums)
        {
            a ^= ele;
        }
        
        return a;
    }




    // HELPER FUNCTIONS __________________________________________________
    public static void display1D(int[] nums)
    {
        for(int ele : nums)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}