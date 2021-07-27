package one.digitalInnovation.abstracts;

public class Programa {
    public static void main(String[] args) {
        //final FormaGeometrica formaGeometrica = new FormaGeometrica();

        final FormaGeometrica quadrado = new Quadrado("quadrado",16d);

        System.out.println(quadrado.toString());
        System.out.println(quadrado.desenha(4,4));

        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());
    }
}
