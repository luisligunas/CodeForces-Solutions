import java.io.*;
import java.util.HashSet;

public class CF236A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        HashSet<Character> set = new HashSet<>();
        
        String g = br.readLine();
        
        for(int i = 0; i < g.length(); i++) {
            set.add(g.charAt(i));
        }
        if(set.size() % 2 == 1) pw.println("IGNORE HIM!");
        else pw.println("CHAT WITH HER!");
        
        pw.close();
    }
}
