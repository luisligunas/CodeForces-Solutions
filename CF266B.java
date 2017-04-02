import java.io.*;

public class CF266B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int time = Integer.parseInt(br.readLine().split(" ")[1]);
        char[] line = br.readLine().toCharArray();
        
        while(time-- > 0) {
            for(int i = 0; i < line.length - 1; i++) {
                if(line[i] == 'B' && line[i + 1] == 'G') {
                    line[i] = 'G';
                    line[i + 1] = 'B';
                    i++;
                }
            }
        }
        
        for(int i = 0; i < line.length; i++) {
            pw.print(line[i]);
        }
        pw.println();
        
        pw.close();
    }
}