package strings.cifraDeCesar;

public class Programa {
    public static void main(String[] args) {

        Mensagem emsg = new Mensagem("zuzu saiu com a zuza para passear",3);
        System.out.println("Mensagem encriptada: "+emsg.encriptada());

        //Basta ter a mensagem e o codigo para decriptar
        Mensagem dmsg = new Mensagem("CXCX VDLX FRP D CXCD SDUD SDVVHDU",3);
        System.out.println("Mensagem decriptada: "+dmsg.decriptada());
    }
}
