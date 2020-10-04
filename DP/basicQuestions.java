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
        int target = 10;

        // BOARDPATH DICE MOVES ONLY ____________
        // System.out.println(boardpathDice_1(target));
        // int[] dp = new int[target + 1];
        // System.out.println(boardpathDice_2(target, dp));
        // display1D(dp);
        // System.out.println(boardpathDice_3(target));

        // BOARDPATH ARRAY MOVES ONLY _____________
        int[] arr = {2 , 5 , 3 , 7};
        // System.out.println(boardpathGivenOutcome_1(target , arr));
        // int[] dp = new int[target + 1];
        // System.out.println(boardpathGivenOutcome_2(target, arr, dp));
        // display1D(dp);
        System.out.println(boardpathGivenOutcome_3(target, arr));
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




    // 






    // DISPLAY FUNCTION __________________________________________________________________________
    public static void display1D(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
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