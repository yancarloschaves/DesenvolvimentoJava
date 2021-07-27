package one.digitalInnovation.classes.cliente;

import one.digitalInnovation.classes.pessoa.Pessoa;

public class Cliente extends Pessoa {
    public Cliente(final Integer idade){
        super(idade); //chama construtor de Pessoa com um unico parametro idade
    }
}
