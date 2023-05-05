package uc15_etapa02;

import java.util.Scanner;

public class UC15_Etapa02 {

    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        Formulario form = new Formulario();
        Menu menu = new Menu();
        int option_0, option_1, option_2, sub_option;

        //Povoamento do sistema para fins de teste
        Cargo cargo1 = new Cargo("Gerente Geral", 5000.00);
        Cargo cargo2 = new Cargo("Gerente Administrativo", 4200.00);
        Cargo cargo3 = new Cargo("Supervisor", 3300.00);
        Cargo cargo4 = new Cargo("Vendedor", 2200.00);
        Endereco endereco = new Endereco("Rua Teste", 123, "Apartamento 203", "Cidade Alta", "Far Away", "FA", 21521852);
        Contato contato = new Contato("85-45685-2525", "85-33303030", "teste@zipmail.com.ru");

        Funcionario f1 = new Funcionario(1, cargo1, "Reed Richards", "123.456.789-95", "7080901050", endereco, contato);
        Funcionario f2 = new Funcionario(2, cargo2, "Bruce Banner", "123.456.789-95", "7080901050", endereco, contato);
        Funcionario f3 = new Funcionario(3, cargo3, "Matt Murdock", "123.456.789-95", "7080901050", endereco, contato);
        Funcionario f4 = new Funcionario(4, cargo4, "Sue Storm", "123.456.789-95", "7080901050", endereco, contato);
        Catalogo c1 = new Catalogo(001, "Casa de Madeira Nobre, 2 Dormitórios", 79.5, 98000.00);
        Catalogo c2 = new Catalogo(002, "Casa de Alvenaria, 3 Dormitórios", 86.65, 149900.00);
        Catalogo c3 = new Catalogo(003, "Sobrado de Madeira Nobre, 3 Dormitórios, 2 Sanitários, Lavanderia", 102.00, 162500.00);

        form.lista.adicionarCatalogo(c1);
        form.lista.adicionarCatalogo(c2);
        form.lista.adicionarCatalogo(c3);
        form.lista.adicionarFuncionario(f1);
        form.lista.adicionarFuncionario(f2);
        form.lista.adicionarFuncionario(f3);
        form.lista.adicionarFuncionario(f4);

        //Inicio do sistema para o usuário
        menu.titulo();

        do {
            menu.menu0();
            menu.cursor();
            option_0 = inputNum.nextInt();
            switch (option_0) {
                case 1:   //Comercial
                    do {
                        menu.menu1();
                        menu.cursor();
                        option_1 = inputNum.nextInt();
                        switch (option_1) {
                            case 1: //Catalogo - Cadastro
                                do {
                                    form.cadastro_catalogo();
                                    menu.submenu1();
                                    menu.cursor();
                                    sub_option = inputNum.nextInt();
                                } while (sub_option != 2);
                                break;

                            case 2: //Catalogo - Consulta
                                form.imprime_catalogo();

                                break;

                            case 3: //Venda - Cadastro
                                do {
                                    form.cadastro_venda();
                                    menu.submenu1();
                                    menu.cursor();
                                    sub_option = inputNum.nextInt();
                                } while (sub_option != 2);

                                break;

                            case 4: //Venda - Consulta
                                form.imprime_vendas();

                                break;

                            case 5: //Cliente - Consulta
                                form.imprime_clientes();

                                break;

                            default:
                                System.out.println("    * * * COMERCIAL: Encerrado * * *");
                                menu.separador();
                                break;
                        }
                    } while (option_1 != 6);
                    break;

                case 2:   //Administração
                    do {
                        menu.menu2();
                        menu.cursor();
                        option_2 = inputNum.nextInt();
                        switch (option_2) {
                            case 1: //Funcionarios - Cadastro
                                do {
                                    form.cadastro_funcionario();
                                    menu.submenu1();
                                    menu.cursor();
                                    sub_option = inputNum.nextInt();
                                } while (sub_option != 2);

                                break;

                            case 2: //Funcionarios - Consulta
                                form.imprime_funcionarios();

                                break;

                            default:
                                System.out.println("    * * * ADMINISTRAÇÃO: Encerrado * * *");
                                menu.separador();
                                break;
                        }

                    } while (option_2 != 3);

                    break;

                default:
                    System.out.println("*_Trabalho Encerrado!");
                    menu.separador();
                    break;

            }
        } while (option_0 != 3);
    }

}
