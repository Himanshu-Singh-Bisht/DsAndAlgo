public class questions
{
    public static void main(String[] args) 
    {
        // Link = https://practice.geeksforgeeks.org/explore/?page=1&company%5B%5D=Goldman%20Sachs

        // GFG , Delete without head pointer ___________________

        // GFG , Mirror Tree ___________________________________

        // GFG , Wave Array _____________________________________
        // (GFG) Sort an array in wave form (for unsorted array)_____________________________

        // GFG , Print Anagrams Together ___________________________________________

        // GFG , Segregate 0's and 1's in an Array____________________________________
        // GFG , Sort an Array of 0's , 1's and 2's _________________________________________



    }

    // GFG , Delete without head pointer ___________________
    // O(n)
    public static void deleteNode(Node node)
    {
         if(node == null || node.next == null)
         {
             return;
         }
         
         while(true)
         {
             int temp = node.data;
             node.data = node.next.data;
             node.next.data = temp;
             
             if(node.next.next == null)
             {
                 break;
             }
             
             node = node.next;
         }
         
         node.next = null;
    }

    // O(1) ___________
    public static void deleteNode_2(Node node)
    {
         if(node == null || node.next == null)
         {
             return;
         }
         
         node.data = node.next.data;
         node.next = node.next.next;
    }


    // GFG , Mirror Tree ___________________________________
    public static void mirror(Node node)
    {
	    if(node == null)
	    {
	        return;
	    }
	    
	    mirror(node.left);
	    mirror(node.right);
	    
	    Node temp = node.left;
	    node.left = node.right;
	    node.right = temp; 
    }


    // GFG , Wave Array _____________________________________
    public static void convertToWave(int arr[], int n)
    {
        for(int i = 1 ; i < arr.length ; i += 2)
        {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }

    // (GFG) Sort an array in wave form _____________________________
    // for unsorted array _______________
    // in O(nlogn)
    public static void convertToWave_unsortedArray_1(int arr[], int n)  
    {
        Arrays.sort(arr);
        for(int i = 1 ; i < arr.length ; i += 2)
        {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }


    // in O(n) _________________
    public static void convertToWave_unsortedArray_2(int[] arr , int n)
    {
        for(int i = 1; i < arr.length ; i += 2)
        {
            if(arr[i - 1] < arr[i])
            {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }

            if(i + 1 < arr.length && arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }




    // GFG , Print Anagrams Together ___________________________________________
    // Approach1 = categorized by sorted string ___
    public static List<List<String>> Anagrams(String[] list) 
    {
        HashMap<String , List<String>> map = new HashMap<>();
        
        for(String s : list)
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            
            String sortedString = String.valueOf(arr);
            if(!map.containsKey(sortedString))
            {
                map.put(sortedString, new ArrayList<>());
            }
            
            map.get(sortedString).add(s);
        }
        
        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet())
        {
            ans.add(map.get(key));
        }
        
        return ans;
    }

    // Approach2 , Categorized by count
    public static List<List<String>> Anagrams_2(String[] list)
    {
        HashMap<String , List<String>> map = new HashMap<>();
        int[] freqMap = new int[26];
        for(String s : list)
        {
            Arrays.fill(freqMap , 0);
            for(char ch : s.toCharArray())
            {
                freqMap[ch - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < freqMap.length ; i++)
            {
                sb.append("#");
                sb.append(freqMap[i]);            
            }
            
            String key = sb.toString();
            if(!map.containsKey(key))
            {
                map.put(key , new ArrayList<>());
            }
            
            map.get(key).add(s);
        }
        
        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet())
        {
            ans.add(map.get(key));
        }
        
        return ans;
    }



    // GFG , Segregate 0's and 1's in an Array____________________________________
    public static void segregate0and1(int[] arr, int n) 
    {
        int lo = 0;
        int hi = arr.length - 1;
        
        while(lo < hi)
        {
            if(arr[lo] == 1)
            {
                swap(arr , lo , hi);
                hi--;
            }
            else
            {
                lo++;
            }
        }
    }
    
    public static void swap(int[] arr , int lo , int hi)
    {
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
    }


    // GFG , Sort an Array of 0's , 1's and 2's _________________________________________
    public static void sort012(int arr[], int n)
    {
        int lo = 0;     // left of this all are 0
        int m = 0;
        int hi = arr.length - 1;  // right of this all are 1
        
        while(m <= hi)
        {
            if(arr[m] == 0)
            {
                swap(arr , lo , m);
                m++;
                lo++;
            }
            else if(arr[m] == 1)
            {
                m++;
            }
            else
            {
                swap(arr , m , hi);
                hi--;
            }
        }
    }

    
}