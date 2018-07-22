package Kermis;

import java.util.Scanner;

public class Kassa {
    private int omzetPerAttractie[]  = new int[5];
    private int omzetPerRisicoAttractie[]  = new int[7];
    private int gekochteTickets;
    private int totaleOmzet;
    private Attractie[] attracties;
    private RisicoRijkeAttracties [] risicoAttracties;

    Kassa() {
        attracties = new Attractie[5];
        attracties[1] = new Botsautos();
        attracties[2] = new Spiegelpaleis();
        attracties[3] = new Spookhuis();
        attracties[4] = new Ladderklimmen();

        risicoAttracties = new RisicoRijkeAttracties[7];
        risicoAttracties[5] = new Spin();
        risicoAttracties[6] = new Hawaii();

        Scanner sc = new Scanner(System.in);
        boolean doorgaan = true;
        while (doorgaan) {
            System.out.println("Van welke attractie wil de klant gebruik maken? \n1 -- Botsauto's \n2 -- Spiegelpaleis  \n3 -- Spookhuis  \n4 -- Ladderklimmen \n5 -- Spin  \n6 -- Hawaii \n7 -- Naar het omzet-menu \nVoer Uw Keuze in:");
            int keuzeVoorAttractie = sc.nextInt();
            if (keuzeVoorAttractie < 0 || keuzeVoorAttractie > ((attracties.length + risicoAttracties.length)+1)) {
                System.out.println("Dit is niet bekend1.");
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
        if (kva > 0 && kva < (attracties.length)) {
            Attractie attractie = attracties[kva];
            System.out.println("U heeft gekozen voor de " + attractie.getNaam() + ".");
            System.out.println("De attractie " + attractie.getNaam() + " draait.");
            totaleOmzet = totaleOmzet + (kvp * attractie.getPrijs());
            omzetPerAttractie[kva] = omzetPerAttractie[kva] + (kvp * attractie.getPrijs());
            gekochteTickets =  gekochteTickets + kvp;
        } else {
            RisicoRijkeAttracties attractie = risicoAttracties[kva];
            System.out.println("U heeft gekozen voor de " + attractie.getNaam() + ".");
            System.out.println("De attractie " + attractie.getNaam() + " draait.");
            totaleOmzet = totaleOmzet + (kvp * attractie.getPrijs());
            omzetPerRisicoAttractie[kva] = omzetPerRisicoAttractie[kva] + (kvp * attractie.getPrijs());
            gekochteTickets =  gekochteTickets + kvp;
            attractie.aantalVerkochteTickets = attractie.aantalVerkochteTickets + kvp;
            System.out.println(attractie.aantalVerkochteTickets);
            if (attractie.opstellingsKeuring()) {
                System.out.println("De " + attractie.getNaam() + " moet gekeurd worden!");
            }
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
                    System.out.println("U heeft de keuze uit: \n1 -- Botsauto's \n2 -- Spiegelpaleis  \n3 -- Spookhuis  \n4 -- Ladderklimmen \n5 -- Spin  \n6 -- Hawaii  \n7 -- Quit \nVoer Uw Keuze in:");
                    int keuzeVoorAttractie = sc.nextInt();
                    if (keuzeVoorAttractie < 0 || keuzeVoorAttractie > attracties.length+2) {
                        System.out.println("Dit is niet bekend.");
                    }
                    else if (keuzeVoorAttractie == 7) {
                        doorgaan = false;
                    } else if ((keuzeVoorAttractie > 0 && keuzeVoorAttractie < attracties.length)){
                        System.out.println("De omzet van de/het " + attracties[keuzeVoorAttractie].getNaam() + " is " + omzetPerAttractie[keuzeVoorAttractie] + " cent.");
                    }

                    else {
                        System.out.println("De omzet van de/het " + risicoAttracties[keuzeVoorAttractie].getNaam() + " is " + omzetPerRisicoAttractie[keuzeVoorAttractie] + " cent.");
                    }
                }
                break;
            default:
                System.out.println("dit is me niet bekend");
                break;
        }
    }
}