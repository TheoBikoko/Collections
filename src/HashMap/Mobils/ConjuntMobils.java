package HashMap.Mobils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class ConjuntMobils {
     private HashMap<String, Mobil> conjuntMobils;

    public ConjuntMobils() {
        this.conjuntMobils = new HashMap<>();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConjuntMobils cm = new ConjuntMobils();
        cm.afegirMobil(input);
        cm.treureMobil(input);
        cm.buscarMovil(input);


    }
    public void afegirMobil(Scanner input){
        System.out.println("Si us plau, afegeixi un DNI");
        String dni = input.nextLine();
        if (conjuntMobils.containsKey(dni)){
            System.out.println("El DNI ja ha sigut introduit anteriorment. Si us plau, torni a provar.");
        }
        else {
            System.out.println("Si us plau, introdueix la marca, model i numero de telefon del mobil a afegir:");
            Mobil mobil = new Mobil(input.nextLine(), input.nextLine(), input.nextInt());
            conjuntMobils.put(dni, mobil);
            System.out.println("Mobil afegit correctament");
        }
    }

    public void treureMobil(Scanner input){
        System.out.println("Si us plau, introdueixi el DNI de l'estudiant per a treure el mobil: ");
        String dni = input.nextLine();
        if (conjuntMobils.containsKey(dni)){
            conjuntMobils.remove(dni);
            System.out.println("El mobil s'ha eliminat correctament.");
        }
    }

    public Collection<Mobil> buscarMovil(Scanner input){
        System.out.println("Si us plau, introdueixi el DNI de l'estudiant per buscar el mobil: ");
        String dni = input.nextLine();
        if (conjuntMobils.containsKey(dni)){
            System.out.println("El mobil associat al DNI " + dni + " és el següent: ");
            return conjuntMobils.values();
        }
        return null;
    }

//    public Collection<Mobil> buscarDni(Scanner input){
//        System.out.println("Si us plau, introdueixi el numero de telefon per a trobar el DNI: ");
//        String numero = input.nextLine();
//        if (conjuntMobils.containsValue(numero)){
//            System.out.println("El DNI associat al numero " + numero + " és el següent: ");
//            return conjuntMobils.ge;
//        }
//        return null;
//    }

}

