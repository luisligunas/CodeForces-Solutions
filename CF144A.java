import java.io.*;

public class CF144A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        int[] heights = new int[split.length];
        
        for(int i = 0; i < heights.length; i++) {
            heights[i] = Integer.parseInt(split[i]);
        }
        int min = Integer.MAX_VALUE, max = -1;
        int minInd = -1, maxInd = -1;
        
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] > max) {
                max = heights[i];
                maxInd = i;
            }
            if(heights[i] <= min) {
                min = heights[i];
                minInd = i;
            }
        }
        int answer = heights.length + maxInd - minInd - 1;
        if(minInd < maxInd) answer--;
        
        pw.println(answer);
        
        pw.close();
    }
}