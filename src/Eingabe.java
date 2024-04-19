import java.io.InputStream;
import java.io.InputStreamReader;

public class Eingabe {
    
    public static int leseZahl() {
        Ausgabe.zahlEingeben();
        InputStreamReader isr = new InputStreamReader(System.in);

        try{
            int zahl = isr.read();
            return zahl;
        } catch (Exception e) {
            Ausgabe.keineZahl();
            return leseZahl();
        }
    }

    public static int leseHoelzer(int AnzahlStreichhoelzer) {
        int zahl = leseZahl();
        if(zahl < 1 || zahl > 3) {
            Ausgabe.zahlNichtImBereich();
            return leseHoelzer(AnzahlStreichhoelzer);
        } else if(zahl > AnzahlStreichhoelzer) {
            Ausgabe.zugNichtMoeglich();
            return leseHoelzer(AnzahlStreichhoelzer);
        } else {
            return zahl;
        }
    }
}   
