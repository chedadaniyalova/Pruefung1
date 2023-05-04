package at.campus02.musikanten;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Quartett {

	ArrayList <Musikant> band;

	public Quartett(ArrayList<Musikant> musikants) {
		this.band = musikants;
	}

	public void add(Musikant m) {
	band.add(m);
	}
	public boolean istQuartett() {
		if (band.size()  == 4) {
			return true;
		} else {
			return false;
		}
	}

	
	public int gemeinsamRaeuberVerscheucht() {
		Iterator <Musikant> it = band.iterator();

		// TODO	
		return 0;
	}
	public double durchschnittlicheLautstaerke()
	{
		// TODO
		return 0;
	}
	
	public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis)
	{ 
		// TODO
		return null;
	}
	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl()
	{
		// TODO
		return null;
	}
	public void printLautStaerkeAbsteigend()
	{
		// TODO
	}
}
