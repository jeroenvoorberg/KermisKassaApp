package Kermis;

public class Kermis {

    public static void main (String [] args) {
        System.out.println("Welkom bij de KermisApp. Wij zetten u door naar de kassa.");
        Kassa kassa = new Kassa();
        kassa.deSwitch();
    }
}