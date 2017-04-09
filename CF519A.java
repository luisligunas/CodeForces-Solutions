import java.io.*;
import java.util.*;

public class CF519A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('Q', 9);
        map.put('R', 5);
        map.put('B', 3);
        map.put('N', 3);
        map.put('P', 1);
        map.put('K', 0);
        
        int black = 0, white = 0;
        
        for(int i = 0; i < 8; i++) {
            String g = br.readLine();
            for(int j = 0; j < g.length(); j++) {
                if(g.charAt(j) == '.') continue;
                
                if(map.containsKey(g.charAt(j))) white += map.get(g.charAt(j));
                else black += map.get(Character.toUpperCase(g.charAt(j)));
            }
        }
        
        if(white > black) pw.println("White");
        else if(white < black) pw.println("Black");
        else pw.println("Draw");
        
        pw.close();
    }
}