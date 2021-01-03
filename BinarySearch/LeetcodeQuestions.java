public class LeetcodeQuestions
{
    public static void main(String[] args) 
    {
        // Leetcode - 704 , Binary Search

        // LEETCODE - 367 , VALID PERFECT SQUARE 

        // LEETCODE - 278 , FIRST BAD VERSION
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
}