package Kermis;

public class Kassa {
    private double omzetPerAttractie[]  = new double[7];
    int gekochteTickets;

    public double omzet (double prijs, int i) {
        double omzet = prijs * i;
        totaleOmzet = totaleOmzet + omzet;
        return omzet;
    }

}