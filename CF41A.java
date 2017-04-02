import java.io.*;

public class CF41A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String a = br.readLine();
        String b = br.readLine();
        
        boolean correct = false;
        if(a.length() == b.length()) {
            for(int i = 0; i < a.length(); i++) {
                if(a.charAt(i) != b.charAt(b.length() - i - 1)) break;
                if(i == a.length() - 1) correct = true;
            }
        }
        if(correct) pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}