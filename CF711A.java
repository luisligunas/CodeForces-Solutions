import java.io.*;

public class CF711A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int rows = Integer.parseInt(br.readLine());
        
        StringBuilder finalBus = new StringBuilder();
        boolean haveSatDown = false;
        String[] row;
        
        for(int i = 0; i < rows; i++) {
            row = br.readLine().split("\\|");
            
            for(int j = 0; j < row.length; j++) {
                if(!haveSatDown && row[j].equals("OO")) {
                    row[j] = "++";
                    haveSatDown = true;
                }
                
                if(j != 0) finalBus.append("|");
                finalBus.append(row[j]);
            }
            finalBus.append("\n");
        }
        
        if(haveSatDown) pw.print("YES\n" + finalBus);
        else pw.println("NO");
        
        pw.close();
    }
}