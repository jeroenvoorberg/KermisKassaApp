package Kermis;

import java.util.Scanner;

public class Kermis {

    private Attractie[] attracties;
    private Kassa kassa;

    Kermis() {
        kassa = new Kassa();
        attracties = new Attractie[6];
        attracties[1] = new Botsautos();
        attracties[2] = new Spin();
        attracties[3] = new Spiegelpaleis();
        attracties[4] = new Spookhuis();
        attracties[5] = new Hawaii();
        attracties[6] = new Ladderklimmen();
        }

    public void ticketGekocht(int keuzeVoorAttractie, int keuzeVoorPersonen) {
        if (keuzeVoorAttractie < 0 || keuzeVoorAttractie > attracties.length + 1) {
            System.out.println("Dit is niet bekend.");
        } else {
            Attractie attractie = attracties[keuzeVoorAttractie];
            System.out.println("U heeft gekozen voor de " + attractie.getNaam()+".");
            System.out.println("De omzet van de " + attractie.getNaam() + " is hierdoor " + kassa.omzet(attractie.getPrijs(), keuzeVoorPersonen)+".");
            System.out.println(kassa.totaleOmzet);
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        boolean doorgaan = true;
        while (doorgaan) {
            System.out.println("U heeft de keuze uit de onderstaande keuzes: \n1 -- Botsauto's \n2 -- Spin \n3 -- Spiegelpaleis \n4 -- Spookhuis \n5 -- Hawaii \n6 -- Ladderklimmen \n7 -- Naar huis \nVoer Uw Keuze in:");
            int keuzeVoorAttractie = sc.nextInt();
            if (keuzeVoorAttractie == 7){
                System.out.println("Dank voor uw bezoek. Tot ziens!");
                doorgaan = false;
            }
            else {
                System.out.println("Hoeveel personen willen in de attractie?");
                int keuzeVoorPersonen = sc.nextInt();
                Kermis kermis = new Kermis();
                kermis.ticketGekocht(keuzeVoorAttractie, keuzeVoorPersonen);
            }
        }
    }
}