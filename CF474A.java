import java.io.*;

public class CF474A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        int shift = (br.readLine().equals("R")) ? -1 : 1;
        String inp = br.readLine();
        
        for(int i = 0; i < inp.length(); i++) {
            pw.print(keyboard.charAt(keyboard.indexOf(inp.charAt(i)) + shift));
        }
        pw.println();
        
        pw.close();
    }
}