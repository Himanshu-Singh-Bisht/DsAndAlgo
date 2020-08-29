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


        // LEETCODE - 606 , CONSTRUCT STRING FROM BINARY TREE _____________________________________
        // INPUT : root = [1,2,3,null,4]
        // OUTPUT : "1(2()(4))(3)"
        // System.out.println(tree2str(root));
        // System.out.println(tree2str2(root));



        // LEETCODE - 530 , MINIMUM ABSOLUTE DIFFERENCE IN BST ______________________________________
        // INPUT : root = [543 , 384 , 652 , null , 445 , null , 699]
        // OUTPUT = 47 
        // System.out.println(getMinimumDifference1(root));
        // System.out.println(getMinimumDifference2(root));



        // LEETCODE - 107 , BINARY TREE LEVEL ORDER TRAVERSAL - II ____________________________________
        // INPUT : root = [3,9,20,null,null,15,7]
        // OUTPUT : [[15,7],[9,20],[3]]
        // System.out.println(levelOrderBottom(root));
        // System.out.println(levelOrderBottom2(root));


        // LEETCODE - 100 , SAME TREE _______________________________________________
        // INPUT : p = [1, 2] , q = [1 , null , 2]
        // OUTPUT : false
        // System.out.println(isSameTree(p , q));


        // LEETCODE - 783 , MINIMUM DISTANCE BETWEEN BST NODES_____________________________________________
        // INPUT : root = [4 , 2 ,6 ,1, 3 , null ,null]
        // OUTPUT : 1
        // System.out.println(minDiffInBST(root));


        // LEETCODE - 993 , COUSINS IN BINARY TREE ____________________________________
        // Input : root = [1,2,3,null,4,null,5], x = 5, y = 4
        // Output : true
        // System.out.prnitln(isCousins(root, x, y));
        // System.out.println(isCousins2(root, x, y));



        // LEETCODE - 257 , BINARY TREE PATHS ________________________________________________________
        // Input : root = [1,2,3,null,5]
        // Output : ["1->2->5", "1->3"]
        // System.out.println(binaryTreePaths1(root));
        // System.out.println(binaryTreePaths2(root));



        // LEETCODE - 404 , SUM LEFT LEAVES _______________________________________________________
        // INPUT : root = [3,9,20,null,null,15,7]
        // OUTPUT : 24
        // System.out.println(sumOfLeftLeaves(root));


        // LEETCODE - 235 , LOWEST COMMON ANCESTOR OF A BINARY SEARCH TREE ______________________________
        // INPUT : root = [6,2,8,0,4,7,9,null,null,3,5] , p = 0 , q = 3
        // OUTPUT : 2
        // System.out.println(lowestCommonAncestor(root , p , q));


        // LEETCODE - 101 , SYMMETRIC TREE ______________________________________________
        // INPUT : root = [1,2,2,3,4,4,3]
        // OUTPUT : true
        // System.out.println(isSymmetric(root));
        // System.out.println(isSymmetric2(root));


        // LEETCODE - 572 , SUBTREE OF ANOTHER TREE__________________________________
        // INPUT :  s = [3,4,5,1,2]  ,  t = [4,1,2]
        // OUTPUT : true
        // System.out.println(isSubtree(s, t));
        // System.out.println(isSubtree2(s, t));


        // LEETCODE - 110 , BALANCED BINARY TREE ___________________________________________________
        // Input : root = [3,9,20,null,null,15,7]
        // Output : true
        // System.out.println(isBalanced(root));
        // System.out.println(isBalanced2(root));


        // LEETCODE - 671 , SECOND MINIMUM SMALLEST NODE IN A BINARY TREE ___________________________
        // Input : root = [1 , null , 2 , 2]
        // Output : [2]
        // System.out.println(findMode(root));
        // System.out.println(findMode2(root));


        // LEETCODE - 111 , MINIMUM DEPTH OF BINARY TREE _________________________________________
        // INPUT : root = [3,9,20,null,null,15,7]
        // OUTPUT : 2
        // System.out.println(minDepth(root));


        // LEETCODE - 687 , LONGEST UNIVALUE PATH _________________________________________________
        // Input : root = [1,null,1,1,1,1,1,1]
        // Output : 4 
        // System.out.println(longestUnivaluePath(root));
        // System.out.println(longestUnivaluePath2(root));



        // LEETCODE - 112 , PATH SUM _________________________________________________________
        // INPUT : root = [5,4,8,11,null,13,4,7,2,null,null,null,1] , sum = 22
        // Output = true
        // System.out.println(hasPathSum(root, sum));
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



    // LEETCODE - 606 ________________________________________________________
    // using recursion
    public static String tree2str(TreeNode node) 
    {
        if(node == null)
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(node.val + "");
        
        if(node.left != null && node.right != null)
        {
            sb.append("(" + tree2str(node.left) + ")(" + tree2str(node.right) + ")");
        }
        else if(node.left != null)
        {
            sb.append("(" + tree2str(node.left) + ")");
        }
        else if(node.right != null)
        {
            sb.append("()(" + tree2str(node.right) + ")");
        }
        
        return sb.toString();
    }

    // using stack
    public static String tree2str2(TreeNode node) 
    {
        if(node == null)
        {
            return "";
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(node);
        
        StringBuilder sb = new StringBuilder();
        
        HashSet<TreeNode> vis = new HashSet<>();
        while(st.size() > 0)
        {
            node = st.peek();
            if(vis.contains(node))
            {
                st.pop();
                sb.append(")");
            }
            else
            {
                vis.add(node);
                sb.append("(" + node.val);
                if(node.left == null && node.right != null)
                {
                    sb.append("()");
                }
                if(node.right != null)
                {
                    st.push(node.right);
                }
                if(node.left != null)
                {
                    st.push(node.left);
                }
            }
        }
        
        return sb.substring(1 , sb.length() - 1).toString();
    }



    // LEETCODE - 530 ______________________________________________________________
    public static int getMinimumDifference1(TreeNode node) 
    {
        traverseToFindMinDiff(node);
        return diff;
    }
    
    public static int diff = Integer.MAX_VALUE;
    public static void traverseToFindMinDiff(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        if(node.left != null)
        {
            TreeNode temp = node.left;
            TreeNode t = rightMostLeftNode(temp);
            diff = Math.min(diff , node.val - t.val);
            traverseToFindMinDiff(node.left);
        }
        if(node.right != null)
        {
            TreeNode temp = node.right;
            TreeNode t = leftMostRightNode(temp);
            diff = Math.min(diff , t.val - node.val);
            traverseToFindMinDiff(node.right);
        }
    }
    
    
    public static TreeNode rightMostLeftNode(TreeNode leftNode)
    {
        while(leftNode.right != null)
        {
            leftNode = leftNode.right;
        }
        return leftNode;
    }
    
    public static TreeNode leftMostRightNode(TreeNode rightNode)
    {
        while(rightNode.left != null)
        {
            rightNode = rightNode.left;
        }
        return rightNode;
    }

    // using inorder traversal and to store the previous value in BST tree inorder
    public int min = Integer.MAX_VALUE;
    public Integer prev = null;
    public int getMinimumDifference2(TreeNode node) 
    {
        if(node == null)
        {
            return min;
        }
        
        getMinimumDifference(node.left);
        
        if(prev != null)
        {
            min = Math.min(min , node.val - prev);
        }
        prev = node.val;
        
        getMinimumDifference(node.right);
        return min;
    }



    // LEETCODE - 107 _______________________________________________________________
    public static List<List<Integer>> levelOrderBottom(TreeNode node) 
    {
        if(node == null)
        {
            return new ArrayList<>();
        }
        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(node);
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        while(que.size() != 0)
        {
            int size = que.size();
            List<Integer> temp = new ArrayList<Integer>();
            while(size != 0)
            {
                node = que.remove();
                temp.add(node.val);
                if(node.left != null)
                {
                    que.add(node.left);    
                }
                if(node.right != null)
                {
                    que.add(node.right);
                }
                size--;
            }
            
            list.add(temp);
        }
        
        Collections.reverse(list);
        return list;
    }


    // using the recursion 
    public static List<List<Integer>> levelOrderBottom2(TreeNode node) 
    {
        if(node == null)
        {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        levelMaker(node , 0 , list);
        
        return list;
    }
    
    public static void levelMaker(TreeNode node , int level , List<List<Integer>> list)
    {
        if(node == null)
        {
            return;
        }
        
        if(level >= list.size())
        {
            list.add(0 , new ArrayList<>());
        }
        
        levelMaker(node.left , level + 1 , list);
        levelMaker(node.right , level + 1 , list);
        list.get(list.size() - 1 - level).add(node.val);
    }


    // LEETCODE - 100 ___________________________________________________________
    public static boolean isSameTree(TreeNode p, TreeNode q) 
    {
        if(p == null || q == null)
        {
            if(p == null && q == null)
            {
                return true;
            }
            return false;
        }
        if(p.val != q.val)
        {
            return false;
        }
        
        boolean res = true;
        res = res && isSameTree(p.left , q.left);
        res = res && isSameTree(p.right ,q.right);
        
        return res;
    }



    // LEETCODE - 783 _____________________________________________________________
    public static Integer minDiff = Integer.MAX_VALUE;
    public static Integer prevNode = null;
    public static int minDiffInBST(TreeNode node)
    {   
        if(node == null)
        {
            return minDiff;
        }
        
        minDiffInBST(node.left);
        if(prevNode != null)
        {
            minDiff = Math.min(minDiff , node.val - prevNode);
        }
        
        prevNode = node.val;
        minDiffInBST(node.right);
        
        return minDiff;
    }


    // LEETCODE - 993 _______________________________________________________________
    public static boolean isCousins(TreeNode node, int x, int y) 
    {
        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(node);
        
        while(que.size() > 0)
        {
            int size = que.size();
            HashSet<Integer> set = new HashSet<>();
            
            while(size > 0)
            {
                node = que.remove();
                if((node.left != null && node.right != null) && 
                    (node.left.val == x || node.right.val == x )&& (node.left.val == y || node.right.val == y))
                {
                    return false;
                }
                
                if(node.left != null)
                {
                    que.add(node.left);
                }
                if(node.right != null)
                {
                    que.add(node.right);
                }
                set.add(node.val);
                
                size--;
            }
            
            if(set.contains(x) && set.contains(y))
            {
                return true;
            }
        }
        
        return false;
    }



    public static HashMap<Integer , DataNode> mapCousins = new HashMap<>();
    
    public static boolean isCousins2(TreeNode node, int x, int y) 
    {
        traverse(node , x, y , null , 0);
        if(mapCousins.get(x).depth == mapCousins.get(y).depth  && 
          mapCousins.get(x).parent != mapCousins.get(y).parent)
        {
            return true;
        }
        return false;
    }   
    
    public static class DataNode
    {
        private Integer parent;
        private int depth;
        
        public DataNode(Integer parent , int depth)
        {
            this.parent = parent;
            this.depth = depth;
        }
    }
    
    public static void traverse(TreeNode node , int x, int y, Integer parent , int depth)
    {
        if(node == null || mapCousins.size() == 2)
        {
            return;
        }
        
        if(node.val == x || node.val == y)
        {
            mapCousins.put(node.val , new DataNode(parent , depth));
        }
        
        traverse(node.left , x , y , node.val , depth + 1);
        traverse(node.right , x , y, node.val , depth + 1);
    }



    // LEETCODE - 257 ______________________________________________________________________
    public static List<String> binaryTreePaths1(TreeNode node)
    {
        List<String> list = new ArrayList<String>();
        
        if(node == null)
        {
            return list;
        }
        if(node.left == null && node.right == null)
        {
            list.add(Integer.toString(node.val) + "");
            return list;
        }
        
        for(String s : binaryTreePaths(node.left))
        {
            list.add(node.val + "->" + s);
        }
        
        for(String s : binaryTreePaths(node.right))
        {
            list.add(node.val + "->" + s);
        }
        
        return list;
    }



    public static List<String> binaryTreePaths2(TreeNode node)
    {
        List<String> list = new ArrayList<>();
        if(node == null)
        {
            return list;
        }
        
        StringBuilder sb = new StringBuilder();
        recursionBinaryTreePaths(node , sb , list);
        return list;
    }
    
    public static void recursionBinaryTreePaths(TreeNode node , StringBuilder sb , List<String> list)
    {
        if(node == null)
        {
            return;
        }
        
        int len = sb.length();
        sb.append(node.val);
        if(node.left == null && node.right == null)
        {
            list.add(sb.toString());
        }
        else
        {
            sb.append("->");
            recursionBinaryTreePaths(node.left , sb , list);
            recursionBinaryTreePaths(node.right , sb , list);
        }
        sb.setLength(len);      // used for deleting characters added to the StringBuilder
    }



    // LEETCODE - 404 ______________________________________________
    public static int sumLeftLeaves = 0;    
    public static int sumOfLeftLeaves(TreeNode node) 
    {
        if(node == null)
        {
            return sum;
        }
        
        calls(node , null);
        return sum;
    }
    
    public static void calls(TreeNode node , TreeNode prev)
    {
        if(node == null)
        {
            return;
        }
        if(node.left == null && node.right == null)
        {
            if(prev != null && node == prev.left)
            {
                sum += node.val;
            }
        }
        
        prev = node;
        calls(node.left , prev);
        calls(node.right , prev);
    }



    // LEETCODE = 235 ________________________________________________________________
    public static TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) 
    {
        while(node != null)
        {
            if(p.val < node.val && q.val < node.val)
            {
                node = node.left;
            }
            else if(p.val > node.val && q.val > node.val)
            {
                node = node.right;
            }
            else
            {
                break;
            }
        }
        
        return node;
    }



    // LEETCODE - 101 , SYMMETRIC TREE___________________________________________________
    public static boolean isSymmetric(TreeNode node) 
    {
        if(isMirror(node , node))
            return true;
        return false;
    }
    
    public static boolean isMirror(TreeNode node1 , TreeNode node2)
    {
        if(node1 == null || node2 == null)
        {
            if(node1 == null && node2 == null)
            return true;
            
            return false;
        }
        if(node1.val != node2.val)
        {
            return false;
        }
        
        if(isMirror(node1.left , node2.right) && isMirror(node1.right , node2.left))
        {
            return true;
        }
        
        return false;
    }


    public static boolean isSymmetric2(TreeNode node) 
    {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(node);
        que.add(node);
        
        while(que.size() != 0)
        {
            TreeNode node1 = que.remove();
            TreeNode node2 = que.remove();
            
            if(node1 == null && node2 == null)
            {
                continue;
            }
            if(node1 == null || node2 == null)
            {    
                return false;
            }
            
            if(node1.val != node2.val)
            {
                return false;
            }
            
            que.add(node1.left);
            que.add(node2.right);
            que.add(node1.right);
            que.add(node2.left);
        }
        
        return true;
    }



    // LEETCODE - 572 __________________________________________________________________________
    public static boolean isSubtree(TreeNode s, TreeNode t) 
    {
        String tree1 = preorder(s , true);
        String tree2 = preorder(t , true);
        
        return tree1.contains(tree2);
    }
    
    public static String preorder(TreeNode node , boolean left)
    {
        if(node == null)
        {
            if(left)
            {
                return "lnull";
            }
            else
            {
                return "rnull";
            }
        }
        return "#" + node.val + " " + preorder(node.left , true) +" "+ preorder(node.right , false);   
    }



    public static boolean isSubtree2(TreeNode s, TreeNode t) 
    {
        return traverse(s , t);
    }
    
    public static boolean traverse(TreeNode s , TreeNode t)
    {
        return s != null && (equals(s , t)  || traverse(s.left , t) || traverse(s.right , t));
    }
    
    public static boolean equals(TreeNode x , TreeNode y)
    {
        if(x == null && y == null)
        {
            return true;
        }
        if(x == null || y == null)
        {
            return false;
        }
        return (x.val == y.val) && equals(x.left , y.left) && equals(x.right , y.right);
    }



    // LEETCODE - 110 _______________________________________________________________________
    public static boolean isBalanced(TreeNode node) 
    {
        if(node == null)
        {
            return true;
        }
        
        int lDepth = height(node.left);
        int rDepth = height(node.right);
        
        return Math.abs(lDepth - rDepth) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }
    public static int height(TreeNode node)
    {
        if(node == null)
        {
            return -1;
        }
        
        int left = height(node.left);
        int right = height(node.right);
        
        return Math.max(left , right) + 1;
    }


    public static boolean isBalanced2(TreeNode node) 
    {
        return recursionBalanced(node) != -1;
    }
    public static int recursionBalanced(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
        
        int left = recursionBalanced(node.left);
        if(left == -1)
        {
            return -1;
        }
        int right = recursionBalanced(node.right);
        if(right == -1)
        {
            return -1;
        }
        
        if(Math.abs(left - right) > 1)
        {
            return -1;
        }
        
        return Math.max(left , right) + 1;
    }


    // LEETCODE - 671 __________________________________________________________________
    public static long smallest = Long.MAX_VALUE;
    public static long secondSmallest = Long.MAX_VALUE;
    
    public static int findSecondMinimumValue(TreeNode node)
    {
        setSmallestAndSecondSmallest(node);
        return secondSmallest < Long.MAX_VALUE ? (int)secondSmallest : -1;
    }
    
    public static void setSmallestAndSecondSmallest(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        
        if(node.val < smallest)
        {
            secondSmallest = smallest;
            smallest = node.val;
        }
        else if(node.val < secondSmallest && node.val > smallest)
        {
            secondSmallest = node.val;
        }
        
        setSmallestAndSecondSmallest(node.left);
        setSmallestAndSecondSmallest(node.right);
    }



    // LEETCODE - 501 _____________________________________________________________________________
    private static Map<Integer, Integer> map= new HashMap<>();
    private static int max = 1;
    
    public static int[] findMode(TreeNode root) 
    {
        if(root == null)
        {
            return new int[0];
        }
        
        makeHashMap(root);
        int result[] = new int[map.size()];     // max size of the ans array
        int i = 0;
        for(Integer k: map.keySet())
        {
            if(map.get(k) == max)
            {
                result[i++] = k;
            }
        }
        return Arrays.copyOf(result, i);        // means the array only upto i index
    }
    
    private static void makeHashMap(TreeNode node)
    {
        if(node != null)
        {
            if(map.containsKey(node.val))
            {
                int count = map.get(node.val) + 1;
                map.put(node.val, map.get(node.val) + 1);
                max = Math.max(max, count);
            }
            else
            {
                map.put(node.val, 1);
            }
            
            makeHashMap(node.left);
            makeHashMap(node.right);
        }
    }


    // using BST property and O(1) space
    public static ArrayList<Integer> list = new ArrayList<>();
    public static  int maxNode = 0;
    public static int curr;
    public static TreeNode prevNode1;
    
    public static int[] findMode2(TreeNode root) 
    {
        makingArrayList(root);
        
        int[] ans = new int[list.size()];
        for(int i = 0 ; i < ans.length ; i++)
        {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
    
    public static void makingArrayList(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        
        makingArrayList(node.left);
        
        curr = (prevNode1 == null ? 1 : (prevNode1.val == node.val ? curr + 1 : 1));
        
        if(curr > maxNode)
        {
            maxNode = curr;
            list.clear();   // tp remove all elements
            list.add(node.val);
        }
        else if(curr == maxNode)
        {
            list.add(node.val);
        }
        
        prevNode1 = node;
        makingArrayList(node.right);
    }


    // LEETCODE - 111 _____________________________________________________________________
    public static int minDepth(TreeNode node) 
    {
        if(node == null)
        {
            return 0;
        }
        
        int left = minDepth(node.left);
        int right = minDepth(node.right);
        
        return (left == 0 || right == 0) ? (left + right + 1) : Math.min(left , right) + 1;
    }


    // LEETCODE - 687 ____________________________________________________________________
    public static int maxUnivaluePath = 0;
    public static int longestUnivaluePath(TreeNode root) 
    {
        int[] rvalue = recursionForUnivaluePath(root);
        
        return maxUnivaluePath;
    }
    
    public static int[] recursionForUnivaluePath(TreeNode node)
    {
        if(node == null)
        {
            return new int[]{0 , -1};
        }
        
        int[] left = recursionForUnivaluePath(node.left);
        int[] right = recursionForUnivaluePath(node.right);
        
        int[] ans = new int[2];
        if(left[1] == node.val && right[1] == node.val)
        {
            ans[1] = node.val;
            ans[0] = Math.max(left[0] , right[0]) + 1;
            maxUnivaluePath = Math.max(maxUnivaluePath , left[0] + right[0]);
        }
        else if(left[1] == node.val || right[1] == node.val)
        {
            ans[1] = node.val;
            ans[0] = (left[1] == node.val ? left[0] : right[0]) + 1;
            maxUnivaluePath = Math.max(maxUnivaluePath , ans[0] - 1);
        }
        else
        {
            ans[0] = 1;
            ans[1] = node.val;
        }
        
        return ans;
    }


    public static int ansUnivaluePath = 0;
    public static int longestUnivaluePath2(TreeNode root) 
    {
        recursion(root);
        return ansUnivaluePath;
    }
    
    public static int recursion(TreeNode node)
    {
        if(node == null) 
        {
            return 0;
        }
        
        int l = recursion(node.left);
        int r = recursion(node.right);
        
        int ansleft = 0;
        int ansright = 0;
        
        if(node.left != null && node.left.val == node.val)
        {
            ansleft += l + 1;    
        }
        if(node.right != null && node.right.val == node.val)
        {
            ansright += r + 1;
        }
        
        ansUnivaluePath = Math.max(ansUnivaluePath ,ansleft + ansright);
        return Math.max(ansleft , ansright);
    }


    // LEETCODE - 112 ___________________________________________________________
    public static boolean hasPathSum(TreeNode node, int sum) 
    {
        if(node == null)
        {
            return false;
        }
        
        if(node.left == null && node.right == null)
        {
            sum -= node.val;
            if(sum == 0)
            {
                return true;
            }
        }
        
        boolean res = false;
        
        res = res || hasPathSum(node.left , sum - node.val);
        res = res || hasPathSum(node.right , sum - node.val);
        
        return res;
    }
}