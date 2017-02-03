
package Prob5;

import java.util.Arrays;
import java.util.Comparator;

public class Problema5 {

	public static void main(String[] args) {
		
		Object[] vec = new Object[5];
		
		vec[0] = "16";
		vec[1] = "33";
		vec[2] = "44";
		vec[3] = "25";
		vec[4] = "10";
		
		Arrays.sort(vec, new Comparator<Object>() {
								public int compare(Object o1, Object o2) {
								return (((String) o2).compareTo((String) o1));
							}
		});
		
	for (Object object : vec) {
		System.out.println(object);
	}
	
	}
}
