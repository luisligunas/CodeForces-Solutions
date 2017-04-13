import java.io.*;

public class CF474B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        int[] pilesMax = new int[split.length + 2];
        
        pilesMax[pilesMax.length - 1] = Integer.MAX_VALUE;
        for(int i = 0; i < split.length; i++) {
            pilesMax[i+1] = pilesMax[i] + Integer.parseInt(split[i]);
        }
        
        br.readLine();
        split = br.readLine().split(" ");
        
        for(int i = 0; i < split.length; i++) {
            int juicy = Integer.parseInt(split[i]);
            int left = 0, right = pilesMax.length - 1;
            
            while(right - left >= 2) {
                int mid = (right + left)/2;
                
                if(pilesMax[mid] >= juicy && juicy > pilesMax[mid - 1]) {
                    pw.println(mid);
                    break;
                }
                if(pilesMax[mid] < juicy) left = mid;
                else right = mid;
            }
        }
        
        pw.close();
    }
}