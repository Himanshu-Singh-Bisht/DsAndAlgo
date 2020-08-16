import java.util.Scanner;
import java.util.ArrayList;

public class avl
{
    public static class Node
    {
        int data;
        Node left = null;
        Node right = null;

        int height = -1;        // height
        int bal = 0;            // balance factor

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
            str += left != null ? left.data : ".";
            str += " -> " + data + " <- ";
            str += right != null ? right.data : ".";
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
        Node root = null;
        for(int i = 0 ; i < 10 ; i++)
        {
            root = addNodeAVL(root , (i + 1) * 10);
        }

        root = removeNodeAVL(root, 10);
        root = removeNodeAVL(root, 20);
        root = removeNodeAVL(root, 30);
        System.out.println(root);
    }


    // UPDATING THE HEIGHT AND BALANCE FACTOR   ______________________________________________________
    public static void updateHeightAndBalance(Node node)
    {
        int lh = -1;
        int rh = -1;

        if(node.left != null)
        {
            lh = node.left.height;
        }
        if(node.right != null)
        {
            rh = node.right.height;
        }

        node.height = Math.max(lh , rh) + 1;
        node.bal = lh - rh;
    }

    // LL 
    public static Node ll(Node x)
    {
        Node y = x.left;
        Node yright = y.right;

        y.right = x;
        x.left = yright;

        updateHeightAndBalance(x);
        updateHeightAndBalance(y);

        return y;
    }


    // RR
    public static Node rr(Node x)
    {
        Node y = x.right;
        Node yleft = y.left;

        y.left = x;
        x.right = yleft;

        updateHeightAndBalance(x);
        updateHeightAndBalance(y);

        return y;
    }


    // ROTATION _________________
    public static Node rotation(Node node)
    {
        updateHeightAndBalance(node);   // update height and bal of current node

        if(node.bal == 2)  // ll , lr
        {
            if(node.left.bal == 1)      // ll
            {
                return ll(node);
            }
            else                    // lr
            {
                node.left = rr(node.left);
                return ll(node);
            }
        }
        else if(node.bal == -2)     // rr , rl
        {
            if(node.right.bal == -1)     // rr
            {
                return rr(node);
            }
            else        // rl
            {
                node.right = ll(node.right);
                return rr(node);
            }
        }

        return node;
    }


    // ADDING NODE TO THE BST AND ROTATING THE TREE TO MAKE IT BALANCED BST ____________________________
    public static Node addNodeAVL(Node node , int data)
    {
        if(node == null)
        {
            return new Node(data);
        }

        if(node.data > data)
        {
            node.left = addNodeAVL(node.left, data);
            node.left = rotation(node.left);
        }
        else
        {
            node.right = addNodeAVL(node.right, data);
            node.right = rotation(node.right);
        }

        node = rotation(node);
        return node;
    }


    // REMOVING NODE FROM A BST AND REMAINING TREE SHOULD REMAIN BALANACED BST _____________________________
    public static Node removeNodeAVL(Node node , int data)
    {
        if(node == null)
        {
            return null;
        }

        if(node.data == data)
        {
            if(node.left == null || node.right == null)     // for 0 or 1 child
            {
                return node.left == null ? node.right : node.left;
            }
            int maxData = maxInTree(node.left);
            node.data = maxData;
            node.left = removeNodeAVL(node.left, maxData);
        }
        else
        {
            if(node.data > data)
            {
                node.left = removeNodeAVL(node.left, data);
            }
            else
            {
                node.right = removeNodeAVL(node.right, data);
            }
        }

        node = rotation(node);
        return node;
    }
    public static int maxInTree(Node node)
    {
        if(node == null)
        {
            return Integer.MIN_VALUE;
        }

        Node rnode = node;
        while(rnode.right != null)
        {
            rnode = rnode.right;
        }
        return rnode.data;
    }
}