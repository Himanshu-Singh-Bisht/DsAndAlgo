import java.util.LinkedList;
import java.util.ArrayList;

public class MyHashMapGeneric<K,V>
{
    public class Node 
    {
        K key;
        V value;

        public Node(K key , V value)
        {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString()
        {
            return key + "->" + value;
        }
    }

    public LinkedList<Node>[] buckets = new LinkedList[10];
    public int size = 0;

    public MyHashMapGeneric()
    {
        reassign();
    }

    public void reassign()
    {
        for(int i = 0 ; i < buckets.length ; i++)
        {
            buckets[i] = new LinkedList<>();
        }
        this.size = 0;
    }


    @Override 
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for(LinkedList<Node> ll : buckets)
        {
            int groupSize = ll.size();
            while(groupSize-- > 0)
            {
                Node tnode = ll.getFirst();
                sb.append(tnode + " ,");
                ll.addLast(ll.removeFirst());
            }
        }

        sb.deleteCharAt(sb.length() -1);
        sb.append("]");
        return sb.toString();
    }
    
    public int size()
    {
        return this.size;
    }


    public int myGroup(K key)
    {
        int hashcode = key.hashCode();
        return Math.abs(hashcode) % buckets.length;
    }

    public Node foundElementInGroup(LinkedList<Node> group , K key)
    {
        int groupSize = group.size();
        while(groupSize-- > 0)
        {
            if(group.getFirst().key == key)
            {
                return group.getFirst();
            }

            group.addLast(group.removeFirst());
        }
        return null;
    }
    
    public V get(K key)
    {
        int idx = myGroup(key);
        LinkedList<Node> group = buckets[idx];

        Node rn = foundElementInGroup(group, key);
        return rn == null ? null : rn.value;
    }

    public V remove(K key)
    {
        int idx = myGroup(key);
        LinkedList<Node> group = buckets[idx];

        Node rn = foundElementInGroup(group, key);
        if(rn != null)
        {
            this.size--;
            return group.removeFirst().value;
        }
        else
        {
            System.out.println("Key not found : -1");
            return null;
        }
    }

    public void put(K key , V value)
    {
        int idx = myGroup(key);
        LinkedList<Node> group = buckets[idx];

        Node rn = foundElementInGroup(group , key);
        if(rn == null)
        {
            this.size++;
            group.addLast(new Node(key , value));
        }
        else
        {
            rn.value = value;
        }

        double lamda = (group.size() * 1.0) / buckets.length;
        if(lamda > 0.3)
        {
            rehash();
        }
    }

    public void rehash()
    {
        LinkedList<Node>[] oldBuckets = buckets;
        buckets = new LinkedList[2 * oldBuckets.length];
        reassign();

        for(LinkedList<Node> ll : buckets)
        {
            if(ll.size() > 0)
            {
                int groupSize = ll.size();
                while(groupSize-- > 0)
                {
                    Node tnode = ll.removeFirst();
                    put(tnode.key , tnode.value);
                }
            }
        }
    }


    public boolean containsKey(K key)
    {
        int idx = myGroup(key);
        LinkedList<Node> group = buckets[idx];

        Node rn = foundElementInGroup(group, key);
        return rn == null ? false : true;
    }

    public V getOrDefault(K key , V defaultValue)
    {
        int idx = myGroup(key);
        LinkedList<Node> group = buckets[idx];

        Node rn = foundElementInGroup(group, key);
        return rn == null ? defaultValue : rn.value;
    }

    public ArrayList<K> keySet()
    {
        ArrayList<K> list = new ArrayList<>();

        for(LinkedList<Node> ll : buckets)
        {
            int groupSize = ll.size();
            while(groupSize-- > 0)
            {
                list.add(ll.getFirst().key);
                ll.addLast(ll.removeFirst());
            }
        }

        return list;
    }

}