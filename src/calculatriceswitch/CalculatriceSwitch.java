/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatriceswitch;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class CalculatriceSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        afficherTitre();

        System.out.println("Quel est le premier nombre?");
        int nombre1 = scan.nextInt();
        double nb1 = nombre1;
        System.out.println("Quel est le deuxieme nombre?");
        int nombre2 = scan.nextInt();
        double nb2 = nombre2;

        System.out.println("--------------------");

        System.out.print(" Que voulez-vous faire avec les chiffres" + " " + nombre1 + " et " + nombre2 + "\n"
                + " Selectionnez 1 pour + " + "\n" + " Selectionnez 2 pour - " + "\n"
                + " Selectionnez 3 pour * " + "\n" + " Selectionnez 4 pour / "
                + "\n" + "Faite votre choix !" + "\n");

        int choice = scan.nextInt();

        
        switch (choice) {

            case 1:
                System.out.println(nb1 + " + " + nb2 + " = " + Double.sum(nb1, nb2));
                break;
            case 2:
                System.out.println(nb1 + " - " + nb2 + " = " + Double.sum(nb1, ((-1) * nb2)));
                break;
            case 3:
                System.out.println(nb1 + " * " + nb2 + " = " + (nb1 * nb2));
                break;
            case 4:
                System.out.println(nb1 + " / " + nb2 + " = " + (nb1 / nb2));
                break;
            
                
                
        }

    }

    static void afficherTitre() {

        String m = "";
        System.out.println("Bienvenue dans la calculatrice!");
    }

}
