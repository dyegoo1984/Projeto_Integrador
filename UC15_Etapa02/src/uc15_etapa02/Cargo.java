package uc15_etapa02;

public class Cargo {
    protected String cargo;
    private double remuneracao;

    public Cargo(String cargo, double remuneracao) {
        this.cargo = cargo;
        this.remuneracao = remuneracao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }
    
    
}
