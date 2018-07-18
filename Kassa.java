package Kermis;

import java.util.Scanner;

public class Kassa {
    double totaleOmzet;

    public double omzet (double prijs) {
        System.out.println("Hoeveel personen willen in de attractie?");
        Scanner sc = new Scanner(System.in);
        int keuze = sc.nextInt();
//        System.out.println(ba.prijs);
        double omzet = prijs * keuze;
        System.out.println(omzet);
//        System.out.println(Botsautos.prijs);
        return omzet;
    }
}