import java.io.*;

public class CF467A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        int rooms = Integer.parseInt(br.readLine());
        String[] split;
        int count = 0;
        
        for(int i = 0; i < rooms; i++) {
            split = br.readLine().split(" ");
            int p = Integer.parseInt(split[0]);
            int q = Integer.parseInt(split[1]);
            
            if(q - p >= 2) count++;
        }
        
        pw.println(count);
        
        pw.close();
    }
}
