class questions
{
    public static void main(String[] args)
    {
        // Leetcode - 200 , Number of Islands 

        // Leetcode - 231 , Power Of Two

        // LEETCODE - 20 ,VALID PARENTHESIS 

        // LEETCODE - 36 , SINGLE NUMBER

        // LEETCODE - 412 ,FIZZ BUZZ


        
        // LEETCODE - 217 , CONTAIN DUPLICATE

        // LEETCODE - 121 , BSET TIME TO BUY AND SELL STOCKS

        // LEETCODE - 867 , FIRST UNIQUE CHARACTER IN A STRING

        // LEETCODE - 242 , VALID ANAGRAM

        // LEETCODE - 344 , REVERSE STRING
    }

    // Leetcode - 200 , Number of Islands ____________________________________________
    public static int numIslands(char[][] grid) 
    {
        int count = 0;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(grid[i][j] == '1')       // means not visited
                {
                    count++;
                    dfs(grid , i , j);
                }
            }
        }
        
        return count;
    }
    
    public static int[][] dir = {{0, 1} , {1 , 0} , {0 , -1} ,{-1 , 0}};
    public static void dfs(char[][] grid , int r , int c)
    {
        grid[r][c] = '0';
        
        for(int i = 0 ; i < dir.length ; i++)
        {
            int row = r + dir[i][0];
            int col = c + dir[i][1];
            
            if(row >= 0 && col >= 0 && row < grid.length && col < grid[0].length)
            {
                if(grid[row][col] == '1')
                {
                    dfs(grid , row , col);
                }
            }
        }
    }


    // Leetcode - 231 , Power Of Two _______________________________________
    public static boolean isPowerOfTwo_1(int n) 
    {
        long i = 1;
        while(i < n)
        {
            i *= 2;
        }
        
        return (i == n);
    }

    // optimized
    public static boolean isPowerOfTwo_2(int n) 
    {
        if(n < 1)
        {
            return false;
        }
        return (n & (n-1)) == 0;
    }


    // LEETCODE - 20 ,VALID PARENTHESIS ____________________________________________
    public static boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray())
        {
            if(st.size() == 0)
            {
                st.push(ch);
                continue;
            }
            
            if(ch == ')' && st.peek() == '(')
            {
                st.pop();
            }
            else if(ch == '}' && st.peek() == '{')
            {
                st.pop();
            }
            else if(ch == ']' && st.peek() == '[')
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        
        return st.size() == 0;
    }


    // LEETCODE - 36 , SINGLE NUMBER _________________________________________
    public static int singleNumber(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums)
        {
            if(set.contains(i))
            {
                set.remove(i);
            }
            else 
            {
                set.add(i);
            }
        }
    
        for(int i :set)
        {
            return i;
        }
        return 0;
    }

    // optimized _____
    public static int singleNumber_2(int[] nums)
    {
        int n = 0;
        for(int i : nums)
        {
            n = n ^ i;
        }
        
        return n;
    }

    // LEETCODE - 412 ,FIZZ BUZZ _________________________________
    public List<String> fizzBuzz(int n) 
    {
        List<String> ans = new ArrayList<>();
        int i = 1;
        while(i <= n)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                ans.add("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                ans.add("Fizz");
            }
            else if(i % 5 == 0)
            {
                ans.add("Buzz");
            }
            else
            {
                ans.add(Integer.toString(i));
            }
            
            i++;
        }
        
        return ans;
    }


    // LEETCODE - 217 , CONTAIN DUPLICATE _____________________________________
    public static boolean containsDuplicate(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums)
        {
            if(set.contains(i))
            {
                return true;
            }
            set.add(i);
        }
        
        return false;
    }


    // LEETCODE - 121 , BSET TIME TO BUY AND SELL STOCKS ______________________________________
    // O(N^2) __________
    public static int maxProfit_1(int[] prices) 
    {
        int max = 0;
        for(int i = 0 ; i < prices.length ; i++)
        {
            for(int j = i + 1 ; j < prices.length ; j++)
            {
                max = Math.max(max , prices[j] - prices[i]);
            }
        }
        
        return max;
    }

    // O(N) ______
    public static int maxProfit_2(int[] prices) 
    {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < prices.length ; i++)
        {
            if(min < prices[i])
            {
                max = Math.max(max , prices[i] - min);
            }
            else
            {
                min = prices[i];
            }
        }
        
        return max;
    }


    // LEETCODE - 867 , FIRST UNIQUE CHARACTER IN A STRING ________________________________________________
    public static int firstUniqChar_1(String s) 
    {
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(map.get(ch) == 1)
            {
                return i;
            }
        }
        
        return -1;
    }

    public static int firstUniqChar_2(String s) 
    {
        HashMap<Character , int[]> map = new HashMap<>();
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                int[] val = map.get(ch);
                val[1] = val[1] + 1;
                map.put(ch , val);
            }
            else
            {
                int[] val = {i, 1};
                map.put(ch , val);
            }
        }
        
        int min = s.length();
        for(Character c : map.keySet())
        {
            if(map.get(c)[1] == 1)
            {
                min = Math.min(min , map.get(c)[0]);
            }
        }
        
        return min == s.length() ? -1 : min;
    }


    // LEETCODE - 242 , VALID ANAGRAM ____________________________________
    public static boolean isAnagram_1(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray())
        {
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }
        
        for(char ch : t.toCharArray())
        {
            if(map.containsKey(ch))
            {
                if(map.get(ch) == 1)
                {
                    map.remove(ch);
                }
                else
                {
                    map.put(ch , map.get(ch) - 1);
                }
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }


    public static boolean isAnagram_2(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1 , arr2);
    }


    // LEETCODE - 344 , REVERSE STRING __________________________________________
    public static void reverseString(char[] s) 
    {
        int i = 0;
        int j = s.length - 1;
        
        while(i < j)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            i++;
            j--;
        }
    }
}