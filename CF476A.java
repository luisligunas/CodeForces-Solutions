import java.io.*;

public class CF476A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]); //steps
        int m = Integer.parseInt(split[1]); //div num
        
        int min = -1;
        for(int i = (n+1)/2; i <= n; i++) {
            if(i % m == 0) {
                min = i;
                break;
            }
        }
        pw.println(min);
        
        pw.close();
    }
}