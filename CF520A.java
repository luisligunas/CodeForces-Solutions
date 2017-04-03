import java.io.*;
import java.util.HashSet;

public class CF520A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        HashSet<Character> hash = new HashSet<Character>();
        br.readLine();
        char[] letters = br.readLine().toLowerCase().toCharArray();
        
        for(char c : letters) {
            hash.add(c);
        }
        
        if(hash.size() == 26) pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}