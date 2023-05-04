package at.campus02.musikanten;

public class Katze extends Musikant {
	protected double kratzKraft;
	
	public Katze(int aB, Instrument i , double kratzKraft) {
		super(aB,i);
		this.kratzKraft = kratzKraft;

	}

	@Override
	public int verscheucheRaeuber() {
   int verscheuchteRaeuber = (int)kratzKraft;
   if (anzahlBeine == 3) {
	   verscheuchteRaeuber = (int) kratzKraft / 2;
   }
else if (anzahlBeine <=2) {
	verscheuchteRaeuber = 1;
   }
		return verscheuchteRaeuber;
	}

	@Override
	public double spieleMusik() {
		double lautstärke;
		return lautstärke = instrument.getLautstaerke();
	}

	public double getKratzKraft() {
		return kratzKraft;
	}
	@Override //zum Überschreiben toString schreiben
	public String toString() {
		return "Katze " + kratzKraft +
				"Verscheucht: " + verscheucheRaeuber() +
				", Musiziert: " + spieleMusik();
	}
}
