package Prob2;

public class Pair {

	public String s;
	public int i;
	public Pair(String s, int i) {
		super();
		this.s = s;
		this.i = i;
	}
	
	public String toString() {
		return "nume " + s + " nota " + i;
	}
	
	public boolean equals(Pair p) {
		return (this.i == p.i) && (this.s ==p.s);
	}
}
