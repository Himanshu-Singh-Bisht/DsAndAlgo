import java.util.NoSuchElementException;

public class linkedList
{
    public static class Node
    {
        int data = 0;
        Node next = null;

        public Node()
        {

        }

        public Node(int data)
        {
            this.data = data;
        }

        public Node(int data , Node next)
        {
            this.data = data;
            this.next = next;
        }

        @Override 
        public String toString()
        {
            return this.data + "  ";
        }
    }


    private Node head = null;
    private Node tail = null;
    private int nodeCount = 0;


    @Override
    public String toString()
    {
        if(nodeCount == 0)
        {
            return "[]";
        }    

        StringBuilder sb = new StringBuilder();
        Node curr = head;
        sb.append("[");
        while(curr.next != null)
        {
            sb.append(curr.data + " , ");
            curr = curr.next;
        }
        sb.append(curr.data);
        sb.append("]");

        return sb.toString();
    }




    // basic functions
    public int size()
    {
        return this.nodeCount;
    }

    public boolean isEmpty()
    {
        return nodeCount == 0;
    }

    public Node getNodeAt(int idx)
    {
        if(idx < 0 || idx >= this.nodeCount)
        {
            throw new NullPointerException();
        }

        Node curr = this.head;
        while(idx-- > 0)
        {
            curr = curr.next;
        }

        return curr;
    }


    // Add functions 
    // add first
    public void addFirst(int data)
    {
        Node node = new Node(data);
        addFirstNode(node);
    }

    public void addFirstNode(Node node)
    {
        if(this.nodeCount == 0)
        {
            this.tail = node;
        }

        node.next = head;
        this.head = node;
        this.nodeCount++;
    }


    public void addLast(int data)
    {
        Node node = new Node(data);
        addLastNode(node);
    }

    public void addLastNode(Node node)
    {
        if(this.nodeCount == 0)
        {
            this.head = node;
            this.tail = node;
        }
        else
        {
            this.tail.next = node;
            this.tail = node;
        }
        this.nodeCount++;
    }

    public void addAt(int data , int idx)
    {
        if(idx < 0 || idx > this.nodeCount)
        {
            throw new NullPointerException();
        }
        Node node = new Node(data);
        addAtNode(node , idx);
    }

    public void addAtNode(Node node , int idx)
    {
        if(idx == 0)
        {
            addFirstNode(node);
        }
        else if(idx == this.nodeCount)
        {
            addLastNode(node);
        }
        else
        {
            Node prev = getNodeAt(idx - 1);
            Node forw = prev.next;

            prev.next = node;
            node.next = forw;
            this.nodeCount++;
        }
    }


    // GET FUNCTIONS ______________________________
    public int getFirst()
    {
        return head.data;
    }

    public int getLast()
    {
        return tail.data;
    }

    public int getAt(int idx)
    {
        return getNodeAt(idx).data;
    }


    // REMOVE FUNCTIONS _____________________________      
    public int removeFirst()
    {
        if(nodeCount == 0)
        {
            throw new NullPointerException();
        }
        return removeFirstNode().data;
    }

    public Node removeFirstNode()
    {
        Node rn = this.head;
        if(nodeCount == 1)
        {
            this.tail = null;
            this.head = null;
        }
        else
        {
            this.head = this.head.next;
        }

        rn.next = null;
        this.nodeCount--;
        return rn;
    }


    public int removeLast()
    {
        if(nodeCount == 0)
        {
            throw new NoSuchElementException();
        }
        return removeLastNode().data;
    }

    public Node removeLastNode()
    {
        Node rn = tail;
        if(this.nodeCount == 1)
        {
            this.head = null;
            this.tail = null;
        }
        else
        {
            Node secondLast = getNodeAt(this.nodeCount - 2);
            this.tail = secondLast;
            secondLast.next = null;
        }

        this.nodeCount--;
        return rn;
    }

    public int removeAt(int idx)
    {
        if(idx < 0 || idx >= this.nodeCount)
        {
            throw new NoSuchElementException();
        }
        return removeAtNode(idx).data;
    }

    public Node removeAtNode(int idx)
    {
        if(idx == 0)
        {
            return removeFirstNode();
        }
        else if(idx == this.nodeCount - 1)
        {
            return removeLastNode();
        }
        else
        {
            Node prev = getNodeAt(idx - 1);
            Node forw = prev.next;

            prev.next = forw.next;
            forw.next = null;

            this.nodeCount--;
            return forw;
        }
    }

    // REVERSE LINKED LIST _______________________________
    public void reverseListItrData()
    {
        int si = 0;
        int ei = this.nodeCount - 1;

        while(si <= ei)
        {
            Node first = getNodeAt(si);
            Node second = getNodeAt(ei);

            int temp = first.data;
            first.data = second.data;
            second.data = temp;

            si++;
            ei--;
        }
    }

    public Node reverseListPtr(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node forw = null;

        while(curr != null)
        {
            forw = curr.next;
            curr.next = prev;

            prev = curr;
            curr = forw;
        }

        return prev;
    }
}