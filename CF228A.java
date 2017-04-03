import java.io.*;
import java.util.HashSet;

public class CF228A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        HashSet<Integer> colors = new HashSet<Integer>();
        String[] split = br.readLine().split(" ");
        
        for(int i = 0; i < split.length; i++) {
            colors.add(Integer.parseInt(split[i]));
        }
        
        pw.println(split.length - colors.size());
        
        pw.close();
    }
}