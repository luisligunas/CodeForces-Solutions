import java.io.*;

public class CF344A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        int numMagnets = Integer.parseInt(br.readLine());
        
        int changes = 0;
        boolean prev = br.readLine().equals("10");
        
        for(int i = 1; i < numMagnets; i++) {
            if(br.readLine().equals("10") ^ prev) {
                prev = !prev;
                changes++;
            }
        }
        pw.println(changes + 1);
        
        pw.close();
    }
}