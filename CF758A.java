import java.io.*;

public class CF758A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        int total = 0;
        int max = 0;
        
        for(int i = 0; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            
            total += num;
            max = Math.max(max, num);
        }
        
        pw.println(max*split.length - total);
        
        pw.close();
    }
}