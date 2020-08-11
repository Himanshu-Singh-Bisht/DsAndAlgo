import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractList;


public class leetcode
{
    public static void main(String[] args)
    {
        leetcodeQuestion();
    }

    public static void leetcodeQuestion()
    {
        // Ques - 1137, N-th Tribonacci Number  __________________________________________________________
        // System.out.println(tribonacci(4));


        // Ques - 698 ,Partition to K Equal Sum Subsets ____________________________________________________
        // int[] nums = {4, 3, 2, 3, 5, 2, 1};
        // System.out.println(canPartitionKSubsets(nums, 4));
        // Output: True


        // Ques - 401, Binary Watch
        // Input: n = 1
        // Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
        // readBinaryWatch(n);



        // Ques - 1079 , Letter Tile Possibilities ____________________________
        // System.out.println(numTilePossibilities("ABA"));   //  output - 8;
        // Input = "ABA"
        // Output = 8 , [A , B , AA , AB , BA , AAB , ABA , BAA];



        // Ques - 1415 , The k-th Lexicographical String of All Happy Strings of Length n ____________________
        // System.out.println(getHappyString(3, 9));        // output = "cab"
        // Input: n = 1, k = 3
        // Output: "c"
        // Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".

    

        // Ques - 1286 , Iterator for Combination   ______________________________________________
        // CombinationIterator iterator = new CombinationIterator("abc", 2);       // creates iterator
        // iterator.next();                                // returns "ab"
        // iterator.hasNext();                             // returns true
        // iterator.next();                                 // returns "ac"
        // iterator.hasNext();                             // returns true
        // iterator.next();                                // returns "bc"
        // iterator.hasNext();                                // returns false



        // Ques - 1219 , Path With Maximum Gold ______________________________________________________
        // int[][] grid = {{0 , 6 , 0},
        //                 {5 , 8 , 7}, 
        //                 {0 , 9 , 0}};
        // System.out.println(getMaximumGold(grid));  // output - 23



        // Ques - 784 , Letter Case Permutation _________________________________________________
        // List<String> ans = letterCasePermutation("a1b2");
        // System.out.println(ans);


        // Ques - 46 , Permutation __________________________________________
        // int[] arr = {1, 2 , 3};
        // List<List<Integer>> ans = permute(arr);
        // System.out.println(ans);



        // LEETCODE - 22 , GENERATE PARENTHESIS ________________________________________________
        // List<String> ans = generateParenthesis(3);
        // System.out.println(ans);
        // ["((()))","(()())","(())()","()(())","()()()"]



        // LEETCODE - 78 , SUBSETS _________________________________________________________
        // int[] nums = {1 , 2 , 3};
        // List<List<Integer>> ans = subsets(nums);
        // System.out.println(ans);
        // OUTPUT - [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]



        // LEETCODE - 216 , COMBINATION SUM III _________________________________________________
        // List<List<Integer>> ans = combinationSum3(3 , 9);
        // System.out.println(ans);
        // OUTPUT -  [[1, 2, 6], [1, 3, 5], [2, 3, 4]]


        // LEETCODE - 39 , COMBINATION SUM _____________________________________________________
        // int[] arr = {2, 3, 5} ; int target = 8;
        // List<List<Integer>> ans = combinationSum(arr, target);
        // System.out.println(ans);
        // OUTPUT - [[2, 2, 2, 2], [2, 3, 3], [3, 5]]



        // LEETCODE - 77 , COMBINATION ________________________________________________________
        // List<List<Integer>> res = combine(4 , 2);
        // System.out.println(res);
        // OUTPUT -  [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]



        // LEETCODE - 
    }


    // LEETCODE - 1137 __________________________________________________
    public static int tribonacci(int n) 
    {
        int[] memo = new int[n + 1];
        return memoization(n , memo);    
    }
    
    public static int memoization(int n , int[] memo)
    {
        if(n < 3)
        {
            if(n <= 0)
            {
                return 0;   
            }
            return 1;
        }
        
        if(memo[n] != 0)
        {
            return memo[n];
        }
        
        memo[n] = memoization(n- 1 , memo) + memoization(n -2 , memo)  + memoization(n -3 , memo);
        return memo[n];
    }


    // LEETCODE - 698 ___________________________________________________
    public static boolean canPartitionKSubsets(int[] nums, int k) 
    {
        if(k <= 0 || k > nums.length)
        {
            return false;
        }
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum += nums[i]; 
        }
        
        if(sum % k != 0)
        {
            return false;
        }
        sum = sum / k;
        boolean[] flag = new boolean[nums.length];
        
        return recursion(sum , 0 , 0, k , nums , flag);
    }
    
    public static boolean recursion(int subsetSum ,int sum, int idx , int k , int[] nums , boolean[] vis)
    {   
        if(k == 1)
        {
            return true;
        }
        if(sum == subsetSum)
        {
            return recursion(subsetSum , 0 , 0 , k - 1 , nums , vis);
        }
        
        boolean res = false;
        for(int i = idx ; i < nums.length ; i++)
        {
            if(!vis[i] && sum + nums[i] <= subsetSum)
            {
                vis[i] = true;
                res = res || recursion(subsetSum , sum + nums[i] , i + 1 , k , nums , vis);
                vis[i] = false;
            }
        }
        
        return res;
    }



    // LEETCODE - 401 ___________________________________________________
    public static List<String> readBinaryWatch(int num)
    {
        List<String> ans = new ArrayList<>();
        
        // 0-3 index - hours and 4-9 index - minutes 
        int[] arr = {1 , 2 , 4 , 8 , 1 , 2 , 4 , 8, 16 , 32};
        backtracking(arr , 0 , 0 , 0 , num , ans);
        return ans;
    }
    
    public static void backtracking(int[] arr , int hours , int minutes ,int pos , int num , List<String> ans)
    {
        if(num == 0)
        {
            if(hours <= 11 && minutes <= 59)
            {
                StringBuilder sb = new StringBuilder("");
                sb.append(hours).append(":").append(minutes <= 9 ? "0" + minutes : minutes);
                ans.add(sb.toString());
            }
            return ;
        }
        
        for(int i = pos ; i < arr.length ; i++)
        {
            if(i <= 3)
            {
                hours += arr[i];
            }
            else
            {
                minutes += arr[i];
            }
            
            backtracking(arr , hours , minutes , i + 1 , num - 1 , ans);
            
            // subtracting from hours and minutes while backtracking because we're gonna give chance to other                               element of the arr array
            if(i <= 3)
            {
                hours -= arr[i];
            }
            else
            {
                minutes -= arr[i];
            }
        }
    }



    // LEETCODE - 1079 ____________________________________________________
    public static HashMap<String , Boolean> map = new HashMap<>();
    
    public static int numTilePossibilities(String tiles) 
    {
        if(tiles.length() < 2)
        {
            return tiles.length();
        }

        char[] ch = tiles.toCharArray();     // needed to remove the duplicacy among answer
        Arrays.sort(ch);
        tiles = String.valueOf(ch);

        subseq(tiles , "");

        map.remove("");         // as subsequence also have "" (empty string)

        int ans = 0;

        for(String keys : map.keySet())
        {
            int per = permutation(keys , "");
            ans = ans + per;
        }

        return ans;
    }

    public static void subseq(String str , String ans)
    {
        if(str.length() == 0)
        {
            map.put(ans , true);
            return;
        }

        subseq(str.substring(1) , ans);
        subseq(str.substring(1), ans + str.charAt(0));
    } 

    public static int permutation(String str , String ans)       // removing duplicacy in permutation
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        boolean[] vis = new boolean[26];

        for(int i = 0; i < str.length() ; i++)
        {
            int idx = str.charAt(i) - 'A';
            if(!vis[idx])
            {
                vis[idx] = true;
                count += permutation(str.substring(0 , i) + str.substring(i + 1), ans + str.charAt(i));
            }
        }
        return count;
    }



    // LEETCODE - 1415 _____________________________________________________ 
    public static String getHappyString(int n, int k) 
    {
        char[] ch = {'a' , 'b' , 'c'};
        ArrayList<String> list = listOfHappyString(n , ch);
        if(list.size() < k)
        {
            return "";
        }
        return list.get(k - 1);
    }

    public static ArrayList<String> listOfHappyString(int n , char[] ch)
    {
        if(n == 0)
        {   
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> recAns = listOfHappyString(n - 1 , ch);
        for(String s : recAns)
        {
            for(int i = 0; i < ch.length ; i++)
            {
                char c = ch[i];
                if(s.length() == 0 || c != s.charAt(s.length() - 1))
                {
                    ans.add(s + c);
                }
            }
        }

        return ans;
    }



    // LEETCODE - 1286 __________________________________________________________
    public static class CombinationIterator {

        public String characters;
        public int combinationLength;
        
        public static ArrayList<String> list; 
       
        public CombinationIterator(String characters, int combinationLength) 
        {
            this.characters = characters;
            this.combinationLength = combinationLength;
        
            char[] ch = characters.toCharArray();
            Arrays.sort(ch);
            list = lexographical(combinationLength , ch );
        }
        
        
        public static ArrayList<String> lexographical(int n , char[] ch)
        {
            if(n == 0)
            {   
                ArrayList<String> base = new ArrayList<>();
                base.add("");
                return base;
            }
    
            ArrayList<String> ans = new ArrayList<>();
    
            ArrayList<String> recAns = lexographical(n - 1 , ch);
            for(String s : recAns)
            {
                for(int i = 0; i < ch.length ; i++)
                {
                    char c = ch[i];
                    if(s.length() == 0 || c > s.charAt(s.length() - 1))
                    {
                        ans.add(s + c);
                    }
                }
            }
    
            return ans;
        }
        
        
        public static int idx = 0;
        public static String next() 
        {
            return  list.get(idx++);
        }
        
        public static boolean hasNext() 
        {
            return idx < list.size();
        }
    }



    // LEETCODE - 1219 ___________________________________________________________
    public static int getMaximumGold(int[][] grid)
    {
        int maxAns = 0;
        
        for(int i  = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(grid[i][j] != 0)
                {
                    int res = maximumGold(i , j , grid);
                    maxAns = Math.max(res , maxAns);
                }
            }
        }
        
        return maxAns;
    }
    
    public static int maximumGold(int sr , int sc , int[][] grid)
    {
        if(sr < 0 || sc < 0 || sr == grid.length || sc == grid[0].length || grid[sr][sc] == 0)
        {
            return 0;
        }
        
        int val = grid[sr][sc];
        grid[sr][sc] = 0;
        
        int left = maximumGold(sr , sc - 1 , grid);
        int up = maximumGold(sr - 1, sc , grid);
        int right = maximumGold(sr , sc + 1 ,grid);
        int down = maximumGold(sr + 1, sc , grid);
        
        grid[sr][sc] = val;
        
        return grid[sr][sc] + Math.max(Math.max(Math.max(left , up), right) , down);
        
    }
   
   
   
    // LEETCODE - 784 ____________________________________________________________
    public static List<String> letterCasePermutation(String s) 
    {
        List<String> ans = permutationLetterCase(s);
        return ans;
    }
    
    public static List<String> permutationLetterCase(String str)
    {
        if(str.length() == 0)
        {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        List<String> ans = new ArrayList<>();

        char ch = str.charAt(0);
        
        List<String> recAns = permutationLetterCase(str.substring(1));
            
        for(String s : recAns)
        {
            ans.add(ch + s);
            if(ch >= 'a' && ch <= 'z')
            {
                ans.add((char)(ch - 'a' + 'A') + s);
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                ans.add((char)(ch - 'A' + 'a') + s);
            }
        }
        return ans;
    }



    // LEEETCODE - 46 _____________________________________________________________
    public static List<List<Integer>> res = new ArrayList<List<Integer>>();
    public static List<List<Integer>> permute(int[] nums) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        permuteArray(nums , ans , vis);
        return res;
    }

    public static void permuteArray(int[] nums ,List<Integer> ans , boolean[] vis)
    {
        if(ans.size() == nums.length)
        {
            res.add(new ArrayList<>());
            for(int i = 0 ; i < ans.size() ;i++)
            {
                (res.get(res.size() - 1)).add(ans.get(i));
            }
            return;
        }

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(!vis[i])
            {
                vis[i] = true;
                ans.add(nums[i]);
                permuteArray(nums , ans , vis);
                ans.remove(ans.size() - 1);
                vis[i] = false;
            }
        }

    }


    // public static List<List<Integer>> permute2(int[] nums) 
    // {
    //     // ArrayList<Integer> ans = new ArrayList<>();
    //     boolean[] vis = new boolean[nums.length];
    //     List<List<Integer>> res = permuteArray2(nums , vis);
    //     return res;
    // }

    // public static List<List<Integer>> permuteArray2(int[] nums , boolean[] vis)



    // LEETCODE - 22 , GENERATE PARENTHESIS ________________________________________________
    public static List<String> generateParenthesis(int n) 
    {
        List<String> ans = new ArrayList<>();
        backtrack(ans , "" , 0 , 0, n);
        return ans;
    }
    
    public static void backtrack(List<String> ans , String str , int open , int close , int max)
    {
        if(str.length() == 2 * max)
        {
            ans.add(str);
            return;
        }
        
        if(open < max)
        {
            backtrack(ans , str + "(" , open + 1, close , max);
        }
        if(close < open)
        {
            backtrack(ans , str + ")" , open , close + 1 , max);
        }
    }





    // LEETCODE - 78 , SUBSETS _________________________________________________________
    public static List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans = recursionSubsets(nums , nums.length - 1);
        return ans;
    }
    
    public static List<List<Integer>> recursionSubsets(int[] nums , int idx) 
    {
        if(idx == -1)
        {
            List<List<Integer>> base = new ArrayList<List<Integer>>();
            base.add(new ArrayList<>());
            return base;
        }
        
        List<List<Integer>> recAns = recursionSubsets(nums , idx-1);
        
        List<List<Integer>> newSubsets = new ArrayList();
        
        for (List<Integer> curr : recAns) 
        {
            newSubsets.add(new ArrayList<Integer>(curr){{add(nums[idx]);}});
        }
        
        for (List<Integer> curr : newSubsets) 
        {
            recAns.add(curr);
        }
        
        return recAns;
    }




    // LEETCODE - 216 , COMBINATION SUM III ___________________________________________________
    public static List<List<Integer>> combinationSum3(int k, int n)
    {
        List<Integer> ans = new ArrayList<>();
        recursionCombinationSum(k , n , 1 , ans);
        return result;
    }
    
    public static List<List<Integer>> result = new ArrayList<List<Integer>>();
    
    public static void recursionCombinationSum(int k , int sum , int idx , List<Integer> ans)
    {
        if(idx == 10 || sum == 0 || k == ans.size())
        {
            if(sum == 0 && k == ans.size())
            {
                List<Integer> arr = new ArrayList<>(ans);
                result.add(arr);
                return;
            }
            return;
        }
        
        for(int i = idx ; i <= 9 ; i++)
        {
            if(sum - i >= 0)
            {
                ans.add(i);
                recursionCombinationSum(k , sum - i , i + 1 , ans); 
                ans.remove(ans.size() - 1);
            }
        }
    }




    // LEETCODE - 39 , COMBINATION SUM____________________________________________________________
    public static List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        coinChangeCombiInfiniteTime(candidates , target , 0 , new ArrayList<>());
        return result;
    }
    
    public static List<List<Integer>> resultCombi = new ArrayList<List<Integer>>();
    
    public static void coinChangeCombiInfiniteTime(int[] candidates, int target , int idx , List<Integer> ans)
    {
        if(target == 0)
        {
            List<Integer> arr = new ArrayList<>(ans);
            result.add(arr);
            return;
        }
        
        for(int i = idx ; i < candidates.length ; i++)
        {
            if(target - candidates[i] >= 0)
            {
                ans.add(candidates[i]);
                coinChangeCombiInfiniteTime(candidates , target - candidates[i] , i , ans);
                ans.remove(ans.size() - 1);
            }
        }
    }




    // LEETCODE - 77 , COMBINATION ___________________________________________________________
    public static List<List<Integer>> combine(int n, int k) 
    {
        combiRecursion(n , k , 1 ,new ArrayList<>());
        return ans;
    }
    
    public static List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public static void combiRecursion(int n , int k ,int idx , List<Integer> arr)
    {
        if(k == arr.size())
        {
            List<Integer> ar = new ArrayList<>(arr);
            ans.add(ar);
            return;
        }
        
        for(int i = idx ; i <= n ; i++)
        {
            arr.add(i);
            combiRecursion(n , k , i + 1, arr);
            arr.remove(arr.size() - 1);
        }
    }

}
