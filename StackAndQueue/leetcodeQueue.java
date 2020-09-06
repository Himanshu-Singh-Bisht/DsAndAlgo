import java.util.Queue;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class leetcodeQueue
{
    public static void main(String[] args)
    {
        // LEETCODE - 933 , NUMBER OF RECENT CALLS ___________________________________________
        // RecentCounter o = new RecentCounter();


        // LEETCODE - 641 , DESIGN CIRCULAR QUEUE _____________________________________________
        // MyCircularDeque circularDeque = new MyCircularDeque(3);
        // System.out.println(circularDeque.insertLast(1));			// return true
        // System.out.println(circularDeque.insertLast(2));			// return true
        // System.out.println(circularDeque.insertFront(3));			// return true
        // System.out.println(circularDeque.insertFront(4));			// return false, the queue is full
        // System.out.println(circularDeque.getRear());  			    // return 2
        // System.out.println(circularDeque.isFull());				    // return true
        // System.out.println(circularDeque.deleteLast());			    // return true
        // System.out.println(circularDeque.insertFront(4));			// return true
        // System.out.println(circularDeque.getFront());               // return 4



        // LEETCODE - 621 , TASK SCHEDULER ______________________________________________________
        // char[] tasks = {'A' , 'A' , 'A' , 'A' , 'A' , 'A' , 'B' , 'C' , 'D' , 'E' , 'F'};
        // System.out.println(leastInterval1(tasks , 2));              // o/p = 16


        // LEETCODE - 622 , DESIGN CIRCULAR QUEUE ______________________________________________
        // MyCircularQueue circularQueue = new MyCircularQueue(3); // set the size to be 3
        // System.out.println(circularQueue.enQueue(1));  // return true
        // System.out.println(circularQueue.enQueue(2));  // return true
        // System.out.println(circularQueue.enQueue(3));  // return true
        // System.out.println(circularQueue.enQueue(4));  // return false, the queue is full
        // System.out.println(circularQueue.Rear());  // return 3
        // System.out.println(circularQueue.isFull());  // return true
        // System.out.println(circularQueue.deQueue());  // return true
        // System.out.println(circularQueue.enQueue(4));  // return true
        // System.out.println(circularQueue.Rear());  // return 4



        
    }

    // LEETCODE - 933 , NUMBER OF RECENT CALLS ___________________________________________
    public static class RecentCounter 
    {
        Queue<Integer> que;
        public RecentCounter() 
        {
            que = new LinkedList<>();
        }
        
        public int ping(int t) 
        {
            que.add(t);
            while(que.peek() < t - 3000)
            {
                que.remove();
            }
            
            return que.size();
        }
    }



    // LEETCODE - 641 , DESIGN CIRCULAR QUEUE _______________________________________________________
    public static class MyCircularDeque 
    {
        /** Initialize your data structure here. Set the size of the deque to be k. */
        int[] que;
        int head = -1;
        int tail = -1;
        int size;
        public MyCircularDeque(int k) 
        {
            this.que = new int[k];
            this.size = 0;
        }
        
        /** Adds an item at the front of Deque. Return true if the operation is successful. */
        public boolean insertFront(int value) 
        {
            if(size == que.length)
            {
                return false;
            }
            
            this.head = ((this.head - 1) + que.length) % que.length;
            que[this.head] = value;
            if(this.tail == -1)
            {
                this.tail = this.head;
            }
            this.size++;
            return true;
        }
        
        /** Adds an item at the rear of Deque. Return true if the operation is successful. */
        public boolean insertLast(int value) 
        {
            if(size == que.length)
            {
                return false;
            }
            
            this.tail = (this.tail + 1) % que.length;
            que[this.tail] = value;
            if(this.head == -1)
            {
                this.head = this.tail;
            }
            this.size++;
            return true;
        }
        
        /** Deletes an item from the front of Deque. Return true if the operation is successful. */
        public boolean deleteFront() 
        {
            if(size == 0)
            {
                return false;
            }
            
            this.que[this.head] = 0;
            this.head = (this.head + 1) % que.length;
            this.size--;
            return true;
        }
        
        /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
        public boolean deleteLast() 
        {
            if(size == 0)
            {
                return false;
            }
            
            this.que[this.tail] = 0;
            this.tail = (this.tail - 1 + que.length) % que.length;
            this.size--;
            return true;
        }
        
        /** Get the front item from the deque. */
        public int getFront() 
        {
            if(size == 0)
            {
                return -1;
            }
            
            return this.que[this.head];
        }
        
        /** Get the last item from the deque. */
        public int getRear() 
        {
            if(size == 0)
            {
                return -1;
            }
            return this.que[this.tail];
        }
        
        /** Checks whether the circular deque is empty or not. */
        public boolean isEmpty() 
        {
            return this.size == 0;
        }
        
        /** Checks whether the circular deque is full or not. */
        public boolean isFull() 
        {
            return this.size == que.length;    
        }
    }
    


    // LEETCODE - 621 , TASK SCHEDULER ____________________________________________________
    public static int leastInterval1(char[] tasks, int n) 
    {
        int[] map = new int[26];
        int max = 0;
        int maxCount = 0;
        
        for(char ch : tasks)
        {
            map[ch - 'A']++;
            max = Math.max(max , map[ch - 'A']);
        }
        
        for(int num : map)
        {
            if(num == max)
            {
                maxCount++;
            }
        }
        
        return Math.max(tasks.length , (max - 1) * (n + 1) + maxCount);
    }


    // LEETCODE - 622 , DESIGN CIRCULAR QUEUE ___________________________________________________
    public static class MyCircularQueue {

        /** Initialize your data structure here. Set the size of the queue to be k. */
        int[] que;
        int head = 0;
        int tail = -1;
        int size;
        public MyCircularQueue(int k) {
            que = new int[k];
            this.size = 0;
        }
        
        /** Insert an element into the circular queue. Return true if the operation is successful. */
        public boolean enQueue(int value)
        {
            if(this.size == que.length)
            {
                return false;
            }
            
            this.tail = (this.tail + 1) % que.length;
            que[this.tail] = value;
            this.size++;
            return true;
        }
        
        /** Delete an element from the circular queue. Return true if the operation is successful. */
        public boolean deQueue() 
        {
            if(this.size == 0)
            {
                return false;
            }
            
            int rvalue = que[this.head];
            que[this.head] = 0;
            this.head = (this.head + 1) % que.length;
            this.size--;
            return true;
        }
        
        /** Get the front item from the queue. */
        public int Front() 
        {
            if(this.size == 0)
            {
                return -1;
            }
            
            return que[this.head];
        }
        
        /** Get the last item from the queue. */
        public int Rear() 
        {
            if(this.size == 0)
            {
                return -1;
            }
            return que[this.tail];
        }
        
        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() 
        {
            return this.size == 0;    
        }
        
        /** Checks whether the circular queue is full or not. */
        public boolean isFull() 
        {
            return this.size == que.length;    
        }
    }    
}