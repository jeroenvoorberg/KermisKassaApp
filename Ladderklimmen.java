package Kermis;

public class Ladderklimmen extends Attractie implements GokAttractie{

    String naam = "De Ladder-zat";
    private static final int prijs = 500;
    int oppervlakte = 5;

    public int getPrijs(){
        int prijs1 = prijs;
        return prijs1;
    }
    public String getNaam() {
        String naam1 = naam;
        return naam1;
    }
    public void belastbaar(){

    }
}
