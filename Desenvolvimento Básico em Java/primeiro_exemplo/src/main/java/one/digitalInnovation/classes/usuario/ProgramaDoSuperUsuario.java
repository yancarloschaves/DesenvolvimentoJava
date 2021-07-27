package one.digitalInnovation.classes.usuario;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args){
        final var superUsuario = new SuperUsuario( "root", "1234");

        superUsuario.getLogin();
        superUsuario.getLogin();

        String root = superUsuario.nome;
    }
}
