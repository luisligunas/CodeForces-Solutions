import java.io.*;
import java.util.*;

public class CF493B {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
    public static void main(String[] args) throws IOException {
        int numMoves = Integer.parseInt(br.readLine());
        
        Queue<Integer> firstMoves = new LinkedList<Integer>() {};
        Queue<Integer> secondMoves = new LinkedList<Integer>() {};
        
        long first = 0, second = 0;
        boolean last = false; //false = first moved last
        
        for(int z = 0; z < numMoves; z++) {
            int points = Integer.parseInt(br.readLine());
            
            if(points < 0) {
                second -= points;
                secondMoves.add(-points);
                last = true;
            }
            else {
                first += points;
                firstMoves.add(points);
                last = false;
            }
        }
        String winner = "";
        
        if(first > second) winner = "first";
        else if(first < second) winner = "second";
        else {
            while(!firstMoves.isEmpty()) {
                int firstPoint = firstMoves.remove();
                int secondPoint = secondMoves.remove();
                if(firstPoint == secondPoint) continue;
                
                if(firstPoint > secondPoint) winner = "first";
                else winner = "second";
                break;
            }
            if(winner.isEmpty()) {
                if(firstMoves.size() > secondMoves.size()) winner = "first";
                else if(firstMoves.size() < secondMoves.size()) winner = "second";
                else if(last) winner = "second";
                else winner = "first";
            }
        }
        pw.println(winner);
        
        pw.close();
    }
}
