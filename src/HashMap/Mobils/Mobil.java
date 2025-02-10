package HashMap.Mobils;

public class Mobil {
    private String model;
    private String marca;
    private String numero;

    public Mobil(String marca, String model, String numero) {
        this.marca = marca;
        this.model = model;
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", numero=" + numero +
                '}';
    }

}
