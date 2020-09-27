import java.util.LinkedList;
import java.util.ArrayList;

public class MyHashMap
{
    public static class Node 
    {
        Integer key;
        Integer value;

        Node(Integer key , Integer value)
        {
            this.key = key;
            this.value = value;
        } 

        @Override
        public String toString()
        {
            return this.key + "=" + this.value;
        }
    }  

    public LinkedList<Node>[] buckets;
    public int size = 0;


    public MyHashMap()
    {
        buckets = new LinkedList[10];
        reassign();
    }

    public void reassign()
    {
        for(int i = 0 ; i < buckets.length ; i++)
        {
            buckets[i] = new LinkedList<>();        // storing empty linked list at each index of buckets array
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
            if(ll.size() > 0)
            {
                int groupSize = ll.size();
                while(groupSize-- > 0)
                {
                    Node tnode = ll.getFirst();
                    ll.addLast(ll.removeFirst());
                    sb.append(tnode + " ,");
                }
            }
        }

        sb.deleteCharAt(sb.length() - 1);       // to remove last character which is ","
        sb.append("]");
        return sb.toString();
    }


    public int size()
    {
        return this.size;
    }

    public int myGroup(Integer key)
    {
        int hashcode = key.hashCode();
        return Math.abs(hashcode) % buckets.length;         // as hashcode can be in -ve.
    }


    public Node foundElementInGroup(LinkedList<Node> group , Integer key)
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

    public Integer get(Integer key)
    {
        int idx = myGroup(key);
        LinkedList<Node> group = buckets[idx];
        Node rn = foundElementInGroup(group , key);
        return rn == null ? null : rn.value;
    }


    public Integer remove(Integer key)
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
            System.out.println("Key Not found : -1");
            return null;
        }
    }


    public void put(Integer key , Integer value)
    {
        int idx = myGroup(key);
        LinkedList<Node> group = buckets[idx];

        // if(group == null)        // if reassign not used to store empty linked list
        // {
        //     buckets[code] = new LinkedList<>();
        // }

        Node rn = foundElementInGroup(group, key);
        if(rn == null)
        {
            group.addLast(new Node(key , value));
            this.size++;
        }
        else
        {
            rn.value = value;
        }

        double lamda = group.size() * 1.0 / buckets.length;
        if(lamda > 0.3)
        {
            System.out.println("Rehashing is done here - " + group.size());
            rehash();
        }
    }

    public void rehash()
    {
        LinkedList<Node>[] oldArray = buckets;
        buckets = new LinkedList[oldArray.length * 2];
        reassign();     // give the new empty Linked List to each index of the array

        for(LinkedList<Node> ll : oldArray)
        {
            if(ll.size() > 0)
            {
                LinkedList<Node> group = ll;
                int groupSize = group.size();

                while(groupSize-- > 0)
                {
                    Node tnode = group.removeFirst();
                    put(tnode.key , tnode.value);
                }
            }
        }
    }


    public boolean containsKey(Integer key)
    {
        int idx = myGroup(key);
        LinkedList<Node> group = buckets[idx];

        Node rn = foundElementInGroup(group, key);
        return rn == null ? false : true;
    }

    public Integer getOrDefault(Integer key , Integer defaultValue)
    {
        int idx = myGroup(key);
        LinkedList<Node> group = buckets[idx];

        Node rn = foundElementInGroup(group, key);
        return rn != null ? rn.value : defaultValue;
    }


    public ArrayList<Integer> keySet()
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(LinkedList<Node> ll : buckets)
        {
            if(ll.size() > 0)
            {
                int groupSize = ll.size();
                while(groupSize-- > 0)
                {
                    Node tnode = ll.getFirst();
                    list.add(tnode.key);
                    ll.addLast(ll.removeFirst());
                }
            }
        }

        return list;
    }
}