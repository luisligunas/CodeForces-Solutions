import java.io.*;
import java.util.*;

public class CF490A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        Queue<Integer>[] qs = new Queue[3];
        
        for(int i = 0; i < qs.length; i++) qs[i] = new LinkedList<Integer>();
        
        for(int i = 0; i < split.length; i++) qs[Integer.parseInt(split[i]) - 1].add(i + 1);
        
        int minSize = Math.min(Math.min(qs[0].size(), qs[1].size()), qs[2].size());
        pw.println(minSize);
        
        while(minSize-- > 0) {
            pw.println(qs[0].remove() + " " + qs[1].remove() + " " + qs[2].remove());
        }
        
        pw.close();
    }
}