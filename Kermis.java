package Kermis;

import java.util.Scanner;

public class Kermis {

    private Attractie[] attracties;
    private Kassa kassa;

    Kermis() {
        Botsautos botsauto = new Botsautos();
        Spin spin = new Spin();
        Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
        Spookhuis spookhuis = new Spookhuis();
        Hawaii hawaii = new Hawaii();
        Ladderklimmen ladderklimmen = new Ladderklimmen();
        kassa = new Kassa();

        attracties = new Attractie[7];
        attracties[1] = new Botsautos();
        attracties[2] = spin;

        public void ticketGekocht(int keuzeVoorAttractie, int keuzeVoorPersonen){

            if (keuzeVoorAttractie < 1 || keuzeVoorAttractie > attracties.length - 1) {
                System.out.println("dit is me niet bekend");
            } else {
                Attractie attractie = attracties[keuzeVoorAttractie];
                System.out.println("U heeft gekozen voor de " + attractie.naam);
                kassa.omzet(attractie.getPrijs());
                attractie.draaien();
            }
        }
    }
        public static void main (String[]args){
            Kermis kermis = new Kermis();
            Scanner sc = new Scanner(System.in);
            System.out.println("Welke attractie?");
            int keuzeVoorAttractie = sc.nextInt();
            System.out.println("Hoeveel personen willen in de attractie?");
            int keuzeVoorPersonen = sc.nextInt();
            kermis.ticketGekocht(keuzeVoorAttractie - 1, keuzeVoorPersonen);
        }
}

