import java.io.*;
import java.util.*;
import java.lang.*;

public class Practice {
    public static int[][] matrix;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int nodes = Integer.parseInt(br.readLine());
         int edges = Integer.parseInt(br.readLine());

         matrix = new int[nodes][edges];
         visited = new boolean[nodes];

         for(int i = 0; i < edges; i++){
             StringTokenizer st = new StringTokenizer(br.readLine());
             int x = Integer.parseInt(st.nextToken());
             int y = Integer.parseInt(st.nextToken());
             matrix[x][y] = 1;
         }


    }

    private static void dfs(int v){
        for(int i = 0; i < matrix.length; i++){
            if (!visited[i] && matrix[v][i] == 1){
                visited[v] = true;

            }
        }

    }
}