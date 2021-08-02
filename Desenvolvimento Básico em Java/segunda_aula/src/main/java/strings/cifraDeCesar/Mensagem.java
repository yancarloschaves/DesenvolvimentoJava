package strings.cifraDeCesar;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;


public class Mensagem implements CifraDeCesar {
    String msg;
    int cod;

    public Mensagem(final String msg, final int cod){
        this.msg = msg.toUpperCase(); //lidar com caracteres uppercase para usar tabela ASCII
        this.cod = cod;
    }

    @Override
    public String encriptada() {
        CharacterIterator charIt = new StringCharacterIterator(msg);
        StringBuilder emsg = new StringBuilder();
        int ascLetra; //vai armazenar o codigo ASCII do char

        // CharacterIterator.DONE eh fim de arquivo(string)
        while (charIt.current() != CharacterIterator.DONE){

            //verifica se o char eh um espaco em branco
            if (Character.isWhitespace(charIt.current())){
                emsg.append(" ");
                charIt.next();
            }

            ascLetra = charIt.current() + cod;

            //voltar ao inicio dos chars, eles vão de 65 até 90(A ao Z)
            //quando uma encriptacao ultrapassa 90 ele volta ao inicio
            //exemplo: ZUZA encriptado com chave 3, Z(3) = 93, voltando ao inicio
            //64+3=67 => C (comeca com 64 para incluir 65)
            if(ascLetra > 90){
                ascLetra -= 90;
                ascLetra += 64;
            }

            emsg.append(Character.toString(ascLetra));
            charIt.next();
        }

        return emsg.toString();
    }

    @Override
    public String decriptada() {
        CharacterIterator charIt = new StringCharacterIterator(msg);
        StringBuilder dmsg = new StringBuilder();
        int ascLetra; //vai armazenar o codigo ASCII do char

        // CharacterIterator.DONE eh fim de arquivo(string)
        while (charIt.current() != CharacterIterator.DONE){

            //verifica se o char eh um espaco em branco
            if (Character.isWhitespace(charIt.current())){
                dmsg.append(" ");
                charIt.next();
            }

            ascLetra = charIt.current() - cod;

            //Vale o mesmo conceito da encriptacao, se menor que 65 sai do intervalo
            // dos nossos Chars da tabela ASCII
            if(ascLetra < 65){
                ascLetra = 64 - ascLetra;
                ascLetra = 90- ascLetra;
            }

            dmsg.append(Character.toString(ascLetra));
            charIt.next();
        }

        return dmsg.toString();
    }
}
