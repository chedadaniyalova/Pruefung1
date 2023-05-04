package at.campus02.musikanten;

public class Esel extends Musikant {
	protected double trittkraft;

	public Esel(int aB, Instrument i, double trittkraft) {
		super(aB,i);
		this.trittkraft = trittkraft;

	}

	@Override
	public int verscheucheRaeuber() {
		return (int) trittkraft * anzahlBeine;
	}

	@Override
	public double spieleMusik() {
		double lautstärke;
		return lautstärke = instrument.getLautstaerke();

	}

	public double getTrittkraft() {
		return trittkraft;
	}

	@Override //zum Überschreiben toString schreiben
	public String toString() {
	return "Esel " + trittkraft +
			"Verscheucht: " + verscheucheRaeuber() +
			", Musiziert: " + spieleMusik();
	}


}
