import java.io.*;

public class CF270A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine());
        
        for(int z = 0; z < tC; z++) {
            int angle = Integer.parseInt(br.readLine());
            boolean okay = false;
            
            for(int n = 3; n <= 360; n++) {
                if(360 % n != 0) continue;
                if(angle == 180 - 360/n) {
                    okay = true;
                    break;
                }
            }
            
            if(okay) pw.println("YES");
            else pw.println("NO");
        }
        
        pw.close();
    }
}