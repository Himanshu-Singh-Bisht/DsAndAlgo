import java.util.HashMap;
import java.util.PriorityQueue;

public class huffmann1
{
    private static HashMap<String ,String> encode = new HashMap<>();
    private static HashMap<String , String> decode = new HashMap<>();

    private static class Node implements Comparable<Node>
    {
        String data;
        int freq;
        Node left;
        Node right;

        public Node(String data , int freq , Node left , Node right)
        {
            this.data = data;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Node obj)
        {
            return this.freq - obj.freq;        // min heap according to the freq.
        }
    }


    public huffmann1(String str)
    {
        huffmannTree(str);
    }

    public void huffmannTree(String str)
    {
        int[] freqMap = new int[26];        // for only lower case alphabets
        for(int i = 0 ; i < str.length() ; i++)
        {
            int idx = str.charAt(i) - 'a';
            freqMap[idx]++;
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        for(int i = 0 ; i < freqMap.length ; i++)
        {
            if(freqMap[i] > 0)
            {
                pq.add(new Node((char)(i + 'a') + "" , freqMap[i] , null , null));
            }
        }

        while(pq.size() > 1)
        {
            Node one = pq.remove();
            Node two = pq.remove();

            pq.add(new Node("" , one.freq + two.freq , one , two));         // No data (String) is required
                                                        // bcoz we only needed that for the leaf nodes 
        }

        Node root = pq.remove();

        huffmannTraversal(root , "");
    }

    public void huffmannTraversal(Node node , String binaryCode)
    {
        if(node.left == null && node.right == null)     // means leaf node
        {
            encode.put(node.data , binaryCode);
            decode.put(binaryCode , node.data);
            return;
        }

        huffmannTraversal(node.left, binaryCode + "0");  // moving to left add 0
        huffmannTraversal(node.right, binaryCode + "1");   // moving to right add 1
    }


    public String encodeString(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++)
        {
            String s = str.charAt(i) + "";
            sb.append(encode.get(s));
        }

        return sb.toString();
    }

    public String decodeString(String str)
    {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(int j = 1 ; j <= str.length() ; j++)   // = used as subtring exclude the j
        {   
            String s = str.substring(i , j);
            if(decode.containsKey(s))
            {
                sb.append(decode.get(s));
                i = j;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        
    }
}