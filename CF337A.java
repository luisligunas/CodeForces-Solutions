import java.io.*;
import java.util.Arrays;

public class CF337A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        int students = Integer.parseInt(br.readLine().split(" ")[0]);
        String[] split = br.readLine().split(" ");
        
        int[] puzzles = new int[split.length];
        for(int i = 0; i < puzzles.length; i++) {
            puzzles[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(puzzles);
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= puzzles.length - students; i++) {
            min = Math.min(min, puzzles[i + students - 1] - puzzles[i]);
        }
        pw.println(min);
        
        pw.close();
    }
}