package one.digitalInnovation.statics;

public class Programa {
    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bipede";

        final Cachorro viraLatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLatas.zoologia);

        System.out.println(Cachorro.late()); // Consegue chamar sem instanciar por ser static

    }
}
