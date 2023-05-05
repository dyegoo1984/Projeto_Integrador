package uc15_etapa02;

public class Contato {
    private String telefone1, telefone2, email;

    public Contato(String telefone1, String telefone2, String email) {
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
