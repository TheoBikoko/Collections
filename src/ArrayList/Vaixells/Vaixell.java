package ArrayList.Vaixells;

public class Vaixell {
    private String nom;
    private double preu;
    private int edat;

    public Vaixell(String nom, Double preu, int edat) {
        this.nom = nom;
        this.preu = preu;
        this.edat = edat;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Vaixell{" +
                "edat=" + edat +
                ", nom='" + nom + '\'' +
                ", preu=" + preu +
                '}';
    }
}
