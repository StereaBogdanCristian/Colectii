package Test2;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
	
	public static void main(String[] args) {
		
		String [][] mat = new String [5][5];
		
		gen(mat);
		
		mat[1][2] = "aaaa"; mat[1][0] = "aaaa"; mat[1][3] = "aaaa"; mat[1][1] = "aaaa"; mat[1][4] = "bbbb";
		mat[2][2] = "aaaa"; mat[2][0] = "aaaa"; mat[2][3] = "aaaa"; mat[2][1] = "aaaa"; mat[2][4] = "aaaa";
		
		afiseazaMat(mat);
		
		System.out.println();
		System.out.println("*******************************");
		
		Arrays.sort(mat, new Comparator<String[]>() {
									public int compare(String[] o1, String[] o2) {
									int ret = o1[0].compareTo(o2[0]);
									int max = mat.length;
									int iterator = 0;
									while ((ret == 0) && (iterator < max-1)) {
										iterator++;
										ret = o1[iterator].compareTo(o2[iterator]);
									}
									return ret;
			}
			
							});
		
		afiseazaMat(mat);
		
	}

	
	static void gen(String[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = genLitera() + genLitera() + genLitera() + genLitera();
			}
		}
	}
	
	static String genLitera() {
		return String.valueOf((char)(97 + (int)(Math.random()*26)));
	}
	
	static void afiseazaMat(String[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}	
	}
	
}