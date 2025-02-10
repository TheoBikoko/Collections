package ArrayList.SistemaGestioJugadors;

import java.util.ArrayList;
import java.util.Comparator;

public class PlayerManager {
   protected ArrayList<Player> players;

    public PlayerManager() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("Player added succesfully.");
    }

    public void removePlayer(String name) {
        boolean found = false;
        for (Player p : players) {
            if (p.getName().equalsIgnoreCase(name)) {
                players.remove(p);
                found = true;
                System.out.println("Player removed succesfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("The player was not found therefore it cannot be removed.");
        }
    }

    public Player findPlayerWithName(String name) {
        boolean found = false;
        for (Player p : players) {
            if (p.getName().equalsIgnoreCase(name)) return p;
        }
        return null;
    }

    public void updatePlayerScore(String name, int newScore) {
        for (Player p : players) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.setScore(newScore);
            }
        }
    }

    public ArrayList<Player> listByScore(){
        ArrayList<Player> bestScore = new ArrayList<>(players);
        players.sort(Comparator.comparingInt(Player::getScore).reversed());
        return bestScore;
    }

    public ArrayList<Player> scoreThreshold(int minScore){
        ArrayList<Player> scoreThreshold = new ArrayList<>(players);
        for(Player p : players){
            if (p.getScore() > minScore){
                scoreThreshold.add(p);
            }
        }
        scoreThreshold.sort(Comparator.comparingInt(Player::getScore).reversed());
        return scoreThreshold;
    }

    public Player bestPlayer(){
        return players.stream()
                .max(Comparator.comparingInt(Player::getScore))
                .orElse(null);

    }

    public void ShowAllPlayers(){
        if (players.isEmpty()){
            System.out.println("No players were found.");
        }
        else {
            for (Player p:players){
                System.out.println(p);
            }
        }
    }

}
