package one.digitalInnovation.classes.pessoa;

public class ProgramaPessoaFisica {
    public static void main(String[] args) {
        final PessoaFisica pessoaFisica = new PessoaFisica(33,89.63f);

        System.out.println(pessoaFisica.relatorio());
    }
}
