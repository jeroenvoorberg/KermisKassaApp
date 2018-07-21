package Kermis;

import java.util.Scanner;

public class Kassa {
    private int omzetPerAttractie[]  = new int[7];
    private int gekochteTickets;
    private int totaleOmzet;
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
            System.out.println("Van welke attractie wil de klant gebruik maken? \n1 -- Botsauto's \n2 -- Spin \n3 -- Spiegelpaleis \n4 -- Spookhuis \n5 -- Hawaii \n6 -- Ladderklimmen \n7 -- Naar het omzet-menu \nVoer Uw Keuze in:");
            int keuzeVoorAttractie = sc.nextInt();
            if (keuzeVoorAttractie < 0 || keuzeVoorAttractie > attracties.length +1) {
                System.out.println("Dit is niet bekend.");
            }
            else if (keuzeVoorAttractie == 7) {
                doorgaan = false;
            } else {
                System.out.println("Hoeveel personen willen in de attractie?");
                int keuzeVoorPersonen = sc.nextInt();
                ticketKopen(keuzeVoorAttractie, keuzeVoorPersonen);
                System.out.println("Het totaal aantal verkochte tickets is: " + gekochteTickets + "\n");
            }
        }
    }

    public void ticketKopen (int kva, int kvp){
        if (kva < 0 || kva > attracties.length) {
            System.out.println("Dit is niet bekend.");
        } else {
            Attractie attractie = attracties[kva];
            System.out.println("U heeft gekozen voor de " + attractie.getNaam() + ".");
            System.out.println("De attractie " + attractie.getNaam() + " draait.");
            totaleOmzet = totaleOmzet + (kvp * attractie.getPrijs());
            omzetPerAttractie[kva] = omzetPerAttractie[kva] + (kvp * attractie.getPrijs());
            gekochteTickets =  gekochteTickets + kvp;
        }
    }

    public void deSwitch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welke omzet wilt u weten? \nYoets '1' voor totale omzet. \nToets 2 om per attractie de omzet te gaan bekijken.");
        int omzetMenu = sc.nextInt();
        switch(omzetMenu) {
            case 1 :
                System.out.println("De huidige totale omzet is " + totaleOmzet);
                break;
            case 2 :
                boolean doorgaan = true;
                while (doorgaan) {
                    System.out.println("U heeft de keuze uit: \n1 -- Botsauto's \n2 -- Spin \n3 -- Spiegelpaleis \n4 -- Spookhuis \n5 -- Hawaii \n6 -- Ladderklimmen \n7 -- Quit \nVoer Uw Keuze in:");
                    int keuzeVoorAttractie = sc.nextInt();
                    if (keuzeVoorAttractie < 0 || keuzeVoorAttractie > attracties.length +1) {
                        System.out.println("Dit is niet bekend.");
                    }
                    else if (keuzeVoorAttractie == 7) {
                        doorgaan = false;
                    } else {
                        System.out.println("De omzet van de/het " + attracties[keuzeVoorAttractie].getNaam() + " is " + omzetPerAttractie[keuzeVoorAttractie] + " cent.");
                    }
                }
                break;
            default:
                System.out.println("dit is me niet bekend");
                break;
        }
    }
}