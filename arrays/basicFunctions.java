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
        LeetCode();
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


        // Ques = 1252, Cells with Odd Values in a Matrix
        // Input: n = 2, m = 3, indices = [[0,1],[1,1]]
        // Output: 6
        // oddCells(n, m, indices);



        // Ques = 1351, Count Negative Numbers in a Sorted Matrix
        // Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
        // Output: 8
        // countNegatives(grid);



        // Ques = 1299, Replace Elements with Greatest Element on Right Side
        // Input: arr = [17,18,5,4,6,1]
        // Output: [18,6,6,6,1,-1]
        // replaceElements(arr);



        // Ques = 1304, Find N Unique Integers Sum up to Zero
        // Input: n = 5
        // Output: [-7,-1,1,3,4]
        // sumZero(n);



        // Ques = 1475, Final Prices With a Special Discount in a Shop
        // Input: prices = [8,4,6,2,3]
        // Output: [4,2,4,2,3]
        // finalPrices(prices);



        // Ques = 832 , Flipping an Image
        // Input: int[][] A = [[1,1,0],[1,0,1],[0,0,0]]
        // Output: [[1,0,0],[0,1,0],[1,1,1]]
        // flipAndInvertImage(A);



        // Ques - 1460, Make Two Arrays Equal by Reversing Sub-arrays
        // Input: target = [1,2,3,4], arr = [2,4,1,3]
        // Output: true
        // canBeEqual(target, arr);



        // Ques - 905, Sort Array By Parity
        // Input: int[] arr = [3,1,2,4]
        // Output: [2,4,3,1]
        // sortArrayByParity(arr);



        // Ques - 977, Squares of a Sorted Array
        // Input: int[] A = [-4,-1,0,3,10]
        // Output: [0,1,9,16,100]
        // sortedSquares(A);



        // Ques - 1491, Average Salary Excluding the Minimum and Maximum Salary
        // Input: salary = [4000,3000,1000,2000]
        // Output: 2500.00000
        // average(salary);



        // Ques - 561, Array Partition I
        // Input: int[] nums = [1,4,3,2]
        // Output: 4
        // arrayPairSum(nums);



        // Ques - 1380, Lucky Numbers in a Matrix
        // Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
        // Output: [15]
        // luckyNumbers(nums);


        // Ques - 1051 , Height Checker
        // Input: heights = [1,1,4,2,1,3]
        // Output: 3
        // heightChecker(heights);




        // Ques - 922 , Sort Array By Parity - 2
        // Input: [4,2,5,7]
        // Output: [4,5,2,7]
        // sortArrayByParityII(A);



        // Ques - 1377 , The K Weakest Rows in a Matrix
        // Input: mat = 
        // [[1,1,0,0,0],
        // [1,1,1,1,0],
        // [1,0,0,0,0],
        // [1,1,0,0,0],
        // [1,1,1,1,1]], 
        // k = 3
        // Output: [2,0,3]
        // kWeakestRows(mat , k);




        // Ques - 1122 , Relative Sort Array
        // Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
        // Output: [2,2,2,1,4,3,3,9,6,7,19]
        // relativeSortArray(arr1, arr2);




        // Ques - 1002 , Find Common Characters
        // Input: ["bella","label","roller"]
        // Output: ["e","l","l"]
        // commonChars(A);
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



    // LeetCode = 1252  ____________________________________________________________
    public static int oddCells(int n, int m, int[][] indices) 
    {
        int[][] arr = new int[n][m];
        
        for(int i = 0; i < indices.length ; i++)
        {
            int ri = indices[i][0];
            int ci = indices[i][1];
            
            for(int idx = 0 ; idx < arr[0].length; idx++)
            {
                arr[ri][idx] += 1;
            }
            
            for(int idx = 0 ; idx < arr.length ; idx++)
            {
                arr[idx][ci] += 1;
            }
        }
        
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(arr[i][j] % 2 == 1)
                {
                    count++;
                }
            }
        }
        
        return count;
    }

    public static int oddCells_2(int n, int m, int[][] indices) 
    {
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        
        for(int[] ind : indices)
        {
            row[ind[0]] = !row[ind[0]];
            col[ind[1]] = !col[ind[1]];
        }
        
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(row[i] ^ col[j])
                {
                    count++;
                }
            }
        }
        
        return count;
    }


    // LeetCode - 1351 ____________________________________
    public static int countNegatives(int[][] grid) 
    {
        int count = 0;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0; j < grid[0].length ;j++)
            {
                if(grid[i][j] < 0)
                {
                    count += grid[0].length - j;
                    break;
                }
            }
        }
        
        return count;
    }

    // LeetCode - 1299 _________________________________________
    public static int[] replaceElements(int[] arr)
    {
        int[] ans = new int[arr.length];
        
        ans[ans.length - 1] = -1;
        int max_ = Integer.MIN_VALUE;
        
        max_ = Math.max(max_ , arr[arr.length- 1]);
        for(int i = ans.length - 2 ; i >= 0; i--)
        {
            ans[i] = max_;
            max_ = Math.max(max_ , arr[i]);
        }
        
        return ans;
   }


    // LeetCode - 1304 __________________________________________________
    public static int[] sumZero(int n)
    {
        int[] ans = new int[n];
       
        int x = n / 2;
        for(int i = 0 ; i < n/2 ; i++)
        {
            ans[i] = -x;
            ans[n - i - 1] = x;
           
            x--;
        }
       
        if(n % 2 == 1)           // when the n is odd.
        {
           ans[n/2] = 0;
        }
        return ans;
    }



    // LeetCode - 1475 _______________________________________________
    public static int[] finalPrices(int[] prices) 
    {
        for(int i = 0 ; i < prices.length ; i++)
        {
            for(int j = i+1; j < prices.length ; j++)
            {
                if(prices[j] <= prices[i])
                {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        
        return prices;
    }



    // LeetCode - 832 ______________________________________________
    public static int[][] flipAndInvertImage(int[][] A) 
    {
        for(int i = 0 ; i < A.length ; i++)
        {
            for(int j = 0 ; j < (A[0].length + 1) /2 ; j++)
            {
                int temp = A[i][j] ^ 1;
                A[i][j] = A[i][A[0].length - j - 1] ^ 1;
                A[i][A[0].length - j - 1] = temp;
            }
        }
        
        return A;
    }


    // LeetCode = 1460 _____________________________________________________
    public static boolean canBeEqual(int[] target, int[] arr) 
    {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i = 0; i < arr.length ; i++)
        {
            if(target[i] != arr[i])
            {
                return false;
            }
        }
        
        return true;
    }



    // LeetCode - 905 _______________________________________
    public static int[] sortArrayByParity(int[] A) 
    {
        int[] ans = new int[A.length];
        int j = 0;
        int k = ans.length- 1;
        for(int i = 0 ; i < A.length ; i++)
        {
            if(A[i] % 2 == 0)
            {
                ans[j] = A[i];
                j++;
            }
            else
            {
                ans[k] = A[i];
                k--;
            }
        }
        
        return ans;
    }


    //LeetCode - 977 __________________________________________
    public static int[] sortedSquares(int[] A) 
    {
        int[] ans = new int[A.length];
        
        int j = 0;
        
        while(j < A.length && A[j] < 0)
        {
            j++;
        }
        
        int i = j - 1;
        // i is where -ve no. ends and j is where +ve no. starts
        
        int idx = 0;  // to fill the ans array
        while(i >= 0 && j < A.length)
        {
            if(Math.abs(A[i]) < A[j])
            {
                ans[idx++] = A[i] * A[i];
                i--;
            }
            else
            {
                ans[idx++] = A[j] * A[j];
                j++;
            }
        }
        
        while(i >= 0)       // if some -ve no. are left
        {
            ans[idx++] = A[i] * A[i];
            i--;
        }
        
        while(j < A.length)         // if some +ve no. are left
        {
            ans[idx++] = A[j] * A[j];
            j++;
        }
        
        return ans;
    }




    // LeetCode - 1491 _______________________________
    public static double average(int[] salary) 
    {
        double sum = 0;
        int max = 0;
        int min = 10000000;
        
        for(int i = 0 ; i < salary.length ; i++)
        {
            sum += salary[i];
            
            max = Math.max(max , salary[i]);
            min = Math.min(min , salary[i]);
        }
        
        sum = sum - max - min;
        sum = sum / (salary.length - 2);
        
        return sum;
    }



    // LeetCode - 561 _______________________________________
    public static int arrayPairSum(int[] nums)
    {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i+=2)
        {
            sum += nums[i];
        }
        return sum;
    }




    // LeetCode - 1380 ___________________________________________
    public static ArrayList<Integer> luckyNumbers(int[][] matrix)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0 ; i < matrix.length ; i++)
        {
            int min_i = i;
            int min_j = 0;
            
            for(int j = 1; j < matrix[0].length ; j++)
            {
                if(matrix[i][j] < matrix[i][min_j])
                {
                    min_j = j;
                }
            }
            boolean flag = false;
            int k = 0;
            while(k < matrix.length)
            {
                if(matrix[k][min_j] > matrix[min_i][min_j])
                {
                    flag = true;
                    break;
                }
                k++;
            }
            
            if(!flag)
            {
                ans.add(matrix[min_i][min_j]);
            }
        }
        
        return ans;
    }




    // LeetCode - 1051 _____________________________________________________
    public static int heightChecker(int[] heights)
    {
        int[] target = heights.clone();
        
        Arrays.sort(target);
        int count = 0;
        for(int i = 0 ; i < heights.length ;i++)
        {
            if(heights[i] != target[i])
            {
                count++;
            }
        }
        
        return count;
    }


    // LeetCode - 922 ___________________________________________________
    public static int[] sortArrayByParityII(int[] A)
    {
        int j = 1;
        
        for(int i = 0 ; i < A.length ; i += 2)
        {
            if(A[i] % 2 == 1)
            {
                while(A[j] % 2 == 1)
                {
                    j += 2;
                }
            
                // swap A[i] and A[j]
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        
        return A;
    }


    public static int[] sortArrayByParityII_2(int[] A)
    {
        int i = 0, j = A.length-1;
        
        while(i < A.length-1)
        {
            if((A[i] & 1) == 0) i+=2;
            else if((A[j] & 1) != 0) j-=2;
            else 
            {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }




    // LeetCode - 1377 __________________________________________
    public static int[] kWeakestRows(int[][] mat, int k) 
    {
        int[][] helper = new int[mat.length][2];
        
        for(int i = 0 ; i < mat.length ; i++)
        {
            helper[i][0] = i;
            helper[i][1] = soldiers(mat[i]);
        }
        
        // sort the ans array according to the no. of soldiers.
        Arrays.sort(helper , (index1, index2) -> (index1[1] != index2[1] ? index1[1] -                                                              index2[1] : index1[0] - index2[0]));
        int[] ans = new int[k]; 
        for(int i = 0 ; i < k ; i++)
        {
            ans[i] = helper[i][0];
        }
        
        return ans;
    }
    
    public static int soldiers(int[] row)
    {
        int left = 0;
        int right = row.length - 1;
        int mid;
        
        while(left <= right)
        {
            mid = left + (right - left) / 2;
            if(row[mid] == 0)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        
        return left;
    }





    // LeetCode - 1122 _________________________________________
    public static int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        if(arr1.length == 0 && arr2.length == 0) 
            return arr1;
        
        
        int[] frequency = new int[1001];     // as arr1[i] is < 1000
        int max = -1;
        
        for(int i = 0 ; i < arr1.length ; i++)
        {
            frequency[arr1[i]]++;
            max = Math.max(arr1[i] , max);
        }
        
        int idx = 0;
        for(int i = 0 ; i < arr2.length ; i++)
        {
            if(frequency[arr2[i]] > 0)
            {
                while(frequency[arr2[i]]-- > 0)
                {
                    arr1[idx++] = arr2[i];
                }
            }
        }
        
        for(int i = 0 ; i <= max ; i++)
        {
            while(frequency[i]-- > 0)
            {
                arr1[idx++] = i;
            }
        }
        
        return arr1;
    }





    // LeetCode - 1002 __________________________________________________
    public static ArrayList<String> commonChars(String[] A) 
    {
        ArrayList<String> ans = new ArrayList<>();
        int[][] arr = new int[A.length][26];
        
        for(int i = 0 ; i < A.length ; i++)
        {
            for(char ch : A[i].toCharArray())
            {
                int j = (int)(ch - 'a');
                arr[i][j]++;
            }
        }
        
        
        for(int i = 0; i < arr[0].length ; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < arr.length ; j++)
            {
                min = Math.min(min , arr[j][i]);
                if(min == 0)
                {
                    break;
                }
            }
            
            while(min-- > 0)
            {
                ans.add((char)(i + (int)'a') + "");
            }
            
        }
        
        return ans;
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