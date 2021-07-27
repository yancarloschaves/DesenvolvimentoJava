package one.digitalInnovation.interfaces;

public class Fiesta implements Carro, Veiculo{

    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }

    @Override
    public String registro() {
        return "78RWHG5N69Y8";
    }
}
