import java.io.*;

public class CF136A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        int[] givers = new int[split.length];
        
        for(int i = 0; i < split.length; i++) {
            givers[Integer.parseInt(split[i]) - 1] = i + 1;
        }
        
        for(int i = 0; i < givers.length; i++) {
            if(i != 0) pw.print(" ");
            pw.print(givers[i]);
        }
        pw.println();
        
        pw.close();
    }
}