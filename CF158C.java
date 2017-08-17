import java.io.*;
import java.util.*;

public class CF {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> folders = new ArrayList<String>();
		String[] split;
		
		while(n-- > 0) {
			String s = br.readLine();
			if(s.equals("pwd")) {
				pw.print("/");
				for(int i = 0 ; i < folders.size(); i++) {
					pw.print(folders.get(i) + "/");
				}
				pw.println();
			}
			else {
				split = s.substring(3).split("/");
				int i = 0;
				if(split.length == 0 || split[0].isEmpty()) {
					//absolute path
					folders.clear();
					i = 1;
				}
				for(; i < split.length; i++) {
					if(split[i].equals("..")) {
						folders.remove(folders.size() - 1);
					}
					else {
						folders.add(split[i]);
					}
				}
			}
		}
		pw.close();
	}
}