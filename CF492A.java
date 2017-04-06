import java.io.*;

public class CF492A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int blocks = Integer.parseInt(br.readLine());
        int level = 0;
        int total = 0;
        
        while(total <= blocks) {
            level++;
            total += level*(level+1)/2;
            
        }
        pw.println(level - 1);
        
        pw.close();
    }
}