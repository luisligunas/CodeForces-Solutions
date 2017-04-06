import java.io.*;

public class CF155A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        
        int[] points = new int[split.length];
        
        for(int i = 0; i < points.length; i++) {
            points[i] = Integer.parseInt(split[i]);
        }
        
        int min = points[0], max = points[0];
        int amazing = 0;
        
        for(int i = 1; i < points.length; i++) {
            if(points[i] < min) {
                amazing++;
                min = points[i];
            }
            else if(points[i] > max) {
                amazing++;
                max = points[i];
            }
        }
        pw.println(amazing);
        
        pw.close();
    }
}