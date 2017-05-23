import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CF501B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int numChanges = Integer.parseInt(br.readLine());
        String[] split;
        HashMap<String, String> firstToLast = new HashMap<String, String>();
        HashMap<String, String> lastToFirst = new HashMap<String, String>();
        
        for(int z = 0; z < numChanges; z++) {
            split = br.readLine().split(" ");
            String curr = split[0];
            String next = split[1];
            
            if(lastToFirst.containsKey(curr)) {
                String first = lastToFirst.get(curr);
                lastToFirst.remove(curr);
                lastToFirst.put(next, first);
                firstToLast.put(first, next);
            }
            else {
                firstToLast.put(curr, next);
                lastToFirst.put(next, curr);
            }
        }
        
        pw.println(firstToLast.size());
        for(Map.Entry<String, String> change : firstToLast.entrySet()) {
            pw.println(change.getKey() + " " + change.getValue());
        }
        
        pw.close();
    }
}
