import java.io.*;

public class CF705A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int layers = Integer.parseInt(br.readLine());
        pw.print("I hate ");
        
        for(int i = 1; i < layers; i++) {
            if(i % 2 == 1) pw.print("that I love ");
            else pw.print("that I hate ");
        }
        pw.println("it");
        
        pw.close();
    }
}