package HashMap.Mobils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConjuntMobils {
    private HashMap<String, Mobil> conjuntMobils;

    public ConjuntMobils() {
        this.conjuntMobils = new HashMap<>();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConjuntMobils cm = new ConjuntMobils();

        int opcio;
        System.out.println("Menú:");
        System.out.println("1. Afegir mòbil");
        System.out.println("2. Treure mòbil");
        System.out.println("3. Buscar mòbil per DNI");
        System.out.println("4. Buscar DNI per número de mòbil");
        System.out.println("5. Sortir");
        System.out.print("Escull una opció: ");
        opcio = input.nextInt();
        input.nextLine();

        switch (opcio) {
            case 1:
                cm.afegirMobil(input);
                break;
            case 2:
                cm.treureMobil(input);
                break;
            case 3:
                cm.buscarMobil(input);
                break;
            case 4:
                cm.buscarDni(input);
                break;
            case 5:
                System.out.println("Sortint...");
                break;
            default:
                System.out.println("Opció no vàlida.");
        }
    }

    public void afegirMobil(Scanner input) {
        System.out.print("Introdueix el DNI: ");
        String dni = input.nextLine();
        if (conjuntMobils.containsKey(dni)) {
            System.out.println("Aquest DNI ja té un mòbil associat.");
            return;
        }
        System.out.print("Introdueix la marca: ");
        String marca = input.nextLine();
        System.out.print("Introdueix el model: ");
        String model = input.nextLine();
        System.out.print("Introdueix el número: ");
        String numero = input.nextLine();

        conjuntMobils.put(dni, new Mobil(marca, model, numero));
        System.out.println("Mòbil afegit correctament.");
    }

    public void treureMobil(Scanner input) {
        System.out.print("Introdueix el DNI: ");
        String dni = input.nextLine();
        if (conjuntMobils.remove(dni) != null) {
            System.out.println("Mòbil eliminat correctament.");
        } else {
            System.out.println("No s'ha trobat cap mòbil associat a aquest DNI.");
        }
    }

    public void buscarMobil(Scanner input) {
        System.out.print("Introdueix el DNI: ");
        String dni = input.nextLine();
        Mobil mobil = conjuntMobils.get(dni);
        if (mobil != null) {
            System.out.println("Mòbil associat: " + mobil);
        } else {
            System.out.println("No s'ha trobat cap mòbil associat a aquest DNI.");
        }
    }

    public void buscarDni(Scanner input) {
        System.out.print("Introdueix el número de mòbil: ");
        String numero = input.nextLine();
        for (Map.Entry<String, Mobil> entry : conjuntMobils.entrySet()) {
            if (entry.getValue().getNumero().equals(numero)) {
                System.out.println("El número pertany al DNI: " + entry.getKey());
                return;
            }
        }
        System.out.println("No s'ha trobat cap DNI associat a aquest número.");
    }
}