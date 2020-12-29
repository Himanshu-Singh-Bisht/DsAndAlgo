class questions
{
    public static void main(String[] args)
    {
        // Leetcode - 200 , Number of Islands 

        // Leetcode - 231 , Power Of Two

        // LEETCODE - 20 ,VALID PARENTHESIS 

        // LEETCODE - 36 , SINGLE NUMBER

        // LEETCODE - 412 ,FIZZ BUZZ
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
                ans.add(i + "");
            }
            
            i++;
        }
        
        return ans;
    }
}