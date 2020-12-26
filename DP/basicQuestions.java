import java.util.Arrays;

public class basicQuestions
{
    public static void main(String[] args)
    {
        // FIBONACCI SERIES _____________________________________________________
        // int n = 6;
        // System.out.println(fibo_1(n));
        // int[] dp = new int[n+1];
        // System.out.println(fibo_2(n , dp));  
        // display1D(dp);
        // System.out.println(fibo_3(n));
        // System.out.println(fibo_4(n));



        // MAZEPATH _____________________________________________________________________
        // int sr = 0;
        // int sc = 0;
        // int er = 2;
        // int ec = 2;

        // HV MOVES AVAILABLE __________________
        // System.out.println(mazepathHV_1(sr , sc , er , ec)); 
        // int[][] dp = new int[er + 1][ec + 1];
        // System.out.println(mazepathHV_2(sr , sc ,er , ec , dp));
        // System.out.println(mazepathHV_2b(sr, sc, er, ec, dp));
        // display2D(dp);
        // System.out.println(mazepathHV_3(sr, sc, er, ec));

        // HVD MOVES AVAILABLE ________________________
        // System.out.println(mazepathHVD_1(sr, sc, er, ec));
        // int[][] dp = new int[er + 1][ec + 1];
        // System.out.println(mazepathHVD_2(sr, sc, er, ec, dp));
        // display2D(dp);
        // System.out.println(mazepathHVD_3(sr , sc , er , ec));

        // HVD MULTIPLE MOVES AVAILABLE ______________________
        // System.out.println(mazepathHVDMulti_1(sr , sc , er , ec));
        // int[][] dp = new int[er + 1][ec + 1];
        // System.out.println(mazepathHVDMulti_2(sr, sc, er, ec , dp));
        // display2D(dp);
        // System.out.println(mazepathHVDMulti_3(sr, sc, er, ec));


        
        
        // BOARDPATH __________________________________________________________________________
        // int target = 10;

        // BOARDPATH DICE MOVES ONLY ____________
        // System.out.println(boardpathDice_1(target));
        // int[] dp = new int[target + 1];
        // System.out.println(boardpathDice_2(target, dp));
        // display1D(dp);
        // System.out.println(boardpathDice_3(target));

        // BOARDPATH ARRAY MOVES ONLY _____________
        // int[] arr = {2 , 5 , 3 , 7};
        // System.out.println(boardpathGivenOutcome_1(target , arr));
        // int[] dp = new int[target + 1];
        // System.out.println(boardpathGivenOutcome_2(target, arr, dp));
        // display1D(dp);
        // System.out.println(boardpathGivenOutcome_3(target, arr));



        // CLIMBING STAIRS _____________________________________________________________
        // int n = 3;
        // System.out.println(climbingStairs_1(n));
        // int[] dp = new int[n + 1];
        // System.out.println(climbingStairs_2(n, dp));
        // display1D(dp);
        // System.out.println(climbingStairs_3(n));


        // MIN COST CLIMBING STAIRS ________________________________________________________-
        // int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1 , 0};
        // System.out.println(minCost_1(arr , arr.length - 1));
        // int[] dp = new int[arr.length];
        // System.out.println(minCost_2(arr, arr.length - 1 , dp));
        // display1D(dp);
        // System.out.println(minCost_3(arr, arr.length - 1));


        // MINIMUM PATH SUM _________________________________________________________________
        // int[][] arr = {{1 , 3 , 1},
                    //  {1 , 5 , 1},
                    //  {4 , 2 , 1}};
        // int sr = 0;
        // int sc = 0;
        // System.out.println(minPathSum_1(sr , sc , arr));
        // int[][] dp = new int[arr.length][arr[0].length];
        // System.out.println(minPathSum_2(sr, sc, arr, dp));
        // display2D(dp);
        // System.out.println(minPathSum_3(arr));


        // PAIR AND SINGLE UP _______________________________________________________________
        // int n = 4;
        // System.out.println(pairAndSingleUp_1(n));
        // System.out.println(pairAndSingleUp_1b(n));
        // int[] dp = new int[n + 1];
        // System.out.println(pairAndSingleUp_2(n , dp));
        // display1D(dp);
        // System.out.println(pairAndSingleUp_3(n));


        
        // LEETCODE - 45 , JUMP GAME-2 ______________________________________
        // int[] nums = {2,3,1,1,4};
        // System.out.println(jumpGame_1(nums , 0));
        // int[] dp = new int[nums.length];
        // System.out.println(jumpGame_2(nums, 0, dp));
        // display1D(dp);
        // System.out.println(jumpGame_3(nums));


        // LEETCODE - 55 , JUMP GAME-I __________________________________________
        // int[] nums = {2,3,1,1,4};
        // System.out.println(canJump_1(nums , 0));
        // System.out.println(canJump_2(nums));



        // GFG , COUNT NO. OF WAYS OF PARTITION OF N ELEMENTS INTO K SUBSETS ________________
        // int n = 5 ; int k = 3;
        // System.out.println(divideIntoKGroups_1(n , k));
        // int[][] dp = new int[n + 1][k + 1];
        // System.out.println(divideIntoKGroups_2(n, k , dp));
        // display2D(dp);
        // System.out.println(divideIntoKGroups_3(n, k));


        // GFG , GOLDMINE PROBLEM _________________________
        // int mat[][] = { {1, 3, 1, 5},
        //                 {2, 2, 4, 1},
        //                 {5, 0, 2, 3},
        //                 {0, 6, 1, 2}};

        // int max = Integer.MIN_VALUE;

        // int[][] dp = new int[mat.length][mat[0].length];
        // for(int i = 0 ; i < mat.length ; i++)
        // {
        //     // int rec = goldmine_1(mat , i , 0);
        //     int rec = goldmine_2(mat, i, 0 , dp);
        //     max = Math.max(max , rec);
        // }
        // System.out.println(max);
        // display2D(dp);
        // System.out.println(goldmine_3(mat));



        // GFG , MAXIMUM SIZE SQUARE SUB MATRIX WITH ALL 1'S ________________
        // int[][] arr =  { {0, 1, 1, 0, 1},  
        //                  {1, 1, 0, 1, 0},  
        //                  {0, 1, 1, 1, 0},  
        //                  {1, 1, 1, 1, 0},  
        //                  {1, 1, 1, 1, 1},  
        //                  {0, 0, 0, 0, 0}};  
        // maxSizeSquareSubmatrix_1(arr , 0 , 0);
        // int[][] dp = new int[arr.length][arr[0].length];
        // for(int[] row : dp)
        // {
        //     Arrays.fill(row , -1);
        // }
        // maxSizeSquareSubmatrix_2(arr, 0, 0, dp);
        // System.out.println(maxAns);
        // display2D(dp);
        // System.out.println(maxSizeSquareSubmatrix_3(arr));


        // GFG , COUNT NO. OF WAYS TO FILL N X M SPACE USING 1 X M TILES____________________________
        // int n = 7 , m = 4;
        // System.out.println(tileFloor_1(n, m));
        // int[] dp = new int[n + 1];
        // System.out.println(tileFloor_2(n, m , dp));
        // display1D(dp);
        // System.out.println(tileFloor_3(n, m));



        // COIN CHANGE ________________________________________________
        // int[] arr = {2 , 3 , 5 , 7};
        // int target = 10;
        // System.out.println(permu_1(arr , target));
        // int[] dp = new int[target + 1];
        // System.out.println(permu_2(arr , target , dp));
        // display1D(dp);
        // System.out.println(permu_3(arr , target));

        // System.out.println(combi_1(arr, target, 0));
        // int[] dp = new int[target + 1];
        // System.out.println(combi_2(arr, target, 0 , dp));
        // display1D(dp);
        // System.out.println(combi_3(arr, target));


        // LEETCODE - 377 , COMBINATION SUM - IV ____________________________________
        // int[] arr = {1 , 2, 3};
        // int target  = 4;
        // System.out.println(combinationSum4(arr, target));       // o/p = 4


        // (GFG) NO. OF SOLUTIONS OF A LINEAR EQUATION OF N VARIABLE __________________
        // int[] coeff = {2 , 3 , 7};
        // int rhs = 20;       // o/p = 8
        // System.out.println(countSol_1(coeff ,0 ,  rhs));
        // System.out.println(countSol_2(coeff , rhs));
        

        // TARGET TYPE _______________________

        // COIN CHANGE COMBINATION (COIN USED ONLY ONCE)
        // int[] arr = new int[]{0 , 2 , 3 , 5 , 1 , 6};
        // int target = 10;
        // System.out.println(combiOnce_1(arr, target , 0));
        // System.out.println(combiOnce_1b(arr, target, 0));
        // int[][] dp = new int[arr.length][target + 1];
        // System.out.println(combiOnce_2(arr, target , arr.length - 1 , dp));
        // display2D(dp);
        // System.out.println(combiOnce_3(arr , target));


        // (GFG) 0-1 KNAPSACK PROBLEM _____________________________
        // int[] val = {15 , 14 , 10 , 45 , 30};
        // int[] weights = {2 , 5 , 1 , 3 , 4};
        // int cap = 7;
        // System.out.println(knapsack_1(val , weights , cap , weights.length - 1));
        // int[][] dp = new int[weights.length][cap + 1];
        // System.out.println(knapsack_2(val, weights, cap, weights.length - 1 , dp));
        // display2D(dp);
        // System.out.println(knapsack_3(val, weights, cap));

        // UNBOUNDED KNAPSACK ________________________________________
        // System.out.println(unboundeknapsack_1(val , weights , cap));


        // (GFG) PRINT ALL PALINDROMIC SUBSTRINGS IN A STRING ____________________________________
        // String str = "abccbdefeg";
        // boolean[][] dp = isPalindromeSubstring(str);
        // int count = 0;
        // for(int i = 0 ; i < dp.length ; i++)
        // {
        //     for(int j = 0 ; j < dp[0].length ; j++)
        //     {
        //         if(dp[i][j])
        //         {
        //             System.out.println(str.substring(i , j + 1));
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);
        // System.out.println(palindromeSubstringEffeicient(str));


        // leetcode - 5 , longest palindrome substring ___________________________
        // String str = "abcbaddef";
        // System.out.println(longestPalindrome_1(str));
        // System.out.println(longestPalindrome_2(str));
        // int[][] dp = longestPalindromeDP(str);
        // display2D(dp);


        // leetcode - 516 , longest palindromic subsequence _____________________________
        // String str = "acbdebafgh";
        // System.out.println(longestPalindromicSubsequenceDP(str));

        // count all palindromic subsequences possible _________________________
        // String str = "amrmsra";     // o/p - 23
        // String str = "amrmsrp";     // o/p = 12
        // System.out.println(countPalindromicSubsequence(str));


        // LONGEST INCREASING SUBSEQUENCES (LIS) ____________________________________________
        // int[] arr = {0 , 8 , 4 , 12 , 2  , 10 , 6 , 11 , 1 , 9 , 5 };
        // System.out.println(totalLIS_1(arr , 0 , ""));
        // int[] dp = new int[arr.length];
        // LIS_memo(arr , arr.length - 1, dp);
        // System.out.println(maxAnsLIS);
        // display1D(dp);
        // int[] lisDP = LIS_DP(arr);
        // display1D(lisDP);
        // int[] ans = LIS_DP_optimized(arr);
        // display1D(ans);

        // LONGEST DECREASING SUBSEQUENCES (LDS) ______________________________________________
        // int[] ldsDP = LDS_DP(arr);
        // display1D(ldsDP);

        // LONGEST BITONIC SUBSEQUENCES (LBS) __________________________________________
        // int[] lbs_DP = LBS_DP(arr);
        // display1D(lbs_DP);


        // longest sum increasing subsequences (gfg) _________________________________
        // System.out.println(sumIncreasingSubsequencesDP(arr));

        // mininum no.of deletions required to make the array sorted _____________________
        // System.out.println(minDeltionsToMakeSorted(arr));


        // MATRIX CHAIN MULTIPLICATION (MCM) (GFG)_____________________________________________________________
        // int[] arr = {10 , 20 , 30 , 40 , 30};
        // System.out.println(MCM_1(arr , 0 , arr.length - 1));
        // int[][] dp = new int[arr.length][arr.length];
        // System.out.println(MCM_2(arr, 0, arr.length - 1, dp));
        // display2D(dp);
        // System.out.println(MCM_3(arr));

        // MCM WITH ACTUAL STRING _________________________________________
        // pair[][] dp = new pair[arr.length][arr.length];
        // pair obj = MCM_WithString(arr , 0 , arr.length - 1 , dp);
        // System.out.println(obj.first + " -> " + obj.second);

        // System.out.println(MCM_DP_WithString(arr));



    }

    // FIBONACCI SERIES _________________________________________________________
    // recursion
    public static int fibo_1(int n)
    {
        if(n <= 1)
        {
            return n;
        }

        int ans = fibo_1(n-1) + fibo_1(n-2);
        return ans;
    }

    // memoization 
    public static int fibo_2(int n , int[] dp)
    {
        if(n <= 1)
        {
            return n;
        }
        if(dp[n] != 0)
        {
            return dp[n];
        }

        int ans = fibo_2(n - 1, dp) + fibo_2(n - 2 , dp);
        dp[n] = ans;
        return ans;
    }

    // tabulation 
    public static int fibo_3(int n)
    {
        int[] dp = new int[n + 1];
        for(int i = 0 ; i <= n ; i++)
        {
            if(i <= 1)
            {
                dp[i] = i;
                continue;
            }
            dp[i] = dp[i-1] + dp[i-2];
        }

        display1D(dp);
        return dp[n];
    }

    // optimization
    public static int fibo_4(int n)
    {
        int a = 0;
        int b = 1;

        while(n-- > 1)
        {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }



    // MAZEPATH ___________________________________________________________________________

    // MAZEPATH HV MOVES _____________________________________________________________________
    // recursion
    public static int mazepathHV_1(int sr , int sc , int er , int ec)
    {
        if(sr == er && sc == ec)
        {
            return 1;
        }

        int count = 0;
        if(sr + 1 <= er)
        {
            count += mazepathHV_1(sr + 1, sc, er, ec);
        }
        if(sc + 1 <= ec)
        {
            count += mazepathHV_1(sr, sc + 1, er, ec);
        }
        return count;
    }

    // memoization 
    public static int mazepathHV_2(int sr , int sc , int er , int ec , int[][] dp)
    {
        if(sr == er && sc == ec)
        {
            return 1;
        }

        if(dp[sr][sc] != 0)
        {
            return dp[sr][sc];
        }

        int count = 0;
        if(sr + 1 <= ec)
        {
            count += mazepathHV_2(sr + 1, sc, er, ec, dp);
        }
        if(sc + 1 <= ec)
        {
            count += mazepathHV_2(sr, sc + 1, er, ec, dp);
        }

        dp[sr][sc] = count;
        return count;
    }

    // memoization optimization
    public static int mazepathHV_2b(int sr , int sc , int er ,int ec , int[][] dp)
    {
        if(sr == er && sc == ec)
        {
            return 1;
        }

        if(dp[sr][sc] != 0)
        {
            return dp[sr][sc];
        }

        if(er == ec && dp[sc][sr] != 0)
        {
            return dp[sc][sr];
        }

        int count = 0;
        if(sr + 1 <= er)
        {
            count += mazepathHV_2b(sr + 1, sc, er, ec, dp);
        }
        if(sc + 1 <= ec)
        {
            count += mazepathHV_2b(sr, sc + 1, er, ec, dp);
        }

        dp[sr][sc] = count;
        return count;
    }
    // tabulation
    public static int mazepathHV_3(int sr , int sc , int er , int ec)
    {
        int[][] dp = new int[er + 1][ec + 1];
        for(int i = er ; i >= sr ; i--)
        {
            for(int j = ec ; j >= sc ; j--)
            {
                if(i == er && j == ec)
                {
                    dp[i][j] = 1;
                    continue;
                }

                if(i + 1 <= er)
                {
                    dp[i][j] += dp[i + 1][j];
                }
                if(j + 1 <= ec)
                {
                    dp[i][j] += dp[i][j + 1];
                } 
            }
        }

        display2D(dp);
        return dp[sr][sc];
    }



    // MAZEPATH HVD MOVES ___________________________________________________________________
    // recursion 
    public static int mazepathHVD_1(int sr,int sc , int er , int ec)
    {        
        if(sr == er && sc == ec)
        {
            return 1;
        }
        int count = 0;
        if(sr + 1 <= er)
        {
            count += mazepathHVD_1(sr + 1, sc, er, ec);
        }
        if(sc + 1 <= ec)
        {
            count += mazepathHVD_1(sr, sc + 1, er, ec);
        }
        if(sr + 1 <= er && sc + 1 <= ec)
        {
            count += mazepathHVD_1(sr + 1 , sc + 1 , er , ec);
        }

        return count;
    }

    // memoization
    public static int mazepathHVD_2(int sr , int sc , int er , int ec , int[][] dp)
    {
        if(sr == er && sc == ec)
        {
            return 1;
        }

        if(dp[sr][sc] != 0)
        {
            return dp[sr][sc];
        }

        int count = 0;
        if(sr + 1 <= er)
        {
            count += mazepathHVD_2(sr + 1, sc, er, ec, dp);
        }
        if(sc + 1 <= ec)
        {
            count += mazepathHVD_2(sr, sc + 1, er, ec, dp);
        }
        if(sr + 1 <= er && sc + 1 <= ec)
        {
            count += mazepathHVD_2(sr + 1, sc + 1, er, ec, dp);
        }

        dp[sr][sc] = count;
        return count;
    }

    // tabulation
    public static int mazepathHVD_3(int sr , int sc , int er , int ec)
    {
        int[][] dp = new int[er + 1][ec + 1];
        for(int i = er ; i >= sr ; i--)
        {
            for(int j = ec ; j >= sc ; j--)
            {
                if(i == er && j == ec)
                {
                    dp[i][j] = 1;
                    continue;
                }

                if(i + 1 <= er)
                {
                    dp[i][j] += dp[i + 1][j];
                }
                if(j + 1 <= ec)
                {
                    dp[i][j] += dp[i][j + 1];
                }
                if(i + 1 <= er && j + 1 <= ec)
                {
                    dp[i][j] += dp[i + 1][j + 1];
                }
            }
        }

        display2D(dp);
        return dp[0][0];
    }


    // MAZEPATH HVD MULTIMOVES ____________________________________________________
    // recursion 
    public static int mazepathHVDMulti_1(int sr , int sc , int er , int ec)
    {
        if(sr == er && sc == ec)
        {
            return 1;
        }

        int count = 0;
        for(int i = 1 ; sr + i <= er ; i++)
        {
            count += mazepathHVDMulti_1(sr + i, sc, er, ec);
        }
        for(int i = 1 ; sc + i <= ec ; i++)
        {
            count += mazepathHVDMulti_1(sr, sc + i, er, ec);
        } 
        for(int i = 1 ; sr + i <= er && sc + i <= ec ; i++)
        {
            count += mazepathHVDMulti_1(sr + i, sc + i, er, ec);
        }

        return count;
    }

    // memoization
    public static int mazepathHVDMulti_2(int sr ,int sc , int er , int ec , int[][] dp)
    {
        if(sr == er && sc == ec)
        {
            return 1;
        }

        if(dp[sr][sc] != 0)
        {
            return dp[sr][sc];
        }
        int count = 0;
        for(int i = 1 ; sr + i <= er ; i++)
        {
            count += mazepathHVDMulti_2(sr + i, sc, er, ec , dp);
        }
        for(int i = 1 ; sc + i <= ec ; i++)
        {
            count += mazepathHVDMulti_2(sr, sc + i, er, ec , dp);
        } 
        for(int i = 1 ; sr + i <= er && sc + i <= ec ; i++)
        {
            count += mazepathHVDMulti_2(sr + i, sc + i, er, ec , dp);
        }
        
        dp[sr][sc] = count;
        return count;
    }

    // tabulation
    public static int mazepathHVDMulti_3(int sr , int sc , int er , int ec)
    {
        int[][] dp = new int[er + 1][ec + 1];
        for(int i = er ; i >= sr ; i--)
        {
            for(int j = ec ; j >= sc ; j--)
            {
                if(i == er && j == ec)
                {
                    dp[i][j] = 1;
                    continue;
                }

                for(int jump = 1 ; i + jump <= er ; jump++)
                {
                    dp[i][j] += dp[i + jump][j];
                }
                for(int jump = 1 ; j + jump <= ec ; jump++)
                {
                    dp[i][j] += dp[i][j + jump];
                }
                for(int jump = 1 ; i + jump <= er && j + jump <= ec; jump++)
                {
                    dp[i][j] += dp[i + jump][j + jump];
                }
            }
        }

        display2D(dp);
        return dp[0][0];
    }




    // BOARDPATH ___________________________________________________________________________________________
    // BOARDPATH WITH DICE MOVES ONLY ___________________
    //  recursion
    public static int boardpathDice_1(int target)
    {
        if(target == 0)
        {
            return 1;
        }

        int count = 0;
        for(int i = 1 ; i <= 6 && target - i >= 0 ; i++)
        {
            count += boardpathDice_1(target - i);
        }
        return count;
    }

    // memoization 
    public static int boardpathDice_2(int target , int[] dp)
    {
        if(target == 0)
        {
            return 1;
        }

        if(dp[target] != 0)
        {
            return dp[target];
        }

        int count = 0;
        for(int i = 1 ; i <= 6 && target - i >= 0 ; i++)
        {
            count += boardpathDice_2(target - i, dp);
        }
        dp[target] = count;

        return count;
    }


    // tabulation
    public static int boardpathDice_3(int target)
    {
        int[] dp = new int[target + 1];
        for(int i = 0 ; i <= target ; i++)
        {
            if(i == 0)
            {
                dp[i] = 1;
                continue;
            }

            for(int jumps = 1 ; jumps <= 6 && i - jumps >= 0; jumps++)
            {
                dp[i] += dp[i - jumps];
            }
        }

        display1D(dp);
        return dp[target];
    }


    // BOARDPATH ARRAY MOVES ONLY _________________

    // recursion
    public static int boardpathGivenOutcome_1(int target , int[] arr)
    {
        if(target == 0)
        {
            return 1;
        }

        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(target - arr[i] >= 0)
            {
                count += boardpathGivenOutcome_1(target - arr[i], arr);
            }
        }

        return count;
    }

    // memoization
    public static int boardpathGivenOutcome_2(int target , int[] arr , int[] dp)
    {
        if(target == 0)
        {
            return 1;
        }

        if(dp[target] != 0)
        {
            return dp[target];
        }

        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(target - arr[i] >= 0)
            {
                count += boardpathGivenOutcome_2(target - arr[i], arr, dp);
            }
        }

        dp[target] = count;
        return count;
    }

    // tabulation
    public static int boardpathGivenOutcome_3(int target , int[] arr)
    {
        int[] dp = new int[target + 1];
        for(int i = 0 ; i <= target ; i++)
        {
            if(i == 0)
            {
                dp[i] = 1;
                continue;
            }

            for(int j = 0 ; j < arr.length ; j++)
            {
                if(i - arr[j] >= 0)
                {
                    dp[i] += dp[i - arr[j]];
                }
            }
        }
        display1D(dp);
        return dp[target];
    }




    // CLIMBING STAIRS _____________________________________________________________
    // recursion
    public static int climbingStairs_1(int n)
    {
        if(n <= 1)
        {
            return 1;
        }

        int count = 0;
        count += climbingStairs_1(n - 1) + climbingStairs_1(n - 2);
        return count;
    }

    // memoization ____________________
    public static int climbingStairs_2(int n , int[] dp)
    {
        if(n <= 1)
        {
            dp[n] = 1;
            return 1;
        }

        if(dp[n] != 0)
        {
            return dp[n];
        }

        dp[n] = climbingStairs_2(n - 1 , dp) + climbingStairs_2(n - 2 , dp);
        return dp[n];
    }

    // tabulation_______________________
    public static int climbingStairs_3(int n)
    {
        int[] dp = new int[n + 1];
        for(int i = 0 ; i <= n ; i++)
        {
            if(i <= 1)
            {
                dp[i] = 1;
                continue;
            }
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        display1D(dp);
        return dp[n];
    }



    // MIN COST CLIMBING STAIRS ___________________________________________________________
    // recursion___________
    public static int minCost_1(int[] arr , int n)
    {
        if(n <= 1)
        {
            return arr[n];
        }

        int count = Math.min(minCost_1(arr, n - 1) , minCost_1(arr , n - 2)) + arr[n];
        return count;
    }

    // memoization ____________
    public static int minCost_2(int[] arr , int n , int[] dp)
    {
        if(n <= 1)
        {
            return arr[n];
        }

        if(dp[n] != 0)
        {
            return dp[n];
        }
        int count = Math.min(minCost_2(arr , n - 1 , dp) , minCost_2(arr, n - 2, dp)) + arr[n];
        dp[n] = count;

        return dp[n];
    }


    // tabulation _____________
    public static int minCost_3(int[] arr , int n)
    {
        int[] dp = new int[n + 1];
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(i <= 1)
            {
                dp[i] = arr[i];
                continue;
            }

            dp[i] = Math.min(dp[i - 1] , dp[i - 2]) + arr[i];
        }

        display1D(dp);
        return dp[n];
    }



    // MINIMUM PATH SUM__________________________________________________________________________
    // recursion
    public static int minPathSum_1(int sr , int sc , int[][] arr)
    {
        if(sr == arr.length - 1 && sc == arr[0].length - 1)
        {
            return arr[sr][sc];
        }

        int c1 = (sr + 1) < arr.length ? minPathSum_1(sr + 1, sc, arr) : (int)1e6;
        int c2 = (sc + 1) < arr[0].length ? minPathSum_1(sr, sc + 1, arr) : (int)1e6;

        int ans = Math.min(c1 , c2) + arr[sr][sc];
        return ans;
    }


    // memoization _________
    public static int minPathSum_2(int sr , int sc , int[][] arr , int[][] dp)
    {
        if(sr == arr.length - 1 && sc == arr[0].length - 1)
        {
            return arr[sr][sc];
        }
        if(dp[sr][sc] != 0)
        {
            return dp[sr][sc];
        }

        int c1 = (sr + 1) < arr.length ? minPathSum_2(sr + 1, sc, arr , dp) : (int)1e6;
        int c2 = (sc + 1) < arr[0].length ? minPathSum_2(sr, sc + 1, arr ,dp) : (int)1e6;

        int ans = Math.min(c1 , c2) + arr[sr][sc];
        dp[sr][sc] = ans;
        return ans;
    }


    // tabulation ________________
    public static int minPathSum_3(int[][] arr)
    {
        int[][] dp = new int[arr.length][arr[0].length];

        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            for(int j = arr[0].length - 1 ; j >= 0 ; j--)
            {
                if(i == arr.length - 1 && j == arr[0].length - 1)
                {
                    dp[i][j] = arr[i][j];
                    continue;
                }

                int c1 = (i + 1 < arr.length) ? dp[i + 1][j] : (int)1e6;
                int c2 = (j + 1 < arr[0].length) ? dp[i][j + 1] : (int)1e6;

                dp[i][j] = Math.min(c1 , c2) + arr[i][j];
            }
        }
        display2D(dp);
        return dp[0][0];
    }


    // PAIR UP AND SINGLE UP ____________________________________________________________________
    // recursion
    public static int pairAndSingleUp_1(int n)
    {
        if(n <= 1)
        {
            return 1;
        }

        int count = 0;
        count += pairAndSingleUp_1(n - 1);
        int i = n - 1;
        while(i > 0)
        {
            count += pairAndSingleUp_1(n - 2);
            i--;
        }

        return count;
    } 

    public static int pairAndSingleUp_1b(int n)
    {
        if(n <= 1)
        {
            return 1;
        }

        int count = 0;
        count += pairAndSingleUp_1b(n - 1);
        count += ((n - 1) * pairAndSingleUp_1b(n -2));  // as n - 1 calls were made when pairing the no. up.
        return count;
    }

    // memozation ______________
    public static int pairAndSingleUp_2(int n , int[] dp)
    {
        if(n <= 1)
        {
            return 1;
        }

        if(dp[n] != 0)
        {
            return dp[n];
        }

        int count = 0;
        
        count += pairAndSingleUp_2(n - 1 , dp);
        count += ((n - 1) * pairAndSingleUp_2(n - 2 , dp));

        dp[n] = count;
        return count;
    }

    // tabulation __________________________
    public static int pairAndSingleUp_3(int n)
    {
        int[] dp = new int[n + 1];

        for(int i = 0 ; i <= n ; i++)
        {
            if(i <= 1)
            {
                dp[i] = 1;
                continue;
            }

            dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
        }

        display1D(dp);
        return dp[n];
    }


    // leetcode - 45 , jump game 2 ______________________
    // recursion ____________
    public static int jumpGame_1(int[] nums , int idx)
    {
        if(nums[idx] == 0)
        {
            return Integer.MAX_VALUE;
        }
        if(idx == nums.length - 1)
        {
            return 0;
        }

        int minStep = Integer.MAX_VALUE;
        for(int i = 1 ; i <= nums[idx] && (idx + i < nums.length) ; i++)
        {
            int rec = jumpGame_1(nums, idx + i);
            if(rec != Integer.MAX_VALUE)
            {
                minStep = Math.min(rec + 1, minStep);
            }
        }
        return minStep;
    }

    // memoization _________________________
    public static int jumpGame_2(int[] nums , int idx , int[] dp)
    {
        if(idx == nums.length - 1)
        {
            return 0;
        }

        if(nums[idx] == 0)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[idx] != 0)
        {
            return dp[idx];
        }

        int minStep = Integer.MAX_VALUE;
        for(int i = 1 ; i <= nums[idx] && (idx + i < nums.length) ; i++)
        {
            int rec = jumpGame_2(nums, idx + i , dp);
            if(rec != Integer.MAX_VALUE)
            {
                minStep = Math.min(rec + 1, minStep);
            }
        }

        dp[idx] = minStep;
        return minStep;
    }


    // tabulation__________________________
    public static int jumpGame_3(int[] nums)
    {
        int[] dp = new int[nums.length];
        for(int i = nums.length - 1 ; i >= 0 ; i--)
        {
            if(i == nums.length - 1)
            {
                dp[i] = 0;
                continue;
            }

            int minStep = Integer.MAX_VALUE;
            for(int jumps = 1 ; jumps <= nums[i] && i + jumps < nums.length ; jumps++)
            {
                int rec = dp[i + jumps];
                if(rec != Integer.MAX_VALUE)
                {
                    minStep = Math.min(rec + 1 , minStep);
                }
            }

            dp[i] = minStep;
        }

        display1D(dp);
        return dp[0];
    }



    // leetcode - 55 , jump game - 1___________________________________________
    // recursion _____________________
    public static boolean canJump_1(int[] nums , int idx)
    {
        if(idx == nums.length -1)
        {
            return true;
        }

        boolean res = false;
        for(int jumps = 1; jumps <= nums[idx] && jumps + idx < nums.length ; jumps++)
        {
            res = res || canJump_1(nums, idx + jumps);
        }

        return res;
    }


    // tabulation _________________
    public static boolean canJump_2(int[] nums)
    {
        boolean[] dp = new boolean[nums.length];
        for(int i = nums.length - 1; i >= 0 ; i--)
        {
            if(i == nums.length - 1)
            {
                dp[i] = true;
                continue;
            }
            for(int jumps = 1 ; jumps <= nums[i]  &&  i + jumps < nums.length ; jumps++)
            {
                dp[i] = dp[i] || dp[i + jumps];
            }
        }

        display(dp);
        return dp[0];
    }



    // gfg , count ways of partitioning n elements of set into k subsets____________________________
    // recursion ___________________
    public static int divideIntoKGroups_1(int n , int k)
    {
        if(n == k || k == 1)
        {
            return 1;
        }
        if(n < k)
        {
            return 0;
        }

        int nonIncluded = divideIntoKGroups_1(n - 1, k - 1);
        int included = divideIntoKGroups_1(n - 1, k) * k;

        return nonIncluded + included;
    }

    // memoization ________________
    public static int divideIntoKGroups_2(int n , int k , int[][] dp)
    {
        if(n == k || k == 1)
        {
            return 1;
        }
        if(n < k)
        {
            return 0;
        }

        if(dp[n][k] != 0)
        {
            return dp[n][k];
        }
        int nonIncluded = divideIntoKGroups_2(n - 1, k - 1 , dp);
        int included = divideIntoKGroups_2(n - 1, k , dp) * k;

        dp[n][k] = nonIncluded + included;
        return dp[n][k];
    }

    //  tabulation _________________________
    public static int divideIntoKGroups_3(int n , int k)
    {
        int[][] dp = new int[n + 1][k + 1];

        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= k ; j++)
            {
                if(i == j || j == 1)
                {
                    dp[i][j] = 1;
                    continue;
                }
                if(i < j)
                {
                    dp[i][j] = 0;
                    continue;
                }

                dp[i][j] = dp[i - 1][j - 1] + (dp[i - 1][j] * j);
            }
        }

        display2D(dp);
        return dp[n][k];
    }



    // GFG , GOLDMINE PROBLEM _________________________
    // recursion ______
    public static int[][] dir = {{-1 , 1} , {0 , 1} , {1, 1}};
    public static int goldmine_1(int[][] mat , int r , int c)
    {
        if(c == mat[0].length - 1)
        {
            return mat[r][c];
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < dir.length ; i++)
        {
            int x = r + dir[i][0];
            int y = c + dir[i][1];

            if(x >= 0 && y >= 0 && x < mat.length && y < mat[0].length)
            {
                int rec = goldmine_1(mat, x , y);
                max = Math.max(max , rec);
            }
        }
        return max + mat[r][c];
    }

    // memoization _________________
    public static int goldmine_2(int[][] mat , int r , int c , int[][] dp)
    {
        if(c == mat[0].length - 1)
        {
            return mat[r][c];
        }

        if(dp[r][c] != 0)
        {
            return dp[r][c];
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < dir.length ; i++)
        {
            int x = r + dir[i][0];
            int y = c + dir[i][1];

            if(x >= 0 && y >= 0 && x < mat.length && y < mat[0].length)
            {
                int rec = goldmine_2(mat, x , y , dp);
                max = Math.max(max , rec);
            }
        }
        dp[r][c] = max + mat[r][c];
        return dp[r][c];
    }

    // tabulation _________________________
    public static int goldmine_3(int[][] mat)
    {
        int[][] dp = new int[mat.length][mat[0].length];

        for(int c = mat[0].length - 1 ; c >= 0 ; c--)
        {
            for(int r = mat.length - 1 ; r >= 0 ; r--)
            {
                if(c == mat[0].length - 1)
                {
                    dp[r][c] = mat[r][c];
                    continue;
                }

                int max = Integer.MIN_VALUE;
                for(int i = 0 ; i < dir.length ; i++)
                {
                    int x = r + dir[i][0];
                    int y = c + dir[i][1];

                    if(x >= 0 && y >= 0 && x < mat.length && y < mat[0].length)
                    {
                        max = Math.max(max , dp[x][y]);
                    }
                }

                dp[r][c] = max + mat[r][c];
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < dp.length ; i++)
        {
            ans = Math.max(ans , dp[i][0]);
        }
        display2D(dp);
        return ans;
    }


    // MAXIMUM SIZE SQUARE SUBMATRX WITH ALL 1'S ______________________
    // RECURSION ____________
    public static int maxAns = -1;
    public static int maxSizeSquareSubmatrix_1(int[][] arr , int r , int c)
    {
        if(r == arr.length - 1 || c == arr[0].length - 1)
        {
            return arr[r][c];
        }

        int down = maxSizeSquareSubmatrix_1(arr, r + 1, c);
        int diag = maxSizeSquareSubmatrix_1(arr, r + 1, c + 1);
        int right = maxSizeSquareSubmatrix_1(arr, r, c + 1);

        int rec = 0;
        if(arr[r][c] == 1)
        {
            rec = Math.min(Math.min(down , diag) , right) + 1;
        } 
        maxAns = Math.max(rec , maxAns);
        return rec;
    }

    // MEMOIZATION ____________________
    public static int maxSizeSquareSubmatrix_2(int[][] arr , int r , int c , int[][] dp)
    {
        if(r == arr.length - 1 || c == arr[0].length - 1)
        {
            dp[r][c] = arr[r][c];
            return dp[r][c];
        }

        if(dp[r][c] != -1)
        {
            return dp[r][c];
        }

        int down = maxSizeSquareSubmatrix_2(arr, r + 1, c , dp);
        int diag = maxSizeSquareSubmatrix_2(arr, r + 1, c + 1 , dp);
        int right = maxSizeSquareSubmatrix_2(arr, r, c + 1 ,dp);

        int rec = 0;
        if(arr[r][c] == 1)
        {
            rec = Math.min(Math.min(down , diag) , right) + 1;
        } 
        dp[r][c] = rec;
        maxAns = Math.max(rec , maxAns);
        return rec; 
    }

    // tabulation __________
    public static int maxSizeSquareSubmatrix_3(int[][] arr)
    {
        int[][] dp = new int[arr.length][arr[0].length];
        for(int[] row : dp)
        {
            Arrays.fill(row , -1);
        }

        for(int r = arr.length - 1 ; r >= 0 ; r--)
        {
            for(int c = arr[0].length - 1 ; c >= 0 ; c--)
            {
                if(r == arr.length - 1 || c == arr[0].length - 1)
                {
                    dp[r][c] = arr[r][c];
                    continue;
                }

                if(arr[r][c] != 0)
                {
                    dp[r][c] = Math.min(Math.min(dp[r + 1][c] , dp[r][c + 1]) , dp[r+ 1][c + 1]) + 1;
                }
                else
                {
                    dp[r][c] = 0;
                }
                maxAns = Math.max(maxAns , dp[r][c]);
            }
        }

        display2D(dp);
        return maxAns;
    }


    // GFG , COUNT NO. OF WAYS TO FILL N X M SPACE USING 1 X M TILES _______________
    // recursion _________________
    public static int tileFloor_1(int n , int m)
    {
        if(n <= m)
        {
            return n == m ? 2 : 1;
        }

        int count = 0;
        
        count += tileFloor_1(n - 1, m) + tileFloor_1(n - m, m);
        return count;
    }

    // memoization ________________
    public static int tileFloor_2(int n , int m , int[] dp)
    {
        if(n <= m)
        {
            dp[n] = (n == m ? 2 : 1);
            return dp[n];
        }

        if(dp[n] != 0)
        {
            return dp[n];
        }

        int count = 0;
        count += tileFloor_2(n - 1 , m , dp) + tileFloor_2(n - m, m , dp);

        dp[n] = count;
        return dp[n];
    }

    // tabulation _______________
    public static int tileFloor_3(int n , int m)
    {
        int[] dp = new int[n + 1];

        for(int i = 1 ; i <= n ; i++)
        {
            if(i < m)
            {
                dp[i] = 1;
                continue;
            }
            if(i == m)
            {
                dp[i] = 2;
                continue;
            }

            dp[i] = dp[i - 1] + dp[i - m];
        }

        display1D(dp);
        return dp[n];
    }


    // COIN CHANGE ________________________________________________
    // PERMUTATION (INFINTE COINS USED)_________________________________
    // recursion ________________
    public static int permu_1(int[] arr , int target)
    {
        if(target == 0)
        {
            return 1;
        }

        int count = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            if(target - arr[i] >= 0)
            {
                count += permu_1(arr, target - arr[i]);
            }
        }

        return count;
    }

    // memoization ______________________________
    public static int permu_2(int[] arr , int target , int[] dp)
    {
        if(target == 0)
        {
            return 1;
        }

        if(dp[target] != 0)
        {
            return dp[target];
        }

        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(target - arr[i] >= 0)
            {
                count += permu_2(arr, target - arr[i], dp);
            }
        }
        dp[target] = count;
        return count;
    }

    // tabulation __________________________________
    public static int permu_3(int[] arr , int target)
    {
        int[] dp = new int[target + 1];
        for(int i = 0 ; i < dp.length ; i++)
        {
            if(i == 0)
            {
                dp[i] = 1;
                continue;
            }

            for(int j = 0 ; j < arr.length ; j++)
            {
                if(i - arr[j] >= 0)
                {
                    dp[i] += dp[i - arr[j]];
                }
            }
        }

        display1D(dp);
        return dp[target];
    }

    // COMBINATION (INFINTE COINS USED) ______________________
    // recursion ____________
    public static int combi_1(int[] arr , int target , int idx)
    {
        if(target == 0)
        {
            return 1;
        }

        int count = 0;

        for(int i = idx ; i < arr.length ; i++)
        {
            if(target - arr[i] >= 0)
            count += combi_1(arr, target - arr[i], i);
        }

        return count;
    }

    // memoization _________________________
    public static int combi_2(int[] arr , int target , int idx , int[] dp)
    {
        // if(target == 0 || idx == arr.length)
        // {
        //     return target == 0 ? 1 : 0;
        // }

        // if(dp[target] != 0)
        // {
        //     return dp[target];
        // }

        // int count = 0;

        // for(int i = 1 ; i < dp.length && idx < arr.length; i++)
        // {
        //     if(target - arr[idx] >= 0)
        //     {
        //         count += combi_2(arr, target - arr[idx], idx , dp);
        //     }
        //     idx++;
        // }

        // dp[target] = count;
        // return count;
        if(target == 0 || idx == arr.length)
        {
            if(target == 0)
            {
                dp[target] = 1;
                return 1;
            }
            return 0;
        }
    
        if(dp[target] != 0)
        {
            return dp[target];
        }
        int count = 0;
    
        for(int i = idx ; i < arr.length ; i++)
        {
            if (target - arr[i] >= 0)
            {
                count += combi_2(arr , target - arr[i], idx ,  dp);
            }
            idx++;                  // done to not use previous indexes of the current index. 
        }
        dp[target] = count;
        return count;
    }


    // tabulation ____________________________ (very different)
    public static int combi_3(int[] arr , int target)
    {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int t = 0 ; t < dp.length ; t++)
            {
                if(t - arr[i] >= 0)
                {
                    dp[t] += dp[t - arr[i]];
                }
            }
        }

        display1D(dp);
        return dp[target];
    }



    // LEETCODE - 377 , COMBINATION SUM - IV _________________________
    public static int combinationSum4(int[] nums, int target) 
    {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        
        for(int t = 1 ; t < dp.length ; t++)
        {
            for(int i = 0 ; i < nums.length ; i++)
            {
                if(t - nums[i] >= 0)
                {
                    dp[t] += dp[t - nums[i]];
                }
            }
        }
        
        return dp[target];
    }


    // LEETCODE - 322 , COIN CHANGE ____________________________________
    public static int coinChange(int[] coins, int amount)
    {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp , Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i = 1; i < dp.length ; i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < coins.length ; j++)
            {
                if(i - coins[j] >= 0)
                {
                    min = Math.min(min , dp[i - coins[j]]);
                }
            }
            
            if(min < Integer.MAX_VALUE)
            {
                dp[i] = min + 1;
            }
        }
        
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }


    // (GFG) NO. OF SOLUTIONS OF A LINEAR EQUATION OF N VARIABLE __________________
    public static int countSol_1(int[] coeff ,int idx , int rhs)
    {
        if(rhs == 0)
        {
            return 1;
        }

        int count = 0;
        for(int i = idx ; i < coeff.length ; i++)
        {
            if(rhs - coeff[i] >= 0)
            {
                count += countSol_1(coeff, i , rhs - coeff[i]);
            }
        }

        return count;
    }

    // tabulation ________________________________
    public static int countSol_2(int[] coeff , int rhs)
    {
        int[] dp = new int[rhs + 1];
        dp[0] = 1; 
        for(int i = 0 ; i < coeff.length ; i++)
        {
            for(int t = 1 ; t < dp.length ; t++)
            {
                if(t - coeff[i] >= 0)
                {
                    dp[t] += dp[t- coeff[i]];
                }
            }
        }

        display1D(dp);
        return dp[rhs];
    }


    // COIN CHANGE COMBINATION (COIN ONCE USED)____________________________
    // recursion ___________
    public static int combiOnce_1(int[] arr , int target , int idx)
    {
        if(target == 0)
        {
            return 1;
        }

        int count = 0;
        for(int i = idx ; i < arr.length ; i++)
        {
            if(target - arr[i] >= 0)
            {
                count += combiOnce_1(arr, target - arr[i], i + 1);
            }
        }
        return count;
    }

    public static int combiOnce_1b(int[] arr , int target , int idx)
    {
        if(target == 0 || idx == arr.length)
        {
            return target == 0 ? 1 : 0;
        }

        int count = 0;
        if(target - arr[idx] >= 0)
        {
            count += combiOnce_1b(arr, target - arr[idx], idx + 1);
        }
        count += combiOnce_1b(arr, target, idx + 1);

        return count;
    }


    // tabulation _____________________________
    public static int combiOnce_2(int[] arr , int target , int idx , int[][] dp)
    {
        if(target == 0 || idx < 0)
        {
            
            return target == 0 ? 1 : 0;
        }

        if(dp[idx][target] != 0)
        {
            return dp[idx][target];
        }

        int count = 0;
        if(target - arr[idx] >= 0)
        {
            count += combiOnce_2(arr, target- arr[idx], idx - 1 , dp);
        }
        count += combiOnce_2(arr, target, idx - 1, dp);

        dp[idx][target] = count;
        return count;
    }

    // tabulation ______________________________________
    public static int combiOnce_3(int[] arr , int target)
    {
        int[][] dp = new int[arr.length][target + 1];
        dp[0][0] = 1;

        for(int idx = 1 ; idx < arr.length ; idx++)
        {
            for(int tar = 0 ; tar <= target ; tar++)
            {
                if(tar == 0)
                {
                    dp[idx][tar] = 1;
                    continue;
                }

                if(tar - arr[idx] >= 0)
                {
                    dp[idx][tar] += dp[idx - 1][tar - arr[idx]];
                }
                dp[idx][tar] += dp[idx - 1][tar];
            }
        }

        display2D(dp);
        return dp[arr.length - 1][target];
    }


    // (GFG) 0-1 KNAPSACK PROBLEM __________________________________________________________
    // recursion _____________________
    public static int knapsack_1(int[] val, int[] weights, int cap , int idx)
    {
        if(cap == 0 || idx < 0)
        {
            return 0;
        }

        int picked = 0 , unpicked = 0;
        if(cap - weights[idx] >= 0)
        {
            picked = knapsack_1(val, weights, cap - weights[idx], idx - 1) + val[idx];
        }
        unpicked = knapsack_1(val, weights, cap, idx - 1);

        return Math.max(picked , unpicked);
    }

    // memoization ___________________________________
    public static int knapsack_2(int[] val , int[] weights, int cap , int idx , int[][] dp)
    {
        if(cap == 0 || idx < 0)
        {
            return 0;
        }

        if(dp[idx][cap] != 0)
        {
            return dp[idx][cap];
        }

        int picked = 0 , unpicked = 0;
        if(cap - weights[idx] >= 0)
        {
            picked = knapsack_2(val, weights, cap - weights[idx] ,  idx - 1, dp) + val[idx];
        }
        unpicked = knapsack_2(val, weights, cap, idx - 1, dp);

        dp[idx][cap] = Math.max(picked , unpicked);
        return dp[idx][cap]; 
    }

    // tabulation _____________________________________
    public static int knapsack_3(int[] val , int[] weights, int cap)
    {
        int[][] dp = new int[weights.length + 1][cap + 1];
        
        for(int idx = 1 ; idx < dp.length ; idx++)
        {
            int weightIdx = idx - 1;
            for(int c = 0 ; c <= cap ; c++)
            {
                if(c == 0)
                {
                    dp[idx][c] = 0;
                    continue;
                }

                int picked = 0 , unpicked = 0;
                if(c - weights[weightIdx] >= 0)
                {
                    picked = dp[idx - 1][c - weights[weightIdx]] + val[weightIdx];
                }
                unpicked = dp[idx - 1][c];

                dp[idx][c] = Math.max(picked , unpicked);
            }
        }

        display2D(dp);
        return dp[dp.length - 1][cap];
    }

    // (GFG) UNBOUNDED KNAPSACK _____________________________________________________________
    // tabulation _______________________
    public static int unboundeknapsack_1(int[] val ,int[] weights , int cap)
    {
        int[] dp = new int[cap + 1];

        for(int idx = 0 ; idx < weights.length ; idx++)
        {
            for(int c = 0 ; c <= cap ; c++)
            {
                int picked = 0  , unpicked = 0;
                if(c - weights[idx] >= 0)
                {
                    picked = dp[c - weights[idx]] + val[idx];
                }
                unpicked = dp[c];

                dp[c] = Math.max(picked , unpicked);
            }
        }

        display1D(dp);
        return dp[cap];
    }


    // COUNT ALL PALINDROMIC SUBSTRINGS _______________________________________________________________
    // tabulation __________________________________
    public static boolean[][] isPalindromeSubstring(String str)
    {
        boolean[][] dp = new boolean[str.length()][str.length()];

        for(int gap = 0; gap < str.length() ; gap++)
        {
            for(int i = 0 , j = gap ; j < str.length() ; i++ , j++)
            {
                if(gap == 0)
                {
                    dp[i][j] = true;
                    continue;
                }
                else if(str.charAt(i) == str.charAt(j))
                {
                    if(gap == 1)
                    {
                        dp[i][j] = true;
                    }
                    else if(dp[i + 1][j - 1] == true)
                    {
                        dp[i][j] = true;
                    }
                }
            }
        }

        return dp;
    }

    // leetcode - 647 , palindrome substring
    public static int palindromeSubstringEffeicient(String str)
    {
        int count = 0;
        for(int center = 0; center < 2 * str.length() ; center++)
        {
            int left = center / 2;
            int right = left + (center % 2);
            while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
            {
                System.out.println(str.substring(left , right + 1));
                count++;
                left--;
                right++;
            }
        }
        return count;
    }


    // LEETCODE - 5 , LONGEST PALINDROME SUBSTRING _________________________________________________
    // best case ____________
    public static String longestPalindrome_1(String str)
    {
        String ans = "";
        int len = 0;
        
        for(int center = 0 ; center < 2 * str.length() ; center++)
        {
            int left = center / 2;
            int right = left + (center % 2);
            while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right))
            {
                if(right - left + 1 > len)
                {
                    ans = str.substring(left , right + 1);
                    len = right - left + 1;
                }
                left--;
                right++;
            }
        }
        return ans;
    }

    // using boolean dp array 
    public static String longestPalindrome_2(String str) 
    {
         String longestPalindromeSubstring = "";
         int length = 0;
        
        boolean[][] dp = new boolean[str.length() + 1][str.length() + 1];
                               
        for(int gap = 0 ; gap < str.length() ; gap++)
        {
            for(int i = 0 , j = gap ; j < str.length() ; i++ , j++)
            {
                if(gap == 0)
                {
                    dp[i][j] = true;
                }
                
                else if(str.charAt(i) == str.charAt(j))
                {
                    if(gap == 1)
                    {
                        dp[i][j] = true;
                    }
                    
                    else if(dp[i+1][j-1])
                    {
                        dp[i][j] = true;
                    }
                }
                
                
                if(dp[i][j])
                {
                    int len = j-i+1;
                    if(len > length)
                    {
                        length = len;
                        longestPalindromeSubstring = str.substring(i , j+1);
                    }
                }
            }
        }  
                               
        return longestPalindromeSubstring;
    }

    // DP MADE FOR THE LONGEST PALINDROME SUBSTRING _______________________________________
    public static int[][] longestPalindromeDP(String str)
    {
        int[][] dp = new int[str.length()][str.length()];

        for(int gap = 0 ; gap < str.length() ; gap++)
        {
            for(int i = 0 , j = gap ; j < str.length() ; i++ , j++)
            {
                if(gap == 0)
                {
                    dp[i][j] = 1;
                }
                else if(str.charAt(i) == str.charAt(j))
                {
                    if(gap == 1)
                    {
                        dp[i][j] = 2;
                    }
                    else if(dp[i + 1][j - 1] != 0)
                    {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                }
                else
                {
                    dp[i][j] = Math.max(dp[i + 1][j] , dp[i][j - 1]);
                }
            }
        }

        return dp;
    }

    // leetcode - 516 , longest palindromic subsequences __________________________________
    // tabulation ______________________
    public static int longestPalindromicSubsequenceDP(String str)
    {
        int[][] dp = new int[str.length()][str.length()];

        for(int gap = 0 ; gap < str.length() ; gap++)
        {
            for(int i = 0 , j = gap ; j < str.length() ; i++ , j++)
            {
                if(gap == 0)
                {
                    dp[i][j] = 1;
                }
                else if(gap == 1)
                {
                    if(str.charAt(i) == str.charAt(j))
                    {
                        dp[i][j] = 2;
                    }
                    else
                    {
                        dp[i][j] = 1;
                    }
                }
                else
                {
                    if(str.charAt(i) == str.charAt(j))
                    {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                    else
                    {
                        dp[i][j] = Math.max(dp[i + 1][j] , dp[i][j - 1]);
                    }
                }
            }
        }

        display2D(dp);
        return dp[0][dp.length - 1];
    }


    // count all palindromic subsequences possible __________________________________
    public static int countPalindromicSubsequence(String str)
    {
        int[][] dp = new int[str.length()][str.length()];

        for(int gap = 0 ; gap < str.length() ; gap++)
        {
            for(int i = 0 , j = gap ; j < str.length() ; i++ , j++)
            {
                if(gap == 0)
                {
                    dp[i][j] = 1;
                }
                else if(str.charAt(i) == str.charAt(j))
                {
                    dp[i][j] += (dp[i + 1][j - 1] + 1) + (dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1]);

                    // dp[i][j] += dp[i][j - 1] + dp[i + 1][j] + 1;     // it can be done as this.
                }
                else
                {
                    dp[i][j] += dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1];
                }
            }
        }

        display2D(dp);
        return dp[0][dp.length - 1];
    }


    // longest increasing subseqiences (LIS) (gfg) (leetcode - 300)___________________________________________
    // recursion (count all LIS possible)______
    public static int totalLIS_1(int[] arr , int idx , String ans)
    {
        if(idx == arr.length)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        count += totalLIS_1(arr, idx + 1, ans);

        for(int i = idx + 1; i < arr.length ; i++)
        {
            if(arr[i] > arr[idx])
            {
                count += totalLIS_1(arr, i , ans + arr[i] + " ");
            }
        }

        return count;
    }

    // recursion and memoization ___________
    public static int maxAnsLIS = 0;
    public static int LIS_memo(int[] arr , int idx , int[] dp)
    {
        if(idx == 0)
        {
            return 1;
        }

        if(dp[idx] != 0)
        {
            return dp[idx];
        }

        int max = 0;
        for(int i = idx - 1 ; i >= 0 ; i--)
        {
            int recAns = LIS_memo(arr, i, dp);
            if(arr[i] < arr[idx])
            {
                max = Math.max(max , recAns + 1);
            }
        }

        dp[idx] = max;
        maxAnsLIS = Math.max(dp[idx] , maxAnsLIS);

        return max;
    }


    public static int[] LIS_DP(int[] arr)
    {
        int[] dp = new int[arr.length];
        dp[0] = 1;

        int ans = 1;
        for(int i = 1 ; i < dp.length ; i++)
        {
            for(int j = i - 1; j >= 0 ; j--)
            {
                if(arr[j] < arr[i])
                {
                    dp[i] = Math.max(dp[i] , dp[j] + 1);
                }
            }
            ans = Math.max(ans , dp[i]);
        }

        System.out.println(ans);
        return dp;
    }


    // optimized LIS
    public static int[] LIS_DP_optimized(int[] arr) 
    {
        int[] dp = new int[arr.length];
        int[] c = new int[arr.length + 1];      // it contains longest increasing subsequence
        
        int curr = 1;
        c[1] = arr[0];
        
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] < c[1])
            {
                c[1] = arr[i];
                dp[i] = 1;
            }
            else if(arr[i] > c[curr])
            {
                c[curr + 1] = arr[i];
                dp[i] = curr + 1;
                curr++;
            }
            else
            {
                int k = binarySearchLIS(c , curr , arr[i]);
                c[k] = arr[i];
                dp[i] = k;
            }
        }
        
        System.out.println(curr);
        return c;
    }
    
    public static int binarySearchLIS(int[] c , int right , int item)
    {
        int left = 1;
        int mid = 0;
        
        while(right > 1 && left <= right)
        {
            mid = (left + right) / 2;
            
            if(c[mid] == item)
            {
                return mid;
            }
            else if(c[mid] > item)
            {
                right = mid - 1;         
            }
            else
            {
                left = mid + 1;
            }
        }
        
        return mid;
    }


    // LONGEST DECREASING SUBSEQUENCES ________________________________
    public static int[] LDS_DP(int[] arr)
    {
        int[] dp = new int[arr.length];
        dp[dp.length - 1] = 1;

        int maxLen = 0;
        for(int i = dp.length - 2 ; i >= 0 ; i--)
        {
            dp[i] = 1;
            for(int j = i + 1 ; j < dp.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    dp[i] = Math.max(dp[i] , dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen , dp[i]);
        }
        System.out.println(maxLen);
        return dp;
    }


    // Longest Bitonic Subsequences (LBS) _____________________________________________________
    public static int[] LBS_DP(int[] arr)
    {
        int[] lis = LIS_DP(arr);
        int[] lds = LDS_DP(arr);

        int[] lbs = new int[arr.length];
        int maxLen = 0;
        for(int i = 0 ; i < lbs.length ; i++)
        {
            lbs[i] = lis[i] + lds[i] - 1;
            maxLen = Math.max(maxLen , lbs[i]);
        }

        System.out.println(maxLen);
        return lbs;
    }



    // longest sum increasing subsequence (gfg) _____________________________________________
    public static int sumIncreasingSubsequencesDP(int[] arr)
    {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];

        int maxSum = arr[0];
        for(int i = 1 ; i < dp.length ; i++)
        {
            int sum = 0;
            for(int j = 0 ; j < i ; j++)
            {
                if(arr[i] > arr[j])
                {
                    sum = Math.max(sum , dp[j]);
                }
            }
            dp[i] = sum + arr[i];
            maxSum = Math.max(maxSum , dp[i]);
        }

        display1D(dp);
        return maxSum;
    }


    // minimum Number of deletions required to make a sequence sorted _________________________________
    public static int minDeltionsToMakeSorted(int[] arr)
    {
        int[] dp = new int[arr.length];
        dp[0] = 1;

        int maxLen = 1;
        for(int i = 1 ; i < dp.length ; i++)
        {
            int max = 0;
            for(int j = 0 ; j < i ; j++)
            {
                if(arr[i] > arr[j])
                {
                    max = Math.max(max , dp[j]);
                }
                dp[i] = max + 1;

                maxLen = Math.max(maxLen , dp[i]);
            }
        }

        return dp.length - maxLen;
    }


    // MATRIX CHAIN MULTIPLICATION (MCM) (GFG)_____________________________________________________________
    // recursion ___________
    public static int MCM_1(int[] arr , int si , int ei)
    {
        if(si + 1 == ei)
        {
            return 0;
        }

        int minAns = Integer.MAX_VALUE;
        for(int cut = si + 1 ; cut < ei ; cut++)
        {
            int left = MCM_1(arr, si, cut);
            int right = MCM_1(arr, cut, ei);

            int recAns = left + arr[si] * arr[cut] * arr[ei] + right;
            minAns = Math.min(minAns , recAns);
        }

        return minAns;
    }

    // memoization _____________________
    public static int MCM_2(int[] arr ,int si , int ei ,int[][] dp)
    {
        if(si + 1 == ei)
        {
            return 0;
        }

        if(dp[si][ei] != 0)
        {
            return dp[si][ei];
        }

        int minAns = Integer.MAX_VALUE;
        for(int cut = si + 1 ; cut < ei ; cut++)
        {
            int left = MCM_2(arr, si, cut , dp);
            int right = MCM_2(arr, cut, ei , dp);

            int recAns = left + arr[si] * arr[cut] * arr[ei] + right;
            minAns = Math.min(minAns , recAns);
        }

        dp[si][ei] = minAns;
        return minAns;
    }

    // tabulation __________________________________________
    public static int MCM_3(int[] arr)
    {
        int[][] dp = new int[arr.length][arr.length];

        for(int gap = 2 ; gap < arr.length ; gap++)
        {
            for(int si = 0, ei = gap ; ei < arr.length ; si++ , ei++)
            {
                int minAns = Integer.MAX_VALUE;
                for(int cut = si + 1 ; cut < ei ; cut++)
                {
                    int left = dp[si][cut];
                    int right = dp[cut][ei];

                    int temp = left + arr[si] * arr[cut] * arr[ei] + right;
                    minAns = Math.min(minAns , temp);
                }

                dp[si][ei] = minAns;
            }
        }

        display2D(dp);
        return dp[0][arr.length - 1];
    }


    // mcm with actual string _____________________________

    public static class pair
        {
            int first = 0;
            String second = "";

            public pair(int first , String second)
            {
                this.first = first;
                this.second = second;
            }
        }

    public static pair MCM_WithString(int[] arr , int si , int ei , pair[][] dp)
    {
        if(si + 1 == ei)
        {
            dp[si][ei] = new pair(0 , (char)(si + 'A') + "");
            return dp[si][ei];
        }

        if(dp[si][ei] != null && dp[si][ei].first != 0)
        {
            return dp[si][ei];
        }
        pair minAns = new pair(Integer.MAX_VALUE , "");

        for(int cut = si + 1 ; cut < ei ; cut++)
        {
            pair left = MCM_WithString(arr, si, cut, dp);
            pair right = MCM_WithString(arr, cut, ei, dp);

            int recAns = (left != null ? left.first : 0) + (arr[si] * arr[cut] * arr[ei]) + (right != null ? right.first : 0);
            if(recAns < minAns.first)
            {
                minAns.first = recAns;
                minAns.second = "(" + (left != null ? left.second : "") + (right != null ? right.second : "") + ")"; 
            }
        }

        dp[si][ei] = minAns;
        return dp[0][dp.length - 1];
    }

    // tabulation ____________________________________
    public static int MCM_DP_WithString(int[] arr)
    {
        int[][] dp = new int[arr.length][arr.length];
        String[][] sdp = new String[arr.length][arr.length];

        for(int gap = 1; gap < arr.length ; gap++)
        {
            for(int si = 0 , ei = gap ; ei < arr.length ; si++ , ei++)
            {
                if(si + 1 == ei)
                {
                    dp[si][ei] = 0;
                    sdp[si][ei] = (char)(si + 'A') + "";
                    continue;
                }

                int minAns = Integer.MAX_VALUE;
                for(int cut = si + 1 ; cut < ei ; cut++)
                {
                    int left = dp[si][cut];
                    int right = dp[cut][ei];

                    int myCost = left + arr[si] * arr[cut] * arr[ei] + right;
                    if(myCost < minAns)
                    {
                        minAns = myCost;
                        dp[si][ei] = minAns;
                        sdp[si][ei] = "(" + sdp[si][cut] + sdp[cut][ei] + ")";
                    }
                }
            }
        }

        display2D(dp);
        System.out.println(sdp[0][sdp.length - 1]);
        return dp[0][dp.length - 1];
    }


    
    // DISPLAY FUNCTION __________________________________________________________________________
    public static void display1D(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    
    public static void display(boolean[] dp)
    {
        for(int i = 0 ; i < dp.length ; i++)
        {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }


    public static void display2D(int[][] arr)
    {
        for(int[] ar : arr)
        {
            for(int ele : ar)
            {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}