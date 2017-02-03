package prob4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.Vector;

public class Problema4 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		Vector<String> vec = new Vector<String>();
		
		String linie="";
		while ((linie = br.readLine()) != null) {
			vec.add(linie);
		}
		
		for (String string : vec) {
			System.out.println(string);
		}
		System.out.println();
		System.out.println("**************** Sortare dupa coloana " + Integer.parseInt(args[1]) + "*****************");
		
		Collections.sort(vec, new Comparator<String>() {
									public int compare(String o1, String o2) {
										StringTokenizer st1 = new StringTokenizer(o1);
										StringTokenizer st2 = new StringTokenizer(o2);
										String cuv1 = "";
										String cuv2 = "";
										for (int i = 0; i < Integer.parseInt(args[1]); i++) {
											cuv1 = st1.nextToken();
											cuv2 = st2.nextToken();
										}
										return cuv1.compareTo(cuv2);
										}	
								});
		
		for (String string : vec) {
			System.out.println(string);
		}
		
		br.close();
	}

}
