package at.campus02.testprogramme;

import at.campus02.musikanten.Hahn;
import at.campus02.musikanten.Instrument;

public class MusikantenTest {

	public static void main(String[] args) {
		// Testen Sie hier Ihr Beispiel

		Hahn hahn = new Hahn(3,new Instrument("Gitarre",5.2),1);
		System.out.println(hahn.verscheucheRaeuber());

	}

}
