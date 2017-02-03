package Test;

public class TestStiva {
	
	public static void afiseaza(Stack s) {
		System.out.println("Continutul stivei este " + s);
	}
	
	public static void main(String[] args) {
		try {
			Stack s2 = new StackImpl2();
			afiseaza(s2);
			s2.push(new Integer(7));
			s2.push(new Integer(2));
			afiseaza(s2);
			s2.push(new Integer(6));
			s2.push(new Integer(4));
			afiseaza(s2);
			System.out.println(s2.peek());
		} 
		catch (StackException e) {
			System.err.println("Eroare");
			e.printStackTrace();
		}
	}

}
