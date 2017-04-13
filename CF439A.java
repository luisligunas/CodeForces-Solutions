import java.io.*;

public class CF439A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int d = Integer.parseInt(br.readLine().split(" ")[1]);
        String[] split = br.readLine().split(" ");
        int total = 0;
        
        for(int i = 0; i < split.length; i++) {
            total += Integer.parseInt(split[i]);
        }
        
        if(total + (split.length - 1)*10 > d) pw.println(-1);
        else pw.println((d - total)/5);
        
        pw.close();
    }
}