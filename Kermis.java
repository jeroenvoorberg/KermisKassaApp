package Kermis;

import java.util.Scanner;

public class Kermis {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        Botsautos botsauto = new Botsautos();
//        System.out.println(botsauto.prijs);
        Spin spin = new Spin();
        Attractie spiegelpaleis = new Spiegelpaleis();
        Attractie spookhuis = new Spookhuis();
        Attractie hawaii = new Hawaii();
        Attractie ladderklimmen = new Ladderklimmen();
        Kassa kassa = new Kassa();
        System.out.println("Welke attractie?");

        int keuze = sc.nextInt();

        switch (keuze) {
            default:
                System.out.println("dit is me niet bekend");
            case 1:
                System.out.println("U heeft gekozen voor de Botsauto's!");
                kassa.omzet(botsauto.prijs);
                botsauto.draaien();
                break;
            case 2:
                System.out.println("U heeft gekozen voor Spin");
                kassa.omzet(spin.prijs);
                spin.draaien();
                break;
            case 3:
                System.out.println("U heeft gekozen voor het Spiegelpaleis");
                kassa.omzet(spiegelpaleis.prijs);
                spiegelpaleis.draaien();
                break;
            case 4:
                System.out.println("U heeft gekozen voor het Spookhuis");
                kassa.omzet(spookhuis.prijs);
                spookhuis.draaien();
                break;
            case 5:
                System.out.println("U heeft gekozen voor Hawaii");
                kassa.omzet(hawaii.prijs);
                hawaii.draaien();
                break;
            case 6:
                System.out.println("U heeft gekozen voor Ladderklimmen");
                kassa.omzet(ladderklimmen.prijs);
                ladderklimmen.draaien();
                break;
        }
    }
}