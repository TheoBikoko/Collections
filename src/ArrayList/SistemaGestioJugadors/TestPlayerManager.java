package ArrayList.SistemaGestioJugadors;

import java.util.Scanner;

public class TestPlayerManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PlayerManager manager = new PlayerManager();
        boolean programaEnCurs = true;

        Player player1 = new Player("Theo", 75);
        Player player2 = new Player("Mamadou", 100);
        Player player3 = new Player("Julia", 26);
        Player player4 = new Player("Marti", 48);
        Player player5 = new Player("Victor", 91);

        manager.players.add(player1);
        manager.players.add(player2);
        manager.players.add(player3);
        manager.players.add(player4);
        manager.players.add(player5);

        while (programaEnCurs) {
            System.out.println("Select an option: \n" +
                    "a. Add player \n" +
                    "b. Remove player \n" +
                    "c. Find player with name \n" +
                    "d. Update player Score \n" +
                    "e. List players by score (descending) \n" +
                    "f. List players that surpass score threshold \n" +
                    "g. Show best player \n" +
                    "h. Show all players \n" +
                    "i. Exit");
            switch (input.nextLine()) {
                case "a":
                    System.out.println("Please, introduce the name of the new player.");
                    String playerName = input.nextLine();
                    System.out.println("Now, introduce the score: ");
                    int playerScore = input.nextInt();

                    Player player = new Player(playerName, playerScore);
                    manager.addPlayer(player);
                    break;

                case "b":
                    System.out.println("Please, introduce the name of the player you wish to remove.");
                    manager.removePlayer(input.nextLine());
                    break;

                case "c":
                    System.out.println("Please, introduce the name of the player you wish to find.");
                    manager.findPlayerWithName(input.nextLine());
                    break;

                case "d":
                    System.out.println("Please, introduce the name of the player and the new score you want to apply.");
                    manager.updatePlayerScore(input.nextLine(), input.nextInt());
                    break;

                case "e":
                    System.out.println("Player ranking ordered by score: ");
                    manager.listByScore();
                    break;

                case "f":
                    System.out.println("Please, introduce the score threshold (only players above the introduced score will show up in the list):");
                    manager.scoreThreshold(input.nextInt());
                    break;

                case "g":
                    System.out.println("Currently, the best player is: ");
                    manager.bestPlayer();
                    break;

                case "h":
                    System.out.println("The player full list is the following: ");
                    manager.ShowAllPlayers();
                    break;

                case "i":
                    programaEnCurs = false;
                    System.out.println("Exiting the program...");
                    break;
            }
        }
    }
}


