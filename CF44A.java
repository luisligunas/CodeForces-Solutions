import java.io.*;
import java.util.*;

public class CF44A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int numLeaves = Integer.parseInt(br.readLine());
        HashSet<String> hash = new HashSet<String>();
        
        for(int z = 0; z < numLeaves; z++) {
            hash.add(br.readLine());
        }
        
        pw.println(hash.size());
        
        pw.close();
    }
}
