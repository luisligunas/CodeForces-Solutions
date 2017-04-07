import java.io.*;

public class CF268B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int numButtons = Integer.parseInt(br.readLine());
        
        int x = 0;
        int dx = 1;
        int ddx = 1;
        
        while(ddx <= numButtons) {
            x += dx;
            dx += ddx;
            ddx++;
        }
        
        pw.println(x);
        
        pw.close();
    }
}