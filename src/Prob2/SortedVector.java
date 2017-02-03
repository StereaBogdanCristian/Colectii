package Prob2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class SortedVector extends Vector<Pair> {

	Comparator<Pair> criteriu;
	
	public SortedVector(Comparator<Pair> criteriu) {
		super();
		this.criteriu = criteriu;
	}

	public void adauga(Pair o) {
		super.add(o);
		Collections.sort(this, criteriu);
	}
	
}
