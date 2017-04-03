import java.io.*;
import java.util.HashSet;

public class CF443A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String g = br.readLine();
        String[] split = g.substring(1, g.length() - 1).split(", ");
        HashSet<Character> letters = new HashSet<Character>();
        
        if(!split[0].isEmpty()) {
            for(int i = 0; i < split.length; i++) {
                letters.add(split[i].charAt(0));
            }
        }
        
        pw.println(letters.size());
        
        pw.close();
    }
}