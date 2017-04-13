import java.io.*;
import java.util.Arrays;

public class CF701A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        br.readLine();
        String[] split = br.readLine().split(" ");
        Card[] cards = new Card[split.length];
        
        for(int i = 0; i < cards.length; i++) {
            cards[i] = new Card(Integer.parseInt(split[i]), i + 1);
        }
        Arrays.sort(cards);
        
        for(int i = 0; i < cards.length/2; i++) {
            pw.println(cards[i].ind + " " + cards[cards.length - 1 - i].ind);
        }
        
        pw.close();
    }
    public static class Card implements Comparable<Card> {
        int val, ind;
        
        public Card(int val, int ind) {
            this.val = val;
            this.ind = ind;
        }
        
        @Override
        public int compareTo(Card o) {
            return val - o.val;
        }
        
    }
}