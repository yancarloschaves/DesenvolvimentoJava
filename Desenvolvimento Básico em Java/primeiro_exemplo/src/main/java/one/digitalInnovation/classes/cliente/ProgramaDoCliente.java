package one.digitalInnovation.classes.cliente;

public class ProgramaDoCliente {
    public static void main(String[] args) {
        final var cliente = new Cliente(24);

        cliente.getIdade();
        cliente.getPeso();

        //System.out.println(cliente.relatorio()); // não acesso pois o pacote é diferente
    }
}
