import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class leetcodeQuestions
{
    public static void main(String[] args)
    {

        // DETECT CYCLE IN A DIRECTED GRAPH _______________________
        int n = 5;
        ArrayList<Integer>[] dirGraph = new ArrayList[n];
        for(int i = 0 ; i < dirGraph.length ; i++)
        {
            dirGraph[i] = new ArrayList<>();
        }
        addEdgeDirectedGraph(dirGraph, 0, 1);
        addEdgeDirectedGraph(dirGraph, 2, 1);
        addEdgeDirectedGraph(dirGraph, 2, 3);
        addEdgeDirectedGraph(dirGraph, 3, 4);
        addEdgeDirectedGraph(dirGraph, 4, 2);
        addEdgeDirectedGraph(dirGraph, 4, 0);

        System.out.println(isCyclicDirectedGraph(n , dirGraph));
        
        
        // leetcode - 200 , Number of Island _______________


        // leetcode - 886 , Possible Bipartition __________________


        // leetcode - 207 , Course Schedule ________________________(using graph coloring)


        // leetcode - 
    }

    // DETECT CYCLE IN A DIRECTED GRAPH _______________________
    public static void addEdgeDirectedGraph(ArrayList<Integer>[] dirGraph , int u , int v)
    {
        dirGraph[u].add(v);
    }

    public static boolean isCyclicDirectedGraph(int n , ArrayList<Integer>[] dirGraph)
    {
        boolean[] vis = new boolean[n];
        boolean flag = false;
        for(int i = 0 ; i < n ; i++)
        {
            vis[i] = true;
            for(int j = 0 ; j < dirGraph[i].size() ; j++)
            {
                flag = isCyclic_(dirGraph , vis, dirGraph[i].get(j));
                if(flag)
                {
                    return true;
                }
            }
            vis[i] = false;
        }
        return false;
    }
 
    public static boolean isCyclic_(ArrayList<Integer>[] dirGraph , boolean[] vis , int curr)
    {
        if(vis[curr] == true)
        {
            return true;
        }

        boolean flag = false;
        vis[curr] = true;
        for(int i = 0 ; i < dirGraph[curr].size() ; i++)
        {
            flag = isCyclic_(dirGraph, vis, dirGraph[curr].get(i));
            if(flag)
            {
                return true;
            }
        }

        return false;
    }



    
    // leetcode - 200 , Number of Island _______________
    public int numIslands(char[][] grid) 
    {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        
        int compo = 0;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(!vis[i][j] && grid[i][j] == '1')
                {
                    compo++;
                    dfs(grid , vis , i , j);
                }
            }
        }
        
        return compo;
    }
    
    public int[][] dir = {{0 , -1} , {-1 , 0} , {0 , 1} , {1 , 0}};
    public void dfs(char[][] grid , boolean[][] vis , int row , int col)
    {
        vis[row][col] = true;
        for(int i = 0 ; i < dir.length ; i++)
        {
            int r = row + dir[i][0];
            int c = col + dir[i][1];
            
            if(r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == '1' && !vis[r][c])
            {
                dfs(grid , vis , r , c);
            }
        }
    }


    // leetcode - 886 , Possible Bipartition __________________
    public boolean possibleBipartition(int N, int[][] dislikes) 
    {
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        
        for (int i = 1; i <= N; ++i)
        {
            graph[i] = new ArrayList();
        }
        for(int i = 0 ; i < dislikes.length ; i++)
        {
            graph[dislikes[i][0]].add(dislikes[i][1]);
            graph[dislikes[i][1]].add(dislikes[i][0]);
        }
        
        int[] color = new int[N + 1];
        Arrays.fill(color , -1);
        
        for(int i = 1; i <= N ; i++)
        {
            if(color[i] == -1)
            {
                if(!isBipartite(graph , color, i))
                {
                    return false;
                }
            }
        }
        
        return true;
    }
    

    
    public boolean isBipartite(ArrayList<Integer>[] graph , int[] color , int src)
    {
        Queue<Integer> que = new LinkedList<>();
        que.add(src);
        color[src] = 1;
        
        while(que.size() != 0)
        {
            int curr = que.poll();
            for(int ele : graph[curr])
            {
                if(color[ele] == color[curr])
                {
                    return false;
                }
                
                if(color[ele] == -1)
                {
                    color[ele] = (color[curr] + 1) % 2;
                    que.add(ele);
                }
            }
        }
        
        return true;
    }


    // leetcode - 207 , Course Schedule ________________________(using graph coloring)
    public boolean canFinish(int numCourses, int[][] prerequisites) 
    {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        
        for(int i = 0 ; i < numCourses ; i++)
        {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] Edge : prerequisites)
        {
            graph[Edge[0]].add(Edge[1]);
        }
        
        int[] vis = new int[numCourses];
        
        for(int i = 0 ; i < numCourses ; i++)
        {
            if(vis[i] == 0)
            {
                if(isCyclic(graph , vis , i))
                {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean isCyclic(ArrayList<Integer>[] graph , int[] vis , int src)
    {
        if(vis[src] == 2)
        {
            return true;
        }
        
        vis[src] = 2;
        for(int ele : graph[src])
        {
            if(vis[ele] != 1)
            {
                if(isCyclic(graph , vis , ele))
                {
                    return true;
                }
            }
        }
        
        vis[src] = 1;
        return false;
    }
}