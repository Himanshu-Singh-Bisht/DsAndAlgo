import java.nio.file.Path;
import java.util.ArrayList;

import javax.crypto.Mac;

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
        // pathMaxMin(0, 5, 0, vis, "");
        // System.out.println(maxPath + " ---> " + max_wsf);
        // System.out.println(minPath + " ---> " + min_wsf);


        // path maximum and minimum using class objects______________________
        // PathMaxMin ansMax = pathMax_2(0, 5, vis);
        // System.out.println(ansMax.s + " ---> " + ansMax.wt);
        // PathMaxMin ansMin = pathMin_2(0, 5, vis);
        // System.out.println(ansMin.s +" ---> " + ansMin.wt);


        // Hamiltonian Path And Cycle _____________________________
        hamiltonianPathCycle(2, 2, 0, 0, vis, maxPath);
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

        addEdge(2 , 5 , 5);         // extra edge for hamiltonian 
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
    static int max_wsf = Integer.MIN_VALUE;
    static int min_wsf = Integer.MAX_VALUE;
    static String maxPath = "";
    static String minPath = "";

    public static void pathMaxMin(int src , int dest , int wsf , boolean[] vis , String ans)
    {
        if(src == dest)
        {
            ans += src;
            if(max_wsf < wsf)
            {
                max_wsf = wsf;
                maxPath = ans;
            }
            if(min_wsf > wsf)
            {
                min_wsf = wsf;
                minPath = ans;
            }
            return;
        }

        vis[src] = true;
        for(Edge e : graph.get(src))
        {
            if(!vis[e.v]) 
            {
                pathMaxMin(e.v, dest, wsf + e.w, vis, ans + src + "->");
            }
        }
        vis[src] = false;
    }


    // path maximum and minimum using class objects______________________
    public static class PathMaxMin
    {
        int wt = 0; 
        String s = "";

        PathMaxMin()
        {

        }

        PathMaxMin(int wt , String s)
        {
            this.wt = wt;
            this.s = s;
        }
    }

    public static PathMaxMin pathMax_2(int src , int dest , boolean[] vis)  // for max
    {
        if(src == dest)
        {
            PathMaxMin base = new PathMaxMin();
            base.s += src;
            return base;
        }

        PathMaxMin myAns = new PathMaxMin(Integer.MIN_VALUE , "");
        vis[src] = true;

        for(Edge e : graph.get(src))
        {
            if(!vis[e.v])
            {
                PathMaxMin recAns = pathMax_2(e.v, dest, vis);
                if(recAns.wt > myAns.wt)
                {
                    myAns = recAns;
                    myAns.wt += e.w;
                    myAns.s =  src + " -> " + myAns.s;
                }
            }
        }

        return myAns;
    }   

    public static PathMaxMin pathMin_2(int src , int dest , boolean[] vis)
    {
        if(src == dest)
        {
            PathMaxMin base = new PathMaxMin();
            base.s += src;
            return base;
        }

        PathMaxMin myAns = new PathMaxMin(Integer.MAX_VALUE , "");
        vis[src] = true;
        for(Edge e : graph.get(src))
        {
            if(!vis[e.v])
            {
                PathMaxMin recAns = pathMin_2(e.v, dest, vis);
                if(recAns.wt < myAns.wt)
                {
                    myAns.wt = e.w + recAns.wt;
                    myAns.s = recAns.s;
                    myAns.s = src + "->" + myAns.s;
                }
            }
        }
        vis[src] = false;

        return myAns;
    }


    // Hamiltonian Path And Cycle _______________________
    public static void hamiltonianPathCycle(int osrc , int src , int count ,int wsf, boolean[] vis , String ans)
    {
        if(count == graph.size() - 1)
        {
            System.out.print(ans + src + " @ " + wsf);
            for(Edge e : graph.get(src))
            {
                if(e.v == osrc)
                {
                    System.out.print(" CYCLE ");
                }
            }
            System.out.println();
            return;
        }

        vis[src] = true;
        for(Edge e : graph.get(src))
        {
            if(!vis[e.v])
            {
                hamiltonianPathCycle(osrc, e.v, count + 1, wsf + e.w , vis, ans + src + "->");
            }
        }
        vis[src] = false;
    }
}