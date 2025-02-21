package HashMap.AssignacioDorsals;

import java.util.Scanner;

public class PlayerTest {
    public static void main(String[] args) {
        PlayerManager manager = new PlayerManager();
        Scanner input = new Scanner(System.in);
        int opcio;
        boolean execucio = true;

        while (execucio) {
            System.out.println("\nMenú:");
            System.out.println("1. Afegir jugador");
            System.out.println("2. Buscar jugador per dorsal");
            System.out.println("3. Buscar jugador per nom");
            System.out.println("4. Llistar jugadors per dorsal");
            System.out.println("5. Llistar jugadors per edat");
            System.out.println("6. Llistar jugadors per posició");
            System.out.println("0. Sortir");
            System.out.print("Escull una opció: ");
            opcio = input.nextInt();
            input.nextLine();

            switch (opcio) {
                case 1:
                    System.out.print("Introdueix el numero: ");
                    int number = input.nextInt();
                    input.nextLine();
                    System.out.print("Introdueix el nom: ");
                    String name = input.nextLine();
                    System.out.print("Introdueix l'edat: ");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.print("Introdueix la posició: ");
                    String position = input.nextLine();
                    manager.addPlayer(number, new Player(name, age, position));
                    break;
                case 2:
                    System.out.print("Introdueix el numero: ");
                    number = input.nextInt();
                    input.nextLine();
                    System.out.println(manager.searchPlayerByNumber(number));
                    break;
                case 3:
                    System.out.print("Introdueix el nom: ");
                    name = input.nextLine();
                    System.out.println(manager.SearchPlayerByName(name));
                    break;
                case 4:
                    manager.listByNumber();
                    break;
                case 5:
                    manager.listByAge();
                    break;
                case 6:
                    manager.listByPosition();
                    break;
                case 0:
                    System.out.println("Sortint...");
                    execucio = false;
                    break;
                default:
                    System.out.println("Opció no vàlida, torna-ho a intentar.");
            }
        }
    }

}

