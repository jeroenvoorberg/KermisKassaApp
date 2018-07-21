package Kermis;


public class Hawaii extends Attractie{
    private final String naam = "Aloha";
    private static final int prijs = 290;
    int attractieOmzet;

    public int getPrijs(){
        int prijs1 = this.prijs;
        return prijs1;
    }
    public String getNaam() {
        String naam1 = this.naam;
        return naam1;
    }
}