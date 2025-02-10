package HashMap.Mobils;

import java.util.HashMap;
import java.util.Scanner;

public class conjuntMobils {
    static HashMap<String, Mobil> conjuntMobils = new HashMap<String, Mobil>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Mobil mobil1 = new Mobil("Apple", "iPhone 15 Pro Max", 692975554);
//        Mobil mobil2 = new Mobil("Samsung", "Galaxy S24 Ultra", 632587451);
//        Mobil mobil3 = new Mobil("Xiaomi", "13 Ultra", 695314782);
//        Mobil mobil4 = new Mobil("Sony", "Xperia 1 VI", 653278415);
//        Mobil mobil5 = new Mobil("Google", "Pixel 9 Pro XL", 685137498);

//        conjuntMobils.put("36541987R", mobil1);
//        conjuntMobils.put("86745993K", mobil2);
//        conjuntMobils.put("32984666K", mobil3);
//        conjuntMobils.put("62543987H", mobil4);
//        conjuntMobils.put("82354776X", mobil5);

    }
    public void afegirMobil(String dni, Mobil mobil){
        System.out.println("Si us plau, introdueixi un DNI");
        if (dni.equals(conjuntMobils.get(dni))){
            System.out.println("DNI ja existent. Si us plau, torni a provar");
        }
        else {
            System.out.println("A continuacio, introdueix la marca, model i numero de telefon del seu dispositiu");
            conjuntMobils.put(dni, new Mobil());
            System.out.println("Mòbil afegit correctament");
        }
    }
}
