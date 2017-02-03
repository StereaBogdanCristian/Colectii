package Prob6;

import java.util.Arrays;
import java.util.Comparator;

public class Problema6 {

	public static void main(String[] args) {
		
		Object[][] a = new Object[5][5];
		
		for (int i = 0; i < a.length; i++) {
			for (int j=0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*10);
				
			}
		}
		
		afMatrice(a);
		System.out.println();
		System.out.println("*****************");
		tabSort(a,1);
		afMatrice(a);
		
	}
	
	public static void tabSort (final Object[][] a, final int c) {
		Arrays.sort(a, new Comparator<Object[]>() {
								public int compare(Object[] o1, Object[] o2) {
									Object[] linia1 = o1;
									Object[] linia2 = o2;
									return ((int)linia1[c-1] - ((int)linia2[c-1]));
							}
					});
		
	}
	
	static void afMatrice(Object[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j=0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				
			}
		
		}
	}
	
}
