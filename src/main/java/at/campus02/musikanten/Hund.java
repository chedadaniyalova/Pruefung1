package at.campus02.musikanten;

public class Hund extends Musikant {
	protected double bellLautstaerke;
	public Hund(int aB, Instrument i , double bellLautstaerke) {
		super(aB, i);
		this.bellLautstaerke = bellLautstaerke;

	}

	@Override
	public int verscheucheRaeuber() {

		if (bellLautstaerke > instrument.getLautstaerke()) {
			return (int) Math.floor(bellLautstaerke);
		} else {
			return (int) Math.floor(instrument.getLautstaerke());
		}

	}

	@Override
	public double spieleMusik() {
		double sum = 2/((bellLautstaerke) + instrument.getLautstaerke());
		return sum;
	}

	public double getBellLautstaerke() {
		return bellLautstaerke;
	}
	@Override //zum Überschreiben toString schreiben
	public String toString() {
		return "Hund " + bellLautstaerke +
				"Verscheucht: " + verscheucheRaeuber() +
				", Musiziert: " + spieleMusik();
	}
}
