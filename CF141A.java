import java.io.*;
import java.util.HashMap;

public class CF141A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < 2; i++) {
            String g = br.readLine();
            
            for(int j = 0; j < g.length(); j++) {
                char c = g.charAt(j);
                if(map.containsKey(c)) map.put(c, map.get(c) + 1);
                else map.put(c, 1);
            }
        }
        
        String g = br.readLine();
        boolean okay = true;
        for(int i = 0; i < g.length(); i++) {
            char c = g.charAt(i);
            if(!map.containsKey(c)) {
                okay = false;
                break;
            }
            if(map.get(c) == 1) map.remove(c);
            else map.put(c, map.get(c) - 1);
        }
        
        if(okay && map.isEmpty()) pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}