import java.io.*;

public class CF116A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int stops = Integer.parseInt(br.readLine());
        String[] split;
        
        int max = 0;
        int count = 0;
        
        for(int i = 0; i < stops; i++) {
            split =  br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            
            count += b - a;
            max = Math.max(max, count);
        }
        
        pw.println(max);
        
        pw.close();
    }
}