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


        
        // LEETCODE - 162 , FIND PEAK ELEMENT 

        // LEETCODE - 1 , TWO SUM

        // LEETCODE - 844 , BACKSPACE STRING COMPARE 
        
        // LEETCODE - 283 , MOVE ZEROES

        // LEETCODE - 7 , Reverse Integer 



        // LEETCODE - 66 , PLUS ONE 

        // LEETCODE - 278 , BAD VERSION

        // LEETCODE - 657 , ROBOT RETURN TO ORIGIN

        // LEETCODE - 219 , CONTAINS DUPLICATE - II

        // 
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


    // LEETCODE - 162, FIND PEAK ELEMENT _____________________________________________________________
    public static int findPeakElement(int[] nums) 
    {
        int peak = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            int left = (i - 1 < 0) ? Integer.MIN_VALUE : nums[i - 1];
            int right = (i + 1 == nums.length) ? Integer.MIN_VALUE : nums[i + 1];
            
            if(nums[i] > left && nums[i] > right)
            {
                peak = i;    
                break;
            }
        }
        return peak;
    }

    // using Binary Search technique _____
    public static int findPeakElement_2(int[] nums) 
    {
        int l = 0;
        int r = nums.length - 1;
        
        while(l < r)
        {
            int mid = (l + r) / 2;
            
            if(nums[mid] > nums[mid+1])
            {
                r = mid;
            }
            else
            {
                l = mid + 1;
            }
        }
        
        return l;
    }

    // complete understanding of Binary Search Approach
    public static int findPeakElement_2b(int[] arr) 
    {
        if(arr.length == 1)
        {
            return 0;
        }
        int l = 0;
        int r = arr.length - 1;

        while(l <= r)
        {
            int mid = (l + r) / 2;
            if(mid > 0 && mid < arr.length - 1)
            {
                if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid + 1])
                {
                    return mid;
                }
                else if(arr[mid] < arr[mid+ 1])
                {
                    l = mid + 1;     // as peak will be at right 
                }
                else if(arr[mid] < arr[mid-1])
                {
                    r = mid- 1;      // as peak will be at left
                }
            }
            else
            {
                if(mid == 0)
                {
                    if(arr[mid] > arr[mid+ 1])
                    {
                        return mid;
                    }
                    else
                    {
                        l = mid + 1;
                    }
                }
                else if(mid == arr.length - 1)
                {
                    if(arr[mid] > arr[mid- 1])
                    {   
                        return mid;
                    }
                    else
                    {
                        r = mid - 1;
                    }
                }
            }
        }
        
        return 0;
    }


    // LEETCODE = 1, TWO SUM ________________________________________________________
    // O(n^2)
    public static int[] twoSum(int[] nums, int target) 
    {
        int a = 0;
        int b = 0;
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            int tar = target - nums[i];
            a = i;
            b = i;
            for(int j = i+1; j < nums.length ; j++)
            {
                if(tar - nums[j] == 0)
                {
                    b = j;
                    break;
                }
            }
            
            if(a != b)
            {
                break;
            }
        }
        
        return new int[]{a, b};
    }


    // O(N)
    public static int[] twoSum_2(int[] nums, int target) 
    {
        HashMap<Integer ,Integer> map = new HashMap<>();
        
        int[] ans = new int[2];
        for(int i = 0 ; i < nums.length ; i++)
        {
            int tar = target - nums[i];
            if(map.containsKey(tar))
            {
                ans[0] = i;
                ans[1] = map.get(tar);
                break;
            }
            
            map.put(nums[i] , i);
        }
        
        return ans;
    }


    // LEETCODE - 844 , BACKSPACE STRING COMPARE ____________________________________________
    public static boolean backspaceCompare(String S, String T)
    {
        StringBuilder s = new StringBuilder();
        for(char ch : S.toCharArray())
        {
            if(ch != '#')
            {
                s.append(ch + "");
            }
            else
            {
                if(s.length() != 0)
                {
                    s.deleteCharAt(s.length() - 1);
                }
            }
        }
        
        StringBuilder t = new StringBuilder();
        for(char ch : T.toCharArray())
        {
            if(ch != '#')
            {
                t.append(ch + "");
            }
            else
            {
                if(t.length() != 0)
                {
                    t.deleteCharAt(t.length() - 1);
                }
            }
        }
        
        
        S = s.toString();
        T = t.toString();
        
        return S.compareTo(T) == 0;     // if true means equal
    }

    // opti (using stack)______
    public static boolean backspaceCompare_2a(String S, String T)
    {
        Stack<Character> st1 = new Stack<>();
        for(char ch : S.toCharArray())
        {
            if(ch == '#')
            {
                if(st1.size() != 0)
                {
                    st1.pop();
                }
            }
            else
            {
                st1.push(ch);
            }
        }
        
        Stack<Character> st2 = new Stack<>();
        for(char ch : T.toCharArray())
        {
            if(ch == '#')
            {
                if(st2.size() != 0)
                {
                    st2.pop();
                }
            }
            else
            {
                st2.push(ch);
            }
        }
        
        if(st1.size() != st2.size())
        {
            return false;
        }
        
        while(st1.size() != 0)
        {
            if(st1.pop() != st2.pop())
            {
                return false;
            }
        }
        
        return true;
    }

    // opti (space - O(1)) _______
    public static boolean backspaceCompare_2b(String S, String T)
    {
        int i = S.length() - 1;
        int j = T.length() - 1;
        
        while(i >= 0 || j >= 0)
        {
            int skipS = 0;
            while(i >= 0 && (skipS > 0 || S.charAt(i) == '#'))
            {
                if(S.charAt(i) == '#')
                {
                    skipS++;
                }
                else
                {
                    skipS--;
                }
                i--;
            }
            
            int skipT = 0;
            while(j >= 0 && (skipT > 0 || T.charAt(j) == '#'))
            {
                if(T.charAt(j) == '#')
                {
                    skipT++;
                }
                else
                {
                    skipT--;
                }
                j--;
            }
               
            if(i >= 0 && j >= 0)
            {
                if(S.charAt(i) != T.charAt(j))
                {
                    return false;
                }
                i--;
                j--;
            }
            else
            {
                if(i >= 0 || j >= 0)
                {
                    return false;
                }
            }
        }
        
        return true;
    }


    // LEETCODE - 283 , MOVE ZEROES _________________________________________________
    public static void moveZeroes(int[] nums) 
    {
        int i = 0;          // for non zeroes
        int j = 0;          // for zeroes
  
        while(i < nums.length)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                j++;
            }
            i++;
        }
    }


    // LEETCODE - 7 , REVERSE INTEGER __________________________________________________
    public static int reverse(int x) 
    {
        int n = x;
        long rev = 0;
        while(n != 0)
        {
            int rem = n % 10;
            n = n / 10;
            rev = rev * 10 + rem;
        }
        rev = (x < 0) ? (-1 * rev) : rev;
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
        {
            return 0;
        }
        return (x < 0) ? (int)(-1 * rev) : (int)(rev);
    }


    // LEETCODE - 66 , PLUS ONE ___________________________________________________________
    public static int[] plusOne(int[] digits) 
    {
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;        // then just increase last index val by 1 and return that array.
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    // LEETCODE - 278 , BAD VERSION _________________________________________________________
    public static int firstBadVersion(int n) 
    {
        int i = 1;
        int j = n;
        while(i < j)
        {
            int mid = i + (j - i) / 2;
            if(isBadVersion(mid))
            {
                j = mid;
            }
            else
            {
                i = mid + 1;
            }
        }
        return i;
    }

    // LEETCODE - 657 , ROBOT RETURN TO ORIGIN _________
    public static boolean judgeCircle(String moves) 
    {
        int r = 0;
        int c = 0;
        
        for(char ch : moves.toCharArray())
        {
            if(ch == 'R')
            {
                c += 1;
            }
            else if(ch == 'L')
            {
                c -= 1;
            }
            else if(ch == 'U')
            {
                r -= 1;
            }
            else 
            {
                r += 1;
            }
        }
        
        return (r == 0 && c == 0) ? true : false;
    }


    // LEETCODE - 219 , CONTAINS DUPLICATE - II _____________________________________
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(map.containsKey(nums[i]))
            {
                int val = map.get(nums[i]);
                if(i - val <= k)
                {
                    return true;
                }
                else
                {
                    map.put(nums[i] , i);
                }
            }
            else 
            {
                map.put(nums[i] , i);
            }
        }
        
        return false;
    }

    
}