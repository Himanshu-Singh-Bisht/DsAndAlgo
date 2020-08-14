import java.util.ArrayList;
import java.util.Scanner;

public class binaryTrees
{
    public static class Node 
    {
        int data;
        Node left = null;
        Node right = null;

        public Node(int data)
        {
            this.data = data;
        }

        public Node(int data , Node left , Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString()
        {
            String str = "";

            str += (left != null ? left.data : ".");
            str += " -> " + data + " <- ";
            str += (right != null ? right.data : ".");
            str += "\n";

            if(left != null)
            {
                str += left.toString();
            }
            if(right != null)
            {
                str += right.toString();
            }
            return str;
        }
    }


    public static void main(String[] args)
    {
        basicFunctions();
    }

    public static void basicFunctions()
    {
        // CREATE TREE ________________________________________________________________
        int[] arr = {10 , 20 , 30 , 40 , -1, -1, 50 , -1 , -1 , 60 , -1 , 70 ,
            -1 , -1 , 80 , 90 , 100 , 110 , -1 , -1 , 120 , -1 , -1 ,
            130 , -1 , -1 , 140 , -1 , -1};
        Node root = createTree(arr);
        // display(root);
        // System.out.println(root);


        // Level Order traversal of the tree using array and it uses a lot of space for array
        // int[] arr = {10 , 20 , 80 , 30 , 60 , 90 , 140 , 40 , 50 , -1 , 70 , 100 , 130 , 
        //             -1 , -1 , -1 , -1 , -1 , -1, -1 , -1 , -1 , -1, 110 , 120 , -1 , -1 ,
        //             -1 ,-1 , -1 , -1, -1 , -1 , -1 , -1 , -1  , -1 , -1 , -1 , -1 , -1 ,
        //             -1 , -1 ,-1 , -1 , -1 , -1 , -1 , -1 , -1 , -1};
        // display2(arr);   


        // MAXIMUM IN TREE ________________________________________
        // System.out.println(maximumInTree(root));

        // FIND ELEMENT IN THE TREE _______________________________________________
        // System.out.println(findInTree(root , 90));

        // SIZE OF THE TREE _____________________________________________________
        // System.out.println(sizeOfTree(root));

        // MAXIMUM HEIGHT OF THE TREE _______________________________________________
        // System.out.println(maxHeightOfTree(root));

        // ROOT TO NODE PATH _______________________________________________________
        // ArrayList<Integer> list = rootToNodePath(root , 100);
        // System.out.println(list);


        // LOWEST COMMON ANCESTOR (LEETCODE - 236)  ____________________________________________
        // System.out.println(lca(root , 110 , 140));       // O(2n)
        // lca2(root , 110 , 140);                 // O(n)
        // System.out.println(ans);            // global variable


        // Kth DISTANCE FROM THE NODE (LEETCODE - 863)  _________________________________________
        // kAway1(root , 80 , 4);
        // kAway2(root, 80 , 4);        // without using root to node path


        // DIAMETER OF THE TREE (LEETCODE - 543) ______________________________________________________________
        // System.out.println(diameter1(root));
        // System.out.println(diameter2(root)[0]);
        // diameter3(root);
        // System.out.println(dia);


        // HAS PATH SUM (LEETCODE - 112) ____________________________________________
        // System.out.println(hasPathSum(root , 160));

        // LEAF TO LEAF SUM (GFG)___________________________________________________
        // leafToLeafSum(root);
        // System.out.println(maxSumLeafToLeaf);


        // BINARY TREE MAXIMUM PATH SUM (LEETCODE - 124)_______________________________________________________
        // nodeToNodeSum(root);
        // System.out.println(maxSumNodeToNode);


        // MINIMUM CAMERAS REQUIRED (LEETCODE - 968) ____________________________________________________
        // minCamera(root);
        // System.out.println(minCameras);


        // HOUSE ROBBER - III (LEETCODE - 337) _________________________________________________
        System.out.println(rob(root));  
        // OUTPUT - 

    }

    // CREATE TREE __________________________________________________________________________
    public static int idx = 0;
    public static Node createTree(int[] arr)
    {
        if(idx == arr.length || arr[idx] == -1)
        {
            idx++;
            return null;
        }

        Node node = new Node(arr[idx]);
        idx++;

        node.left = createTree(arr);
        node.right = createTree(arr);
        
        return node;
    }

    public static void display(Node node)
    {
        if(node == null)
        {
            return;
        }

        System.out.print(node.left != null ? node.left.data : ".");
        System.out.print(" -> " + node.data + " <- ");
        System.out.println(node.right != null ? node.right.data : ".");

        display(node.left);
        display(node.right);
    }

    // LEVEL TRAVERSAL OF TREE USING ARRAY
    public static void display2(int[] arr)
    {
        for(int i = 0; i < arr.length ; i++)
        {
            if(arr[i] == -1)
            {
                continue;
            }
            int left = arr[(2 * i) + 1];          // left child
            int right = arr[(2 * i) + 2];         // right child
            System.out.print(left != -1 ? left : ".");
            System.out.print(" -> " + arr[i] + " <- ");
            System.out.println(right != -1 ? right : ".");
        }
    }

    // MAXIMUM IN TREE _________________________________________________
    public static int maximumInTree(Node node)
    {
        if(node == null)
        {
            return Integer.MIN_VALUE;
        }

        int left = maximumInTree(node.left);
        int right = maximumInTree(node.right);

        return Math.max(node.data , Math.max(left , right));
    }


    // FIND ELEMENT IN THE TREE _______________________________________________
    public static boolean findInTree(Node node , int data)
    {
        if(node == null)
        {
            return false;
        }

        if(node.data == data)
        {
            return true;
        }
        boolean res = false;

        res = res || findInTree(node.left, data);
        res = res || findInTree(node.right, data);
        return res;
    }

    // SIZE OF THE TREE ________________________________________________________
    public static int sizeOfTree(Node node)
    {
        if(node == null)
        {
            return 0;
        }

        int left = sizeOfTree(node.left);
        int right = sizeOfTree(node.right);

        return left + right + 1;
    }

    // MAXIMUM HEIGHT OF THE TREE ______________________________________________
    public static int maxHeightOfTree(Node node)
    {
        if(node == null)
        {
            return -1;
        }

        int lmax = maxHeightOfTree(node.left);
        int rmax = maxHeightOfTree(node.right);

        return Math.max(lmax , rmax) + 1;
    }


    // ROOT TO NODE PATH _______________________________________________________
    public static ArrayList<Node> rootToNodePath(Node node , int data)
    {
        if(node == null)
        {
            return new ArrayList<Node>();
        }

        if(node.data == data)
        {
            ArrayList<Node> base = new ArrayList<>();
            base.add(node);
            return base;
        }

        ArrayList<Node> left = rootToNodePath(node.left, data);
        if(left.size() != 0)
        {
            left.add(node);
            return left;
        }
        ArrayList<Node> right = rootToNodePath(node.right, data);
        if(right.size() != 0)
        {
            right.add(node);
            return right;
        }
        return new ArrayList<Node>();
    }

    // LOWEST COMMON ANCESTOR (LEETCODE - 236)  ____________________________________________
    public static int lca(Node node , int data1 , int data2)            // O(2n)
    {
        ArrayList<Node> list1 = rootToNodePath(node, data1);
        ArrayList<Node> list2 = rootToNodePath(node, data2);

        if(list1.size() == 0 || list2.size() == 0)
        {
            return -1;
        }

        int i = list1.size() - 1;
        int j = list2.size() - 1;

        while(i >= 0 || j >= 0)
        {
            if(list1.get(i).data != list2.get(j).data)
            {
                break;
            }
            i--;
            j--;
        }

        return list1.get(i + 1).data;
    }

    public static int ans = -1;
    public static boolean lca2(Node node , int data1 , int data2)       // O(n)
    {
        if(node == null)
        {
            return false;
        }

        int left = lca2(node.left , data1 , data2) ? 1 : 0;
        int right = lca2(node.right , data1 , data2) ? 1 : 0;

        int mid = (node.data == data1 || node.data == data2) ? 1 : 0;

        if(left + right + mid >= 2)
        {
            ans = node.data;
        }

        return left + right + mid > 0;
    }


    // Kth DISTANCE FROM THE NODE (LEETCODE - 863)  _________________________________________
    public static void kAway1(Node node, int data , int k)
    {
        ArrayList<Node> list = rootToNodePath(node, data);

        Node pnode = null;
        for(int i = 0 ; i < list.size() ; i++)
        {
            kDown(list.get(i)  , pnode , k - i);
            pnode = list.get(i);
        }
    }

    public static void kDown(Node node , Node pnode , int level)
    {
        if(node == pnode || node == null)       // as we don't want to trace the same path again
        {
            return;
        }

        if(level == 0)
        {
            System.out.print(node.data + "  ");
        }
        kDown(node.left , pnode , level - 1);
        kDown(node.right , pnode , level - 1);
    }


    public static int kAway2(Node node , int data , int k)  // without using rootToNodePath()
    {
        if(node == null)
        {
            return -1;
        }
        if(node.data == data)
        {
            kDown(node, null, k);
            return 1;
        }

        int ld = kAway2(node.left, data, k);
        if(ld != -1)
        {
            kDown(node, node.left, k - ld);
            return ld + 1;
        }

        int rd = kAway2(node.right, data, k);
        if(rd != -1)
        {
            kDown(node, node.right, k - rd);
            return rd + 1;
        }
        return -1;
    }


    // DIAMETER OF THE TREE (LEETCODE - 543) ______________________________________________________________
    public static int diameter1(Node node)      // O(n^2)
    {
        if(node == null)
        {
            return 0;
        }

        int ld = diameter1(node.left);
        int rd = diameter1(node.right);

        int lh = maxHeightOfTree(node.left);
        int rh = maxHeightOfTree(node.right);

        return Math.max(lh + rh + 2 , Math.max(ld , rd));
    }

    public static int[] diameter2(Node node)      // O(n)
    {
        if(node == null)
        {
            int[] base = {0 , -1};
            return base;
        }

        int[] l = diameter2(node.left);
        int[] r = diameter2(node.right);

        int[] res = new int[2];
        res[0] = Math.max(l[1] + r[1] + 2 , Math.max(l[0] , r[0]));
        res[1] = Math.max(l[1] , r[1]) + 1;

        return res;
    }

    public static int dia = 0;
    public static int diameter3(Node node)          // O(n)
    {
        if(node == null)
        {
            return -1;
        }

        int lh = diameter3(node.left);
        int rh = diameter3(node.right);

        dia = Math.max(dia , lh + rh + 2);

        return Math.max(lh , rh) + 1;
    }



    // HAS PATH SUM (LEETCODE - 112) __________________________________________________________
    public static boolean hasPathSum(Node node , int sum)
    {
        if(node == null || sum == 0)
        {
            if(node == null && sum == 0)
            {
                return true;
            }
            return false;
        }

        boolean res = false;
        res = res || hasPathSum(node.left, sum - node.data);
        res = res || hasPathSum(node.right , sum - node.data);

        return res;
    }


    // LEAF TO LEAF SUM (GFG) _____________________________________________________________
    public static int maxSumLeafToLeaf = Integer.MIN_VALUE;
    public static int leafToLeafSum(Node node)
    {
        if(node == null)
        {
            return Integer.MIN_VALUE;
        }
        if(node.left == null && node.right == null)         // for leaf node
        {
            return node.data;
        }

        int lsum = leafToLeafSum(node.left);
        int rsum = leafToLeafSum(node.right);

        if(node.left != null && node.right != null)     // update the global variable when the node has 2 childs
        {
            maxSumLeafToLeaf = Math.max(maxSumLeafToLeaf , lsum + rsum + node.data);
        }

        return Math.max(lsum , rsum) + node.data;
    }


    // BINARY TREE MAXIMUM PATH SUM (LEETCODE - 124)_______________________________________________________
    static int maxSumNodeToNode = Integer.MIN_VALUE;
    public static int nodeToNodeSum(Node node)
    {
        if(node == null)
        {
            return 0;
        }

        int lmax = nodeToNodeSum(node.left);
        int rmax = nodeToNodeSum(node.right);

        int maxBranch = Math.max(lmax , rmax);

        maxSumNodeToNode = Math.max(Math.max(maxSumNodeToNode , node.data) ,
                                 Math.max(maxBranch + node.data , lmax + rmax + node.data));

        return Math.max(node.data , maxBranch + node.data);
    }
    


    //  MINIMUM CAMERA REQUIRED (LEETCODE - 968) _________________________________________________________

    // -1 : i need camera
    // 0 : already covered
    // 1 : i m camera
    static int minCameras = 0;
    public static int minCamera(Node node)
    {
        int val = minCamera_(node);
        if(val == -1)
        {
            minCameras++;
        }
        return minCameras;
    }

    public static int minCamera_(Node node)
    {
        if(node == null)
        {
            return 0;
        }

        int left = minCamera_(node.left);
        int right = minCamera_(node.right);

        if(left == -1 || right == -1)
        {
            minCameras++;
            return 1;
        }

        if(left == 1 || right == 1)
        {
            return 0;
        }

        return -1;
    }



    // LEETCODE - 337 , HOUSE ROBBER - III
    public static int currIdx = 0;
    public static int prevIdx = 1;

    public static int rob(Node node)
    {
        int[] ans = houseRobber(node);
        return ans[0];
    }

    public static int[] houseRobber(Node node)
    {
        int[] out = new int[]{0 , 0};
        if(node != null)
        {
            int[] left = houseRobber(node.left);
            int[] right = houseRobber(node.right);

            int curr = left[currIdx] + right[currIdx];
            int prev = left[prevIdx] + right[prevIdx];

            out[currIdx] = Math.max(node.data + prev , curr);
            out[prevIdx] = curr;
        }
        return out;
    }
}