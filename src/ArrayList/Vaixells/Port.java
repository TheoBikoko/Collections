package ArrayList.Vaixells;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Port {
    private ArrayList<Vaixell> vaixells;

    public Port() {
        this.vaixells = new ArrayList<>();
    }

    public void introduirVaixells(Vaixell vaixell){
        vaixells.add(vaixell);
    }

    public void buscarVaixell(String nom){
        for(Vaixell v : vaixells){
            if (v.getNom().equalsIgnoreCase(nom)){
                System.out.println("El vaixell buscat es el següent: ");
                v.toString();
                System.out.println(v);
                break;
            }
        }
    }

    public void modificarVaixell(String nom, Vaixell nouVaixell) {
        for (int i = 0; i < vaixells.size(); i++) {
            if (vaixells.get(i).getNom().equalsIgnoreCase(nom)) {
                vaixells.set(i, nouVaixell);
                System.out.println("Vaixell modificat correctament.");
                break;
            }
        }
        System.out.println("No s'ha trobat el vaixell.");
    }

    public void treureVaixell(String nom){
        for(Vaixell v : vaixells){
            if (v.getNom().equalsIgnoreCase(nom)){
                vaixells.remove(v);
                System.out.println("Vaixell eliminat correctament.");
                break;
            }
            System.out.println("No s'ha trobar el vaixell per a eliminar.");
        }
    }

    public void llistarVaixellsOrdenats(String criteri){
        if (vaixells.isEmpty()){
            System.out.println("EL port no conte cap vaixell, per tant, no es pot llistar.");
        }
        else {
            ArrayList<Vaixell> vaixellsOrdenats = new ArrayList<>(vaixells);

            switch (criteri.toLowerCase()){
                case "antiguitat":
                    vaixellsOrdenats.sort(Comparator.comparingInt(Vaixell::getEdat));
                    System.out.println("Vaixells ordenats per edat");
                    break;

                case "nom":
                    vaixellsOrdenats.sort(Comparator.comparing(Vaixell::getNom));
                    System.out.println("Vaixells ordenats per nom");
                    break;

                case "preu":
                    vaixellsOrdenats.sort(Comparator.comparingDouble(Vaixell::getPreu).reversed());
                    System.out.println("Vaixells ordenats per preu descendent");
                    break;
            }
            for (Vaixell v: vaixellsOrdenats){
                System.out.println(v);
            }
        }
    }

}