import java.io.*;
import java.util.HashMap;

public class CF4C {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int numUsers = Integer.parseInt(br.readLine());
        HashMap<String, Integer> nameCount = new HashMap<String, Integer>();
        
        for(int i = 0; i < numUsers; i++) {
            String name = br.readLine();
            
            if(!nameCount.containsKey(name)) {
                pw.println("OK");
                nameCount.put(name, 1);
            }
            else {
                pw.println(name + nameCount.get(name));
                nameCount.put(name, nameCount.get(name) + 1);
            }
        }
        
        pw.close();
    }
}