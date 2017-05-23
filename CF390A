import java.io.*;
import java.util.HashSet;

public class CF390A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int numClocks = Integer.parseInt(br.readLine());
        HashSet<Integer> x = new HashSet<Integer>();
        HashSet<Integer> y = new HashSet<Integer>();
        
        String[] split;
        for(int z = 0; z < numClocks; z++) {
            split = br.readLine().split(" ");
            
            x.add(Integer.parseInt(split[0]));
            y.add(Integer.parseInt(split[1]));
        }
        
        pw.println(Math.min(x.size(), y.size()));
        
        pw.close();
    }
}
