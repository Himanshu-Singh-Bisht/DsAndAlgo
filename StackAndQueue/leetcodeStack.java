import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class leetcodeStack
{
    public static void main(String[] args)
    {
        // LEETCODE - 1021 , REMOVE OUTER PARENTHESIS _______________________________________________
        // System.out.println(removeOuterParentheses1("(()())(()(()))(())"));
        // System.out.println(removeOuterParentheses2("(()())(()(()))(())"));
        // System.out.println(removeOuterParentheses3("(()())(()(()))(())"));


        // LEETCODE - 1441 , BUILD AN ARRAY WITH STACK OPERATION _________________________________
        // int[] arr = {1 , 3};
        // System.out.println(buildArray1(arr, 3));
        // System.out.println(buildArray2(arr , 3));


        // LEETCODE - 1047 , REMOVE ALL ADJACENT DUPLICATES IN STRING ____________________________
        // System.out.println(removeDuplicates1("abbaca"));
        // System.out.println(removeDuplicates2("abbaca"));


        // LEETCODE - 496 , NEXT GREATER ELEMENT - I _____________________________________________
        // int[] nums1 = {4 , 1 , 2};
        // int[] nums2 = {1 , 3 , 4 , 2};
        // System.out.println(nextGreaterElement(nums1, nums2));
        // System.out.println(nextGreaterElement2(nums1 , nums2));



        // LEETCODE - 682 , BASEBALL GAME __________________________________________
        String[] ops = {"5" , "2", "C" , "D" , "+"};
        System.out.println(calPoints(ops));
    }


    // LEETCODE - 1021 _________________________________________________________________________
    public static String removeOuterParentheses1(String str)
    {
        Stack<Character> st = new Stack<>();
        
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(st.size() == 0)
            {
                st.push(arr[i]);
            }
            else if(arr[i] == '(' && st.size() != 0)
            {
                st.push(arr[i]);
                sb.append(arr[i] + "");
            }
            else if(arr[i] == ')' && st.size() > 1)
            {
                char c = arr[i];
                while(c != '(')
                {
                    c = st.pop();
                    sb.append(arr[i]);
                }
            }
            else if(arr[i] == ')' && st.size() == 1)
            {
                st.pop();
            }
        }
        
        return sb.toString();
    }

    public static String removeOuterParentheses2(String str) 
    {
        StringBuilder sb = new StringBuilder();
        
        int open = 0;
        int close = 0;
        int start = 0;
        // this works as the strinng is a set of valid parenthesis
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == '(')
            {
                open++;
            } 
            else if(str.charAt(i) == ')')
            {
                close++;
            }
            
            if(open == close)
            {
                sb.append(str.substring(start + 1 , i));
                start = i + 1;
            }
        }
        
        return sb.toString();
    }

    public static String removeOuterParentheses3(String str)
    {
        Stack<Character> st = new Stack<>();
        
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        
        int start = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == '(')
            {
                st.push(arr[i]);
            }
            else if(arr[i] == ')')
            {
                st.pop();
            }
            
            if(st.isEmpty())
            {
                sb.append(str.substring(start + 1 , i));
                start = i + 1;
            }
        }
        
        return sb.toString();   
    }


    // LEETCODE - 1441 _____________________________________________________
    public static List<String> buildArray1(int[] target, int n) 
    {
        Stack<Integer> st = new Stack<>();
        for(int i = n ; i > 0 ; i--)
        {
            st.push(i);
        }
        
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i < target.length && st.size() != 0)
        {
            if(st.peek() == target[i])
            {
                ans.add("Push");
                i++;
            }
            else
            {
                ans.add("Push");
                ans.add("Pop");
            }
            
            st.pop();
        }
        
        return ans;
    }

    public static List<String> buildArray2(int[] target , int n)
    {
        List<String> ans = new ArrayList<>();

        int i = 0;
        int num = 1;
        while(i < target.length)
        {
            ans.add("Push");
            if(target[i] == num)
            {
                i++;
                num++;
            }
            else
            {
                ans.add("Pop");
                num++;
            }
        }
        return ans;
    }


    // LEETCODE - 1047 _________________________________________________________________
    public static String removeDuplicates1(String str) 
    {
        Stack<Character> st = new Stack<>();
        
        for(char ch : str.toCharArray())
        {
            boolean flag = false;
            while(st.size() != 0 && st.peek() == ch)
            {
                flag = true;
                st.pop();
            }
            if(!flag)
            {
                st.push(ch);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    public static String removeDuplicates2(String str) 
    {
        int i = 0;
        char[] arr = str.toCharArray();
        
        for(int j = 0 ; j < arr.length ; i++ , j++)
        {
            arr[i] = arr[j];
            
            if(i > 0 && arr[i] == arr[i - 1])
            {
                i -= 2;     //count = 2 , so decrease it by 2 indexes
            }
        }
        
        return new String(arr , 0 , i);
    }


    // LEETCODE - 496 _________________________________________________________________________
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
         for(int i = 0 ; i < nums1.length ; i++)
         {
             nums1[i] = nextGreater(nums2 , nums1[i]);
         }
        
         return nums1;        
    }
    public static int nextGreater(int[] num , int n)
    {
        int i;
        for(i = 0 ; i < num.length ; i++)
        {
            if(num[i] == n)
            {
                break;
            }
        }
        
        for(int j = i + 1 ; j < num.length ; j++)
        {
            if(num[j] > n)
            {
                return num[j];
            }
        }
        
        return -1;
    }


    public static int[] nextGreaterElement2(int[] nums1, int[] nums2) 
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = nums2.length - 1 ; i >= 0 ; i--)
        {
            while(st.size() != 0 && st.peek() < nums2[i])
            {
                st.pop();
            }
            
            if(st.size() == 0)
            {
                map.put(nums2[i] , -1);
            }
            else
            {
                map.put(nums2[i] , st.peek());
            }
            st.push(nums2[i]);
        }
        
        for(int i = 0 ; i < nums1.length ; i++)
        {
            nums1[i] = map.get(nums1[i]);
        }
        
        return nums1;
    }



    // LEETCODE - 682 , BASEBALL GAME _______________________________________________________
    public static int calPoints(String[] ops)
    {
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < ops.length ; i++)
        {
            if(ops[i].equals("C"))
            {
                st.pop();
            }
            else if(ops[i].equals("D"))
            {
                st.push(2 * st.peek());
            }
            else if(ops[i].equals("+"))
            {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            }
            else
            {
                st.push(Integer.parseInt(ops[i]));
            }
        }

        int sum = 0;
        while(st.size() != 0)
        {
            sum += st.pop();
        }
        return sum;
    }
}