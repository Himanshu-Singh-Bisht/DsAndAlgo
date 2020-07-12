import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetCode
{
    public static void main(String[] args)
    {
        solve();
    }

    public static void solve()
    {
        // Ques - 1108 , Defanging an IP Address
        // Input: address = "1.1.1.1"
        // Output: "1[.]1[.]1[.]1"
        // defangIPaddr(address);
        // defangIPaddr_2(address);




        // Ques - 1221 , Split a String in Balanced Strings
        // Input: s = "RLRRLLRLRL"
        // Output: 4
        // balancedStringSplit(s);



        // Ques - 709, To Lower Case
        // Input: String str = "Hello"
        // Output: "hello"
        // toLowerCase(str);



        // Ques - 1436 , Destination City
        // Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
        // Output: "Sao Paulo" 
        // destCity(paths);


        // Ques - 1309 , Decrypt String from Alphabet to Integer Mapping
        // Input: s = "10#11#12"
        // Output: "jkab"
        // freqAlphabets(str);



        // Ques - 804 , Unique Morse Code Words
        // Input: words = ["gin", "zen", "gig", "msg"]
        // Output: 2
        // uniqueMorseRepresentations(words);



        // Ques - 657 , Robot Return to Origin
        // Input: "UD"
        // Output: true
        // judgeCircle(moves);


    }

    // LeetCode - 1108 _______________________________
    public static String defangIPaddr(String address)               // 1ms
    {
        StringBuilder sb = new StringBuilder(address);
        
        for(int i = 0 ; i < sb.length() ; i++)
        {
            char ch = sb.charAt(i);
            if(ch == '.')
            {
                sb.insert(i , '[');
                sb.insert(i + 2 , ']');
                i += 2;
            }
        }
        return sb.toString();
    }
    public static String defangIPaddr_2(String address)              // 0ms
    {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < address.length() ; i++)
        {
            char ch = address.charAt(i);
            if(ch != '.')
            {
                sb.append(ch);
            }
            else
            {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }



    // LeetCode - 1221 _____________________________________
    public static int balancedStringSplit(String str)
    {
        int l = 0 , r = 0 , ans = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == 'L')
            {
                l++;
            }
            else
            {
                r++;
            }
            if(l == r)
            {
                ans++;
                l = 0;
                r = 0;
            }
        }
        return ans;
    }



    // LeetCode - 709 ______________________________________
    public static String toLowerCase(String str) 
    {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0 ; i < sb.length() ; i++)
        {
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                char c = (char)(ch - 'A' + 'a');
                sb.setCharAt(i , c);
            }
        }
        
        return sb.toString();
    }



    // LeetCode - 1436 _____________________________________
    public static String destCity(List<List<String>> paths) 
    {
        String a = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i < paths.size() ; i++)
        {
            a = paths.get(i).get(0);
            list.add(a);
        }
        for(int i = 0 ; i < paths.size() ; i++)
        {
            a = paths.get(i).get(1);
            if(!list.contains(a))
            {
                return a;
            }
        }
        return "";
    }



    // LeetCode - 1309 ___________________________________
    public static String freqAlphabets(String s) 
    {
        StringBuilder sb = new StringBuilder();
        
        for(int i = s.length() - 1; i >= 0 ; i--)
        {
            if(s.charAt(i) == '#')
            {
                sb.append((char)((s.charAt(i-1) - '0') + 
                                 (10 * (s.charAt(i-2) -'0')) + 'a' - 1));
                i -= 2;
            }
            else
            {
                sb.append((char)((s.charAt(i) - '0') + 'a' - 1));
            }
        }
        return sb.reverse().toString();
    }



    // LeetCode - 804 ____________________________________
    public static int uniqueMorseRepresentations(String[] words) 
    {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",                                 ".-..","--","-.","---",".--.","--.-",".-.","...","-",
                          "..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> seen = new HashSet<>();
        
        for(String str : words)
        {
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < str.length() ; i++)
            {
                sb.append(morse[str.charAt(i) - 'a']);
            }
            
            seen.add(sb.toString());
        }
        
        return seen.size();
    }



    // LeetCode - 657 _________________________________
    public static boolean judgeCircle(String moves) 
    {
        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y--;
            
            else if (move == 'D') y++;
            
            else if (move == 'L') x--;
            
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }








}