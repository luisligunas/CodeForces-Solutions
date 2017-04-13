import java.io.*;
import java.util.*;

public class CF37A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < split.length; i++) {
            int length = Integer.parseInt(split[i]);
            
            if(map.containsKey(length)) map.put(length, map.get(length) + 1);
            else map.put(length, 1);
        }
        
        int max = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()) max = Math.max(max, e.getValue());
        
        pw.println(max + " " + map.size());
        
        pw.close();
    }
}