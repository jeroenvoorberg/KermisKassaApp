package Kermis;

public class Spin extends RisicoRijkeAttracties {
    String naam = "Tarantula";
    int prijs = 225;
    int aantalVerkochteTickets;
    int attractieOmzet;


    public int getPrijs(){
        int prijs1 = prijs;
        return prijs1;
    }
    public String getNaam() {
        String naam1 = naam;
        return naam1;
    }

    boolean opstellingsKeuring(){
        boolean keuren = false;
        if (aantalVerkochteTickets > 5) {
            keuren = true;
        }
        return keuren;
    }

}
