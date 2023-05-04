package at.campus02.musikanten;

public class Hahn extends Musikant {
	protected int flugWeite;
	public Hahn(int aB, Instrument i , int flugWeite) {
		super(aB,i);
		this.flugWeite = flugWeite;

	}

	@Override
	public int verscheucheRaeuber() {
		int verscheuchteRaeuber = 0;
		if (flugWeite <2) {
			verscheuchteRaeuber = (int)Math.floor(instrument.getLautstaerke());
		}
		if (flugWeite > 6){
			verscheuchteRaeuber = 1;
		}
		switch (flugWeite) {
			case 2:
				verscheuchteRaeuber = 6;
				break;
			case 3:
				verscheuchteRaeuber = 5;
				break;
			case 4:
				verscheuchteRaeuber = 4;
				break;
			case 5:
				verscheuchteRaeuber = 3;
				break;
			case 6:
				verscheuchteRaeuber = 2;
				break;
		}
		return verscheuchteRaeuber;
	}

	@Override
	public double spieleMusik() {
		return (instrument.getLautstaerke()+2)/flugWeite;
	}

	public int getFlugWeite() {
		return flugWeite;
	}
	@Override //zum Überschreiben toString schreiben
	public String toString() {
		return "Hahn" + flugWeite +
				"Verscheucht: " + verscheucheRaeuber() +
				", Musiziert: " + spieleMusik();
	}
}
