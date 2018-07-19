package Kermis;

public abstract class Attractie {

    String naam;
    abstract double getPrijs();
    int oppervlakte;

    public void draaien() {
        System.out.println("De attractie " + naam + " draait!");
    }
}
