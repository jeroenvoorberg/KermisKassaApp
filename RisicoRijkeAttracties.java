package Kermis;

public abstract class RisicoRijkeAttracties {
    String naam;
    int prijs;
    int oppervlakte;
    int attractieOmzet;
    int aantalVerkochteTickets;

    public abstract int getPrijs();
    public abstract String getNaam();

    abstract boolean opstellingsKeuring();
}
