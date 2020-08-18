import java.util.Scanner;
import java.util.Stack;
import java.rmi.Remote;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;

public class gt1
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
}