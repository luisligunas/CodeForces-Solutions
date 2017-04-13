import java.io.*;
import java.util.*;

public class CF721A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String crossword = br.readLine();
        
        int curr = 0; //number of discovered blacks
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i = 0; i < crossword.length(); i++) {
            if(crossword.charAt(i) == 'B') curr++;
            else {
                if(curr == 0) continue;
                q.add(curr);
                curr = 0;
            }
        }
        if(curr != 0) q.add(curr);
        
        pw.println(q.size());
        for(int i = 0; !q.isEmpty(); i++) {
            if(i != 0) pw.print(" ");
            pw.print(q.remove());
        }
        pw.println();
        
        pw.close();
    }
}