import java.io.*;

public class CF200B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        
        int total = 0;
        for(int i = 0; i < split.length; i++) {
            total += Integer.parseInt(split[i]);
        }
        pw.println(total*1.0/split.length);
        
        pw.close();
    }
}