public class Ausgabe {
    
    public static void zahlEingeben() {
        System.out.println("Bitte geben Sie eine Zahl ein: ");
    }

    public static void keineZahl() {
        System.out.println("Das ist keine Zahl!");
    }

    public static void zahlNichtImBereich() {
        System.out.println("Die Zahl ist nicht im Bereich (Zwischen 1 und 3)!");
    }

    public static void menschGewinnt() {
        System.out.println("Der Mensch gewinnt!");
    }

    public static void computerGewinnt() {
        System.out.println("Der Computer gewinnt!");
    }

    public static void zugNichtMoeglich() {
        System.out.println("Der Zug ist nicht möglich!");
    }

    public static void spielstand(int AnzahlStreichhoelzer) {
        System.out.println("Es sind noch " + AnzahlStreichhoelzer + " Streichhölzer übrig.");
    }

    public static void menschZug(int gezogeneHoelzer, int verbleibendeHoelzer) {
        System.out.println("Der Mensch zieht " + gezogeneHoelzer + " Streichhölzer.");
        System.out.println("Es sind noch " + verbleibendeHoelzer + " Streichhölzer uebrig.");
    }

    public static void computerZug(int gezogeneHoelzer, int verbleibendeHoelzer) {
        System.out.println("Der Computer zieht " + gezogeneHoelzer + " Streichhoelzer.");
        System.out.println("Es sind noch " + verbleibendeHoelzer + " Streichhölzer uebrig.");
    }


}
