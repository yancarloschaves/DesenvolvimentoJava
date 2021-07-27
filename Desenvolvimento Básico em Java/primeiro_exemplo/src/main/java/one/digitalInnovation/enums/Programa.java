package one.digitalInnovation.enums;

public class Programa {

    public static void main(String[] args) {
        //final TipoVeiculo tipoVeiculo = new TipoVeiculo();

        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //System.out.println(TipoVeiculo.valueOf("AERO"));
        System.out.println(TipoVeiculo.valueOf("AEREO"));

        for (TipoVeiculo tipo : TipoVeiculo.values()){
            System.out.println("Tipo: " + tipo);
        }

        System.out.println("Código do Status OPEN: " + Status.OPEN.getCod());
        System.out.println("Código do Status CLOSE: " + Status.CLOSE.getCod());

    }
}
