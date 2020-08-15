import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class bst
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
            str += " -> " + data + " -> ";
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
        // CREATE BST ______________________________________________________________________
        int[] arr = new int[10];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = (i + 1) * 10;
        }
        Node root = createBST(arr , 0 , arr.length - 1);
        // display(root);
        // System.out.println(root);


        // FINDING DATA IN BST  _____________________________________________________________________
        // System.out.println(findRec(root , 80));         // RECURSION
        // System.out.println(findItr(root , 80));         // ITERATION


        // ADDING THE DATA TO BST _______________________________________________________
        root = addData(root , 25);
        root = addData(root , 85);
        // System.out.println(root);



        // SUCCESSOR AND PREDECCESSOR IN BST ____________________________________________
        predSuccInBST(root , 80);

    }


    // CREATE BST ___________________________________________________________________________
    public static Node createBST(int[] arr, int si, int ei)
    {
        if(si > ei)
        {
            return null;
        }

        int mid = si + (ei - si) / 2;
        Node node = new Node(arr[mid]);

        node.left = createBST(arr , si , mid - 1);
        node.right = createBST(arr , mid + 1 , ei);

        return node;
    }

    public static void display(Node node)
    {
        if(node == null)
        {
            return;
        }

        System.out.print((node.left != null) ? node.left.data + "" : ".");
        System.out.print(" -> " + node.data + " <- ");
        System.out.println((node.right != null) ? node.right.data + "" : ".");

        display(node.left);
        display(node.right);
    }



    // FINDING DATA IN BST________________________________________________________________
    // RECURSIVELY
    public static boolean findRec(Node node , int data)
    {
        if(node == null)
        {
            return false;
        }

        if(node.data == data)
        {
            return true;
        }

        if(node.data > data)
        {
            return findRec(node.left, data);
        }
        else
        {
            return findRec(node.right, data);
        }
    }


    // ITERATION
    public static boolean findItr(Node node , int data)
    {
        while(node != null)
        {
            if(node.data == data)
            {
                return true;
            }
            else if(node.data > data)
            {
                node = node.left;
            }
            else
            {
                node = node.right;
            }
        }

        return false;
    }



    // ADDING DATA TO THE BST ______________________________________________________________
    public static Node addData(Node node, int data)
    {
        if(node == null)
        {
            return new Node(data);
        }

        if(node.data > data)
        {
            node.left = addData(node.left, data);
        }
        else
        {
            node.right = addData(node.right, data);
        }

        return node;
    }



    // SUCCESOR AND PREDECCESOR IN BST ___________________________________________________
    public static void predSuccInBST(Node node , int data)
    {
        Node pred = null;
        Node succ = null;
        while(node != null)
        {
            if(node.data == data)
            {
                if(node.left != null)
                {
                    pred = node.left;
                    while(pred.right != null)
                    {
                        pred = pred.right;
                    }
                }
                if(node.right != null)
                {
                    succ = node.right;
                    while(succ.left != null)
                    {
                        succ = succ.left;
                    }
                }

                System.out.println("Predecessor of data - " + pred.data);
                System.out.println("Successor of data - " + succ.data);

                return;
            }

            else if(node.data > data)
            {
                node = node.left;
            }
            else
            {
                node = node.right;
            }
        }
    }
}