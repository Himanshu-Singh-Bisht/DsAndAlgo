public class leetcode
{
    public static void main(String[] args)
    {
        // LEETCODE - 237 , DELETE NODE IN LINKED LIST _________________________
        // ListNode head = [4,5,1,9]
        // deleteNode(5);  // o/p = [4 , 1, 9]

    }
    public static class ListNode 
    {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    // LEETCODE - 237 , DELETE NODE IN LINKED LIST _________________________
    public static void deleteNode(ListNode node) 
    {
        ListNode first = node;
        ListNode second = node.next;
        
        first.val = second.val;
        first.next = second.next;
        second.next = null;
    }


    // LEETCODE - 203 , REMOVE LINKED LIST ELEMENTS _________________________
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;
        while(curr != null)
        {
            forw = curr.next;
            if(curr.val == val)
            {
                if(prev != null)
                {
                    prev.next = forw;
                    curr.next = null;
                }
                else
                {
                    head = forw;
                }
            }
            else
            {
                prev = curr;
            }
            curr = forw;
        }
        
        return head;
    }


    // LEETCODE - 206 , REVERSE LINKED LIST _________________________
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;
        
        while(curr != null)
        {
            forw = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = forw;
        }
        
        return prev;
    }


    // LEETCODE - 876 , MIDDLE OF LINKED LIST _________________________
    public ListNode middleNode(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return (fast.next == null) ? slow : slow.next;
    }


    // LEETCODE - 234 , PALINDROME LINKED LIST _________________________
    public boolean isPalindrome(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return true;
        }

        if(head.next.next == null)   // NOT NEEDED (BUT IT DECREASES EXECUTION TIME).
        {
            return ((head.val == head.next.val) ? true : false);
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = slow.next;
        head2 = reverseList(head2);
        slow.next = null;
        
        ListNode curr1 = head;
        ListNode curr2 = head2;
        while(curr1 != null && curr2 != null)
        {
            if(curr1.val != curr2.val)
            {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        head2 = reverseList(head2);
        slow.next = head2;
        return true;
    }


    // LEETCODE - 141, linked list cycle _____________________________
    public boolean hasCycle(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                break;
            }
        }
        
        return (slow == fast);
    }


    // leetcode - 142 , linked list cycle - II ____________________________________
    public ListNode detectCycle(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                break;
            }
        }
        
        if(slow != fast) 
        {
            return null;
        }
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
    }


    // leetcode - 160 , intersection of two linked list ___________
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if(headA == null || headB == null)
        {
            return null;
        }
        
        if(headA.next == null && headB.next == null && headA.val == headB.val)
        {
            return headA;
        }
        ListNode curr = headA;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        
        curr.next = headB;  // to make cycle
        
        ListNode slow = headA;
        ListNode fast = headA;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                break;
            }
        }
        
        if(slow != fast)
        {
            curr.next = null;
            return null;
        }
        
        slow = headA;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        curr.next = null;   // to break cycle
        return slow;
    }


    // leetcode = 61 , Rotate List ____________
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null)
        {
            return null;
        }
        if(k == 0)
        {
            return head;
        }
        int size = 1;
        ListNode curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
            size++;
        }
        
        k = k % size;
        k = size - k;
        
        curr.next = head;
        while(k-- > 0)
        {
            curr = curr.next;
        }
        
        head = curr.next;
        curr.next = null;
        return head;
    }


    // leetcode - 83 , Remove Duplicate from sorted List_______________
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode curr = head;
        while (curr != null && curr.next != null) 
        {
            ListNode forw = curr.next;
            if (forw.val == curr.val) 
            {
                curr.next = forw.next;
                forw.next = null;
            } 
            else 
            {
                curr = curr.next;
            }
        }
        return head;
    }

    // leetcode 21 , merge two sorted list __________________
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        
        ListNode head = new ListNode(-1);
        
        ListNode curr = head;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                curr.next = l1;
                l1 = l1.next;
            }
            else
            {
                curr.next = l2;
                l2 = l2.next;
            }
            
            curr = curr.next;
        }
        
        if(l1 != null)
        {
            curr.next = l1;
        }
        if(l2 != null)
        {
            curr.next = l2;
        }
           
        return head.next;
    }


    // leetcode - 23 , merge k Sorted Lists___________
    public ListNode mergeKLists(ListNode[] lists) 
    {
        if(lists.length == 0)
        {
            return null;
        }
        
        return mergeKLists_(lists , 0 , lists.length - 1);
    }
    
    public ListNode mergeKLists_(ListNode[] lists , int si , int ei)
    {
        if(si == ei)
        {
            return lists[si];
        }
        if(si + 1 == ei)
        {
            return mergeTwoSortedLists(lists[si] , lists[ei]);
        }
        
        int mid = (si + ei) / 2;
        ListNode a = mergeKLists_(lists , si , mid);
        ListNode b = mergeKLists_(lists , mid + 1 , ei);
        
        // return mergeTwoSortedLists(a , b);
        return mergeKListsPQ(lists);    // using priority queue
    }
    
    public ListNode mergeTwoSortedLists(ListNode l1 ,ListNode l2)
    {
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                curr.next = l1;
                l1 = l1.next;
            }
            else
            {
                curr.next = l2;
                l2 = l2.next;
            }
            
            curr = curr.next;
        }
        
        if(l1 != null)
        {
            curr.next = l1;
        }
        if(l2 != null)
        {
            curr.next = l2;
        }
        
        return head.next;
    }

    public ListNode mergeKListsPQ(ListNode[] lists) 
    {
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>((ListNode a , ListNode b) ->
                                                         {
                                                             return a.val - b.val;
                                                         });
        for(ListNode l : lists)
        {
            if(l != null)
            {
                pq.add(l);
            }
        }
        
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        
        while(pq.size() != 0)
        {
            ListNode l = pq.peek();
            pq.remove();
            
            curr.next = l;
            curr = curr.next;
            
            if(l.next != null)
            {
                pq.add(l.next);
            }
        }
        
        return head.next;
    }


    // leetcode - 1290 , convert binary number in a linked list ___________________
    public int getDecimalValue(ListNode head) 
    {
        ListNode curr = reverseList2(head);  
        
        int ans = 0;
        int i = 0;
        while(curr != null)
        {
            ans += Math.pow(2 , i) * curr.val;
            curr = curr.next;
            i++;
        }
        
        return ans;
    }
    
    public ListNode reverseList2(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;
        
        while(curr != null)
        {
            forw = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = forw;
        }
          
        return prev;
    }

    // leetcode - 148 ,reorder list 
    public void reorderList(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode nhead = mid.next;
        
        mid.next = null;
        
        nhead = reverseList(nhead);
        
        ListNode curr1 = head;
        ListNode curr2 = nhead;
        
        while(curr1 != null && curr2 != null)
        {
            ListNode forw1 = curr1.next;
            ListNode forw2 = curr2.next;
            
            curr1.next = curr2;
            curr2.next = forw1;
            
            curr1 = forw1;
            curr2 = forw2;
        }
        
    }
    
    public ListNode middle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;
        
        while(curr != null)
        {
            forw = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = forw;
        }
          
        return prev;
    }

    // Again Reorder list (making folded list back to normal list)
    public ListNode againReorderList(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode curr1 = head;
        ListNode nhead = curr1.next;
        ListNodde curr2 = nhead;

        while(curr1 != null && curr2 != null)
        {
            if(curr2.next != null)
            {
                curr1.next = curr2.next;
                curr1 = curr1.next;
            }
            else
            {
                break;
            }

            if(curr1.next != null)
            {
                curr2.next = curr1.next;
                curr2 = curr2.next;
            }
            else
            {
                break;
            }
        }

        curr1.next = null;
        curr2.next = null;

        nhead = reverseList(nhead);
        curr1.next = nhead;
        
        return head;
    }


    // leetcode - 1019 , next greater node in linked list ___________________
    // by brute force ________
    public int[] nextLargerNodes_1(ListNode head) 
    {
        if(head == null)
        {
            return new int[0];
        }
        ListNode curr = head;
        int count = 0;
        while(curr != null)
        {
            curr = curr.next;
            count++;
        }
        int[] ans = new int[count];
        
        curr = head;
        int i = 0;
        while(curr != null)
        {
            ListNode nextGreater = nextGreaterNode(curr);
            if(nextGreater == null)
            {
                ans[i++] = 0;
            }
            else
            {
                ans[i++] = nextGreater.val;
            }
            
            curr = curr.next;
        }
        
        return ans;
    }
    
    
    public ListNode nextGreaterNode(ListNode l)
    {
        ListNode curr = l;
        while(curr != null)
        {
            if(curr.val > l.val)
            {
                break;
            }
            curr = curr.next;
        }
        
        return curr;
    }

    // using stack __________
    public int[] nextLargerNodes(ListNode head) 
    {
        ArrayList<Integer> nodeVals = new ArrayList<>();
        
        ListNode curr = head;
        while(curr != null)
        {
            nodeVals.add(curr.val);
            curr = curr.next;
        }
        
        int[] ans = new int[nodeVals.size()];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < nodeVals.size() ; i++)
        {
            while(st.size() != 0 && nodeVals.get(st.peek()) < nodeVals.get(i))
            {
                int idx = st.pop();
                ans[idx] = nodeVals.get(i);
            }
            
            st.push(i);
        }
        
        while(st.size() != 0)
        {
            ans[st.pop()] = 0;
        }
        
        return ans;
    }


    // leetcode - 328 , odd even linked list
    public ListNode oddEvenList(ListNode head) 
    {
        if(head == null || head.next == null || head.next.next == null)
        {
            return head;
        }
        ListNode odd = new ListNode(-1);
        ListNode curr1 = odd;
        
        ListNode even = new ListNode(-1);
        ListNode curr2 = even;
        
        while(head != null)
        {
            curr1.next = head;
            curr2.next = head.next;
            
            curr1 = curr1.next;
            curr2 = curr2.next;
            
            head = head.next;
            if(head != null)
            {
                head = head.next;
            }
            else
            {
                break;
            }
        }
        
        curr1.next = even.next;
        
        return odd.next;
    }

    // leetcode = 2 , Add two numbers ______
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        int carry = 0;
        ListNode curr1 = l1;
        ListNode prev = null;
        ListNode curr2 = l2;
        while(curr1 != null && curr2 != null)
        {
            curr1.val = curr1.val + curr2.val + carry;
            carry = curr1.val / 10;
            curr1.val %= 10;
            
            prev = curr1;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        while(curr1 != null && carry != 0)
        {
            curr1.val += carry;
            carry = curr1.val / 10;
            curr1.val %= 10;
            
            prev = curr1;
            curr1 = curr1.next;
        }
        
        if(curr2 != null)
        {
            prev.next = curr2;
            while(curr2 != null && carry != 0)
            {
                curr2.val += carry;
                carry = curr2.val / 10;
                curr2.val %= 10;
                
                prev = curr2;
                curr2 = curr2.next;
            }
        }
        
        if(carry != 0)
        {
            prev.next = new ListNode(carry);
        }
        
        return l1;
    }


    // leetcode = 146 , LRU Cache ________
    class LRUCache 
    {

        public class Node 
        {
            int key;
            int val;
            Node next;
            Node prev;   
            
            public Node()
            {
                
            }
            public Node(int key ,int val)
            {
                this.key = key;
                this.val = val;
            }
        }
        
        Node tail = new Node();
        Node head = new Node();
        
        int cacheCapacity;
        HashMap<Integer , Node> map;
        
        public LRUCache(int capacity) 
        {
            map = new HashMap<>(capacity);
            this.cacheCapacity = capacity;
            
            head.next = tail;
            tail.prev = head;
        }
        
        public int get(int key)
        {
            int result = -1;
            Node node = map.get(key);
            
            if(node != null)
            {
                result = node.val;
                remove(node);
                add(node);
            }
            
            return result;
        }
        
        public void put(int key, int value)
        {
            Node node = map.get(key);
            if(node != null)
            {
                node.val = value;
                remove(node);
                add(node);
            }
            else
            {
                if(map.size() == cacheCapacity)
                {
                    map.remove(tail.prev.key);
                    remove(tail.prev);
                }
                Node newNode = new Node(key , value);
                map.put(key , newNode);
                add(newNode);
            }
        }
        
        public void add(Node node)
        {
            Node headNext = head.next;
            headNext.prev = node;
            node.next = headNext;
            
            head.next = node;
            node.prev = head;
        }
        
        public void remove(Node node)
        {
            Node nextNode = node.next;
            Node prevNode = node.prev;
            
            nextNode.prev = prevNode;
            prevNode.next = nextNode;
        }
    } 
}