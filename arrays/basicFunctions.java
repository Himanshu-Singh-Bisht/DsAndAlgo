import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


        // Ques - 1385, Find the Distance Value Between Two Arrays
        // Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
        // Output: 2
        // findTheDistanceValue(arr1, arr2, d);




        // Ques - 1160, Find Words That Can Be Formed by Characters
        // Input: words = ["cat","bt","hat","tree"], chars = "atach"
        // Output: 6
        // countCharacters(words, chars);



        // Ques = 509 , fibonacci number
        // Input: 3
        // Output: 2
        // fib(n);



        // Ques - 999 , Available Captures for Rook
        // Input: char[][] board = [[".",".",".",".",".",".",".","."],
        //         [".",".",".","p",".",".",".","."],
        //         [".",".",".","R",".",".",".","p"], 
        //         [".",".",".",".",".",".",".","."],
        //         [".",".",".",".",".",".",".","."],
        //         [".",".",".","p",".",".",".","."],
        //         [".",".",".",".",".",".",".","."],
        //         [".",".",".",".",".",".",".","."]]
        // Output: 3
        // numRookCaptures(board);




        
        
        // Ques - 1200 , Minimum Absolute Difference
        // Input: arr = [4,2,1,3]
        // Output: [[1,2],[2,3],[3,4]]
        // minimumAbsDifference(arr);




        // Ques - 1394, Find Lucky Integer in an Array
        // Input: arr = [2,2,3,4]
        // Output: 2
        



        // Ques - 1413 , Minimum Value to Get Positive Step by Step Sum
        // Input: nums = [-3,2,-3,4,2]
        // Output: 5
        // minStartValue(nums);



        // Ques - 706 , Toeplitz Matrix
        // matrix = [
        //             [1,2,3,4],
        //             [5,1,2,3],
        //             [9,5,1,2] 
        //             ]
        // Output: True
        // isToeplitzMatrix(matrix);




        // Ques - 1399 , Count Largest Group
        // Input: n = 13
        // Output: 4
        // countLargestGroup(n);




        // Ques - 1185 , Day of the Week
        // Input: day = 31, month = 8, year = 2019
        // Output: "Saturday"
        // dayOfTheWeek(day , month, year);




        // Ques - 867 , Transpose of a Matrix
        // transpose(A);



        // Ques - 985 , Sum of Even Number After Queries
        // Input: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
        // Output: [8,6,2,4]
        // sumEvenAfterQueries(A, queries);



        // Ques - 1260 , Shift 2D Grid
        // Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
        // Output: [[9,1,2],[3,4,5],[6,7,8]]
        // shiftGrid(grid, k);
        // shiftGrid_2(grid, k);
        
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




    // LeetCode - 1385
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d)
    {
        int count = 0;
        for(int i = 0 ; i < arr1.length; i++)
        {
            boolean flag = false;
            for(int j = 0 ; j < arr2.length ; j++)
            {
                if((Math.abs(arr1[i] - arr2[j])) <= d)
                {
                    flag = true;
                    break;
                }
            }
            
            if(flag)
            {
                count++;
            }
        }
        
        return arr1.length - count;
    }




    // LeetCode - 1160 ___________________________________________
    public static int countCharacters(String[] words, String chars) 
    {
        int[] indexedArray=new int[26];  //Data Indexed Array stores cnt of letters in chars
        
        for(int i=0;i<chars.length();i++)
        {
            char c = chars.charAt(i);
            indexedArray[c-'a']++;
        }
        
        int sum=0;
        
        for(int i=0;i<words.length;i++)
        {
            if(formed(words[i],indexedArray)) 
            {
                sum += words[i].length();
            }
        }
        return sum;
    }
    
   private static boolean formed(String word, int[] indexedArray)
   {
        int[] wordDic = new int[26];
       
        for(int i=0;i<word.length();i++)
        {
           char c = word.charAt(i);
           if(wordDic[c-'a'] == indexedArray[c-'a'])
           {                                            //already ==, false
                return false;
           }
           else
           {
               wordDic[c-'a']++;
           }
        }
        return true;
    }
    
    
    
    // LeetCode = 509  ________________________________________
    public static int fib(int n) 
    {
        if(n==0)
        {
            return 0;
        }
        int a = 0; 
        int b = 1;
        int c = a+b;
        for(int  i = 2 ; i <=n ; i++)
        {
            c = a+b;
            a = b;
            b = c;
        }
        
        return c;
    }
    
    
    
    // LeetCode - 999 _____________________________________________
    public static int numRookCaptures(char[][] board) 
    {
        int r = -1; 
        int c = -1;
        for(int i = 0 ; i < board.length ; i++)
        {
            for(int j = 0 ; j < board[0].length ; j++)
            {
                if(board[i][j] == 'R')
                {
                    r = i;
                    c = j; 
                    break;
                }
            }
            
            if(r != -1)
            {
                break;
            }
        }
        
        int count = 0;
        
        int[][] dir = {{0 , 1} , {1, 0} , {0 , -1} , {-1 , 0}};
        
        for (int i = 0 ; i < dir.length ; i++)
        {
            int row = r + dir[i][0];
            int col = c + dir[i][1];
            
            // loop to traverse a row or a column at a time
            while (row >= 0 && row < 8 && col >= 0 && col < 8)      
            {
                if (board[row][col] == 'p')
                {
                    count++;
                    break;
                }
                else if (board[row][col] == 'B')
                {
                    break;  
                }
                row += dir[i][0];
                col += dir[i][1];
            }
        }
        return count;
    }
    



    // LeetCode - 1200 _______________________________________________
    public static ArrayList<ArrayList<Integer>> minimumAbsDifference(int[] arr) 
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int d = Integer.MAX_VALUE;
        
        
        for(int i = 1 ; i < arr.length ; i++)
        {
            d = Math.min(d , arr[i] - arr[i-1]);
        }
        
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(d == (arr[i] - arr[i-1]))
            {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                
                ans.add(list);
            }
        }
        
        return ans;
    }



    // LeetCode - 1394 _______________________________________________
    public static int findLucky(int[] arr) 
    {
        Arrays.sort(arr);
        int ans = -1;
        
        int i = 0;
        while(i < arr.length)
        {
            int val = arr[i];
            int size = 1;
            for(int j = i + 1 ; j < arr.length && arr[j] == val ; j++)
            {
                size++;
                i = j;
            }
            
            if(size == val)
            {
                if(ans == -1)
                {
                    ans = val;
                }
                else
                {
                    ans = Math.max(ans , val);
                }
            }
            
            i++;
        }
        
        return ans;
    } 



    // LeetCode - 1413 ______________________________________________
    public static int minStartValue(int[] nums) 
    {
        int startValue = 1;
        int sum = 0;
        
        for(int i = 0; i < nums.length ; i++)
        {
            sum = sum + nums[i];
            
            startValue = Math.min(sum , startValue);
        }
        
        
        if(startValue < 1)
        {
            return Math.abs(startValue) + 1;
        }
        return startValue;
    }




    
    // LeetCode - 706 ________________________________________
    public static boolean isToeplitzMatrix(int[][] matrix) 
    {
        for(int i = 1 ; i < matrix.length ; i++)
        {
            for(int j = 1 ; j < matrix[i].length ; j++)
            {
                if(matrix[i][j] != matrix[i-1][j-1])
                {
                    return false;
                }
            }
        }
        
        return true;
    }



    // LeetCode - 1399 ________________________________________
    public static int countLargestGroup(int n) 
    {
        if(n < 10)
            return n;
        int count[] = new int[37];
        
        for(int i=1;i<=9;i++) 
        {
            count[i] = 1; // from 1 to 9 size is always 1 initially 
        }
        
        for(int i=10;i<=n;i++)
        {
            count[getDigitSum(i)]++;  //get the digit sum and increment the respective bucket
        }
        
        int size = 0 , lastMax = -1;
        for(int v : count)
        {  //count the occurances of a MAXIMUM VALUE
            if(v == lastMax)
            {
                size++;
            }
            else if (v > lastMax && v > 0)
            {
                size = 1; 
                lastMax = v;
            }
        }
        return size;
    }

    public static int getDigitSum(int x)
    {
        int sum=0;
        while(x>0)
        {
            sum += x % 10;
            x = x/10;
        }
        return sum;
    }





    // LeetCode - 1185 _________________________________________
    private static int NON_LEAP_YEAR = 365;
    private static int LEAP_YEAR = 366;
    
    public static String dayOfTheWeek(int day, int month, int year) 
    {
        int days = 0;
        String[] dayOfWeek = {"Friday" , "Saturday" , "Sunday" , "Monday" , "Tuesday" ,                                         "Wednesday" , "Thursday"};
        // as day on 1/1/1971 is Friday
        
        for(int i = 1971 ; i < year ; i++)
        {
            if(checkLeapYear(i))
            {
                days += LEAP_YEAR;
            }
            else
            {
                days += NON_LEAP_YEAR;
            }
        }
        
        
        boolean currYear = checkLeapYear(year);
        
        for(int  i = 1 ; i < month ; i++)
        {
            if(i == 2)
            {
                days += (currYear) ? 29 : 28;
            }
            else if(i == 4 || i == 6 || i == 9 || i == 11)
            {
                days += 30;
            }
            else
            {
                days += 31;
            }
        }
        
        days += day - 1;
        
        return dayOfWeek[days % 7];
    }
    
    public static boolean checkLeapYear(int y)
    {
        if(y % 400 == 0)
        {
            return true;
        }
        if(y % 100 == 0)
        {
            return false;
        }
        if(y % 4 == 0)
        {
            return true;
        }
        return false;
    }



    // LeetCode - 867 __________________________
    public static int[][] transpose(int[][] A) 
    {
        int[][] ans = new int[A[0].length][A.length];
        for(int i = 0 ; i < A.length ; i++)
        {
            for(int j = 0 ; j < A[0].length ; j++)
            {
                ans[j][i] = A[i][j];
            }
        }
        return ans;
    }
    
    
    

    // LeetCode - 985 ___________________________
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) 
    {
        int[] ans = new int[queries.length];
        
        int sum = 0;
        for(int x : A)
        {
            if(x % 2 == 0)
            {
                sum += x;
            }
        }
        for(int i = 0 ; i < queries.length; i++)
        {
            int val = queries[i][0];
            int idx = queries[i][1];
            
            if(A[idx] % 2 == 0)
            {
                sum -= A[idx];
            }
            A[idx] += val;
            
            if(A[idx] % 2 == 0)
            {
                sum += A[idx];
            }
            ans[i] = sum;
        }
        
        return ans;
    }
    
    

    // LeetCode - 1260 ______________________________________
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) 
    {
        while(k-- > 0)
        {
            int[][] newgrid = new int[grid.length][grid[0].length];
            for(int i = 0 ; i < grid.length ; i++)
            {
                for(int j = 0 ; j < grid[0].length - 1 ; j++)
                {
                    newgrid[i][j+1] = grid[i][j];
                }
            }
            
            for(int i = 0; i < grid.length - 1 ; i++)
            {
                newgrid[i + 1][0] = grid[i][grid[0].length - 1];
            }
            
            newgrid[0][0] = grid[grid.length - 1][grid[0].length -1];
            
            grid = newgrid;
        }
        
        
        List<List<Integer>> result = new ArrayList<>();
        for(int[] row : grid)
        {
            List<Integer> list = new ArrayList<>();
            for(int i : row)
            {
                list.add(i);
            }
            result.add(list);
        }
        
        return result;
    }


    public static List<List<Integer>> shiftGrid_2(int[][] grid, int k) 
    {
        while(k-- > 0)
        {
            int prev = grid[grid.length - 1][grid[0].length - 1];
            for(int i = 0 ; i < grid.length ; i++)
            {
                for(int j = 0 ; j < grid[0].length ; j++)
                {
                    int temp = grid[i][j];
                    grid[i][j] = prev;
                    prev = temp;
                }
            }
        }
        
        
        List<List<Integer>> result = new ArrayList<>();
        for(int[] row : grid)
        {
            List<Integer> list = new ArrayList<>();
            for(int i : row)
            {
                list.add(i);
            }
            result.add(list);
        }
        
        return result;
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