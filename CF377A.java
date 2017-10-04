import java.io.*;
import java.util.*;

public class CF377A {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static int n, m;
	
	public static void main (String[] args) throws IOException {
		String[] split = br.readLine().split(" ");
		
		n = Integer.parseInt(split[0]);
		m = Integer.parseInt(split[1]);
		int K = Integer.parseInt(split[2]);
		
		Node[][] yarra = new Node[n][m];
		Queue<Node> freeNodes = new LinkedList<>();
		
		for(int i = 0; i < yarra.length; i++) {
			String g = br.readLine();
			for(int j = 0; j < yarra[i].length; j++) {
				Node node = new Node(g.charAt(j), i, j);
				yarra[i][j] = node;
				
				if(node.val == '#')
					continue;
				
				node.val = 'X';
				freeNodes.add(node);
			}
		}
		int s = freeNodes.size();
		int count = 0;
		Queue<Node> q = new LinkedList<Node>();
		for(int i = 0; i < yarra.length; i++) {
			for(int j = 0; j < yarra[i].length; j++) {
				if(yarra[i][j].val == '#')
					continue;
				for(int k = -1; k <= 1; k++) {
					for(int l = -1; l <= 1; l++) {
						if(k == 0 && l == 0)
							continue;
						if(k * l != 0)
							continue;
						
						if(isValid(i + k, j + l) && yarra[i+k][j+l].val != '#') {
							yarra[i][j].neighbors.add(yarra[i+k][j+l]);
						}
					}
				}
				if(q.isEmpty())
					q.add(yarra[i][j]);
			}
		}
		
		while(!q.isEmpty() && count < s-K) {
			Node node = q.remove();
			
			if(node.val == '.')
				continue;
			node.val = '.';
			count++;
			
			for(Node neighbor : node.neighbors) {
				if(neighbor.val == '.')
					continue;
				q.add(neighbor);
			}
		}
		
		for(int i = 0; i < yarra.length; i++) {
			for(int j = 0; j < yarra[i].length; j++) {
				pw.print(yarra[i][j].val);
			}
			pw.println();
		}
		
		
		pw.close();
	}
	
	public static boolean isValid(int x, int y) {
		return x >= 0 && y >= 0 && x < n && y < m;
	}
	
	public static class Node {
		char val;
		ArrayList<Node> neighbors = new ArrayList<>();
		int x, y;
		
		public Node(char val, int x, int y) {
			this.val = val;
			this.x = x;
			this.y = y;
		}
	}
}
