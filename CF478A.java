import java.io.*;

public class CF478A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        
        int total = 0;
        for(int i = 0; i < split.length; i++) {
            total += Integer.parseInt(split[i]);
        }
        
        if(total != 0 && total % split.length == 0) pw.println(total/split.length);
        else pw.println(-1);
        
        pw.close();
    }
}