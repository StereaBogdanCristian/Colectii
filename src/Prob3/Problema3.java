package Prob3;

import java.io.File;

public class Problema3 {
	
	public static void main(String[] args) {
		try {
			File director = new File(".");
			String[] lista;
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
				lista = director.list(new Filtru(args[i]));
				for (String string : lista) {
					System.out.println(string);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
