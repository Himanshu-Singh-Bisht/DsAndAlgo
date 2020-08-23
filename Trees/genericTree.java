import java.util.Scanner;
import java.util.Stack;
import java.rmi.Remote;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;

public class genericTree
{
    public static class Node
    {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node()
        {

        }
        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {10 , 20 , 50 , -1 , 60 , -1 , -1 , 30 , 70 , -1 , 80 , 110 , -1 , 120 , -1 , -1 ,
                     90 , -1 , -1 , 40 , 100 , -1 , -1 , -1};
        Node root = createGenericTree(arr);
        // display(root);

        // System.out.println(sizeOfGenericTree(root));

        // System.out.println(maximumOfGenericTree(root));

        // System.out.println(heightOfGenericTree(root));

        // System.out.println(find(root, 80));

        // traversal(root);     // euler path
        // traversalLevelWise(root);       // euler path

        // TRAVERSAL ___________________________________________________
        // levelOrderTraversal1(root);
        // levelOrderTraversal2(root);
        // levelOrderTraversal3(root);
        // levelOrderTraversal4(root);


        // levelOrderTraversalZigZag(root);

        // mirrorImage(root);
        // display(root);

        // removeLeavesFromGenericTree(root);
        // display(root);

        // LINEARIZE THE GENERIC TREE _____________________________________
        // linearize1(root);
        // linearize2(root);
        // display(root);


        // ROOT TO NODE PATH ____________________________________________________
        // ArrayList<Integer> list = rootToNodePath(root , 80);
        // System.out.println(list);

        // LCA ________________________________________________________
        // System.out.println(LCA(root , 110 , 90));

        // DISTANCE BETWEEN TWO NODES ________________________________________________
        // System.out.println(distanceBetweenTwoNodes(root, 70 , 100));

        
        // ARE TREES SIMILAR IN SHAPE ___________________________________________________
        // int[] arr2 = {100 , 200 , 500 , -1 , 600 , -1 , -1 , 300 , 700 , -1 , 800 , 1100 , -1 , 1200 , -1 , -1 ,
        //     900 , -1 , -1 , 400 , 1000 , -1 , -1 , -1};
        // Node root2 = createGenericTree(arr2);
        // System.out.println(areTreesSimilar(root, root2));


        // ARE TREES MIRROR IN SHAPE ___________________________________________________
        // int[] arr3 = {100 , 400 , 1000 , -1 , -1 , 300 , 900 , -1 , 800 , 1100 , -1 , 1200 , -1 , -1 , 900 , -1,
        //                 -1 , 200 , 500 , -1 , 600 , -1 , -1 , -1};
        // Node root3 = createGenericTree(arr3);
        // System.out.println(areTreesMirrorInShape(root , root3));


        // IS TREE SYMMETRIC ____________________________________________________
        // System.out.println(isSymmetric(root));


        // MULTISOLVER _____________________________________________________
        // size = 0;
        // min = Integer.MAX_VALUE;
        // max = Integer.MIN_VALUE;
        // height = -1;
        // multisolver(root , 0);
        // System.out.println(size + " " + min + " " + max + " " + height);


        // PREDECESOR AND SUCCESSOR ________________________________________________
        // predecessor = null;
        // successor = null;
        // state = 0;
        // predecessorAndSuccessor(root, 90);
        // System.out.println(predecessor.data + " " + successor.data);


        // CEIL AND FLOOR __________________________________________________________
        // ceil = Integer.MAX_VALUE;
        // floor = Integer.MIN_VALUE;
        // ceilAndFloor(root, 60);
        // System.out.println(ceil + " " + floor);


        // KTH LARGEST ELEMENT __________________________________________________
        // System.out.println(kthLargestElement(root , 3));


        // NODE WITH MAXIMUM SUBTREE SUM _______________________________________________
        // maximumSumSubtree(root);
        // System.out.println(maximumSumNode.data +" @ " + maximumSum);


        // DIAMETER OF THE GENERIC TREE ________________________________________
        // calculateDiameterReturnHeight(root);
        // System.out.println(dia);


        // ITERATIVE PREORDER AND POSTORDER TRAVERSAL ______________________________________________
        // iterativePreorderAndPostorder(root);


        // ITERABLE AND ITERATOR _____________________________________________________
        GenericTree gtree = new GenericTree(root);
        // for(int val : gtree)
        // {
        //     System.out.print(val + " ");
        // }

        Iterator<Integer> gt = gtree.iterator();
        while(gt.hasNext())
        {
            System.out.print(gt.next() + " ");
        }
    }


    // CREATE GENERIC TREE _________________________________________
    public static Node createGenericTree(int[] arr)
    {
        Node root = null;
        Stack<Node> st = new Stack<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == -1)
            {
                st.pop();
            }
            else
            {
                Node node = new Node(arr[i]);
                if(st.size() != 0)
                {
                    st.peek().children.add(node);
                }
                else
                {
                    root = node;
                }
                st.push(node);
            }
        }

        return root;
    }
    
    
    public static void display(Node node)
    {
        String str = node.data + " -> ";
        for(Node child : node.children)
        {
            str += child.data + " , ";
        }
        str += ".";
        System.out.println(str);

        for(Node child : node.children)
        {
            display(child);
        }
    }


    // SIZE OF GENERIC TREE __________________________________
    public static int sizeOfGenericTree(Node node)
    {
        int size = 0;
        for(Node child : node.children)
        {
            int csize = sizeOfGenericTree(child);
            size += csize;
        }
        return size + 1;
    }


    // MAXIMUM OF GENERIC TREE __________________________________
    public static int maximumOfGenericTree(Node node)
    {
        int max = Integer.MIN_VALUE;
        for(Node child : node.children)
        {
            int cmax = maximumOfGenericTree(child);
            max = Math.max(cmax , max);
        }
        return Math.max(max , node.data);
    }


    // HEIGHT OF GENERIC TREE __________________________________
    public static int heightOfGenericTree(Node node)
    {
        int h = -1;
        for(Node child : node.children)
        {
            int ch = heightOfGenericTree(child);
            h = Math.max(h , ch);
        }

        return h + 1;
    }


    // FIND A NODE IN GENERIC TREE ____________________________
    public static boolean find(Node node , int data)
    {
        if(node.data == data)
        {
            return true;
        }

        boolean res = false;
        for(Node child : node.children)
        {
            res = res || find(child, data);
        }
        return res;
    }


    // TRAVERSAL IN GENERIC TREE ____________________________________________________
    public static void traversal(Node node)
    {
        System.out.println("Node Pre - " + node.data);
        
        for(Node child : node.children)
        {
            System.out.println("Edge Pre - "  + node.data + "--" + child.data);
            traversal(child);
            System.out.println("Edge Post - " + node.data + "--" + child.data);
        }

        System.out.println("Node Post - " + node.data);
    }

    public static void traversalLevelWise(Node node)
    {
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        while(q.size() > 0)
        {
            node = q.remove();
            System.out.print(node.data + " ");

            for(Node child : node.children)
            {
                q.add(child);
            }
        }
    }

    // LEVEL ORDER TRAVERSAL LINEWISE OF GENERIC TREE ________________________________________

    // using main and child queue
    public static void levelOrderTraversal1(Node node)
    {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        Queue<Node> cq = new ArrayDeque<>();
        while(mq.size() > 0)
        {
            node = mq.remove();
            System.out.print(node.data + " ");

            for(Node child : node.children)
            {
                cq.add(child);
            }

            if(mq.size() == 0)
            {
                mq = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    // using only main Queue and using delimiter to change the line
    public static void levelOrderTraversal2(Node node)
    {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);
        mq.add(new Node(-1));

        while(mq.size() > 0)
        {
            node = mq.remove();

            if(node.data == -1)
            {
                System.out.println();
                if(mq.size() != 0)
                {
                    mq.add(new Node(-1));
                }
            }
            else
            {
                System.out.print(node.data + " ");
                for(Node child : node.children)
                {
                    mq.add(child);
                }
            }
        }
    }

    // using main queue and counting the no. of nodes in a level
    public static void levelOrderTraversal3(Node node)
    {
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(node);

        while(mq.size() != 0)
        {
            int size = mq.size();
            while(size != 0)
            {
                node = mq.remove();
                System.out.print(node.data + " ");

                for(Node child : node.children)
                {
                    mq.add(child);
                }
                size--;
            }
            System.out.println();
        }
    }

    // using pair class storing node and the level
    public static class Pair
    {
        Node node = null;
        int level = 0;

        public Pair()
        {

        }
        public Pair(Node node , int level)
        {
            this.node = node;
            this.level = level;
        }
    }

    public static void levelOrderTraversal4(Node node)
    {
        Queue<Pair> mq = new ArrayDeque<>();
        mq.add(new Pair(node , 0));

        int level = 0;
        while(mq.size() != 0)
        {
            Pair rpair = mq.remove();
            if(rpair.level > level)
            {
                level = rpair.level;
                System.out.println();
            }
                    
            System.out.print(rpair.node.data  +  " ");
            for(Node child : rpair.node.children)
            {
                Pair t = new Pair(child , rpair.level + 1);
                mq.add(t);
            }
        }
    }


    

    // LEVEL ORDER TRAVERSAL ZIG ZAG ______________________________________________________________
    public static void levelOrderTraversalZigZag(Node node)
    {
        Stack<Node> mst = new Stack<>();
        mst.push(node);

        Stack<Node> cst = new Stack<>();
        int level = 0;
        while(mst.size() > 0)
        {
            node = mst.pop();
            System.out.print(node.data + " ");

            if(level % 2 == 0)      // L to R
            {
                for(int i = 0 ; i < node.children.size() ; i++)
                {
                    cst.push(node.children.get(i));
                }
            }
            else
            {
                for(int i = node.children.size() - 1 ; i >= 0 ; i--)
                {
                    cst.push(node.children.get(i));
                }
            }

            if(mst.size() == 0)
            {
                mst = cst;
                cst = new Stack<>();
                level++;
                System.out.println();
            }
        }
    }



    // MIRROR IMAGE OF A GENERIC TREE ____________________________________________
    public static void mirrorImage(Node node)
    {
        for(Node child : node.children)
        {
            mirrorImage(child);
        }

        Collections.reverse(node.children);
    }



    // REMOVING LEAVES FROM THE GENERIC TREE _____________________________________________
    public static void removeLeavesFromGenericTree(Node node)
    {
        for(int i = node.children.size() - 1 ; i >= 0 ; i--)
        {
            Node child = node.children.get(i);          // do it in pre region (not in post region)
            if(child.children.size() == 0)
            {
                node.children.remove(i);
            }
            removeLeavesFromGenericTree(child);
        }
    } 


    // LINEARIZE THE GENERIC TREE _______________________________________________________
    public static void linearize1(Node node)        // O(n^2)
    {
        for(Node child : node.children)
        {
            linearize1(child);
        }

        while(node.children.size() > 1)
        {
            Node lc = node.children.remove(node.children.size() - 1);   // last
            Node slc = node.children.get(node.children.size() - 1);  // second last

            Node secondLastNodeTail = getTail(slc);

            secondLastNodeTail.children.add(lc);
        }
    }

    public static Node getTail(Node node)
    {
        while(node.children.size() >= 1)
        {
            node = node.children.get(0);
        }
        return node;
    }


    public static Node linearize2(Node node)            // O(n)
    {
        if(node.children.size() == 0)
        {
            return node;
        }
        Node lkt = linearize2(node.children.get(node.children.size() - 1));

        while(node.children.size() > 1)
        {
            Node last = node.children.remove(node.children.size() - 1);
            Node sl = node.children.get(node.children.size() - 1);  // second last
            Node secondLastTail = linearize2(sl);
            secondLastTail.children.add(last);
        }

        return lkt;
    }


    // ROOT TO NODE PATH _______________________________________________
    public static ArrayList<Integer> rootToNodePath(Node node , int data)
    {
        if(node.data == data)
        {
            ArrayList<Integer> base = new ArrayList<>();
            base.add(node.data);
            return base;
        }

        for(Node child : node.children)
        {
            ArrayList<Integer> cl = rootToNodePath(child, data);
            if(cl.size() != 0)
            {
                cl.add(node.data);
                return cl;
            }
        }

        return new ArrayList<>();
    }

    // LCA ___________________________________
    public static int LCA(Node node , int data1 , int data2)
    {
        ArrayList<Integer> list1 = rootToNodePath(node, data1);
        ArrayList<Integer> list2 = rootToNodePath(node, data2);

        int i = list1.size() - 1;
        int j = list2.size() - 1;

        while(i >= 0 && j >= 0)
        {
            if(list1.get(i) != list2.get(j))
            {
                break;
            }
            i--;
            j--;
        }

        i++;
        j++;

        return list1.get(i);
    }


    // DISTANCE BETWEEN TWO NODES ____________________________________________________
    public static int distanceBetweenTwoNodes(Node root , int data1 , int data2)
    {
        ArrayList<Integer> list1 = rootToNodePath(root, data1);
        ArrayList<Integer> list2 = rootToNodePath(root, data2);

        int i = list1.size() - 1;
        int j = list2.size() - 1;

        while(i >= 0 && j >= 0)
        {
            if(list1.get(i) != list2.get(j))
            {
                break;
            }
            i--;
            j--;
        }
        i++;
        // j++;
        return i + j;
    }


    // ARE TREES SIMILAR IN SHAPE _________________________________
    public static boolean areTreesSimilar(Node node1 , Node node2)
    {
        if(node1.children.size() != node2.children.size())
        {
            return false;
        }

        for(int i = 0 ; i < node1.children.size() ; i++)
        {
            Node c1 = node1.children.get(i);
            Node c2 = node2.children.get(i);

            if(!areTreesSimilar(c1 , c2))
            {
                return false;
            }
        }

        return true;
    }

    // ARE TREES MIRROR IN SHAPE ____________________________________________
    public static boolean areTreesMirrorInShape(Node node1 , Node node2)
    {
        if(node1.children.size() != node2.children.size())
        {
            return false;
        }

        for(int i = 0 ; i < node1.children.size() ; i++)
        {
            int j = node1.children.size() - 1 - i;
            Node c1 = node1.children.get(i);
            Node c2 = node2.children.get(j);
            if(!areTreesMirrorInShape(c1 , c2))
            {
                return false;
            }
        }
        return true;
    }

    
    // IS SYMMETRIC TREE _____________________________________
    public static boolean isSymmetric(Node node)
    {
        return areTreesMirrorInShape(node, node);
    }


    // MULTISOLVER ____________________________________________
    static int size;
    static int min;
    static int max;
    static int height;
    public static void multisolver(Node node , int depth)
    {
        size++;
        min = Math.min(min , node.data);
        max = Math.max(max , node.data);
        height = Math.max(height , depth);
        for(Node child : node.children)
        {
            multisolver(child, depth + 1);
        }
    } 


    // PREDECESSOR AND SUCCESSOR ______________________________________________
    static Node predecessor;
    static Node successor;
    static int state;
    public static void predecessorAndSuccessor(Node node , int data)
    {
        if(state == 0)
        {
            if(node.data == data)
            {
                state = 1;
            }
            else
            {
                predecessor = node;
            }
        }
        else if(state == 1)
        {
            successor = node;
            state = 2;
        }


        for(Node child : node.children)
        {
            predecessorAndSuccessor(child, data);
        }
    }


    // CEIL AND FLOOR _____________________________________________________
    static int ceil;
    static int floor;
    public static void ceilAndFloor(Node node , int data)
    {
        if(node.data > data)
        {
            ceil = Math.min(ceil , node.data);
        }
        else if(node.data < data)
        {
            floor = Math.max(floor , node.data);
        }

        for(Node child : node.children)
        {
            ceilAndFloor(child, data);
        }
    }


    // KTH LARGEST ELEMENT ______________________________________________
    public static int kthLargestElement(Node node , int k)
    {
        floor = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;

        for(int i = 0 ; i < k ; i++)
        {
            ceilAndFloor(node, ans);        // will set floor
            ans = floor;
            floor = Integer.MIN_VALUE;
        }

        return ans;
    }


    // NODE WITH MAXIMUM SUBTREE SUM __________________________________________
    static int maximumSum = Integer.MIN_VALUE;
    static Node maximumSumNode = null;
    public static int maximumSumSubtree(Node node)
    {
        int sum = 0;
        
        for(Node child : node.children)
        {
            sum += maximumSumSubtree(child);
        }

        sum += node.data;
        if(maximumSum < sum)
        {
            maximumSum = sum;
            maximumSumNode = node;
        }

        return sum;
    }


    // DIAMETER OF A GENERIC TREE__________________________________________
    static int dia = 0;
    public static int calculateDiameterReturnHeight(Node node)
    {
        int lch = -1;   // longest child height
        int slch = -1;  // second longest child height

        for(Node child : node.children)
        {
            int ch = calculateDiameterReturnHeight(child);

            if(ch > lch)
            {
                slch = lch;
                lch = ch;
            }
            else if(ch > slch)
            {
                slch = ch;
            }
        }
        if(lch + slch + 2 > dia)
        {
            dia = lch + slch + 2;
        }
        return lch + 1;        
    }


    // ITERATIVE PREORDER AND POSTORDER TRAVERSAL ______________________________________________
    public static class Pair 
    {
        Node node = null;
        int state = -1;

        public Pair(Node node , int state)
        {
            this.node = node;
            this.state = state;
        }
    }

    public static void iterativePreorderAndPostorder(Node node)
    {
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(node , -1));

        StringBuilder pre = new StringBuilder();
        StringBuilder post = new StringBuilder();

        while(st.size() != 0)
        {   
            Pair top = st.peek();
            if(top.state == -1)  // start 
            {
                pre.append(top.node.data + " ");
                top.state++;
            }
            else if(top.state == top.node.children.size())
            {
                post.append(top.node.data + " ");
                st.pop();
            }
            else
            {
                Pair p = new Pair(top.node.children.get(top.state) , -1);
                st.push(p);
                top.state++;
            }
        }

        System.out.println("Preoder - " + pre);
        System.out.println("Postorder - " + post);
    }


    // ITERABLE AND ITERATOR __________________________________________________________
    public static class GenericTree implements Iterable<Integer>
    {
        Node root;
        public GenericTree(Node root)
        {
            this.root = root;
        }

        @Override
        public Iterator<Integer> iterator() 
        {
            Iterator<Integer> obj = new GTPreorderIterator(root);    
            return obj;
        }
    }


    public static class GTPreorderIterator implements Iterator<Integer>
    {
        Integer nextVal;
        Stack<Pair> st;
        public GTPreorderIterator(Node root)
        {
            st = new Stack<>();
            st.push(new Pair(root , -1));
            next();
        }

        public boolean hasNext()
        {
            if(nextVal == null)
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        public Integer next()
        {
            Integer fr = nextVal;
            nextVal = null;

            while(st.size() != 0)
            {
                Pair top = st.peek();
                if(top.state == -1)  // start 
                {
                    nextVal = top.node.data;
                    top.state++;
                    break;
                }
                else if(top.state == top.node.children.size())
                {
                    st.pop();
                }
                else
                {
                    Pair p = new Pair(top.node.children.get(top.state) , -1);
                    st.push(p);
                    top.state++;
                } 
            }

            return fr;
        }
    }
}