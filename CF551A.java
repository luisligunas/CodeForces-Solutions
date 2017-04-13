import java.io.*;
import java.util.*;

public class CF551A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int[] rating = new int[split.length];
        for(int i = 0; i < rating.length; i++) {
            rating[i] = Integer.parseInt(split[i]);
        }
        
        int[] sorter = rating.clone();
        Arrays.sort(sorter);
        
        for(int i = sorter.length - 1; i >= 0; i--) {
            if(map.containsKey(sorter[i])) continue;
            map.put(sorter[i], sorter.length - i);
        }
        
        for(int i = 0; i < rating.length; i++) {
            if(i != 0) pw.print(" ");
            pw.print(map.get(rating[i]));
        }
        pw.println();
        
        pw.close();
    }
}