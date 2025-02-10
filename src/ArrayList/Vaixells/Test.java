package ArrayList.Vaixells;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean programaEnCurs = true;

        Port port = new Port();

        Vaixell vaixell1 = new Vaixell("Moby Dick", 46985.34, 25);
        Vaixell vaixell2 = new Vaixell("Going Merry", 265314.28, 18);
        Vaixell vaixell3 = new Vaixell("Flying Dutch", 436985.147, 11);
        Vaixell vaixell4 = new Vaixell("Thousand Sunny", 36589.21, 46);
        Vaixell vaixell5 = new Vaixell("Black Pearl", 2361.258, 93);
        Vaixell vaixell6 = new Vaixell("Pearl Harbor", 16598.24, 3);

        port.introduirVaixells(vaixell1);
        port.introduirVaixells(vaixell2);
        port.introduirVaixells(vaixell3);
        port.introduirVaixells(vaixell4);
        port.introduirVaixells(vaixell5);
        port.introduirVaixells(vaixell6);

        while (programaEnCurs) {
            System.out.println("Benvingut al port gestor de vaixells. Si us plau, esculleixi una opcio: \n" +
                    "a. Introduir vaixell \n" +
                    "b. Buscar vaixell \n" +
                    "c. Modificar vaixell \n" +
                    "d. Treure vaixell \n" +
                    "e. Llistar vaixells \n" +
                    "f. Sortir del programa");
            switch (input.nextLine()) {
                case "a":
                    System.out.println("Si us plau, introdueixi el nom del nou vaixell que desitja afegir");
                    String nomNouVaixell = input.next();
                    System.out.println("A continuacio, indiqui el preu del nou vaixell :");
                    Double preuNouVaixell = input.nextDouble();
                    System.out.println("Finalment, indiqui l'edat del nou vaixell :");
                    int edatNouVaixell = input.nextInt();
                    Vaixell vaixell = new Vaixell(nomNouVaixell, preuNouVaixell, edatNouVaixell);
                    port.introduirVaixells(vaixell);
                    System.out.println("Vaixell afegit correctament.");
                    break;

                case "b":
                    System.out.println("Si us plau, introdueixi el nom del vaixell que desitja buscar");
                    port.buscarVaixell(input.nextLine());
                    break;

                case "c":
                    System.out.println("Si us plau, introdueixi el nom del vaixell que desitja modificar. A continuacio, indiqui per ordre el nom, preu i edat del nou vaixell:");
                    port.modificarVaixell(input.nextLine(), new Vaixell(input.next(), input.nextDouble(), input.nextInt()));
                    break;

                case "d":
                    System.out.println("Si us plau, introdueixi el nom del vaixell que desitja treure:");
                    port.treureVaixell(input.nextLine());
                    break;

                case "e":
                    System.out.println("Si us plau, escrigui a continuacio quin criteri vol utilitzar per a ordenar la llista de vaixells: \n" +
                    "antiguitat, preu, o nom");
                    port.llistarVaixellsOrdenats(input.nextLine());
                    break;

                case "f":
                    programaEnCurs = false;
                    System.out.println("Gracies per utilitzar els nostres serveis.");
                    break;
            }
        }
    }
}
