import java.io.*;

public class CF158A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        
        int k = Integer.parseInt(split[1]);
        
        split = br.readLine().split(" ");
        int kth = Integer.parseInt(split[k-1]);
        
        int count = 0;
        for(int i = 0; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            
            if(num > 0 && num >= kth) count++;
        }
        pw.println(count);
        
        pw.close();
    }
}