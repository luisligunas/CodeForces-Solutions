import java.io.*;

public class CF510A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String[] split = br.readLine().split(" ");
        int row = Integer.parseInt(split[0]);
        int col = Integer.parseInt(split[1]);
        char snake = '#', empty = '.';
        
        StringBuilder full = new StringBuilder(), skipped = new StringBuilder();
        for(int i = 0; i < col; i++) full.append(snake);
        for(int i = 1 ; i < col; i++) skipped.append(empty);
        
        for(int i = 1; i <= row; i++) {
            if(i % 2 == 1) pw.println(full);
            else if(i % 4 == 0) pw.println(snake + skipped.toString());
            else pw.println(skipped.toString() + snake);
        }
        
        pw.close();
    }
}