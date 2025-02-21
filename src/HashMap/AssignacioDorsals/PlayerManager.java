package HashMap.AssignacioDorsals;

import java.util.*;

public class PlayerManager {

    private HashMap<Integer, Player> playerManager;

    public HashMap<Integer, Player> getPlayerManager() {
        return playerManager;
    }

    public void setPlayerManager(HashMap<Integer, Player> playerManager) {
        this.playerManager = playerManager;
    }

    public PlayerManager() {
        playerManager = new HashMap<>();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }

    public void addPlayer(int dorsal, Player player) {
        if (!playerManager.containsKey(dorsal)) {
            playerManager.put(dorsal, player);
        }
    }

    public Player searchPlayerByNumber(int number) {
        return playerManager.get(number);
    }

    public Player SearchPlayerByName(String name) {
        for (Player player : playerManager.values()) {
            if (player.getName().equalsIgnoreCase(name)) {
                return player;
            }
        }
        return null;
    }

    public void listByNumber() {
        List<Map.Entry<Integer, Player>> numberList = new ArrayList<>(playerManager.entrySet());
        numberList.sort(Map.Entry.<Integer, Player>comparingByKey());
        Iterator<Map.Entry<Integer, Player>> listIterator = numberList.iterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    public void listByAge() {
        List<Map.Entry<Integer, Player>> ageList = new ArrayList<>(playerManager.entrySet());
        ageList.sort(Comparator.comparing(entry -> entry.getValue().getAge()));
        Iterator<Map.Entry<Integer, Player>> listIterator = ageList.iterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    public void listByPosition() {
        List<Map.Entry<Integer, Player>> positionList = new ArrayList<>(playerManager.entrySet());
        positionList.sort(Comparator.comparing(entry -> entry.getValue().getPosition()));
        Iterator<Map.Entry<Integer, Player>> listIterator = positionList.iterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
