import java.util.*;
import java.io.*;

public class CF2A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		int lines = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<String, Integer>(); //stores indices in ArrayList
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> scores = new ArrayList<Integer>();
		Queue<String> inps = new LinkedList<String>();
		String[] split;
		
		while(lines-- > 0) {
			String s = br.readLine();
			inps.add(s);
			split = s.split(" ");
			
			if(!map.containsKey(split[0])) {
				map.put(split[0], scores.size());
				names.add(split[0]);
				scores.add(0);
			}
			
			int ind = map.get(split[0]);
			scores.set(ind, scores.get(ind) + Integer.parseInt(split[1]));
		}
		
		int max = Integer.MIN_VALUE;
		HashSet<Integer> topScorers = new HashSet<Integer>();
		
		for(int i = 0; i < scores.size(); i++) {
			if(scores.get(i) > max) {
				max = scores.get(i);
				topScorers.clear();
			}
			
			if(scores.get(i) == max)
				topScorers.add(i);
		}
		
		scores.clear();
		for(int i = 0; i < names.size(); i++)
			scores.add(0);
		
		int winningIndex = -1;
		
		while(!inps.isEmpty()) {
			split = inps.remove().split(" ");
			
			int ind = map.get(split[0]);
			scores.set(ind, scores.get(ind) + Integer.parseInt(split[1]));
			
			if(scores.get(ind) >= max && topScorers.contains(ind)) {
				winningIndex = ind;
				break;
			}
		}
		
		pw.println(names.get(winningIndex));
		
		pw.close();
	}
}