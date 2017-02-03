package Prob1;

public class Name implements Comparable<Name>{

	String nume, prenume;
	
	public Name(String nume, String prenume) {
		super();
		this.nume = nume;
		this.prenume = prenume;
	}

	
	public boolean equals(Name num) {
		return ((nume == num.nume) && (prenume == num.prenume));
	}

	
	public int compareTo(Name o) {
		return nume.compareTo(o.nume);
	}

	
	public String toString() {
		return "nume: " + nume + "  prenume: " + prenume;
	}
	
}
