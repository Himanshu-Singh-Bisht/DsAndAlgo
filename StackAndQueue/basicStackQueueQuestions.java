import java.util.Stack;
import java.util.Scanner;

public class basicStackQueueQuestions
{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {
        // NEXT GREATER ELEMENT (GFG) ___________________________________________________
        // int[] arr = {2 , 1, 3 , 8 , 7 , 6 , 5 , 11 , 13, 9};
        // nextGreaterElementRight(arr);
        // nextGreaterElementLeft(arr);
        // nextSmallerElementRight(arr);
        // nextSmallerElementLeft(arr);


        // ASTERIOD COLLISION (LEETCODE - 735) _______________________________________________
        // int[] arr = {10 , 2 , -5};
        // int[] ans = asteriodCollision(arr);
        // displayArray(ans);


        // REMOVE K DIGITS (LEETCODE - 40) __________________________________________________
        // String num = "1432219" ; int k = 3;
        // String num = "10200" ; int k = 1;
        // System.out.println(removeKDigits(num , k));


        // LARGEST AREA RECTANGLE IN HISTOGRAM (LEETCODE - 84) ________________________________________________
        // int[] arr = {1 , 2, 4 , 4 , 4 , 4 , 3 , 4 , 4 , 3 , 2 , 1}; // o/p = 24
        // int[] arr = {1 , 2, 3 , 4 , 4 , 6 , 6, 6, 5 , 2 , 4 , 6 , 5};  // o/p = 24
        // System.out.println(largestRectangleArea1(arr));
        // System.out.println(largestRectangleArea2(arr));
        // System.out.println(largestRectangleArea3(arr));


        // MAXIMAL RRECTANGLE (LEETCODE - 85) ______________________________________________
        // char[][] matrix = {{'1','0','1','1','1'},
        //                     {'0','1','0','1','0'},
        //                     {'1','1','0','1','1'},
        //                     {'1','1','0','1','1'},
        //                     {'0','1','1','1','1'}};
        // System.out.println(maximalRectangle(matrix));



        // VALID LONGEST SEQUENCE __________________________________________________________________
        // String str = "))(())(())()(()(";
        // System.out.println(validLongestSequence(str));


        // MINIMUM STACK (LEETCODE - 155) ________________________________________________________
        // MinStack1 obj1 = new MinStack1();    // using 2 stacks
        // MinStack2 obj2 = new MinStack2();   // using 1 stack


        // TRAPPING RAIN WATER (LEETCODE - 42) ____________________________________________________
        // int[] height = {0 , 1 , 0 , 2, 1 , 0 , 1, 2 , 3 , 1 ,2 ,1};     // o/p = 6
        // System.out.println(trap1(height));
        // System.out.println(trap2(height));


        // VALID PARENTHESIS (LEETCODE - 20) ___________________________________________________
        // System.out.println(isValid("({})"));    // o/p = true
    }

    // NEXT GREATER ELEMENT(GFG) __________________________________________________________
    public static void nextGreaterElementRight(int[] arr)
    {
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(st.size() == 0)
            {
                st.push(arr[i]);
            }
            else
            {
                while(st.size() != 0 && st.peek() < arr[i])
                {
                    System.out.println(st.pop() + " -> " + arr[i]);
                }
                st.push(arr[i]);
            }
        }

        while(!st.isEmpty())
        {
            System.out.println(st.pop() + " -> " + (-1));
        }
    }

    public static void nextGreaterElementLeft(int[] arr)
    {
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            if(st.size() == 0)
            {
                st.push(arr[i]);
            }
            else
            {
                while(st.size() != 0 && st.peek() < arr[i])
                {
                    System.out.println(st.pop() + " -> " + arr[i]);
                }
                st.push(arr[i]);
            }
        }

        while(!st.isEmpty())
        {
            System.out.println(st.pop() + " -> " + (-1));
        }
    }


    public static void nextSmallerElementRight(int[] arr)
    {
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(st.size() == 0)
            {
                st.push(arr[i]);
            }
            else
            {
                while(st.size() != 0 && st.peek() > arr[i])
                {
                    System.out.println(st.pop() + " -> " + arr[i]);
                }
                st.push(arr[i]);
            }
        }

        while(!st.isEmpty())
        {
            System.out.println(st.pop() + " -> " + (-1));
        }
    }

    public static void nextSmallerElementLeft(int[] arr)
    {
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length - 1; i >= 0 ; i--)
        {
            if(st.size() == 0)
            {
                st.push(arr[i]);
            }
            else
            {
                while(st.size() != 0 && st.peek() > arr[i])
                {
                    System.out.println(st.pop() + " -> " + arr[i]);
                }
                st.push(arr[i]);
            }
        }

        while(!st.isEmpty())
        {
            System.out.println(st.pop() + " -> " + (-1));
        }
    }



    // LEETCODE - 735 ___________________________________________
    public static int[] asteriodCollision(int[] arr)
    {
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > 0)
            {
                st.push(arr[i]);
            }
            else
            {
                while(st.size() != 0 && st.peek() < -arr[i])
                {
                    st.pop();
                }

                if(st.size() != 0 && st.peek() > 0 && st.peek() == -arr[i])
                {
                    st.pop();
                }
                else if(st.size() == 0 || st.peek() < 0)
                {
                    st.push(arr[i]);
                }
            }
        }

        int[] ans = new int[st.size()];
        for(int i = ans.length - 1 ; i >= 0 ; i--)
        {
            ans[i] = st.pop();
        }

        return ans;
    }



    // LEETCODE - 402 _________________________________________________________________________
    public static String removeKDigits(String num , int k)
    {
        Stack<Character> st = new Stack<>();

        char[] arr = num.toCharArray();

        for(int i = 0 ; i < arr.length ; i++)
        {
            while(st.size() != 0 && st.peek() > arr[i] && k != 0)
            {
                st.pop();
                k--;
            }
            st.push(arr[i]);
        }

        while(k != 0)
        {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }

        if(sb.length() > 0 && sb.charAt(sb.length() - 1) == '0')
        {
            int idx = sb.length() - 2;
            while(idx >= 0)
            {
                if(sb.charAt(idx) != '0')
                {
                    break;
                }
                idx--;
            }
            sb = new StringBuilder(sb.substring(0 , idx));
        }

        sb.reverse();
        String ans = sb.toString();
        return ans.length() > 0 ? ans : "0";
    }



    // LEETCODE - 84 ________________________________________________________________
    public static int largestRectangleArea1(int[] arr)
    {
        int maxArea = 0;
        int leftSmall = 0;
        int rightSmall = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            leftSmall = nextSmallerLeft(arr , i);
            rightSmall = nextSmallerRight(arr , i);

            int area = arr[i] * (rightSmall - leftSmall + 1);
            maxArea = Math.max(maxArea , area);
        }

        return maxArea;
    }
    public static int nextSmallerLeft(int[] arr , int idx)
    {
        int ans = idx;
        for(int i = idx - 1 ; i >= 0 ; i--)
        {
            if(arr[i] < arr[idx])
            {
                break;
            }
            ans = i;
        }
        return ans;
    }
    public static int nextSmallerRight(int[] arr , int idx)
    {
        int ans = idx;
        for(int i = idx + 1 ; i < arr.length ; i++)
        {
            if(arr[i] < arr[idx])
            {
                break;
            }
            ans = i;
        }

        return ans;
    }



    public static int largestRectangleArea2(int[] arr)
    {
        int maxArea = 0;
        int[] left = nextSmallerLeftArray(arr);
        int[] right = nextSmallerRightArray(arr);

        for(int i = 0 ; i < arr.length ; i++)
        {
            int area = arr[i] * (right[i] - left[i] + 1);
            maxArea = Math.max(area , maxArea);
        }
        return maxArea;
    }
    public static int[] nextSmallerLeftArray(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            while(st.size() != 0 && arr[st.peek()] > arr[i])
            {
                ans[st.peek()] = i+1;
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            ans[st.peek()] = 0;
            st.pop();
        }

        return ans;
    }
    public static int[] nextSmallerRightArray(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++)
        {
            while(st.size() != 0 && arr[st.peek()] > arr[i])
            {
                ans[st.peek()] = i-1;
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            ans[st.peek()] = arr.length - 1;
            st.pop();
        }

        return ans; 
    }



    public static int largestRectangleArea3(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int maxArea = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            while(st.peek() != -1 && arr[st.peek()] >= arr[i])
            {
                int height = arr[st.pop()];
                int left = st.peek();
                int width = i - left - 1;

                int area = height * width;
                maxArea = Math.max(area , maxArea);
            }

            st.push(i);
        }

        while(st.peek() == -1)
        {
            int heigth = arr[st.pop()];
            int left = st.peek();
            int width = arr.length - left - 1;
            int area = heigth * width;
            maxArea = Math.max(area , maxArea);
        }

        return maxArea;
    }



    // LEETCODE - 85 , MAXIMAL RECTANGLE _____________________________________________
    public static int maximalRectangle(char[][] matrix) 
    {
        if(matrix.length == 0)
        {
            return 0;
        }
        int[] height = new int[matrix[0].length];
        int area = 0;
        
        for(int i =0 ; i<matrix.length ; i++)
        {
            for(int j =0 ; j<matrix[0].length ; j++)
            {
                int val = matrix[i][j] - '0';
                if(val == 1)
                {
                    height[j] += val;
                }
                else
                {
                    height[j] = 0;
                }
            }
            
            area = Math.max(area , largestRectangleArea3(height));
        }
        return area;
    }



    // LONGEST VALID SEQUENCE _______________________________________________________
    public static int validLongestSequence(String str)
    {
        char[] arr = str.toCharArray();
        Stack<Integer> st = new Stack<>();
        st.add(-1);

        int maxAns = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(st.peek() != -1 && arr[st.peek()] == '(' && arr[i] == ')')
            {
                st.pop();
                int ans = i - st.peek();
                maxAns = Math.max(ans , maxAns);
            }
            else
            {
                st.push(i);
            }
        }

        return maxAns;
    }



    // MIN STACK (LEETCODE - 155) ______________________________________________________________
    // using two stack
    public static class MinStack1 {

        /** initialize your data structure here. */
        Stack<Integer> st;
        Stack<Integer> minSt;
        public MinStack1() 
        {
            st = new Stack<>();
            minSt = new Stack<>();
        }
        
        public void push(int x) 
        {
            st.push(x);
            if(minSt.isEmpty())
            {
                minSt.push(x);
            }
            else
            {
                minSt.push(Math.min(minSt.peek() , x));
            }
        }
        
        public void pop() 
        {
            st.pop();
            minSt.pop();
        }
        
        public int top() 
        {
            return st.peek();    
        }
        
        public int getMin() 
        {
            return minSt.peek();    
        }
    }



    // using one stack only
    public static class MinStack2 
    {
        /** initialize your data structure here. */
        Stack<Long> st;
        long min = (long)(1e8);
        public MinStack2() 
        {
            st = new Stack<>();    
        }
        
        public void push(int x)
        {
            if(st.size() == 0)
            {
                long val = (long)(x);
                st.push(val);
                min = val;
            }
            else
            {
                if(x < min)
                {
                    long val = x - min + x;
                    min = x;
                    st.push(val);
                }
                else
                {
                    st.push((long)(x));
                }
            }
            
        }
        
        public void pop() 
        {
            if(st.peek() <= min)
            {
                min = min - st.peek() + min;
            }
            st.pop();
        }
        
        public int top() 
        {
            if(st.peek() > min)
            {
                long val = st.peek();
                return (int)val;
            }
            else
            {
                return (int)min;   
            }
        }
        
        public int getMin() 
        {
            return (int)min;    
        }
    }



    // TRAPPING RAIN WATER (LEETCODE - 42) __________________________________________________________
    public static int trap1(int[] height) 
    {
        int[] left = leftMaxHeight(height);
        int[] right = rightMaxHeight(height);
        
        int ans = 0;
        for(int i = 0 ; i < height.length ; i++)
        {
            ans += (Math.min(right[i] , left[i]) - height[i]);
        }
        return ans;
    }
    
    public static int[] leftMaxHeight(int[] height)
    {
        int[] left = new int[height.length];
        
        for(int i = 0 ; i < left.length ; i++)
        {
            left[i] = height[i];
            for(int j = i - 1 ; j >= 0 ; j--)
            {
                left[i] = Math.max(left[i] , height[j]);
            }
        }
        
        return left;
    }
    
    public static int[] rightMaxHeight(int[] height)
    {
        int[] right = new int[height.length];
        for(int i = 0 ; i < right.length ; i++)
        {
            right[i] = height[i];
            for(int j = i + 1 ; j < height.length ; j++)
            {
                right[i] = Math.max(right[i] , height[j]);
            }
        }
        
        return right;
    }


    // using stack
    public static int trap2(int[] arr) 
    {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        int ans = 0;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            while(st.peek() != -1 && arr[st.peek()] <= arr[i])
            {
                int h = arr[st.pop()];
                if(st.peek() == -1)
                {
                    break;
                }
                else
                {
                    ans += (Math.min(arr[i] , arr[st.peek()]) - h) * (i - st.peek() - 1);           
                }
            }
            st.push(i);
        }
        return ans;
    }



    // VALID PARENTHESIS (LEETCODE - 20) _____________________________________________________
    public static boolean isValid(String s)
    {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
            {
                st.push(arr[i]);
            }
            else 
            {
                if(st.size() == 0)
                {
                    return false;
                }
                else if(st.peek() == '(' && arr[i] != ')')
                {
                    return false;
                }
                else if(st.peek() == '{' && arr[i] != '}')
                {
                    return false;
                }
                else if(st.peek() == '[' && arr[i] != ']')
                {
                    return false;
                }
                else
                {
                    st.pop();
                }
            }
        }
        
        return st.size() == 0;
    }









    // HELPER FUNCTIONS ____________________________________________________
    public static void displayArray(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }
}