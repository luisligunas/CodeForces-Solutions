import java.io.*;

public class CF579A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        pw.println(Integer.bitCount(Integer.parseInt(br.readLine())));
        
        pw.close();
    }
}