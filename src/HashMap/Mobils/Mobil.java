package HashMap;

public class Mobil {
    private String model;
    private String marca;
    private int numero;

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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
