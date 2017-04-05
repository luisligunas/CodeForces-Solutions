import java.io.*;
import java.util.ArrayList;

public class CF25D {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int[] rank, parent;
    
    public static void main(String[] args) throws IOException {
        int numCities = Integer.parseInt(br.readLine());
        rank = new int[numCities];
        parent = new int[numCities];
        
        for(int i = 0; i < parent.length; i++)
            parent[i] = i;
        
        String[] split;
        ArrayList<String> delete = new ArrayList<String>();
        ArrayList<String> create = new ArrayList<String>();
        
        for(int i = 1; i < numCities; i++) {
            split = br.readLine().split(" ");
            int u = Integer.parseInt(split[0]) - 1;
            int v = Integer.parseInt(split[1]) - 1;
            
            int x = findSet(u);
            int y = findSet(v);
            
            if(x == y) delete.add((u + 1) + " " + (v + 1));
            else unionSet(x, y);
        }
        
        for(int i = 1; i < numCities; i++) {
            int x = findSet(i);
            int y = findSet(i - 1);
            
            if(x != y) {
                create.add((i) + " " + (i + 1));
                unionSet(x, y);
            }
        }
        
        pw.println(delete.size());
        for(int i = 0; i < delete.size(); i++) {
            pw.println(delete.get(i) + " " + create.get(i));
        }
        
        pw.close();
    }
    public static int findSet(int i) {
        if(parent[i] == i) return i;
        parent[i] = findSet(parent[i]);
        return parent[i];
    }
    public static void unionSet(int i, int j) {
        int x = findSet(i);
        int y = findSet(j);
        
        if(rank[x] < rank[y]) parent[x] = y;
        else {
            parent[y] = x;
            if(rank[x] == rank[y])
                rank[x]++;
        }
    }
}