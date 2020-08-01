import java.util.Scanner;
import java.util.Arrays;

import java.util.ArrayList;


public class voidType
{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {
        basicFunctions();
    }

    public static void basicFunctions()
    {   
        // Print elements 1 - 10 or 10 - 1  _______________________________________________
        // printIncUp(1 , 10);
        // printIncDown(1 , 10);
        // printDecUp(10 , 1);
        // printDecDown(10, 0);


        // FACTORIAL _________________________________________
        // factorial(5 , 1);


        // STRING TYPE ____________________________________________
        // subsequence("abc" , "");
        // removeHi("iihiiihihi" , "");
        // removeHiNotHit("iihithithithihihi" , "");
        // removeDuplicate("aaaabbcccefdd" , "");
        // compression("abbbccde", "", 0);
        // System.out.println(permutation("abc" , ""));
        // System.out.println(permutationWithoutRepetitionUsingArray("aab" , ""));
        // System.out.println(permutationWithoutRepetitionUsingBits("aab" , ""));
        


        // PATH TYPE ______________________________________
        // System.out.println(mazepathHV(0 , 0 , 2 , 2, ""));
        // System.out.println(mazepathHVD(0 , 0 , 2 , 2 , ""));
        // System.out.println(mazepathHVDMultimove(0, 0, 2, 2, ""));
        // System.out.println(boardpathDice(10 , 1 , ""));



        // COIN CHANGE ALL VARIATIONS   _______________________________________________________
        // int[] arr = {2 , 3 , 5 , 7};
        // System.out.println(coinChangePer1(arr , 10  , ""));         // coin used infinite times.
        // System.out.println(coinChangeCombi1(arr , 10 , 0 , ""));    // coin used infinite times.

        // System.out.println(coinChangeCombi2(arr , 10 , 0 , ""));    // coin used once only.
        // boolean[] vis = new boolean[arr.length];
        // System.out.println(coinChangePer2(arr , 10 , "" , vis));     // coin used once only.

        // System.out.println(coinChangeCombi3(arr , 10 , 0 , ""));    // coin used infinite times(Subsequence)
        // System.out.println(coinChangePer3(arr , 10 , 0 , ""));     // coin used infinite times (Subsequence)

        // System.out.println(coinChangeCombi4(arr , 10 , 0 , ""));    // coin used once (Subsequence)
        // System.out.println(coinChangePer4(arr , 10, 0, "", vis));    //coin used once(Subsequence)

        
        //  EQUI SETS WITH RESPECT TO SUM______________________________________
        // int[] arr = {10 , 20 , 30 , 40 , 50 , 60 , 70};
        // System.out.println(equiSet(arr , 0, 0 , 0 , "" , ""));
        // System.out.println(equiSetRemovedDuplicacy(arr, 1, 10, 0, "10 ", ""));     // just 0th index in any set



        // QUEENS IN 1D ARRAY   _____________________________________________________________
        // boolean[] boxes = new boolean[5];       // 5 size box
        // int tq = 3;         // total queens to be placed
        // System.out.println(queen1DCombi1(5 , 0 , tq , 0 ,  ""));
        // System.out.println(queen1DPer1(boxes , 0 , tq , 0 , ""));
        // System.out.println(queen1DCombi2Subsequence(5 , 0 , tq , 0 , ""));   // using subsequence method
        // System.out.println(queen1DPer2Subsequence(boxes , 0 , tq , 0 , ""));    // using subsequence method



        // QUEENS IN THE BOARD (2D ARRAY) _______________________________________________
        // int tq = 4;
        // boolean[][] board = new boolean[4][4];
        // System.out.println(queen2DCombi1(board , 0 , tq , 0 , ""));
        // System.out.println(queen2DPer1(board , 0 , tq , 0 , ""));
        // System.out.println(queen2DCombi2Subsequence(board , 0 , tq , 0 , ""));
        // System.out.println(queen2DPer2Subsequence(board , 0 , tq , 0 , ""));


        // NQUEEN PLACING QUEEN IN A BOARD SUCH THAT NO TWO QUEEN CAN CUT EACH OTHER ___________________________
        // int tq = 4;
        // boolean[][] board = new boolean[4][4];
        // System.out.println(nQueenProblemCombi1(board , 0 , tq , 0 , ""));
        // System.out.println(nQueenProblemPer1(board , 0 , tq  , 0 , ""));
        // System.out.println(nQueenProblemCombi2Subsequence(board , 0 , tq , 0 , ""));
        // System.out.println(nQueenProblemPer2Subsequence(board , 0 , tq , 0 , ""));



        // CRYPTOGRAPHY ______________________________________________________________
        // System.out.println(crypto());


        // DICTIONARY________________________________________________________________
        String word = "ilikemangoandsamsung";
        System.out.println(dictionary(word, ""));        
    }


    // PRINTING THE ELEMENTS INCREASING AND DECREASING (VOID TYPE)______________________________________

    public static void printIncUp(int start , int end)
    {
        if(start == end)
        {
            System.out.print(start + " ");
            return;
        }

        System.out.print(start + " ");
        printIncUp(start + 1, end);
    }

    public  static void printIncDown(int start , int end)
    {
        if(start == end)
        {
            System.out.print(end + " ");
            return;
        }
        printIncDown(start, end - 1);
        System.out.print(end + " ");
    }

    public static void printDecUp(int start , int end)
    {
        if(start == end)
        {
            System.out.print(start + " ");
            return;
        } 
        System.out.print(start + " ");
        printDecUp(start - 1, end);
    }

    public static void printDecDown(int start , int end)
    {
        if(start == end)
        {
            System.out.print(end + " ");
            return;
        }
        printDecDown(start, end + 1);
        System.out.print(end + " ");
    }



    // FACTORIAL ____________________________________________________________
    public static void factorial(int n , int k)
    {
        if(n == 1)
        {
            System.out.println(k);
            return;
        }

        k = k * n;
        factorial(n - 1 , k);
    }


    // STRING TYPE _________________________________________________
    public static void subsequence(String str , String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        subsequence(str.substring(1) , ans);
        subsequence(str.substring(1) , ans + str.charAt(0));
    }

    public static void removeHi(String str , String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        if(str.length() > 1 && str.substring(0 , 2).equals("hi"))
        {
            removeHi(str.substring(2), ans);
        }
        else
        {
            removeHi(str.substring(1), ans + str.charAt(0));
        }
    }

    public static void removeHiNotHit(String str , String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        if(str.length() > 1 && str.substring(0 , 2).equals("hi"))
        {
            if(str.length() > 2 && str.charAt(2) == 't')
            {
                removeHiNotHit(str.substring(3) , ans + "hit");
            }
            else
            {
                removeHiNotHit(str.substring(2), ans);
            }
        }
        else
        {
            removeHiNotHit(str.substring(1), ans + str.charAt(0));
        }
    }

    public static void removeDuplicate(String str , String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        if(ans.length() == 0)
        {
            ans = ans + str.charAt(0);
            str = str.substring(1);
        }
        if(ans.length() > 0 && str.charAt(0) != ans.charAt(ans.length() - 1))
        {
            removeDuplicate(str.substring(1), ans + str.charAt(0));
        }
        else
        {
            removeDuplicate(str.substring(1), ans);
        }
    }

    public static void compression(String str , String ans , int count)
    {
        if(str.length() == 0)
        {
            System.out.println(ans + ((count > 1) ? count : ""));
            return;
        }

        if(ans.length() == 0)
        {
            ans = ans + str.charAt(0);
            str = str.substring(1);
            count++;
        }
        if(ans.length() > 0 && str.charAt(0) == ans.charAt(ans.length() - 1))
        {
            compression(str.substring(1), ans, count + 1);
        }
        else
        {
            compression(str.substring(1) , ans + (count > 1 ? count : "") + str.charAt(0) , 1);
        }
    }

    public static int permutation(String str , String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;

        for(int i = 0 ; i < str.length() ; i++)
        {
            count += permutation(str.substring(0 , i) + str.substring(i + 1), ans + str.charAt(i));
        }
        return count;
    }

    public static int permutationWithoutRepetitionUsingArray(String str , String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        boolean[] vis = new boolean[26];

        for(int i = 0; i < str.length() ; i++)
        {
            int idx = str.charAt(i) - 'a';
            if(!vis[idx])
            {
                vis[idx] = true;
                count += permutationWithoutRepetitionUsingArray(str.substring(0 , i) 
                                                    + str.substring(i+ 1), ans + str.charAt(i));
            }
        }
        return count;
    }

    public static int permutationWithoutRepetitionUsingBits(String str , String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        int maping = 0;

        for(int i = 0 ; i < str.length() ; i++)
        {
            int idx = str.charAt(i) - 'a';
            int flag = 1;
            flag = (flag << idx);     // left shift in flag 

            if((maping & flag) == 0)
            {
                maping = (maping | flag);
                count += permutationWithoutRepetitionUsingBits(str.substring(0 ,i) 
                                                        + str.substring(i + 1), ans + str.charAt(i));
            }
        }
        return count;
    }




    // PATH TYPE  ______________________________________________________________________________
    public static int mazepathHV(int sr , int sc , int er , int ec , String ans)
    {
        if(sr == er && sc == ec)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        if(sr + 1 <= er)
        {
            count += mazepathHV(sr + 1, sc, er, ec, ans + "V");
        }
        if(sc + 1 <= ec)
        {
            count += mazepathHV(sr, sc + 1, er, ec, ans + "H");
        }

        return count;
    }

    public static int mazepathHVD(int sr , int sc , int er , int ec , String ans)
    {
        if(sr == er && sc == ec)
        {
            System.out.println(ans);
            return 1;
        }
        int count = 0;
        if(sr + 1 <= er)
        {
            count += mazepathHVD(sr + 1, sc, er, ec, ans + "V");
        }
        if(sc + 1 <= ec)
        {
            count += mazepathHVD(sr, sc + 1, er, ec, ans + "H");
        }
        if(sr + 1 <= er && sc + 1 <= ec)
        {
            count += mazepathHVD(sr + 1, sc + 1, er, ec, ans + "D");
        }
        return count;
    }

    public static int mazepathHVDMultimove(int sr , int sc , int er , int ec , String ans)
    {
        if(sr == er && sc == ec)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for(int i = 1; sr + i <= er ; i++)
        {
            count += mazepathHVDMultimove(sr + i, sc, er, ec, ans + "V" + i);
        }
        for(int i = 1 ; sc + i <= ec ; i++)
        {
            count += mazepathHVDMultimove(sr, sc + i, er, ec, ans + "H" + i);
        }
        for(int i = 1 ; sr + i <= er && sc + i <= ec ; i++)
        {
            count += mazepathHVDMultimove(sr + i, sc + i, er, ec, ans + "D" + i);
        }
        return count;
    }

    public static int boardpathDice(int target ,int present , String ans)
    {
        if(target == present)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;

        for(int i = 1; i < 7 ; i++)
        {
            if(present + i <= target)
            {
                count += boardpathDice(target, present + i, ans + i);
            }
        }
        return count;
    }


    // COIN CHANGE ALL VARIATIONS
    
    public static int coinChangePer1(int[] arr , int target , String ans)
    {
        if(target == 0)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(target - arr[i] >= 0)
            {
                count += coinChangePer1(arr, target - arr[i], ans + " " + arr[i]);
            }
        }
        return count;
    }

    public static int coinChangeCombi1(int[] arr , int target , int vidx , String ans)
    {
        if(target == 0)
        {
            System.out.println(ans);
            return 1;
        
        }

        int count = 0;

        for(int i = vidx ; i < arr.length ; i++)
        {
            if(target - arr[i] >= 0)
            {
                count += coinChangeCombi1(arr, target - arr[i], i, ans + " " + arr[i]);
            }
        }
        return count;
    }

    public static int coinChangeCombi2(int[] arr , int target , int vidx , String ans)
    {
        if(target == 0)
        {
            System.out.println(ans);
            return 1;
        }
        int count = 0;

        for(int i = vidx ; i < arr.length ; i++)
        {
            if(target - arr[i] >= 0)
            {
                count += coinChangeCombi2(arr, target - arr[i], i + 1, ans + " " + arr[i]);
            }
        }
        return count;
    }

    public static int coinChangePer2(int[] arr , int target , String ans , boolean[] vis)
    {
        if(target == 0)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(target - arr[i] >= 0 && !vis[i])
            {
                vis[i] = true;
                count += coinChangePer2(arr, target - arr[i], ans + " " + arr[i], vis);
                vis[i] = false;
            }
        }
        return count;
    }

    public static int coinChangeCombi3(int[] arr , int target , int idx , String ans)
    {
        if(idx == arr.length || target == 0)
        {
            if(target == 0)
            {
                System.out.println(ans);
                return 1;
            }
            return 0;
        }

        int count = 0;
        if(target - arr[idx] >= 0)
        {
            // use the coin and pass same index (don't increase index)
            count += coinChangeCombi3(arr, target - arr[idx], idx, ans + " " + arr[idx]);
        }
        // coin doesn't used and index increased
        count += coinChangeCombi3(arr, target, idx + 1, ans);
        return count;
    }

    public static int coinChangePer3(int[] arr , int target , int idx , String ans)
    {
        if(idx == arr.length || target == 0)
        {
            if(target == 0)
            {
                System.out.println(ans);
                return 1;
            }
            return 0;
        }
        int count = 0;

        if(target - arr[idx] >= 0)
        {
            count += coinChangePer3(arr, target - arr[idx], 0, ans + " " + arr[idx]);
        }
        count += coinChangePer3(arr, target, idx + 1, ans);
        return count;
    }

    public static int coinChangeCombi4(int[] arr , int target , int idx , String ans)
    {
        if(idx == arr.length || target == 0)
        {   
            if(target == 0)
            {
                System.out.println(ans);
                return 1;
            }
            return 0;
        }

        int count = 0;
        if(target - arr[idx] >= 0)
        {
            count += coinChangeCombi4(arr, target - arr[idx], idx + 1, ans + " " + arr[idx]);
        }
        count += coinChangeCombi4(arr, target, idx + 1, ans);
        return count;
    }

    public static int coinChangePer4(int[] arr , int target , int idx , String ans , boolean[] vis)
    {
        if(idx == arr.length || target == 0)
        {
            if(target == 0)
            {
                System.out.println(ans);
                return 1;
            }
            return 0;
        }

        int count = 0;
        if(target - arr[idx] >= 0 && !vis[idx])
        {
            vis[idx] = true;
            count += coinChangePer4(arr, target - arr[idx], 0, ans + " " + arr[idx], vis);
            vis[idx] = false;
        }
        count += coinChangePer4(arr, target, idx + 1, ans, vis);
        return count;
    }


    //  EQUI SETS WITH RESPECT TO SUM______________________________________
    public static int equiSet(int[] arr , int idx , int sumSet1 , int sumSet2 , String ans1 , String ans2)
    {
        if(idx == arr.length)
        {
            if(sumSet1 == sumSet2)
            {
                System.out.println("Set 1 = " + ans1 + " , " + "Set 2 = " + ans2);
                return 1;
            }
            return 0;
        }

        int count = 0;

        count += equiSet(arr , idx + 1, sumSet1 + arr[idx] , sumSet2 , ans1 + arr[idx] + "  " , ans2);
        count += equiSet(arr, idx + 1, sumSet1, sumSet2 + arr[idx], ans1, ans2 + arr[idx] + "  ");

        return count;
    }

    public static int equiSetRemovedDuplicacy(int[] arr, int idx, int sumSet1, int sumSet2,
                                 String sum1, String sum2)
    {
        if(idx == arr.length)
        {
            if(sumSet1 == sumSet2)
            {
                System.out.println(sum1 + "    " + sum2);
                return 1;
            }
            return 0;
        }

        int count = 0;
        
        count += equiSetRemovedDuplicacy(arr, idx + 1, sumSet1 + arr[idx], sumSet2, sum1 + arr[idx] + " ", sum2);
        count += equiSetRemovedDuplicacy(arr, idx + 1, sumSet1, sumSet2 + arr[idx], sum1, sum2 + arr[idx] + " ");

        return count;
    }        
    
    




    // QUEEN IN 1D ARRAY _________________________________________________
    
    // tq = total queen
    // qpsf = queen placed so far
    public static int queen1DCombi1(int box , int idx , int tq ,int qpsf ,  String ans)
    {
        if(tq == qpsf)
        {
            System.out.println(ans);
            return 1;
        }
        int count = 0;

        for(int i = idx ; i < box ; i++)
        {
            count += queen1DCombi1(box, i + 1, tq , qpsf + 1,  ans + "q" + (qpsf + 1) + "b" + (i) + "  ");
        }
        return count;
    }

    public static int queen1DPer1(boolean[] boxes , int idx , int tq , int qpsf , String ans)
    {
        if(tq == qpsf)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for(int i = 0 ; i < boxes.length ; i++)
        {
            if(!boxes[i])
            {
                boxes[i] = true;
                count += queen1DPer1(boxes, 0 , tq, qpsf + 1, ans + "q" + (qpsf + 1) + "b" + (i) + "  ");
                boxes[i] = false;
            }
        }

        return count;
    }

    public static int queen1DCombi2Subsequence(int box , int idx , int tq , int qpsf , String ans)
    {
        if(tq == qpsf || idx == box)
        {
            if(tq == qpsf)
            {
                System.out.println(ans);
                return 1;
            }
            return 0;
        }

        int count = 0;

        count += queen1DCombi2Subsequence(box, idx + 1 , tq, qpsf + 1, ans + "q" + (qpsf + 1) + "b" + idx + "  ");
        count += queen1DCombi2Subsequence(box, idx + 1, tq, qpsf, ans);

        return count;
    }

    public static int queen1DPer2Subsequence(boolean[] boxes , int idx , int tq , int qpsf , String ans)
    {
        if(tq == qpsf || idx == boxes.length)
        {
            if(tq == qpsf)
            {
                System.out.println(ans);
                return 1;
            }
            return 0;
        }

        int count = 0;
        if(!boxes[idx])
        {
            boxes[idx] = true;
            count += queen1DPer2Subsequence(boxes, 0, tq, qpsf + 1, ans + "q" + (qpsf + 1) + "b" + idx + "  ");
            boxes[idx] = false;
        }
        count += queen1DPer2Subsequence(boxes, idx + 1, tq, qpsf, ans);

        return count;
    }






    // QUEENS IN 2D ARRAY (BOARD) ___________________________________________
    public static int queen2DCombi1(boolean[][] board , int idx , int tq , int qpsf , String ans)
    {
        if(tq == qpsf)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for(int i = idx ; i < board.length * board[0].length ; i++)
        {
            int x = i / board.length;
            int y = i % board[0].length;

            count += queen2DCombi1(board, i + 1, tq, qpsf + 1, 
                            ans + "q" + (qpsf + 1) + "b" + "(" + x + "," + y + ")   ");
        }

        return count;
    }

    public static int queen2DPer1(boolean[][] board , int idx , int tq , int qpsf , String ans)
    {
        if(tq == qpsf)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for(int i = idx ; i < board.length * board[0].length ; i++)
        {
            int x = i / board.length;
            int y = i % board[0].length;

            if(!board[x][y])
            {
                board[x][y] = true;
                count += queen2DPer1(board, 0 , tq, qpsf + 1, 
                            ans + "q" + (qpsf + 1) + "b" + "(" + x + "," + y + ")   ");
                board[x][y] = false;
            }
        }

        return count;
    }

    public static int queen2DCombi2Subsequence(boolean[][] board , int idx , int tq , int qpsf , String ans)
    {
        if(tq == qpsf || board.length * board[0].length == idx)
        {
            if(tq == qpsf)
            {
                System.out.println(ans);
                return 1;
            }
            return 0;
        }

        int count = 0;
        int x = idx / board.length;
        int y = idx % board[0].length;

        count += queen2DCombi2Subsequence(board, idx + 1 , tq, qpsf + 1, 
                                ans + "q" + (qpsf + 1) + "b" + "(" + x + "," + y + ")   ");
        count += queen2DCombi2Subsequence(board, idx + 1, tq, qpsf, ans);

        return count;
    }

    public static int queen2DPer2Subsequence(boolean[][] board , int idx , int tq , int qpsf , String ans)
    {
        if(tq == qpsf || idx == board.length * board[0].length)
        {
            if(tq == qpsf)
            {
                System.out.println(ans);
                return 1;
            }
            return 0;
        }

        int count = 0;

        int x = idx / board.length;
        int y = idx % board[0].length;
        if(!board[x][y])
        {
            board[x][y] = true;
            count += queen2DPer2Subsequence(board, 0 , tq, qpsf + 1, 
                                        ans + "q" + (qpsf + 1) + "b" + "(" + x + "," + y + ")   ");
            board[x][y] = false;
        }
        count += queen2DPer2Subsequence(board, idx + 1, tq, qpsf, ans);

        return count;
    }



    // NQUEEN PLACING QUEEN IN A BOARD SUCH THAT NO TWO QUEEN CAN CUT EACH OTHER ___________________________

    public static int nQueenProblemCombi1(boolean[][] board , int idx , int tq , int qpsf , String ans)
    {
        if(tq == qpsf)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;

        for(int i = idx ; i < board.length * board[0].length ; i++)
        {
            int x = i / board[0].length;
            int y = i % board[0].length;

            if(isSafeToPlaceCombination(board , x , y))
            {
                board[x][y] = true;
                count += nQueenProblemCombi1(board, i + 1, tq, qpsf + 1, ans + "(" + x + "," + y + ")  ");
                board[x][y] = false;
            }
        }
        return count;
    }

    public static boolean isSafeToPlaceCombination(boolean[][] board , int x , int y)
    {
        int[][] dir = {{0 , -1} , {-1 , -1} , {-1 , 0} , {-1 , 1}};
        
        for(int i = 0 ; i < dir.length ; i++)
        {
            for(int rad = 1 ; rad <= Math.max(board.length , board[0].length) ; rad++)
            {
                int r = x + (rad * dir[i][0]);
                int c = y + (rad * dir[i][1]);

                if(r < 0 || c < 0 || r >= board.length || c >= board[0].length)
                {
                    break;
                }
                if(board[r][c])
                {
                    return false;
                }
            }
        }
        return true;
    }


    public static int nQueenProblemPer1(boolean[][] board , int idx , int tq , int qpsf , String ans)
    {
        if(tq == qpsf)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for(int i = 0 ; i < board.length * board[0].length ; i++)
        {
            int r = i / board[0].length;
            int c = i % board[0].length;

            if(isSafeToPlacePermutation(board, r, c) && !board[r][c])
            {
                board[r][c] = true;
                count += nQueenProblemPer1(board, 0, tq, qpsf + 1,
                                         ans + "q" + (qpsf + 1) + "(" + r + "," + c + ")  ");
                board[r][c] = false;
            }
        }

        return count;
    }

    public static boolean isSafeToPlacePermutation(boolean[][] board , int r , int c)
    {
        int[][] dir = {{0 , -1} , {-1 , -1} , {-1 , 0} ,  {-1 , 1} , {0 , 1} , {1 , 1} , {1 , 0} , {1 , -1}};

        for(int i = 0 ; i < dir.length ;i++)
        {
            for(int rad = 1; rad <= Math.max(board.length , board[0].length) ; rad++)
            {
                int x = r + (rad * dir[i][0]);
                int y = c + (rad * dir[i][1]);

                if(x < 0 || y < 0 || x >= board.length || y >= board[0].length)
                {
                    break;
                }
                if(board[x][y])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static int nQueenProblemCombi2Subsequence(boolean[][] board , int idx , int tq , int qpsf , String ans)
    {
        if(idx == board.length * board[0].length || tq == qpsf)
        {
            if(tq == qpsf)
            {
                System.out.println(ans);
                return 1;
            }
            return 0;
        }

        int count = 0;
        int r = idx / board[0].length;
        int c = idx % board[0].length;

        if(isSafeToPlaceCombination(board , r  , c))
        {
            board[r][c] = true;
            count += nQueenProblemCombi2Subsequence(board, idx + 1, tq, qpsf + 1, ans + "(" + r + "," + c + ")  ");
            board[r][c] = false;
        }

        count += nQueenProblemCombi2Subsequence(board, idx + 1, tq, qpsf, ans);
        return count;
    }

    public static int nQueenProblemPer2Subsequence(boolean[][] board , int idx , int tq , int qpsf , String ans)
    {
        if(idx == board.length * board[0].length || tq == qpsf)
        {
            if(tq == qpsf)
            {
                System.out.println(ans);
                return 1;
            }
            return 0;
        }

        int count = 0;
        int r = idx / board[0].length;
        int c = idx % board[0].length;

        if(isSafeToPlacePermutation(board, r, c) && !board[r][c])
        {
            board[r][c] = true;
            count += nQueenProblemPer2Subsequence(board, 0 , tq, qpsf + 1, 
                                                ans + "q" + (qpsf + 1) + "(" + r + "," + c + ")  ");
            board[r][c] = false;
        }

        count += nQueenProblemPer2Subsequence(board, idx + 1, tq, qpsf, ans);
        return count;
    }



    // CRYPTOGRAPHY ______________________________________________________________________
    public static String str1 = "send";
    public static String str2 = "more";
    public static String str3 = "money";
    public static int[] map = new int[26];
    public static boolean[] numUsed = new boolean[10];

    public static int crypto()
    {
        String str = str1 + str2 + str3;
        int[] freq = new int[26];
        for(int i = 0 ; i < str.length() ; i++)
        {
            int idx = str.charAt(i) - 'a';
            freq[idx]++;
        }
        String res = new String("");
        for(int i = 0 ; i < 26 ; i++)
        {
            if(freq[i] != 0)
            {
                res += (char)(i + 'a');
            }
        }

        return crypto_(res , 0);
    }

    public static int crypto_(String str , int idx)
    {
        if(idx == str.length())
        {
            int num1 = decode(str1);
            int num2 = decode(str2);
            int num3 = decode(str3);

            if(num1 + num2 == num3)
            {
                System.out.print(str1 + " - " + "(" + num1 + ")" + " + ");
                System.out.print(str2 + " - " + "(" + num2 + ")" + "  =  ");
                System.out.println(str3 + " - " + "(" + num3 + ")");
                return 1;
            }
            return 0;
        }

        int count = 0;
        char ch = str.charAt(idx);

        for(int i = 0 ; i < 10 ; i++)
        {
            if(!numUsed[i])
            {
                numUsed[i] = true;
                map[ch - 'a'] = i;      // storing i for the maping[] in the character
                count += crypto_(str , idx + 1);
                map[str.charAt(idx) - 'a'] = 0;
                numUsed[i] = false;
            }
        }

        return count;
    }

    public static int decode(String s)
    {
        int num = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            int n = map[s.charAt(i) - 'a'];
            num = (num * 10) + n;
        }
        return num;
    }



    // DICTIONARY _______________________________________________
    public static String[] dict = {"man" , "go" , "mango" , "i" , "like" , "and" , "sam" , "sung" 
                                        , "samsung" , "ili" , "ilike" , "ke"};

    public static int dictionary(String word , String ans)
    {
        if(word.length() == 0)
        {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        String temp = "";
        for(int i = 0 ; i < word.length() ; i++)
        {
            temp += word.charAt(i);
            if(isWordPresent(temp))
            {
                count += dictionary(word.substring(i + 1) , ans + temp + " ");
            }
        }
        return count;
    }

    public static boolean isWordPresent(String s)
    {
        for(String str : dict)
        {
            if(str.equals(s))
            {
                return true;
            }
        }
        return false;
    }
}