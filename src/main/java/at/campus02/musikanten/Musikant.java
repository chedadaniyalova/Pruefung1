package at.campus02.musikanten;

import java.util.Arrays;

public abstract class Musikant { //Hier abstrakte Klasse erstellen
    protected int anzahlBeine;
    protected Instrument instrument;

    public Musikant(int anzahlBeine, Instrument instrument) {
        this.anzahlBeine = anzahlBeine;
        this.instrument = instrument;
    }

    public int getAnzahlBeine (){
      return anzahlBeine;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return "Musikant{" +
                "anzahlBeine=" + anzahlBeine +
                ", instrument=" + instrument +
                "Verscheucht: " + verscheucheRaeuber() +
                ", Musiziert: " + spieleMusik() +
                '}';
    }


    //Abstrakte Methoden
    public abstract int verscheucheRaeuber ();
    public abstract double spieleMusik();

}
