import java.io.*;

public class CF339B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        long roadSize = Long.parseLong(br.readLine().split(" ")[0]);
        String[] split = br.readLine().split(" ");
        
        long curr = 1;
        long totalTime = 0;
        
        for(int i = 0; i < split.length; i++) {
            long task = Long.parseLong(split[i]);
            totalTime += (task - curr + roadSize) % roadSize;
            curr = task;
        }
        pw.println(totalTime);
        
        pw.close();
    }
}