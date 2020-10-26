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
        int n = 7 , m = 4;
        // System.out.println(tileFloor_1(n, m));
        // int[] dp = new int[n + 1];
        // System.out.println(tileFloor_2(n, m , dp));
        // display1D(dp);
        System.out.println(tileFloor_3(n, m));
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