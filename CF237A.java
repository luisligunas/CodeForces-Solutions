import java.io.*;

public class CF237A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        int numCustomers = Integer.parseInt(br.readLine());
        int count = 1, max = 1;
        String prev = br.readLine();
        
        for(int i = 1; i < numCustomers; i++) {
            String curr = br.readLine();
            
            if(curr.equals(prev)) count++;
            else count = 1;
            
            prev = curr;
            max = Math.max(max, count);
        }
        
        pw.println(max);
        
        pw.close();
    }
}