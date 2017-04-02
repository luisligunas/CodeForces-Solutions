import java.io.*;

public class CF208A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split("WUB");
        
        boolean first = true;
        
        for(int i = 0; i < split.length; i++) {
            if(split[i].isEmpty()) continue;
            
            if(first) first = false;
            else pw.print(" ");
            pw.print(split[i]);
        }
        pw.println();
        
        pw.close();
    }
}