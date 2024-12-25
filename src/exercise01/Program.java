package exercise01;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int x = 0;x < n;x++) {
			for(int y = 0;y < n;y++) {
				mat[x][y] = s.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		
		for(int i = 0; i < n;i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		int negative = 0;
		for(int x = 0; x < n;x++) {
			for(int y = 0; y < n; y++) {
				if(mat[x][y] < 0) {
					negative++;
				}
			}
		}
		System.out.println("Negative Number = "+negative);
		
		s.close();
	}

}
