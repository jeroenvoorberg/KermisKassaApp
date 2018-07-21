package Kermis;

import java.util.Scanner;

public class Kassa {
    private int omzetPerAttractie[]  = new int[7];
    int gekochteTickets;
    int totaleOmzet;
    private Attractie[] attracties;
    Kassa() {
        attracties = new Attractie[7];
        attracties[1] = new Botsautos();
        attracties[2] = new Spin();
        attracties[3] = new Spiegelpaleis();
        attracties[4] = new Spookhuis();
        attracties[5] = new Hawaii();
        attracties[6] = new Ladderklimmen();

        Scanner sc = new Scanner(System.in);
        boolean doorgaan = true;
        while (doorgaan) {
            System.out.println("U heeft de keuze uit de onderstaande keuzes: \n1 -- Botsauto's \n2 -- Spin \n3 -- Spiegelpaleis \n4 -- Spookhuis \n5 -- Hawaii \n6 -- Ladderklimmen \n7 -- Naar huis \nVoer Uw Keuze in:");
            int keuzeVoorAttractie = sc.nextInt();
            if (keuzeVoorAttractie == 7) {
                System.out.println("Dank voor uw bezoek. Tot ziens! (Wij hebben lekker " + totaleOmzet + " cent aan u verdient!)");
                doorgaan = false;
            } else {
                System.out.println("Hoeveel personen willen in de attractie?");
                int keuzeVoorPersonen = sc.nextInt();
                ticketKopen(keuzeVoorAttractie, keuzeVoorPersonen);
            }
        }
    }
    public void ticketKopen ( int kva, int kvp){
        if (kva < 0 || kva > attracties.length) {
            System.out.println("Dit is niet bekend.");
        } else {
            Attractie attractie = attracties[kva];
            System.out.println("U heeft gekozen voor de " + attractie.getNaam() + ".");
            System.out.println("De attractie " + attractie.getNaam() + " draait.");
            System.out.println("De omzet van de " + attractie.getNaam() + " is hierdoor " + omzet(attractie, kvp, kva) + ".");
        }
    }

    public double omzet (Attractie attractie, int i, int j){
        int omzet = attractie.getPrijs() * i;
        totaleOmzet = totaleOmzet + omzet;
        omzetPerAttractie[j] = omzetPerAttractie[j] + omzet;
        System.out.println(omzetPerAttractie[j]);
        return omzet;
    }



}