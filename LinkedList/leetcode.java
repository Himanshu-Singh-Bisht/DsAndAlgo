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

}