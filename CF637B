import java.io.*;
import java.util.*;

public class CF637B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int numMessages = Integer.parseInt(br.readLine());
        Stack<String> messages = new Stack<String>();
        
        for(int z = 0; z < numMessages; z++) {
            messages.push(br.readLine());
        }
        
        HashSet<String> passed = new HashSet<String>();
        while(!messages.isEmpty()) {
            String friend = messages.pop();
            
            if(passed.contains(friend)) continue;
            passed.add(friend);
            pw.println(friend);
        }
        
        pw.close();
    }
}
