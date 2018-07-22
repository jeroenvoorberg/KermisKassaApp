package Kermis;


public class Hawaii extends RisicoRijkeAttracties{
    private final String naam = "Aloha";
    private static final int prijs = 290;
    int attractieOmzet;
    int aantalVerkochteTickets;


    public int getPrijs(){
        int prijs1 = this.prijs;
        return prijs1;
    }
    public String getNaam() {
        String naam1 = this.naam;
        return naam1;
    }

    boolean opstellingsKeuring(){

        return true;
    }
}