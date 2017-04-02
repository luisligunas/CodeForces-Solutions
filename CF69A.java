import java.io.*;

public class CF69A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int numForces = Integer.parseInt(br.readLine());
        String[] split;
        int[] xyz = new int[3];
        
        for(int i = 0; i < numForces; i++) {
            split = br.readLine().split(" ");
            
            for(int j = 0; j < xyz.length; j++) {
                xyz[j] += Integer.parseInt(split[j]);
            }
        }
        
        if(xyz[0] == 0 && xyz[1] == 0 && xyz[2] == 0)
            pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}