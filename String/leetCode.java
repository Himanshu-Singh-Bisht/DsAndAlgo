import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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



        // Ques - 557 , Reverse Words in a String III
        // Input: "Let's take LeetCode contest"
        // Output: "s'teL ekat edoCteeL tsetnoc"
        // reverseWords(s);



        // Ques - 334 , Reverse String
        // Input: ["h","e","l","l","o"]
        // Output: ["o","l","l","e","h"]
        // reverseString(s);



        // Ques - 929 , Unique Email Addresses
        // Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
        //                      "testemail+david@lee.tcode.com"]
        // Output: 2
        // numUniqueEmails(s);



        // Ques - 893, Groups of Special-Equivalent Strings
        // Input: A = ["abcd","cdab","cbad","xyzz","zzxy","zzyx"]
        // Output: 3
        // numSpecialEquivGroups(A);




        // Ques - 1455 , Check If a Word Occurs As a Prefix of Any Word in a Sentence
        // Input: sentence = "i love eating burger", searchWord = "burg"
        // Output: 4
        // isPrefixOfWord(sentence, searchWord);



        // Ques - 1408 , String Matching in an Array
        // Input: words = ["mass","as","hero","superhero"]
        // Output: ["as","hero"]
        // stringMatching(words);



        // Ques - 1189 , Maximum Number of Balloons
        // Input: text = "nlaebolko"
        // Output: 1
        // maxNumberOfBalloons(text);



        // Ques - 1446 , Conescutive Characters
        // Input: s = "leetcode"
        // Output: 2
        // maxPower(s);




        // Ques - 1332 , Remove Palindromic Subsequences
        // Input: s = "ababa"
        // Output: 1
        // removePalindromeSub(s);



        // Ques - 917 , Reverse Only Letters
        // Input: "Test1ng-Leet=code-Q!"
        // Output: "Qedo1ct-eeLg=ntse-T!" 
        // reverseOnlyLetters(S);



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




    // LeetCode - 557 ______________________________________
    public static String reverseWords(String s) 
    {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                temp.reverse();
                sb.append(temp);
                sb.append(' ');
                temp = new StringBuilder("");
            }
            else
            {
                temp.append(ch);
            }
        }
        
        temp.reverse();
        sb.append(temp);
        return sb.toString();
    }



    // LeetCode - 334 ____________________________________
    public static void reverseString(char[] s) 
    {
        for(int i = 0 ; i < s.length / 2; i++)    
        {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }



    // LeetCode - 929 ____________________________________
    public static int numUniqueEmails(String[] emails) 
    {
        Set<String> seen = new HashSet<>();
        for (String email : emails) 
        {
            seen.add(test(email));
        }
        return seen.size();
    }
    public static String test(String email)
    {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        
        int idx = -1;
        while(idx < email.length())
        {
            idx++;
            char letter = email.charAt(idx);
            if(letter == '@')
            {
                break;
            }
            else if(flag || letter == '.')
            {
                continue;
            }
            else if(letter == '+')
            {
                flag = true;
                continue;
            }
            else
            {
                sb.append(letter);
            }
        }
        sb.append(email.substring(idx));
        return sb.toString();
    }



    // LeetCode - 893 _________________________________
    public static int numSpecialEquivGroups(String[] A) 
    {
        Set<String> seen = new HashSet<String>();
        for(int i = 0 ; i < A.length ; i++)
        {
            seen.add(oddEvenConversionOfString(A[i]));
        }
        
        return seen.size();
    }
    public static String oddEvenConversionOfString(String s)
    {
        int[] odd = new int[26];
        int[] even = new int[26];
        
        for(int i = 0 ; i < s.length(); i += 2)
        {
            even[s.charAt(i) - 'a']++;
        }
        for(int  i = 1; i < s.length() ; i += 2)
        {
            odd[s.charAt(i) - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < 26 ; i++)
        {
            sb.append(odd[i]);
        }
        for(int i = 0 ; i < 26 ; i++)
        {
            sb.append(even[i]);
        }
        
        return sb.toString();
    }




    // LeetCode - 1455 _____________________________________
    public static int isPrefixOfWord(String sentence, String searchWord) 
    {
        int num = 1;
        int k = 0;
        for(int i = 0 ; i < sentence.length() ; i++)
        {
            int j = 0;
            while(k < sentence.length() &&  j < searchWord.length())
            {
                if(sentence.charAt(k) == searchWord.charAt(j))
                {
                    j++;
                    k++;
                }
                else
                {
                    break;
                }
            }
            
            if(j == searchWord.length())
            {
                return num;
            }
            
            if(sentence.charAt(i) == ' ')
            {
                k = i+1;
                num++;
            }
        }
        return -1;
    }



    // LeetCode - 1408 _________________________________
    public static List<String> stringMatching(String[] words) 
    {
        List<String> list = new ArrayList<>();
        
        for(String s : words)
        {
            for(String str : words)
            {
                if(str.equals(s))
                {
                    continue;
                }
                if(str.contains(s))
                {
                    list.add(s);
                    break;
                }
            }
        }
        return list;
    }



    // LeetCode - 1189 _______________________________________
    public static int maxNumberOfBalloons(String text) 
    {
        int[] arr = new int[26];
        for(int i = 0 ; i < text.length() ; i++)
        {
            char ch = text.charAt(i);
            arr[ch - 'a']++;
        }
        
        // as balloon has two 2 l and 2 o so
        arr['l' - 'a'] = arr['l' - 'a'] / 2;
        arr['o' - 'a'] = arr['o' - 'a'] / 2;
        
        int min = Integer.MAX_VALUE;
        char[] chArray = {'b' , 'a' , 'l' , 'o' , 'n'};
        
        for(char ch : chArray)
        {
            min = Math.min(min , arr[ch - 'a']);
        }
        
        return min;
    }




    // LeetCode - 1446 _________________________________________
    public static int maxPower(String s) 
    {
        int currentMax = 1;
        int max = 1;

        for(int i = 0; i < s.length()-1 ; i++) 
        {
            if(s.charAt(i) == s.charAt(i+1)) 
            {
                max++;
            }
            else 
            {
                if (max > currentMax) 
                {
                    currentMax = max;
                }
                max = 1;
            }
        }
        return Math.max(currentMax, max);
    }



    // LeetCode - 1332 _________________________________________
    public static int removePalindromeSub(String str)
    {
        if(str.length() == 0) return 0;
        if(str.length() == 1) return 1;
        
        boolean flag = true;
        int l = 0;
        int r = str.length() - 1;
        
        while(l < r)
        {
            if(str.charAt(l) != str.charAt(r))
            {
                flag = false;
            }
            l++;
            r--;
        }
        
        if(flag)
        {
            return 1;    
        }
        return 2;       // as string only has 'a' and 'b' character
    }



    // LeetCode - 917 ______________________________________
    public static String reverseOnlyLetters(String S)
    {
        StringBuilder sb = new StringBuilder(S);
        
        int l = 0;
        int r = sb.length() - 1;
        
        while(l < r)
        {
            char ch1 = sb.charAt(l);
            char ch2 = sb.charAt(r);
            // 'A' - 'Z' = 65 - 90
            // 'a' - 'z' = 97 - 122
            if(ch1 < 65 || ch1 > 122 || (ch1 < 97 && ch1 > 90))
            {
                l++;       
            }
            else if(ch2 < 65 || ch2 > 122 || (ch2 < 97 && ch2 > 90))
            {
                r--;       
            }
            else
            {
                sb.setCharAt(l , ch2);
                sb.setCharAt(r , ch1); 
                l++;
                r--;
            }
        }
                    
        return sb.toString();
    }


}