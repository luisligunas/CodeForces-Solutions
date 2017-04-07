import java.io.*;

public class CF677A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int height = Integer.parseInt(br.readLine().split(" ")[1]);
        String[] split = br.readLine().split(" ");
        
        int width = split.length;
        for(int i = 0; i < split.length; i++) {
            if(Integer.parseInt(split[i]) > height)
                width++;
        }
        pw.println(width);
        
        pw.close();
    }
}