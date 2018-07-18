package Kermis;

public abstract class Attractie {

    String naam;
    double prijs;
    int oppervlakte;

    public void draaien() {
        System.out.println("De attractie " + naam + " draait!");
    }
}
