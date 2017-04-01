import java.io.*;

public class CF263A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        int x = -1, y = -1;
        
        for(int i = 0; i < 5; i++) {
            String g = br.readLine();
            
            if(x == -1 && g.contains("1")) {
                x = i;
                y = g.indexOf("1")/2;
            }
        }
        int answer = Math.abs(2 - x) + Math.abs(2 - y);
        pw.println(answer);
        
        pw.close();
    }
}
