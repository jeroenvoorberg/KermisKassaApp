package Kermis;

import java.util.Scanner;

public class Kermis {

    private Attractie[] attracties;
    private Kassa kassa;

    Kermis() {
        kassa = new Kassa();
        attracties = new Attractie[7];
        attracties[1] = new Botsautos();
        attracties[2] = new Spin();
        }

    public void ticketGekocht(int keuzeVoorAttractie, int keuzeVoorPersonen) {

        if (keuzeVoorAttractie < 0 || keuzeVoorAttractie > attracties.length - 1) {
            System.out.println("Dit is niet bekend.");
        } else {
            Attractie attractie = attracties[keuzeVoorAttractie];
            System.out.println("U heeft gekozen voor de " + attractie.naam);
            kassa.omzet(attractie.getPrijs());
            attractie.draaien();
        }

    }

    public static void main (String [] args) {
        Kermis kermis = new Kermis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welkom bij KermisKassa 3000! \nU heeft de keuze uit de onderstaande keuzes: \n0 -- Botsauto's \n1 -- Spin \n2 -- Spiegelpaleis \n3 -- Spookhuis \n4 -- Hawaii \n5 -- Ladderklimmen \nVoer Uw Keuze in:");
        int keuzeVoorAttractie = sc.nextInt();
        System.out.println("Hoeveel personen willen in de attractie?");
        int keuzeVoorPersonen = sc.nextInt();
        kermis.ticketGekocht(keuzeVoorAttractie-1, keuzeVoorPersonen);

    }
}