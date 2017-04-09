import java.io.*;
import java.util.HashMap;

public class CF519B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        String[] split = br.readLine().split(" ");
        int[] prev = new int[split.length];
        
        for(int i = 0; i < prev.length; i++) prev[i] = Integer.parseInt(split[i]);
        
        for(int z = 0; z < 2; z++) {
            for(int i = 0; i < prev.length; i++) {
                if(hash.containsKey(prev[i])) hash.put(prev[i], hash.get(prev[i]) + 1);
                else hash.put(prev[i], 1);
            }
            
            split = br.readLine().split(" ");
            int[] curr = new int[split.length];
            
            for(int i = 0; i < curr.length; i++) curr[i] = Integer.parseInt(split[i]);
            
            for(int i = 0; i < curr.length; i++) {
                if(hash.get(curr[i]) == 1) hash.remove(curr[i]);
                else hash.put(curr[i], hash.get(curr[i]) - 1);
            }
            
            for(int i : hash.keySet()) pw.println(i);
            prev = curr;
            hash.clear();
        }
        
        pw.close();
    }
}