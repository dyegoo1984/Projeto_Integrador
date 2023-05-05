package uc15_etapa02;

public class Venda {
    protected Cliente cliente;
    protected Funcionario vendedor;
    protected Catalogo projeto;
    protected String formaPagamento;
    protected String data;

    public Venda(Cliente cliente, Funcionario vendedor, Catalogo projeto, String formaPagamento, String data) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.projeto = projeto;
        this.formaPagamento = formaPagamento;
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public Catalogo getProjeto() {
        return projeto;
    }

    public void setProjeto(Catalogo projeto) {
        this.projeto = projeto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
