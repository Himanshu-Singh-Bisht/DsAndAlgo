import java.util.ArrayList;

public class basicGraph
{
    public static class Edge
    {
        int v;
        int w;

        public Edge(int v , int w)
        {
            this.v = v;
            this.w = w;
        }
    }

    public static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

    public static void main(String[] args)
    {
        constructor();
        // display();

        // removeEdge(0 , 1);

        // removeVertex(3);

        boolean[] vis = new boolean[graph.size()];
        // System.out.println(hasPath(0, 6, vis , ""));

        // System.out.println(allPath(0 , 6 , 0 , vis , ""));
        // preorderAllPath(0, 0, vis, "");
        // postorderAllPath(0, 0, vis, "");

        // path maximum and minimum according to weights_______________________
    }

    public static void constructor()
    {
        int n = 7;
        for(int i= 0 ; i < n ; i++)
        {
            graph.add(new ArrayList<Edge>());
        }

        addEdge(0 , 1, 10);
        addEdge(0 , 3 , 10);
        addEdge(1 , 2 , 10);
        addEdge(2 , 3 , 40);
        addEdge(3 , 4 , 2);
        addEdge(4 , 5 , 2);
        addEdge(5 , 6 , 8);
        addEdge(4 , 6 , 3);
    }

    public static void addEdge(int u , int v, int w)
    {
        if(u < 0 || v < 0 || u >= graph.size() || v >= graph.size())
        {
            return;
        }
        graph.get(u).add(new Edge(v , w));      // from u -> v
        graph.get(v).add(new Edge(u , w));      // from v -> u
    }

    public static void display()
    {
        for(int i = 0 ; i < graph.size() ; i++)
        {
            System.out.print(i + " -> ");
            for(Edge e : graph.get(i))
            {
                System.out.print("(" + e.v + "," + e.w + ")  ");
            }
            System.out.println();
        }
    }

    
    // remove edge
    public static void removeEdge(int u , int v)
    {
        int i = 0;
        for(Edge e : graph.get(u))
        {
            if(e.v == v)
            {
                break;
            }
            i++;
        }

        int j = 0;
        for(Edge e : graph.get(v))
        {
            if(e.v == u)
            {
                break;
            }

            j++;
        }

        graph.get(u).remove(i);     // v is at i index
        graph.get(v).remove(j);     // u is at j index 
    }


    // remove vertex
    public static void removeVertex(int u)
    {
        ArrayList<Edge> list = graph.get(u);
        int a = list.size();

        while(a-- > 0)
        {
            Edge e = graph.get(u).get(a);
            removeEdge(u , e.v);
        }
    }


    // Has Path using DFS (depth first traversal) ______________
    public static boolean hasPath(int src , int dest , boolean[] vis , String ans)
    {
        if(src == dest)
        {
            ans += dest + "";
            System.out.println(ans);
            return true;
        }

        boolean res = false;
        vis[src] = true;

        for(Edge e : graph.get(src))
        {
            if(!vis[e.v])
            {
                res = res || hasPath(e.v, dest, vis, ans + src + " -> ");
            }
        }

        return res;
    }

    // all path from source to destination ________
    public static int allPath(int src , int dest , int wsf , boolean[] vis , String ans)
    {
        if(src == dest)
        {
            ans += dest + "";
            System.out.println(ans + " ----> " + wsf);
            return 1;
        }

        int count = 0;

        vis[src] = true;
        for(Edge e : graph.get(src))
        {
            if(!vis[e.v])
            {
                count += allPath(e.v, dest, wsf + e.w, vis, ans + src + " -> ");
            }
        }
        vis[src] = false;

        return count;
    }

    // preorder all path __________________
    public static void preorderAllPath(int src , int wsf , boolean[] vis , String ans)
    {
        System.out.println(ans + src + " ---> " + wsf);

        vis[src] = true;
        for(Edge e : graph.get(src))
        {
            if(!vis[e.v])
            {
                preorderAllPath(e.v, wsf + e.w, vis, ans + src + "->");
            }
        }
        vis[src] = false;
    }

    // postorder all path_______________________
    public static void postorderAllPath(int src , int wsf , boolean[] vis , String ans)
    {
        vis[src] = true;
        for(Edge e : graph.get(src))
        {
            if(!vis[e.v])
            {
                postorderAllPath(e.v, wsf + e.w, vis, ans + src + "->");
            }
        }
        vis[src] = false;

        System.out.println(ans + src + " ---> " + wsf);
    }


    // path maximum and minimum according to weights_______________________
    
}