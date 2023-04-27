package Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(tk.nextToken()); // 10
		int X = Integer.parseInt(tk.nextToken()); // 5
			
		tk = new StringTokenizer(br.readLine());
		
		while (tk.hasMoreTokens()) {
			int number = Integer.parseInt(tk.nextToken());
			if (number < X) {
				System.out.print(number + " ");
			}
		}
		
	
			
	}
}
