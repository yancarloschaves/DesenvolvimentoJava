package one.digitalInnovation.classes.pessoa;

import one.digitalInnovation.classes.cliente.Cliente;

public class ProgramaDoCliente {
    public static void main(String[] args) {
        final var cliente = new Cliente(24);

        cliente.getIdade();
        cliente.getPeso();

        System.out.println(cliente.relatorio()); // acesso pois o pacote é o mesmo de Pessoa
    }
}