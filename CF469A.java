import java.io.*;
import java.util.HashSet;

public class CF469A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        HashSet<Integer> hash = new HashSet<Integer>();
        int levels = Integer.parseInt(br.readLine());
        
        String[] split = br.readLine().split(" ");
        for(int i = 1; i < split.length; i++) {
            hash.add(Integer.parseInt(split[i]));
        }
        split = br.readLine().split(" ");
        for(int i = 1; i < split.length; i++) {
            hash.add(Integer.parseInt(split[i]));
        }
        
        if(hash.size() == levels) pw.println("I become the guy.");
        else pw.println("Oh, my keyboard!");
        
        pw.close();
    }
}