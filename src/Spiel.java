public class Spiel {
    private int AnzahlStreichhoelzer;

    public Spiel(int AnzahlStreichhoelzer) {
        this.AnzahlStreichhoelzer = AnzahlStreichhoelzer;
    }

    public void computerZiehen(){


    }


    //Problem 1: Die Methode menschZiehen() ist nicht implementiert.
    public void menschZiehen(){
    int gezogeneHoelzer = Eingabe.leseHoelzer();
    if (gezogeneHoelzer <= AnzahlStreichhoelzer) {
        AnzahlStreichhoelzer -= gezogeneHoelzer;
    } else {
         System.out.println("Sie können nicht mehr Hölzer ziehen als vorhanden sind.");
    }

    }

    private void berechneComputerZug(){


    }


}    
