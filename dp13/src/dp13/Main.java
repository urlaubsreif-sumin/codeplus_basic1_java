package dp13;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int N = Integer.parseInt(br.readLine());
			int[] d = new int[N + 1];
			for(int i = 1; i < N + 1; i++) {
				d[i] = -1;
				for(int j = 1; j * j <= i; j++) {
					if(d[i] == -1 || d[i] > d[i - j * j] + 1) {
						d[i] = d[i - j * j] + 1;
					}
				}
			}
			
			System.out.println(d[N]);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}