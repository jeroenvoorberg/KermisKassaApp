package Kermis;

public abstract class Attractie {

    String naam;

    abstract double getPrijs();
    abstract int oppervlakte;

    public void draaien() {
        System.out.println("De attractie " + naam + " draait!");
    }
}
