package uc15_etapa02;

public class Menu {

    public void titulo() {
        System.out.println("""
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        ***********************************************************************************************
                        CONSTRUTORA OLIVEIRA LTDA   * * *   Terminal  Gerencial                      
        ***********************************************************************************************
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        """);
    }

    public void menu0() {
        System.out.println("""
                        INICIO = Selecione uma das opções abaixo
        
                (1)COMERCIAL                    (2)ADMINISTRAÇÃO                (3)SAIR
        """);
    }

    public void menu1() {
        System.out.println("""
                        COMERCIAL = Selecione uma das opções abaixo
        
                (1)CATÁLOGO - Cadastro          (3)VENDA - Cadastro             (5)CLIENTE - Consulta 
                (2)CATÁLOGO - Consulta          (4)VENDA - Consulta             (6)VOLTAR
        """);
    }

    public void menu2() {
        System.out.println("""
                        ADMINISTRAÇÃO = Selecione uma das opções abaixo
        
                (1)FUNCIONÁRIOS - Cadastro      (2)FUNCIONÁRIOS - Consulta      (3)VOLTAR
        """);
    }

    public void submenu1() {
        System.out.println("""
                (1)Continuar                    (2)Voltar
        """);
    }

    public void separador() {
        System.out.println("""
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        """);
    }

    public void cursor() {
        System.out.print("*_");
    }

    public void imagem() {
        System.out.println("""
                _____________________       _____________________       _____________________
                |                   |       |                   |       |                   |
                |                   |       |                   |       |                   |
                |                   |       |                   |       |                   |
                |     Imagem 1      |       |     Imagem 2      |       |      Planta       |
                |                   |       |                   |       |                   |
                |                   |       |                   |       |                   |
                |___________________|       |___________________|       |___________________|

        """);
    }
}
