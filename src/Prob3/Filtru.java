package Prob3;

import java.io.File;
import java.io.FilenameFilter;

public class Filtru implements FilenameFilter {

	String extensie;
	
	Filtru (String extensie) {
		this.extensie = extensie;
	}
	public boolean accept(File dir, String nume) {
		return (nume.endsWith(extensie));
	}

}
