import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class basicFunctions
{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        // basicf();
        LeetCode();
    }

    /***************************************
     * BASIC FUNCTIONS IN ARRAY
     ***************************************/
    public static void basicf() {
        // MIN_MAX
        /*
         * int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; int[] ans = min_max(arr);
         * System.out.print("min->" + ans[0] + "\n" + "max->" + ans[1]);
         */

        // All index
        /*
         * int[] arr = { 1, 2, 3, 4, 4, 4, 5, 6, 7, 4, 4, 6, 4, 4 }; 
         * ArrayList<Integer>
         * indices = findAllIndex(arr, 4); for (Integer index : indices) {
         * System.out.print(index + " "); }
         */

        // Reverse array
        /*
         * int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 }; revArray(arr); display1D(arr);
         */

        // Matrix

        // int[][] mat = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };
        // int[][] hmat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // addTwoMatrix(mat, hmat);
        // transposeMatrix(mat);
        // multiplyMatrix(mat, hmat);
        // wavePrint(mat);
        // spiralPrint(mat);
        // int[][] mat={{0,0,0,1},{0,1,0,1},{0,0,0,0},{0,0,0,0}};
        // display1D(exitPoint1(mat));
        // display2D(matrix);

    }



    public static void LeetCode()
    {
        // Ques = 189 ,Rotate Array
        // int[] nums = {1,2,3,4,5,6,7};
        // int k = 3;

        // rotateArray(nums , k);
        // display(nums);

        // rotateArrayWithoutSpace(nums , k);
        // display(nums);



        // QUES = 1480 , RUNNING SUM OF 1D ARRAY
        // int[] nums = {1,2,3,4,5};
        // int[] ans = runningSum(nums);
        // display(ans);



        // QUES = 1470 , SHUFFLE THE ARRAY
        // int[] nums = {2 ,5 ,1 ,3 ,4 ,7};
        // int n = 3;
        // int[] ans = shuffle(nums, n);
        // display(ans);



        //  QUES = 1431 ,  Kids With the Greatest Number of Candies
        // Input: candies = [2,3,5,1,3], extraCandies = 3
        // Output: [true,true,true,false,true] 
        // kidsWithCandies(candies , extraCandies)



        //  QUES = 1486 , XOR Operation in an Array
        // Input: n = 5, start = 0
        // Output: 8
        // xorOperation(n, start);



        // QUES = 1365 , How Many Numbers Are Smaller Than the Current Number
        // Input: nums = [8,1,2,2,3]
        // Output: [4,0,1,1,3]
        // smallerNumbersThanCurrent_1(nums);  // O(n^2)
        // smallerNumbersThanCurrent_2(nums);  // O(n)
        // smallerNumbersThanCurrent_3(nums);  // O(nlog(n))   , using binarySearch



        // QUES = 1313 , Decompress Run-Length Encoded List
        // Input: nums = [1,2,3,4]
        // Output: [2,4,4,4]
        // decompressRLElist(nums);



        // QUES = 1389 , Create Target Array in the Given Order
        // Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        // Output: [0,4,1,3,2]
        // createTargetArray(nums, index);



        // Ques = 1295, Find Numbers with Even Number of Digits
        // Input: nums = [12,345,2,6,7896]
        // Output: 2
        // findNumbers(nums);



        // Ques = 1266, Minimum Time Visiting All Points
        // Input: points = [[1,1],[3,4],[-1,0]]
        // Output: 7
        // minTimeToVisitAllPoints(points);



        // Ques = 1450, Number of Students Doing Homework at a Given Time
        // Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
        // Output: 1
        // busyStudent(startTime, endTime, queryTime);



        // Ques = 1464 , Maximum Product of Two Elements in an Array
        // Input: nums = [3,4,5,2]
        // Output: 12 
        // maxProduct(nums);
    }


    // LEETCODE  = 189 __________________________________
    public static void rotateArray(int[] nums, int k) 
    {
        k = k % nums.length;
        int[] ans = new int[nums.length];
        
        for(int i = 0 ; i < k ; i++)
        {
            ans[i] = nums[i + (nums.length - k)];
        }
        
        for(int i = k ; i < ans.length ; i++)
        {
            ans[i] = nums[i - k];
        }
        
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = ans[i];
        }
    }


    public static void rotateArrayWithoutSpace(int[] nums , int k)
    {
        int len = nums.length;
        k = k % len;

        reverse(nums , 0 , len - k - 1);
        reverse(nums , len - k , len - 1);
        reverse(nums , 0 , len - 1);
    }

    public static void reverse(int[] nums , int si , int ei)
    {
        while(si <= ei)
        {
            swap(nums , si , ei);
            si++;
            ei--;
        }
    }

    public static void swap(int[] nums , int i1 , int i2)
    {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }

    //Leetcode = 1480___________________________________________________________________
    public static int[] runningSum(int[] nums)
    {
        int sum = 0;
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = sum + nums[i];
            sum = nums[i];
        } 
        
        return nums;
    }


    //Leetcode = 1470 ___________________________________________
    public static int[] shuffle(int[] nums, int n) 
    {
        int[] ans = new int[2 * n];
        
        for(int i = 0 , j = 0; i < 2 * n && j < n; i += 2 , j++)
        {
            ans[i] =  nums[j];
            ans[i+1] = nums[j + n];
        }
        
        return ans;
    }



    // LeetCode = 1431______________________________________
    public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        ArrayList<Boolean> ans = new ArrayList<>();
        
        int maxCandy = 0;
        for(int i = 0; i < candies.length ; i++)
        {
            maxCandy = Math.max(maxCandy , candies[i]);
        }
        
        for(int i = 0 ; i < candies.length ; i++)
        {
            if(candies[i] + extraCandies >= maxCandy)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }
        
        return ans;
    }


    // LeetCode = 1486____________________________
    public static int xorOperation(int n, int start) 
    {
        int[] nums = new int[n];
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = start + 2 * i;
            
            ans ^= nums[i];
        }
        
        return ans;
    }


    // LeetCode = 1365 _____________________________
    public static int[] smallerNumbersThanCurrent_1(int[] nums) //O(n^2)
    {
        int[] ans = new int[nums.length];
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++)
            {
                if(j != i && nums[j] < nums[i])
                {
                    count++;
                }
            }
            ans[i] = count;
        }
        
        return ans;
    }

    public int[] smallerNumbersThanCurrent_2(int[] nums) // O(n)
    {
        int[] map = new int[101];       // as nums[i] <= 100
        
        for(int i = 0; i < nums.length ; i++)
        {
            map[nums[i]]++;
        }
        
        int count = 0;
        int temp;
        
        for(int i = 0 ; i < map.length ; i++)
        {
            temp = map[i];
            map[i] = count;
            count = count + temp;
        }
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = map[nums[i]];
        }
        
        return nums;
    }


    public static int[] smallerNumbersThanCurrent_3(int[] nums)  // O(nlog(n))
    {
        int[] copy = new int[nums.length];
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            copy[i] = nums[i];
        } 
        
        Arrays.sort(copy);
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            int index = binarySearch(copy , nums[i]);
            nums[i] = index;
        }
        
        return nums;
    }
    
    public static int binarySearch(int[] copy , int ele)
    {
        int si = 0;
        int ei = copy.length - 1; 
        int mid = 0;
        while(si <= ei)
        {
            mid = (si + ei) / 2;
            if(ele == copy[mid])
            {
                if(mid == 0 || ele != copy[mid-1])
                {
                    return mid;
                }
                else
                {
                    ei = mid-1;    
                }
            }
            
            else if(ele < copy[mid])
            {
                ei = mid-1;
            }
            else
            {
                si = mid+1;
            }
        }
        
        return mid;
    }



    // LeetCode 1313__________________________________________________
    public static int[] decompressRLElist(int[] nums) 
    {
        int size = 0;
        for(int i = 0 ; i < nums.length ; i += 2)
        {
            size += nums[i];
        }
        
        int[] ans = new int[size];
        
        int idx = 0;
        for(int i = 0 ; i < nums.length ; i += 2)
        {
            int freq = nums[i];
            int val = nums[i+1];
            while(freq != 0)
            {
                ans[idx++] = val;
                freq--;
            }
        }
        
        return ans;
    }

    

    // LeetCode = 1389______________________________________
    public static int[] createTargetArray(int[] nums, int[] index) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0 ; i < index.length ; i++)
        {
            ans.add(index[i] , nums[i]);
        }
        
        int[] target = new int[ans.size()];
        
        for(int i = 0 ; i < ans.size() ; i++)
        {
            target[i] = ans.get(i);
        }
        
        return target;
    }


    // LeetCode = 1295 __________________________________
    public static int findNumbers(int[] nums)
    {
        int count = 0;
        for(int i = 0 ; i < nums.length; i++)
        {
            int len = 0;
            int n = nums[i];
            while(n != 0)
            {
                n /= 10;
                len++;
            }
            if(len % 2 == 0)
            {
                count++;
            }
        }
        
        return count;
    }


    
    // LeetCode - 1266 __________________________________________
    public static int minTimeToVisitAllPoints(int[][] points)
    {
        int count = 0;
        
        for(int i = 1; i < points.length ; i++)
        {
            int x = Math.abs(points[i][0] - points[i-1][0]);
            int y = Math.abs(points[i][1] - points[i-1][1]);
            
            // int diagDistance = Math.min(x ,y);
            // int leftDistance = Math.max(x , y) - diagDistance;
            // count += diagDistance + leftDistance;
            
            count += Math.max(x ,y);
        }
        
        return count;
    }
    
    

    // LeetCode - 1450 _____________________________________________
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) 
    {
        int count = 0;
        for(int i = 0 ; i < startTime.length ; i++)
        {
            if(startTime[i] <= queryTime && endTime[i] >= queryTime)
            {
                count++;
            }
        }
        
        return count;
    }



    // LeetCode = 1464 _____________________________________________________
    public static int maxProduct(int[] nums)
    {
        int a = 0;
        int b = 0;
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(b <= nums[i])
            {
                a = b;
                b = nums[i];
            }
            else if(a < nums[i])
            {
                a = nums[i];
            }
        }
        
        return (a-1) * (b-1);
    }



    // HELPER FUNCTIONS ____________________________
    public static void display(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }
}