package one.digitalInnovation.interfaces;

public interface Veiculo {
    String registro();

    default void ligar(){
        System.out.println("Ligando Veiculo!!");
    }

    /*void desligar();
    default void desligar(){
        System.out.println("Desligando o Veiculo!!");
    }*/
}
