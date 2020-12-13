import java.util.LinkedList;
import java.util.PriorityQueue;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Arrays;
import java.util.Stack;



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
        // constructor();
        // display();

        // removeEdge(0 , 1);

        // removeVertex(3);

        // boolean[] vis = new boolean[graph.size()];
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
        // hamiltonianPathCycle(2, 2, 0, 0, vis, maxPath);


        // get connected component ________________
        // System.out.println(getConnectedComponent());


        // BFS traversal ____________
        // bfs(0, 6);      // using class 
        // bfs_2(0 , 6);      // using null as delimiter
        // bfs_3(0 , 6);          // using two loops


        // Bipartite graph ________________
        // bipartite();


        // creating the directional graph
        constructDirectionalGraph();
        // displayDirectional();

        // topogical sort 
        // topologicalSort();

        // detecting cycle using topological sort technique _________
        // detectCycleInDirectedGraph();

        //  Khans Algo ______________________________
        KhansAlgo();

    }

    public static void constructor()
    {
        int n = 10;      // 9
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

        // addEdge(2 , 5 , 5);         // extra edge for hamiltonian 

        addEdge(7 , 8 , 1);
        addEdge(8 , 9 , 4);
        addEdge(9 , 7 , 3);
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


    // get connetected component ______________________
    public static int getConnectedComponent()
    {
        boolean[] vis = new boolean[graph.size()];
        int compo = 0;

        for(int i = 0 ; i < graph.size() ; i++)
        {
            if(!vis[i])
            {
                compo++;
                dfs(i , vis);
            }
        }

        return compo;
    }

    public static void dfs(int src , boolean[] vis)
    {
        vis[src] = true;

        for(Edge e : graph.get(src))
        {
            if(!vis[e.v])
            {
                dfs(e.v , vis);
            }
        }
    }


    // BFS traversal 
    // 1st method (using class)
    public static class BFSPath
    {
        int vtx = 0;
        int wsf = 0;
        String psf = "";

        public BFSPath(int vtx , int wsf , String psf)
        {
            this.vtx = vtx;
            this.wsf = wsf;
            this.psf = psf;
        }
    }

    public static void bfs(int src , int dest)
    {
        Queue<BFSPath> que = new LinkedList<>();
        boolean[] vis = new boolean[graph.size()];

        int cycle = 0;
        BFSPath root = new BFSPath(src , 0 , src + "");
        que.add(root);

        while(!que.isEmpty())
        {
            BFSPath rpair = que.remove();

            // cycle
            if(vis[rpair.vtx])
            {
                cycle++;
                System.out.println("cycle number - " + cycle + " -> " + rpair.psf);
                continue;
            }

            vis[rpair.vtx] = true;

            // destination
            if(rpair.vtx == dest)
            {
                System.out.println(rpair.psf);
            }

            for(Edge e : graph.get(rpair.vtx))
            {
                if(!vis[e.v])
                {
                    BFSPath pair = new BFSPath(e.v, rpair.wsf + e.w , rpair.psf + "->" + e.v);
                    que.add(pair);
                }
            }
        }
    }

    // 2nd Method (using -1 as an delimiter)
    public static void bfs_2(int src ,int dest)
    {
        Queue<Integer> que = new LinkedList<>();
        boolean[] vis = new boolean[graph.size()];

        que.add(src);
        que.add(null);

        int level = 0;
        int cycle = 0;

        while(que.size() != 1)
        {
            if(que.peek() == null)
            {
                level++;
                que.poll();
                que.add(null);
                continue;
            }

            int rvtx = que.remove();

            if(vis[rvtx])
            {
                cycle++;
                System.out.println("cycle - "+ cycle + " @ " + rvtx);
                continue;
            }

            vis[rvtx] = true;

            if(rvtx == dest)
            {
                System.out.println("Destination Reached " + "@ level " + level);
            }

            for(Edge e : graph.get(rvtx))
            {
                if(!vis[e.v])
                {
                    que.add(e.v);
                }
            }
        }
    }

    // 3rd method (using two loops)
    public static void bfs_3(int src , int dest)
    {
        Queue<Integer> que = new LinkedList<>();
        boolean[] vis = new boolean[graph.size()];

        int cycle = 0;
        int level = 0;

        que.add(src);

        while(!que.isEmpty())
        {
            int size = que.size();
            while(size-- > 0)
            {
                int rvtx = que.remove();
                
                if(vis[rvtx])
                {
                    cycle++;
                    System.out.println("Cycle Number " + cycle + " @ vertex " + rvtx);
                    continue;
                }

                vis[rvtx] = true;

                if(rvtx == dest)
                {
                    System.out.println("Destination Reached " + "@ level " + level);
                }

                for(Edge e : graph.get(rvtx))
                {
                    if(!vis[e.v])
                    {
                        que.add(e.v);
                    }
                }
            }
            level++;
        }
    }


    // Bipartite Graph ___________________________
    public static class Pair
    {
        int vertex = 0;
        int color = 0;

        public Pair(int vertex ,int color)
        {
            this.vertex = vertex;
            this.color = color;
        }
    }

    public static void bipartite()
    {
        int[] vis = new int[graph.size()];
        Arrays.fill(vis , -1);

        int count = 0;

        // as there can be different components of the graph so we use for loop to traverse all.
        for(int i = 0 ; i < graph.size() ; i++)
        {
            if(vis[i] == -1)        // means not traversed yet____
            {
                count++;
                System.out.println("Component - "+count + " " + ((isBipartite(i , vis)) ? "is bipartite graph." :
                                                                        "is not a bipartite graph."));
            }
        }
    }

    public static boolean isBipartite(int src , int[] vis)
    {
        Queue<Pair> que = new ArrayDeque<Pair>();

        que.add(new Pair(src , 0));
        boolean flag = true;

        while(!que.isEmpty())
        {
            int size = que.size();
            while(size-- > 0)
            {
                Pair rpair = que.remove();

                if(vis[rpair.vertex] != -1)      // means this vertex is already colored
                {
                    if(vis[rpair.vertex] != rpair.color)
                    {
                        System.out.println("Conflict arises at " + rpair.vertex + " so not a bipartite.");
                        flag = false;
                    }
                    if(!flag)
                    {
                        break;
                    }
                    continue;
                }

                vis[rpair.vertex] = rpair.color;

                for(Edge e : graph.get(rpair.vertex))
                {
                    if(vis[rpair.vertex] != -1)
                    {   
                        int col = (rpair.color + 1) % 2;
                        que.add(new Pair(e.v , col));
                    }
                }
            }
            if(!flag)
            {
                break;
            }
        }

        return flag;
    }


    

    // Directional Graph ____________________
    public static ArrayList<ArrayList<Edge>> graphDirectional = new ArrayList<>();
    public static void constructDirectionalGraph()
    {
        int n = 7;
        for(int i = 0 ; i < n ; i++)
        {
            graphDirectional.add(new ArrayList<Edge>());
        }

        addEdgeDirecionalGraph(0 , 1 , 3);
        addEdgeDirecionalGraph(1 , 2 , 2);
        addEdgeDirecionalGraph(2 , 3 , 5);
        addEdgeDirecionalGraph(0 , 3 , 4);
        addEdgeDirecionalGraph(4 , 3 , 6);
        addEdgeDirecionalGraph(4 , 5 , 3);
        addEdgeDirecionalGraph(4 , 6 , 2);          // 6 -> 4 , for obtaining a cycle instead of 4 -> 6
        addEdgeDirecionalGraph(5 , 6 , 7);
    }

    public static void addEdgeDirecionalGraph(int u , int v , int w)
    {
        if(u < 0 || v < 0 || u >= graphDirectional.size() || v >= graphDirectional.size())
        {
            return;
        }

        graphDirectional.get(u).add(new Edge(v , w));   // to construct the single edge means directional edge.
    }

    public static void displayDirectional()
    {
        for(int i = 0 ; i < graphDirectional.size() ; i++)
        {
            System.out.print(i + " -> ");
            for(Edge e : graphDirectional.get(i))
            {
                System.out.print("(" + e.v + "," + e.w + ") ");
            }
            System.out.println();
        }

        System.out.println();
    }


    // toplogical sort _________________
    public static void topologicalSort()
    {
        boolean[] vis = new boolean[graphDirectional.size()];
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < graphDirectional.size() ; i++)
        {
            if(!vis[i])
            {
                topologicalSort_(i , vis , st);
            }
        }


        while(st.size() != 0)
        {
            System.out.print(st.pop() + " ");
        }
    }


    public static void topologicalSort_(int si , boolean[] vis , Stack<Integer> st)
    {
        vis[si] = true;

        for(Edge e : graphDirectional.get(si))
        {
            if(!vis[e.v])
            {
                topologicalSort_(e.v , vis , st);
            }
        }

        st.push(si);
    }
    

    // to detect a cycle using topological sort in a directed graph ___________
    public static void detectCycleInDirectedGraph()
    {
        boolean[] vis = new boolean[graphDirectional.size()];
        boolean[] cycleDetection = new boolean[graphDirectional.size()];
        Stack<Integer> st = new Stack<>();
        boolean res = false;

        for(int i = 0 ; i < graphDirectional.size() ; i++)
        {
            if(!vis[i])
            {
                res = res || detectCycleUsingTopologicalSort(i , vis , cycleDetection , st);
            }
        }

        while(st.size() != 0 && !res)  // if no cycle is present then print topological sort order
        {
            System.out.print(st.pop());
        }
    }

    public static boolean detectCycleUsingTopologicalSort(int src , boolean[] vis , 
                                                        boolean[] cycleDetection , Stack<Integer> st)
    {
        boolean res = false;

        vis[src] = true;
        cycleDetection[src] = true;

        for(Edge e : graphDirectional.get(src))
        {
            if(!vis[e.v])
            {
                res = res || detectCycleUsingTopologicalSort(e.v, vis, cycleDetection, st);
            }
            else
            {
                if(cycleDetection[e.v])
                {
                    System.out.println("CYCLE");
                    return true;
                }
            }
        }

        cycleDetection[src] = false;
        st.push(src);
        return res;
    }


    // Khans's Algo ___________
    public static void KhansAlgo()
    {
        int[] indegree = new int[graphDirectional.size()];
        for(int i = 0 ; i < graphDirectional.size() ; i++)
        {
            for(Edge e : graphDirectional.get(i))
            {
                indegree[e.v]++;
            }
        }

        Queue<Integer> que = new LinkedList<>();

        for(int i = 0 ; i < indegree.length ; i++)
        {
            if(indegree[i] == 0)
            {
                que.add(i);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while(que.size() != 0)
        {
            int rvtx = que.poll();
            ans.add(rvtx);
            for(Edge e : graphDirectional.get(rvtx))
            {
                indegree[e.v]--;

                if(indegree[e.v] == 0)
                {
                    que.add(e.v);
                }
            }
        }

        if(ans.size() != graphDirectional.size())
        {
            System.out.println("Cycle Detected");
        }
        else
        {
            for(int e : ans)
            {
                System.out.print(e + " ");
            }
        }
    }


    // DIJIKSTRA'S ALGORITHM ______________________________
    public static class dpair
    {
        int vtx;
        int par;
        int wt;
        int wsf;

        public dpair(int vtx , int par , int wt , int wsf)
        {
            this.vtx = vtx;
            this.par = par;
            this.wt = wt;
            this.wsf = wsf;
        }

        public dpair()
        {

        }
    }

    public static ArrayList<dpair>[] dgraph = new ArrayList[graph.size()];
    public static int[] dshortestPath = new int[graph.size()];   //to contain min cost to each vertex from src

    public static void dijikstraAlgo(int src)
    {
        for(int i = 0 ; i < dgraph.length ; i++)
        {
            dgraph[i] = new ArrayList<>();
        }

        boolean[] vis = new boolean[dgraph.length];
        PriorityQueue<dpair> pq = new PriorityQueue<>((a , b) -> 
                                                    {
                                                        return a.wsf - b.wsf;
                                                    });      // min priority queue on the basis of wsf

        pq.add(new dpair(src , -1 , 0 , 0));

        while(pq.size() != 0)
        {
            dpair rpair = pq.poll();

            if(vis[rpair.vtx])
            {
                continue;
            }

            if(rpair.par != -1)
            {
                
            }
        }
    }


    // function to add Edge of the dijikstra algo graph
    
}