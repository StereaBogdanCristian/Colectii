package Prob2;

import java.util.Comparator;

public class Problema2 {
	
	public static void main(String[] args) {
		
		Comparator<Pair> criteriu1 = new Comparator<Pair>() {
												public int compare (Pair p1, Pair p2) {
													return (p1.i - p2.i);
												}
										};
		
		Comparator<Pair> criteriu2 = new Comparator<Pair>() {
											public int compare (Pair p1, Pair p2) {
												return (p1.s.compareTo(p2.s));
											}
									};								
		
		SortedVector sv1 = new SortedVector(criteriu1);
		SortedVector sv2 = new SortedVector(criteriu2);
		
		sv1.adauga(new Pair("Vlad", 5));
		sv1.adauga(new Pair("Ion", 2));
		sv1.adauga(new Pair("Robert", 9));
		sv1.adauga(new Pair("Mihai", 7));
	
		System.out.println("Sortare dupa nota");
		for (Pair pair : sv1) {
			System.out.println(pair);
		}
		
		System.out.println("**************************");
		
		
		sv2.adauga(new Pair("Vlad", 5));
		sv2.adauga(new Pair("Ion", 2));
		sv2.adauga(new Pair("Robert", 9));
		sv2.adauga(new Pair("Mihai", 7));
	
		System.out.println("Sortare dupa nume");
		for (Pair pair : sv2) {
			System.out.println(pair);
		}
		
	}

}
