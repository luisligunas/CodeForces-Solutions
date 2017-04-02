import java.io.*;

public class CF472A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        boolean[] composite = new boolean[n];
        
        for(int i = 2; i < composite.length; i++) {
            if(!composite[i]) {
                for(int j = 2; i*j < composite.length; j++) {
                    composite[i*j] = true;
                }
            }
        }
        for(int i = 0; i < composite.length; i++) {
            if(composite[i] && composite[n - i]) {
                pw.println(i + " " + (n - i));
                break;
            }
        }
        
        pw.close();
    }
}