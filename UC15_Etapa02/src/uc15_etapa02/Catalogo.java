package uc15_etapa02;

public class Catalogo {
    protected int codigoProjeto;
    protected String descricao;
    protected double area;
    private double valor;

    public Catalogo(int codigoProjeto, String descricao, double area, double valor) {
        this.codigoProjeto = codigoProjeto;
        this.descricao = descricao;
        this.area = area;
        this.valor = valor;
    }

    public int getCodigoProjeto() {
        return codigoProjeto;
    }

    public void setCodigoProjeto(int codigoProjeto) {
        this.codigoProjeto = codigoProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
