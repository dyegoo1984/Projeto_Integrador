package uc15_etapa02;

public class Funcionario extends Pessoa {
    protected int codigoFuncional;
    protected Cargo cargo;

    public Funcionario(int codigoFuncional, Cargo cargo, String nome, String cpf, String rg, Endereco endereco, Contato contato) {
        super(nome, cpf, rg, endereco, contato);
        this.codigoFuncional = codigoFuncional;
        this.cargo = cargo;
    }

    
    
    
}
