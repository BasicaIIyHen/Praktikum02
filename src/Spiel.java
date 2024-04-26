public class Spiel {
    private int AnzahlStreichhoelzer;

    public Spiel(int AnzahlStreichhoelzer) {
        this.AnzahlStreichhoelzer = AnzahlStreichhoelzer;

        Ausgabe.spielstand(AnzahlStreichhoelzer);

        while (AnzahlStreichhoelzer > 0) {
            menschZiehen();
            if (AnzahlStreichhoelzer == 0) {
                Ausgabe.computerGewinnt();
            }
            computerZiehen();
            if (AnzahlStreichhoelzer == 0) {
                Ausgabe.menschGewinnt();
            }
        }

    }

    public void computerZiehen(){
        int gezogeneHoelzer = berechneComputerZug();
        AnzahlStreichhoelzer -= gezogeneHoelzer;
        Ausgabe.computerZug(gezogeneHoelzer, AnzahlStreichhoelzer);
    }

    public void menschZiehen(){
        int gezogeneHoelzer = Eingabe.leseHoelzer();

        if (gezogeneHoelzer <= AnzahlStreichhoelzer) {
            AnzahlStreichhoelzer -= gezogeneHoelzer;
            Ausgabe.menschZug(gezogeneHoelzer, AnzahlStreichhoelzer);
        } else {
            Ausgabe.zugNichtMoeglich();
            menschZiehen();
        }

    }

    private int berechneComputerZug(){
        int rest = AnzahlStreichhoelzer % 4;
        int pick = 0;

        switch (rest) {
            case 0: 
                pick = 3;
                break;
            case 1:
                pick = 1;
                break;
            case 2:
                pick = 1;
                break;
            case 3:
                pick = 2;
                break;
        }

        return pick;

    }
}    
