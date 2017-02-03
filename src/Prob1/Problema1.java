package Prob1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Problema1 {

	public static void main(String[] args) {
		
		Name[] tab = new Name[4];
		tab[1] = new Name("Ion", "Gheorghe");
		tab[0] = new Name("Vasile", "Puscas");
		tab[2] = new Name("Radu", "Verdes");
		tab[3] = new Name("Mihai", "Ionescu");
		
		for (Name name : tab) {
			System.out.println(name);
		}
		System.out.println("********** Folosind Arrays, dupa nume ********************");
		
		Arrays.sort(tab);
		
		for (Name name : tab) {
			System.out.println(name);
		}
		
		//******************************************************
		System.out.println("************* Folosind Collections, dupa nume *****************");
			
		Vector<Name> vec = new Vector<Name>();
		vec.add(new Name("Ion", "Gheorghe"));
		vec.add(new Name("Vasile", "Puscas"));
		vec.add(new Name("Radu", "Verdes"));
		vec.add(new Name("Mihai", "Ionescu"));
		
		Collections.sort(vec);
		
		for (Name name2 : vec) {
			System.out.println(name2);
		
		}
		
	}
}
