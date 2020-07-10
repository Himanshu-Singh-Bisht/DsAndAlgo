import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class bitManip
{
    public static void main(String[] args)
    {
        solve();
    }

    public static void solve()
    {
        // Ques - 1342, Number of Steps to Reduce a Number to Zero
        // Input: num = 14
        // Output: 6
        // numberOfSteps(num);



        // Ques - 461 , Hamming Distance
        // Input : x = 1 , y = 4
        // Output = 2
        // hammingDistance(x, y);



        // Ques - 1356, Sort Integers by The Number of 1 Bits
        // Input: arr = [0,1,2,3,4,5,6,7,8]
        // Output: [0,1,2,4,8,3,5,6,7]
        // sortByBits(arr);
        // sortByBits_2(arr);




        // Ques = 136 , Single Number
        // Input: [2,2,1]
        // Output: 1
        // singleNumber(nums);




        // 476 , Number Complement
        // Input: num = 5
        // Output: 2
        // findComplement(num);




        // Ques - 762, Prime Number of Set Bits in Binary Representation
        // Input: L = 6, R = 10
        // Output: 4
        // countPrimeSetBits(L, R);



        // Ques - 693 , Binary Number with Alternating Bits
        // Input: 5
        // Output: True
        // hasAlternatingBits(n);




        //  Ques - 169 , Majority Element
        // Input = [3, 2, 3]
        // Output = 3
        // majorityElement(nums);



        // Ques - 389 , Find The Difference
        // Input:
        // s = "abcd"
        // t = "abcde"
        // Output:e
        // findTheDifference(s, t);



        // Ques - 268 , Missing Number
        // Input: [3,0,1]
        // Output: 2
        // missingNumber(nums);



        // Ques - 371 , Sum Of Two Integers
        // Input : a = 3 , b = 4
        // Output = 7
        // getSum(a, b);




        // Ques - 191 , Number Of 1 Bits
        // Input: 00000000000000000000000000001011
        // Output: 3
        // hammingWeight(n);
        // hammingWeight_2(n);



        // Ques - 405 , Convert a Number to Hexadecimal
        // Input : 26
        // Output : "1a"
        // toHex(num);



        // Ques - 231 , Power Of Two
        // Input: 1
        // Output: true 
        // isPowerOfTwo(n);
        // isPowerOfTwo_2(n);



        // Ques - 342 , Power Of Four
        // Input : 32 
        // Output : false
        // isPowerOfFour(n);



        // Ques - 190 , Reverse Bits
        // Input: 00000010100101000001111010011100
        // Output: 00111001011110000010100101000000
        // reverseBits(n);
        // reverseBits_2(n)
    }



    // LeetCode - 1342 ________________________________________
    public static int numberOfSteps (int num) 
    {
        int steps = 0;
        
        while(num != 0)
        {
            if((num & 1) == 0)    // even
            {
                num /= 2;
            }
            else        // odd
            {
                num--;
            }
            steps++;
        }
        
        return steps;
    }





    // LeetCode - 461 _______________________
    public static int hammingDistance(int x, int y) 
    {
        int temp = (x ^ y);
        int p = 0;
        for(int i = 0 ; i < 32 ; i++)
        {
            int mask = (1 << i);
            if((temp & mask) != 0)
            {
                p++;
            }
        }
        
        return p;
    }




    // LeetCode - 1356 ______________________________________
    public static int[] sortByBits(int[] arr)
    {
        int[][] temp = new int[arr.length][2];
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            int k = 0;
            for(int j = 0 ; j < 32 ; j++)
            {
                int mask = (1 << j);
                if((arr[i] & mask) != 0)
                {
                    k++;
                }
                
                int n = 0;
                n |= mask;
                if(n == arr[i])
                {
                    break;
                }
            }
            temp[i][0] = arr[i];
            temp[i][1] = k;
        }
        
        Arrays.sort(temp , (index1 , index2) -> index1[1] != index2[1] ? index1[1] - index2[1]
                                                                : index1[0] - index2[0]);
                    
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = temp[i][0];                
        }
        return arr;
    }


    public static int[] sortByBits_2(int[] arr) {
        Num[] e = new Num[arr.length];

        for (int i=0;i<arr.length;i++) 
        {
            e[i] = new Num(arr[i]);
        }

        Arrays.sort(e, (a,b) -> a.bit == b.bit ? a.num - b.num : a.bit - b.bit);

        for (int i=0;i<arr.length;i++) 
        {
            arr[i] = e[i].num;
        }
        return arr;
    }

    public static class Num
    {
        public int bit;
        public int num;
    
        public Num(int x)
        {
            this.bit = numOf1(x);
            this.num = x;
        }
    
        public int numOf1(int x) 
        {
            int res = 0;
            while (x != 0) 
            {
                res += x & 1;
                x >>= 1;
            }
            return res;
        }
    }



    // LeetCode - 136 _____________________________
    public static int singleNumber(int[] nums) 
    {
        int a = 0;
        for(int i : nums)
        {
            a ^= i;
        }
        
        return a;
    }



    // LeetCode - 476 ______________________________
    public static int findComplement(int num) 
    {
        int res = 0;
        int mask = 1;
        while(num != 0)
        {
            if((num & 1) == 0)
            {
                res |= mask;
            }
            
            mask = mask << 1;
            num = num >> 1;
        }
        return res;
    }




    // LeetCode - 762 _________________________________
    public static int countPrimeSetBits(int L, int R) 
    {
        int ans = 0;
        for(int i = L ; i <= R ; i++)
        {
            int setBits = numberOfSetBits(i);
            if(prime(setBits))
            {
                ans++;
            }
        }
        return ans;
    }
    
    public static int numberOfSetBits(int n)
    {
        int count = 0;
        while(n != 0)
        {
            if((n & 1) != 0)
            {
                count++;
            }
            n = n >> 1;
        }
        
        return count;
    }
    
    public static boolean prime(int n)
    {
        if(n == 1)
        {
            return false;
        }
        for(int i = 2 ; i * i <= n ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }





    // LeetCode - 693 __________________________
    public static boolean hasAlternatingBits(int n) 
    {
        while(n !=0  &&  (n >> 1) != 0)
        {
            if(((n & 1) ^ ((n >> 1) & 1)) == 0)
            {
                return false;
            }
            n >>= 1;
        }
        
        return true;
    }




    // LeetCode - 169 _________________________________
    public static int majorityElement(int[] nums)
    {
        int res = 0;
        for(int i = 0 ; i < 32 ; i++)
        {
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++)
            {
                if((nums[j] & (1 << i)) != 0)
                {
                    count++;       
                }
            }
                   
            if(count > (nums.length - count))
            {
                res |= (1 << i);           
            }
        }
                   
        return res;
    }




    // LeetCode - 389 ___________________________________
    public static char findTheDifference(String s, String t)
    {
        String temp = s + t;
        char diffChar = temp.charAt(0);
        
        for(int i = 1 ; i < temp.length() ; i++)
        {
            char ch = temp.charAt(i);
            diffChar ^= ch;
        }
		return diffChar;
 
    }




    // LeetCode - 268 __________________________________________
    public static int missingNumber(int[] nums) 
    {
        int n = nums.length;
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            n = (n ^ (i ^ nums[i]));
        }
        
        return n;
    }



    // LeetCode - 371 _______________________________________
    public static int getSum(int a, int b) 
    {
        int c = a ^ b;
        int d = a & b;
        
        while(d!=0)
        {
            int e = c;
            c = (c ^ (d << 1));
            d = (e & (d << 1));
        }
        
        return c;
    }



    // LeetCode - 191 __________________________________
    public static int hammingWeight(int n) 
    {
        int count = 0;
        while(n != 0)
        {
             count++;
             n &= (n - 1);
        }
        return count;    
    }
    public static int hammingWeight_2(int n) 
    {
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) 
        {
            if ((n & mask) != 0) 
            {
                count++;
            }
            mask <<= 1;
        }
        return count;    
    }



    // LeetCode - 405 __________________________
    public static String toHex(int num) 
    {
         if(num >= 0 && num < 10)
         {
             return Integer.toString(num);
         }
         StringBuilder sb = new StringBuilder();
         char[] hex = {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' , 'a' ,
                      'b' , 'c' , 'd' , 'e' , 'f'};
         for(int i = 0 ; i < 8 && num != 0 ; i++)   // as 32 / 4 = 8
         {
             sb.insert(0 , hex[num & 15]);
             num = num >> 4;
         }
        
         return sb.toString();
    }



    // LeetCode - 231 ____________________________
    public static boolean isPowerOfTwo(int n) 
    {
        if (n < 1) 
		return false;
	    if (n == 1) 
		return true;
	    if (n % 2 == 1)
		return false;
        
        int flag = 0;
        while(n > 0)
        {
            if((n & 1) != 0)    
            {
                flag++;
            }
            if(flag > 1)
            {
                return false;
            }
            n >>= 1;
        }
        
        return true;
    }
    public static boolean isPowerOfTwo_2(int n) 
    {
        if (n < 1) 
		return false;
	    
        return (n & (n-1)) == 0;
    }




    // LeetCode - 342 _____________________________
    public static boolean isPowerOfFour(int n) 
    {
        if(n < 1)
        {
            return false;
        }
        
        int count = 0;
        if((n & (n -1)) == 0) // for checking the power of two
        {
            while((n & 1) == 0)     // to get position of the set bit
            {
                count++;
                n >>= 1;
            }
        }
        else
        {
            return false;
        }
                                    // % 2 is done bcoz as then it will be divisible by 4
        if(count % 2 == 0)    
        {
            return true;
        }
        return false;
    }



    // LeetCode - 190 ____________________________
    public static int reverseBits(int n) 
    {
        int ans = 0;
        for(int i = 0; i < 32 ; i++)
        {
            ans <<= 1;
            ans = ans | (n & 1);
            n >>= 1;
        }
        return ans;
    }
    public static int reverseBits_2(int n) 
    {
        int mask = 1;
        int ans = 0;
        for(int i = 0; i < 32 ; i++)
        {
            if((n & mask) != 0)
            {
                int j = 31 - i;
                int temp = 1 << j;
                ans = ans | temp;
            }
            
            mask <<= 1;
        }
        return ans;
    }


}