import java.io.*;

public class CF96A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String g = br.readLine();
        
        int count = 0;
        boolean lastWasZero = false;
        
        for(int i = 0; i < g.length(); i++) {
            boolean isZero = g.charAt(i) == '0';
            
            if(isZero ^ lastWasZero) {
                lastWasZero = isZero;
                count = 1;
                continue;
            }
            count++;
            if(count == 7) break;
        }
        if(count == 7) pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}