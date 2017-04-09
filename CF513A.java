import java.io.*;

public class CF513A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int n1 = Integer.parseInt(split[0]);
        int n2 = Integer.parseInt(split[1]);
        
        if(n1 > n2) pw.println("First");
        else pw.println("Second");
        
        pw.close();
    }
}