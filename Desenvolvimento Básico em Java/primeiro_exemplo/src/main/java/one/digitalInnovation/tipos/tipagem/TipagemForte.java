package one.digitalInnovation.tipos.tipagem;

public class TipagemForte {
    public static void main(String[] args) {
    // Uma vez atribuido um tipo a uma variavel não é possível mudar esse tipo
        String texto  = "meu texto";

    //  texto = 1000;  //NOK

        Integer numero = 1024;

        numero = 512; //OK
    }
}
