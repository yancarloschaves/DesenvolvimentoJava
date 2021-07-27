package one.digitalInnovation.classes.pessoa;

import one.digitalInnovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman","123456");

        batman.getLogin();
        //batman.getSenha();  //Error

        //String nomeDoCliente = batman.nome; //ERROR
    }
}
