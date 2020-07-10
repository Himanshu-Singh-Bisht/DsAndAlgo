import java.util.Scanner;

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



        // 
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

    public class Num
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




}