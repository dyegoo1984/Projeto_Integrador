package uc15_etapa02;

public class Cliente extends Pessoa {
    protected int codigoCliente;

    public Cliente(int codigoCliente, String nome, String cpf, String rg, Endereco endereco, Contato contato) {
        super(nome, cpf, rg, endereco, contato);
        this.codigoCliente = codigoCliente;
    }   
}
