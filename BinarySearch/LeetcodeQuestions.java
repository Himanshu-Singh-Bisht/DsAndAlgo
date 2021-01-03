public class LeetcodeQuestions
{
    public static void main(String[] args) 
    {
        // Leetcode - 704 , Binary Search

        // LEETCODE - 367 , VALID PERFECT SQUARE 

        // LEETCODE - 278 , FIRST BAD VERSION

        // LEETCODE - 1011 , CAPACITY TO SHIP PACKAGE WITHIN D DAYS 

        // LEETCODE - 875 , KOKO EATING BANANAS

        // LEETCODE - 852, Peak Index in a Mountain Array

        // leetcode - 1351, Count Negative Numbers in a Sorted Matrix
    }

    // LEETCODE -794 , BINARY SEARCH ____________________________________________________
    public int search(int[] nums, int target) 
    {
        int l = 0;
        int r = nums.length - 1;
        
        while(l <= r)
        {
            int mid = l + (r - l) / 2;
            
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                r = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }
        
        return -1;
    }



    // LEETCODE - 367 , VALID PERFECT SQUARE __________________________________________
    public boolean isPerfectSquare(int num) 
    {
        if(num == 1)
        {
            return true;
        }
        int l = 1;
        int r = num / 2;
        
        while(l <= r)
        {
            long mid = l + (r - l)/2;
            
            if(mid * mid == num)
            {
                return true;
            } else if (mid * mid < num){
                l = (int)mid+1;
            } else {
                r = (int)mid-1;
            }
        }
        
        return false;
    }


    // LEETCODE - 278 , FIRST BAD VERSION ________________________________________
    public int firstBadVersion(int n) 
    {
        int ans = n;
        int l = 1;
        int r = n;
        while(l <= r)
        {
            int mid = l + (r - l) / 2;
            if(isBadVersion(mid))
            {
                ans = mid;
                r = mid - 1;        // now check for lower values 
            }
            else
            {
                l = mid + 1;
            }
        }
        
        return ans;
    }


    // LEETCODE - 1011 , CAPACITY TO SHIP PACKAGE WITHIN D DAYS 
    public int shipWithinDays(int[] weights, int D)
    {
        int max = 0;
        int sum = 0;
        for(int ele : weights)
        {
            max = Math.max(max , ele);
            sum += ele;
        }
        
        int l = max;
        int r = sum;
        
        int ans = r;
        
        while(l <= r)
        {
            int mid = l + (r - l) / 2;  // possible ans
            
            // find the Days required for this minimum weight
            int reqDays = 1;
            int sumWt = 0;
            for(int i = 0 ; i < weights.length ; i++)
            {
                if(sumWt + weights[i] > mid)
                {
                    reqDays++;
                    sumWt = 0;
                }
                sumWt += weights[i];
            }
            
            if(reqDays <= D)
            {
                ans = mid;
                r = mid - 1;        // as there is a possiblity to find lower weight capacity
            }
            else
            {
                l = mid + 1;      // discard left part as lower could not be the answer
            }
        }
        
        
        return ans;
    }


    // LEETCODE - 875 , KOKO EATING BANANAS ______________________________________________________
    public int minEatingSpeed(int[] piles, int H) 
    {
        int max = 0;
        for(int ele : piles)
        {
            max = Math.max(ele , max);
        }
        
        int l = 1;
        int r = max;
        
        int ans = r;
        
        while(l <= r)
        {
            int mid = l + (r - l) / 2;  // possible ans
            
            // required hours for this mid
            int reqHours = 0;
            for(int i = 0 ; i < piles.length ; i++)
            {
                int q = piles[i] / mid;
                int rem = piles[i] % mid;
                
                reqHours = reqHours + (q + ((rem == 0) ? 0 : 1));
            }
            
            
            if(reqHours <= H)
            {
                ans = mid;
                r = mid - 1;        // as there is a possibility of lower rate than this
            }
            else
            {
                l = mid + 1;    // discard lower values as there is no chance for lower values
            }
        }
        
        return ans;
    }


    // LEETCODE - 852, Peak Index in a Mountain Array _____________________________________________
    public int peakIndexInMountainArray(int[] arr) 
    {
        int l = 0;
        int r = arr.length - 1;
        
        while(l <= r)
        {
            int mid = l + (r - l) / 2;
            
            if(mid != 0 && mid != arr.length - 1 && 
               arr[mid] > arr[mid-1] && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            else if(mid == arr.length - 1 || arr[mid] > arr[mid + 1])
            {
                r = mid -1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return l;
    }


    // leetcode - 1351, Count Negative Numbers in a Sorted Matrix _________________________________
    public int countNegatives(int[][] grid) 
    {
        int ans = 0;
        for(int i = 0 ; i < grid.length ; i++)
        {
            ans += calculate(grid[i]);
        }
        
        return ans;
    }
    
    public int calculate(int[] arr)
    {
        int l = 0;
        int r = arr.length - 1;
        
        while(l <= r)
        {
            int mid = l + (r - l) / 2;
            
            if(arr[mid] < 0)
            {
                if(mid - 1 >= 0 && arr[mid - 1] < 0)
                {
                    r = mid - 1;
                }
                else
                {
                    return arr.length - mid;
                }
            }
            else
            {
                l = mid + 1;
            }
        }
        
        return 0;
    }
}