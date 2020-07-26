import java.util.Scanner;
import java.util.ArrayList;


public class returnType
{
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {
        basicFunctions();
    }

    public static void basicFunctions()
    {   
        // Print elements 1 - 10 or 10 - 1
        // System.out.print(printInc(1 , 10));
        // System.out.print(printDec(10 , 1));



        // FACTORIAL
        // System.out.println(factorial(5));



        // POWER
        // System.out.println(power(2 , 6));
        // System.out.println(powerModified(2 , 6));

        

        // RECURSION WITH ARRAY
        // int[] arr = { 1, 5, 4, 5, 5, 2, 4, 8, 5, 5, 9, 6, 3, 5, 4, 7, 8, 5, 2, 5, 2,
                    // 3, -5, 9, 7, 1, 2, 5 };
        // displayArray(arr , 0); 
        // System.out.println(find(arr , 0 , 8));
        // System.out.println(maximum(arr , 0));
        // System.out.println(minimum(arr, 0));
        // System.out.println(lastIndex(arr , 0 , 2));
        // displayArray( allIndex(arr, 0, 2, 0) , 0);



        // TOTAL JUMPS POSSIBLE TO REACH N VIA 1, 2 , 3 JUMPS POSSIBLE
        // System.out.println(totalJumps(3));



        // STRING TYPE 
        // ArrayList<String> subseq = subsequences("abcd");
        // ArrayList<String> subseq = subsequences1("abcd");
        // displayArrayList(subseq);
        // System.out.println(removeHi("iihihiiih"));
        // System.out.println(removeHiNotHit("iitihithiithii"));
        // System.out.println(removeDuplicate("aabbccddeffea"));
        // System.out.println(compression("abbccddeefff" , 0 , 1));
        // System.out.println(compression_2("aaabbcccdeef" , 1));



        // MAZEPATH TYPE
        // ArrayList<String> ans = mazepathHV(0 , 0 , 2 , 2);
        // displayArrayList(ans);
        // ArrayList<String> ans = mazepathHVD(0 , 0 , 2 , 2);
        // displayArrayList(ans);
        // System.out.println(mazepathHeight(0 , 0 , 2, 2));
        // ArrayList<String> ans = mazepathMultimoveHVD(0 , 0 , 2 , 2);
        // displayArrayList(ans);



        // FLOODFILL TYPE
        boolean[][] isdone = {{false , false , false},
                            {false , false , false},
                            {false , false , false},
                            {false , false , false}};
        ArrayList<String> ans = floodfill4Moves(0 , 0 , isdone.length - 1 , isdone[0].length - 1);
        displayArrayList(ans); 
    }


    // PRINTING THE ELEMENTS INCREASING AND DECREASING (RETURN TYPE)______________________________________
    public static int printInc(int start , int end)
    {
        if(start == end)
        {
            return end;
        }
        System.out.print(printInc(start, end - 1) + " ");
        return end;
    }

    public static int printDec(int start , int end)
    {
        if(start == end)
        {
            return end;
        }
        System.out.print(printDec(start , end + 1) + " ");
        return end;
    }


    //  FACTORIAL _______________________________________________
    public static int factorial(int n)
    {
        if(n == 1)
        {
            return n;
        }

        return (n * factorial(n - 1));
    } 



    // POWER ________________________________________________
    public static int power(int a , int b)
    {
        if(b == 1)
        {
            return a;
        }
        return (a * power(a, b - 1));
    }

    public static int powerModified(int a , int b)
    {
        if(b == 1)
        {
            return a;
        }
        
        if(b % 2 == 0)
        {
            return powerModified(a, b / 2) * powerModified(a, b / 2);
        }
        else
        {
            return powerModified(a , b / 2) * powerModified(a, b / 2) * a;
        }
    }



    // RECURSION WITH ARRAY
    public static void displayArray(int[] arr , int vidx)
    {
        if(vidx == arr.length)
        {
            return;
        }
        System.out.print(arr[vidx] + " ");
        displayArray(arr, vidx + 1);
    }

    public static boolean find(int[] arr , int vidx , int data)
    {
        if(vidx == arr.length)
        {
            return false;
        }

        if(arr[vidx] == data)
        {
            return true;
        }
        return find(arr , vidx + 1, data);
    }

    public static int maximum(int[] arr , int vidx)
    {
        if(vidx == arr.length - 1)
        {
            return arr[vidx];
        }

        int p = Math.max(arr[vidx] , maximum(arr , vidx + 1));
        return p;
    }

    public static int minimum(int[] arr , int vidx)
    {
        if(vidx == arr.length - 1)
        {
            return arr[vidx];
        }

        int p = Math.min(arr[vidx] , minimum(arr , vidx + 1));
        return p;
    }

    public static int lastIndex(int[] arr , int vidx , int data)
    {
        if(vidx == arr.length)
        {
            return -1;
        }

        int p = lastIndex(arr, vidx + 1, data);
        if(p != -1)
        {
            return p;
        }
        else 
        {
            return (arr[vidx] == data ? vidx : -1);
        }
    }

    public static int[] allIndex(int[] arr , int vidx , int data , int size)
    {
        if(vidx == arr.length)
        {
            int[] baseArray = new int[size];
            return baseArray;
        }

        if(arr[vidx] == data)
        {
            size++;
        }

        int[] recAns = allIndex(arr, vidx + 1, data, size);
        if(arr[vidx] == data)
        {
            recAns[size - 1] = vidx;
        }

        return recAns;
    }



    // TOTAL JUMPS POSSIBLE TO REACH N VIA 1, 2 , 3 JUMPS POSSIBLE __________________________________
    public static int totalJumps(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        int count = 0;
        if(n - 1 >= 0)  count += totalJumps(n - 1);
        if(n - 2 >= 0)  count += totalJumps(n - 2);
        if(n - 3 >= 0)  count += totalJumps(n - 3);

        return count;
    }




    // STRING TYPE _______________________________________________________________

    public static ArrayList<String> subsequences(String str)
    {
        if(str.length() == 0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        ArrayList<String> recAns = subsequences(str.substring(1));
        ArrayList<String> myAns = new ArrayList<>();

        myAns.addAll(recAns);       // to add all elements of the recAns ArrayList
        for(String s : recAns)
        {
            myAns.add(ch + s);
        }

        return myAns;
    }

    public static ArrayList<String> subsequences1(String str)
    {
        if(str.length() == 0)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        ArrayList<String> ans = subsequences1(str.substring(1));
        int size = ans.size();

        for(int i = 0 ; i < size ; i++)
        {
            ans.add(ch + ans.get(i));
        }

        return ans;
    }

    public static void displayArrayList(ArrayList<String> list)
    {
        for(String s : list)
        {
            System.out.println(s);
        }
    }

    public static String removeHi(String str)
    {
        if(str.length() == 0)
        {
            return "";
        }

        if(str.length() > 1 && str.substring(0 , 2).equals("hi"))
        {
            return removeHi(str.substring(2));
        }
        else
        {
            char ch = str.charAt(0);
            return ch + removeHi(str.substring(1));
        }
    }

    public static String removeHiNotHit(String str)
    {
        if(str.length() == 0)
        {
            return "";
        }

        if(str.length() > 1 && str.substring(0 , 2).equals("hi"))
        {
            if(str.length() > 2 && str.charAt(2) == 't')
            {
                return "hit" + removeHiNotHit(str.substring(3));
            }
            else
            {
                return removeHiNotHit(str.substring(2));
            }
        }
        else
        {
            return str.charAt(0) + removeHiNotHit(str.substring(1));
        }
    }

    public static String removeDuplicate(String str)
    {
        if(str.length() == 1)
        {
            return str;
        }

        char ch = str.charAt(0);
        
        String ans = removeDuplicate(str.substring(1));
        if(ans.charAt(0) == ch)
        {
            return ans;
        }
        return ch + ans;
    }

    public static String compression(String str , int vidx , int count)
    {
        if(vidx == str.length() - 1)
        {
            return str.charAt(vidx) + (count > 1 ? count + "" : "");
        }

        if(str.charAt(vidx) == str.charAt(vidx + 1))
        {
            return compression(str , vidx + 1 , count + 1);
        }
        else
        {
            return str.charAt(vidx) + (count > 1 ? count + "" : "") + compression(str, vidx + 1, 1);
        }
    }

    public static String compression_2(String str , int count)
    {
        if(str.length() == 1)
        {
            return str.charAt(0) + (count > 1 ? count + "" : "");
        }

        if(str.charAt(0) == str.charAt(1))
        {
            return compression_2(str.substring(1) , count + 1);
        }
        else
        {
            return str.charAt(0) + (count > 1 ? count + "" : "") +  compression_2(str.substring(1) , 1);
        }
    }




    // MAZEPATH TYPE __________________________________________________
    public static ArrayList<String> mazepathHV(int sr , int sc , int er , int ec)
    {
        if(sr == er && sc == ec)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(sr + 1 <= er)
        {
            ArrayList<String> recAns = mazepathHV(sr + 1 , sc , er , ec);    
            for(String s : recAns)
            {
                ans.add("H" + s);
            }            
        }

        if(sc + 1 <= ec)
        {
            ArrayList<String> recAns = mazepathHV(sr, sc + 1, er, ec);
            for(String s : recAns)
            {
                ans.add("V" + s);
            }
        }
        return ans;
    }

    public static ArrayList<String> mazepathHVD(int sr , int sc , int er , int ec)
    {
        if(sr == er && sc == ec)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(sc + 1 <= ec)
        {
            ArrayList<String> recAns = mazepathHVD(sr, sc + 1, er, ec);
            for(String s : recAns)
            {
                ans.add("H" + s);
            }
        }
        if(sr + 1 <= er)
        {
            ArrayList<String> recAns = mazepathHVD(sr + 1, sc, er, ec);
            for(String s : recAns)
            {
                ans.add("V" + s);
            }
        }
        if(sr + 1 <= er && sc + 1 <= ec)
        {
            ArrayList<String> recAns = mazepathHVD(sr + 1, sc + 1, er, ec);
            for(String s : recAns)
            {
                ans.add("D" + s);
            }
        }
        return ans;
    }

    public static int mazepathHeight(int sr , int sc , int er , int ec)
    {
        if(sr == er && sc == ec)
        {
            return -1;
        }

        int max_h = 0;
        if(sr + 1 <= er)
        {
            max_h = Math.max(max_h , mazepathHeight(sr + 1, sc, er, ec));
        }
        if(sc + 1 <= ec)
        {
            max_h = Math.max(max_h , mazepathHeight(sr, sc + 1, er, ec));
        }

        return max_h + 1;
    }

    public static ArrayList<String> mazepathMultimoveHVD(int sr , int sc , int er , int ec)
    {
        if(sr == er && sc == ec)
        {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1 ; sr + i <= er ; i++)
        {
            ArrayList<String> recAns = mazepathMultimoveHVD(sr + i, sc, er, ec);
            for(String s : recAns)
            {
                ans.add("H" + i + s);
            }
        }

        for(int i = 1 ; sc + i <= ec ; i++)
        {
            ArrayList<String> recAns = mazepathMultimoveHVD(sr, sc + i, er, ec);
            for(String s : recAns)
            {
                ans.add("V" + i + s);
            }
        }
        return ans;
    }


    // FLOODFILL TYPE _________________________________________________________
    public static ArrayList<String> floodfill4Moves(int sr , int sc , int er , int ec)
    {
        
    }
}