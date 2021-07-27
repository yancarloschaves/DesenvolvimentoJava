package one.digitalInnovation.tipos.tipagem;

public class TipoInferido {
    public static void main(String[] args) {

        var numero = Integer.valueOf("123456");
        
        var texto = "O numero é : ";

        System.out.println(texto + numero);
    }
}
