import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;

public class leetcode
{
    public static void main(String[] args)
    {
        leetcodeQuestions();
    }

    public static void leetcodeQuestions()
    {
        // LEETCODE - 938 , RANGE SUM OF BST ______________________________________________
        // Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
        // Output: 32
        // System.out.println(rangeSumBST(root, 7, 15));


        // LEETCODE - 617 , MERGE TWO BINARY TREES _____________________________________
        // Input : t1 = [1,3,2,5]
        //         t2 = [2,1,3,null,4,null,7]
        // Output : 
        // [3,4,5,5,4,null,7]
        // System.out.println(mergeTrees(t1, t2));



        // LEETCODE - 700 , SEARCH IN A BINARY SEARCH TREE _______________________________
        // Input : [4 , 2 , 7 , 1 , 3]  , 2 
        // Output : [2,1,3]
        // System.out.println(searchBST(root,
        


        // LEETCODE - 897 , INCREASING ORDER SEARCH TREE _____________________________________
        // Input : root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
        // Output : [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
        // System.out.println(increasingBST(root));



        // LEETCODE - 985 , UNIVALUED BINARY TREE ________________________________________
        // Input : root = [1,1,1,1,1,null,1]
        // Output : true
        // System.out.println(isUnivalTree(root));



        // LEETCODE - 1022 , SUM OF ROOT TO LEAF BINARY NUMBERS ________________________________
        // Input : root = [1,0,1,0,1,0,1]
        // Output : 22
        // System.out.println(sumRootToLeaf(root));


        // LEETCODE - 104 , MAXIMUM DEPTH OF BINARY TREE ______________________________________
        // Input : root =  [3,9,20,null,null,15,7]
        // Output : 3
        // System.out.println(maxDepth(root));



        // LEETCODE - 226 , INVERT BINARY TREE ________________________________________________
        // Input = root = [4,2,7,1,3,6,9]
        // Output = [4,7,2,9,6,3,1]
        // System.out.println(invertTree(root));
        // System.out.println(invertTree2(root));



        // LEETCODE - 872 , LEAF SIMILAR TREES _____________________________________________
        // Input : root1 : [3,5,1,6,2,9,8,null,null,7,4]
        //         root2 : [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
        // Output : true
        // System.out.println(leafSimilar(root1, root2));



        // LEETCODE - 637 , AVERAGE LEVELS IN BINARY TREE _____________________________________
        // Input : root = [3,9,20,15,7]
        // Output : [3.00000,14.50000,11.00000]
        // System.out.println(averageOfLevels(root));



        // LEETCODE - 669 , TRIM A BINARY SEARCH TREE ________________________________________
        // Input : root = [1 ,0 ,2] , L = 1 , R = 2
        // Output : [1 , null , 2]
        // System.out.println(trimBST(root, L, R));



        // LEETCODE - 108 , CONVERT SORTED ARRAY TO BINARY SEARCH TREE _________________
        // int[] nums = {-10 , -3 , 0 , 5 , 9};
        // System.out.println(sortedArrayToBST(nums));
        // Output : [0,-10,5,null,-3,null,9]



        // LEETCODE - 590 , N - ARRAY POSTORDER TRAVERSAL ________________________________________
        // Input: root = [1,null,3,2,4,null,5,6]
        // Output: [5,6,3,2,4,1]
        // System.out.println(postorder(root));



        // LEETCODE - 589 , N-ARY PREORDER TRAVERSAL ________________________________________________
        // Input: root = [1,null,3,2,4,null,5,6]
        // Output: [1,3,5,6,2,4]
        // System.out.println(preorder(root));


        // LEETCODE - 559 , MAXIMUM DEPTH OF N-ARY TREE _____________________________________________
        // Input: root = [1,null,3,2,4,null,5,6]
        // Output: 3
        // System.out.println(maxDepth(root));



        // LEETCODE - 653 , TWO SUM - IV - (INPUT IS A BST) __________________________________________
        // Input = root - [5,3,6,2,4,null,7] , k = 9
        // Output = true
        // System.out.println(findTarget1(root, k));
        // System.out.println(findTarget2(root, k));
        // System.out.println(findTarget3(root, k));



        // LEETCODE - 538 , CONVERT BST TO A GREATER TREE ______________________________________________
        // Input : [5 , 3, 7 , 1, 4 , 6, 9]
        // Output : [27,34,16,35,31,22,9]
        // System.out.println(convertBST1(root));
    }


    public static class TreeNode 
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) 
        { 
            this.val = val; 
        }
        TreeNode(int val, TreeNode left, TreeNode right) 
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    // LEETCODE - 938 _________________________________________________________________
    public static int sum = 0;
    public static int rangeSumBST(TreeNode root, int L, int R) 
    {
        recursionSum(root , L , R);
        return sum;
    }
    
    public static void recursionSum(TreeNode node , int L ,int R)
    {
        if(node == null)
        {
            return;
        }
        
        if(node.val >= L && node.val <= R)
        {
            sum += node.val;
        }
        
        if(L < node.val)
        {
            recursionSum(node.left ,L , R);
        }
        if(R > node.val)
        {
            recursionSum(node.right , L , R);
        }
    }



    // LEETCODE - 617 ______________________________________________________
    public static TreeNode mergeTrees(TreeNode t1 , TreeNode t2)
    {
        if(t1 == null)
        {
            return t2;
        }
        if(t2 == null)
        {
            return t1;
        }
        
        t1.val = t1.val + t2.val;
        t1.left = recursionMergeTrees(t1.left , t2.left);
        t1.right = recursionMergeTrees(t1.right , t2.right);
        return t1;
    }


    // LEETCODE - 700 ___________________________________________
    public static TreeNode searchBST(TreeNode node, int val) 
    {
        if(node == null)
        {
            return null;
        }
        
        if(node.val == val)
        {
            return node;
        }
        if(node.val > val)
        {
            return searchBST(node.left , val);
        }
        else
        {
            return searchBST(node.right , val);
        }
    }




    // LEETCODE - 897 ______________________________________________________
    public static TreeNode increasingBST(TreeNode root)
    {
        return inorderStack(root);
    }
    public static TreeNode inorderStack(TreeNode node)
    {
        TreeNode ans = null;
        Stack<Tpair> st = new Stack<>();
        st.push(new Tpair(node));
        
        TreeNode temp = null;
        while(st.size() != 0)
        {
            Tpair tnode = st.peek();
            if(!tnode.ld)
            {
                tnode.ld = true;
                if(tnode.node.left != null)
                {
                    st.push(new Tpair(tnode.node.left));
                }
            }
            else if(!tnode.sd)
            {
                tnode.sd = true;
                if(ans == null)
                {
                    ans = new TreeNode(tnode.node.val);
                    temp = ans;
                }
                else
                {
                    temp.right = new TreeNode(tnode.node.val);
                    temp = temp.right;
                }
            }
            else if(!tnode.rd)
            {
                tnode.rd = true;
                if(tnode.node.right != null)
                {
                    st.push(new Tpair(tnode.node.right));
                }
            }
            else
            {
                st.pop();
            } 
        }
        
        return ans;
    }
    
    public static class Tpair
    {
        TreeNode node = null;
        boolean ld =  false;
        boolean sd = false;
        boolean rd = false;
        
        public Tpair(TreeNode node)
        {
            this.node = node;
        }
    }



    // LEETCODE - 985 ______________________________________________________
    public static boolean isUnivalTree(TreeNode node) 
    {
        return recursionUnival(node , node.val); 
    }
    
    public static boolean recursionUnival(TreeNode node, int val)
    {
        if(node == null)
        {
            return true;
        }
        
        if(node.val != val)
        {
            return false;
        }
        
        boolean res = true;
        res = res && recursionUnival(node.left , val);
        res = res && recursionUnival(node.right , val);
        
        return res;
    }



    // LEETCODE - 1022 ______________________________________________
    public static int sumRootToLeaf(TreeNode root) 
    {
        return sumParentLeaf(root , 0);
    }
    
    public static int sumParentLeaf(TreeNode node , int parentNodeSum)
    {
        if(node == null)
        {
            return 0;
        }
        
        parentNodeSum = 2 * parentNodeSum + node.val;
        
        if(node.left == null && node.right == null)
        {
            return parentNodeSum;
        }
        
        int leftSum = sumParentLeaf(node.left , parentNodeSum);
        int rightSum = sumParentLeaf(node.right , parentNodeSum);
        
        return leftSum + rightSum;
    }


    // LEETCODE - 104 _____________________________________________
    public static int maxDepth(TreeNode node) 
    {
        if(node == null)
        {
            return 0;           // in terms of node (not in terms of edges)
        }
        
        int lh = maxDepth(node.left);
        int rh = maxDepth(node.right);
        
        return Math.max(lh ,rh) + 1;
    }



    // LEETCODE - 226 _____________________________________________
    public static TreeNode invertTree(TreeNode node) 
    {
        if(node == null)
        {
            return null;
        }
        
        TreeNode left = invertTree(node.left);
        TreeNode right = invertTree(node.right);
        
        node.left = right;
        node.right = left;
        
        return node;
    }


    public static TreeNode invertTree2(TreeNode root) 
    {
        if(root == null)
        {
            return null;
        }
        TreeNode ans = new TreeNode(root.val);
        
        invertingRecursion(root , ans);
        return ans;
    }
    
    public static TreeNode invertingRecursion(TreeNode node , TreeNode ans)
    {
        if(node == null)
        {
            return null;
        }
        
        if(node.left != null)
        {
            ans.right = new TreeNode(node.left.val);
        }
        node.left = invertingRecursion(node.left , ans.right);
        
        if(node.right != null)
        {
            ans.left = new TreeNode(node.right.val);
        }
        node.right = invertingRecursion(node.right , ans.left);

        return node;
    }




    // LEETCODE - 872 ______________________________________________
    public static boolean leafSimilar(TreeNode root1, TreeNode root2)
    {
        List<Integer> list1 = new ArrayList<>();
        leafValues(root1 , list1);
        List<Integer> list2 = new ArrayList<>();
        leafValues(root2 , list2);
        
        // if(list1.size() != list2.size())
        // {
        //     return false;
        // }
        // int i = 0;
        // while(i < list1.size())
        // {
        //     if(list1.get(i) != list2.get(i))
        //     {
        //         return false;
        //     }
        //     i++;
        // }
        
        // return true;
        
        return list1.equals(list2);         //using the ArrayList function
    }
    
    public static void leafValues(TreeNode node , List<Integer> ans)
    {
        if(node == null)
        {
            return;
        }
        
        if(node.left == null && node.right == null)
        {
            ans.add(node.val);
        }
        
        leafValues(node.left ,ans);
        leafValues(node.right , ans);
    }



    // LEETCODE - 637 __________________________________________________________
    public static List<Double> averageOfLevels(TreeNode root) 
    {
        List<Double> ans = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        
        placeNodesAccordingToLevels(root , 0 , ans ,count);
        
        for(int i = 0 ; i < ans.size(); i++)
        {
            ans.set(i , ans.get(i) / count.get(i));
        }
        
        return ans;
    }
    
    public static void placeNodesAccordingToLevels(TreeNode node , int level ,List<Double> ans ,
                                                                         List<Integer> count)
    {
        if(node == null)
        {
            return;
        }
        
        if(level < ans.size())          // level already included 
        {
            ans.set(level , ans.get(level) + node.val);
            count.set(level , count.get(level) + 1);
        }
        else                              // leve; needed to be included
        {
            ans.add(1.0 * node.val);
            count.add(1);
        }
        placeNodesAccordingToLevels(node.left , level + 1, ans , count);
        placeNodesAccordingToLevels(node.right , level + 1 , ans , count);
    }



    // LEETCODE - 669 ________________________________________________________
    public static TreeNode trimBST(TreeNode node, int L, int R) 
    {
        if(node == null)
        {
            return null;
        }
        if(node.val < L)    // right call
        {
            return trimBST(node.right , L ,R);
        }
        if(node.val > R)    // left call
        {
            return trimBST(node.left , L, R);
        }
        
        
        node.left = trimBST(node.left , L ,R);
        node.right = trimBST(node.right , L , R);
        
        return node;
    }



    // LEETCODE - 108 _______________________________________________________
    public static TreeNode sortedArrayToBST(int[] nums)
    {
        TreeNode root = createBST(nums , 0 , nums.length - 1);
        return root;
    }
    
    public static TreeNode createBST(int[] nums , int si , int ei)
    {
        if(si > ei)
        {
            return null;
        }
        int mid = si + (ei - si) / 2;
        
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = createBST(nums , si , mid - 1);
        node.right = createBST(nums, mid + 1 , ei);
        
        return node;
    }



    // LEETCODE - 590 __________________________________________________
    public static List<Integer> postorder(Node root) 
    {
        ans = new ArrayList<>();
        if(root == null)
        {
            return ans;
        }
        traversalPostorder(root);
        return ans;
    }

    public static void traversalPostorder(Node node)
    {
        for(Node child : node.children)
        {
            traversalPostorder(child);
        }
        ans.add(node.val);
    }

    public static List<Integer> ans;

    

    // LEETCODE - 589 ___________________________________________________
    public static List<Integer> preorder(Node root) 
    {
        if(root == null)
        {
            return ansPre;
        }
        
        traversalPreorder(root);
        return ansPre;
    }
    
    public static List<Integer> ansPre = new ArrayList<>();;
    public void traversalPreorder(Node node)
    {
        ans.add(node.val);
        for(Node child : node.children)
        {
            traversalPreorder(child);
        }
    }



    // LEETCODE - 559 ________________________________________________________________
    public static int maxDepth(Node node) 
    {
        if(node == null)
        {
            return 0;
        }
        int height = 0;
        for(Node child : node.children)
        {
            int ch = maxDepth(child); 
            height = Math.max(height , ch);
        }
        
        return height + 1;
    }



    // LEETCODE - 653 ______________________________________________________________
    // using hashset and recursion
    public static boolean findTarget1(TreeNode root, int k) 
    {
        HashSet<Integer> set = new HashSet<>();
        return find(root , k , set);
    }
    public static boolean find(TreeNode node , int k , HashSet<Integer> set)
    {
        if(node == null) return false;
        if(set.contains(k - node.val))   return true;
        
        set.add(node.val);
        
        boolean res = false;
        res = res || find(node.left , k , set);
        res = res || find(node.right , k , set);
        
        return res;
    }

    // using HashSet and queue 
    public static boolean findTarget2(TreeNode root, int k) 
    {
        HashSet<Integer> set = new HashSet<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(queue.size() != 0)
        {
            if(queue.peek() != null)
            {
                TreeNode node = queue.remove();
                if(set.contains(k - node.val))
                {
                    return true;
                }
                set.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            else
            {
                queue.remove();
            }
        }
        return false;
    }

    // using BST
    public static boolean findTarget3(TreeNode root, int k) 
    {
        List<Integer> list = new ArrayList<>();
        inorder(root , list);
        
        int i = 0;
        int j = list.size() - 1;
        while(i < j)
        {
            int sum = list.get(i) + list.get(j);
            if(k == sum)
            {
                return true;
            }
            
            if(sum < k)
            {
                i++;        // as we need bigger no.
            }
            else
            {
                j--;        // as we need smaller no.
            }
        }
        return false;
    }
    public static void inorder(TreeNode node , List<Integer> list)
    {
        if(node == null)
        {
            return;
        }
        inorder(node.left , list);
        list.add(node.val);
        inorder(node.right , list);
    }



    // LEETCODE - 538 ____________________________________________________________________
    public static TreeNode convertBST1(TreeNode root) 
    {
        List<TreeNode> list = new ArrayList<>();
        
        inorderTraversal(root , list);
        
        for(int i = list.size() - 2 ; i >= 0 ; i--)
        {
            list.get(i).val += list.get(i+1).val;
        }
        
        return root;
    }
    
    public static void inorderTraversal(TreeNode node , List<TreeNode> list)
    {
        if(node == null)
        {
            return;
        }
        inorderTraversal(node.left , list);
        list.add(node);
        inorderTraversal(node.right , list);
    }

    // using recursion 
    public static int sumBST = 0;
    public static TreeNode convertBST2(TreeNode node) 
    {
        if(node != null)
        {
            convertBST(node.right);
            sumBST += node.val;
            node.val = sumBST;
            convertBST(node.left);
        }
        return node;
    }

    // using Reverse Morris Traversal Algo
    public static TreeNode convertBST(TreeNode node) 
    {
        int sum = 0;
        TreeNode curr = node;
        
        while(curr != null)
        {
            TreeNode nextRight = curr.right;
            if(nextRight == null)
            {
                sum += curr.val;
                curr.val = sum;
                curr = curr.left;
            }
            else
            {
                TreeNode leftMost = leftMostInNextRight(nextRight , curr);
                
                if(leftMost.left == null)
                {
                    leftMost.left = curr;
                    curr = curr.right;
                }
                else
                {
                    leftMost.left = null;
                    sum += curr.val;
                    curr.val = sum;
                    curr = curr.left;
                }
            }
        }
        
        return node;
    }
    public static TreeNode leftMostInNextRight(TreeNode nextRight ,TreeNode curr)
    {
        while(nextRight.left != null && nextRight.left != curr)
        {
            nextRight = nextRight.left;
        }
        
        return nextRight;
    }



}