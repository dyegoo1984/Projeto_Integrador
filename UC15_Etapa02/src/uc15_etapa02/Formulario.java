package uc15_etapa02;

import java.util.Scanner;

public class Formulario {

    Scanner inputNum = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);
    Listas lista = new Listas();
    
    public void cadastro_catalogo() {
        int codigoProjeto = lista.catalogo.size() + 1;
        System.out.print("Descrição........... ");
        String descricao = inputStr.nextLine();
        System.out.print("Área (m2)........... ");
        double area = inputNum.nextDouble();
        System.out.print("Valor............. R$");
        double valor = inputNum.nextDouble();
        Catalogo novo = new Catalogo(codigoProjeto, descricao, area, valor);
        this.lista.adicionarCatalogo(novo);
    }
    
    public void imprime_catalogo() {
        lista.exibeCatalogo();
    }

    public void cadastro_funcionario() {
        int codigoFuncional = lista.funcionario.size() + 1;
        System.out.print("Cargo............... ");
        String cargo = inputStr.nextLine();
        System.out.print("Remuneração....... R$");
        double remuneracao = inputNum.nextDouble();
        System.out.print("Nome................ ");
        String nome = inputStr.nextLine();
        System.out.print("CPF................. ");
        String cpf = inputStr.nextLine();
        System.out.print("RG.................. ");
        String rg = inputStr.nextLine();
        System.out.println("Endereço:");
        System.out.print("  Rua............... ");
        String rua = inputStr.nextLine();
        System.out.print("  Número............ ");
        int numero = inputNum.nextInt();
        System.out.print("  Complemento....... ");
        String complemento = inputStr.nextLine();
        System.out.print("  Bairro............ ");
        String bairro = inputStr.nextLine();
        System.out.print("  Cidade............ ");
        String cidade = inputStr.nextLine();
        System.out.print("  Estado............ ");
        String estado = inputStr.nextLine();
        System.out.print("  CEP............... ");
        int cep = inputNum.nextInt();
        System.out.println("Contato:");
        System.out.print("Telefone 1.......... ");
        String telefone1 = inputStr.nextLine();
        System.out.print("Telefone 2.......... ");
        String telefone2 = inputStr.nextLine();
        System.out.print("E-mail.............. ");
        String email = inputStr.nextLine();
        
        Cargo ca = new Cargo(cargo, remuneracao);
        Endereco en = new Endereco(rua, numero, complemento, bairro, cidade, estado, cep);
        Contato co = new Contato(telefone1, telefone2, email);
        Funcionario fun = new Funcionario(codigoFuncional, ca, nome, cpf, rg, en, co);
        lista.adicionarFuncionario(fun);
    }

    public void imprime_funcionarios() {
        lista.exibeFuncionarios();
    }
    
    public void cadastro_venda() {
        
        System.out.print("Informe o código do vendedor: ");
        int codigoFuncional = inputNum.nextInt();
        Funcionario vendedor = lista.funcionario.get(codigoFuncional - 1);
        System.out.print("Informe o código do Projeto a ser construído: ");
        int codigoProjeto = inputNum.nextInt();
        Catalogo projeto = lista.catalogo.get(codigoProjeto);
        System.out.print("Forma de pagamento: ");
        String formaPagamento = inputStr.nextLine();
        System.out.print("Data da venda: ");
        String data = inputStr.nextLine();
        System.out.print("Cadastro do Comprador: ");
        int codigoCliente = lista.cliente.size() + 1;
        System.out.print("Nome................ ");
        String nome = inputStr.nextLine();
        System.out.print("CPF................. ");
        String cpf = inputStr.nextLine();
        System.out.print("RG.................. ");
        String rg = inputStr.nextLine();
        System.out.println("Endereço:");
        System.out.print("  Rua............... ");
        String rua = inputStr.nextLine();
        System.out.print("  Número............ ");
        int numero = inputNum.nextInt();
        System.out.print("  Complemento....... ");
        String complemento = inputStr.nextLine();
        System.out.print("  Bairro............ ");
        String bairro = inputStr.nextLine();
        System.out.print("  Cidade............ ");
        String cidade = inputStr.nextLine();
        System.out.print("  Estado............ ");
        String estado = inputStr.nextLine();
        System.out.print("  CEP............... ");
        int cep = inputNum.nextInt();
        System.out.println("Contato:");
        System.out.print("Telefone 1.......... ");
        String telefone1 = inputStr.nextLine();
        System.out.print("Telefone 2.......... ");
        String telefone2 = inputStr.nextLine();
        System.out.print("E-mail.............. ");
        String email = inputStr.nextLine();
        
        Endereco en = new Endereco(rua, numero, complemento, bairro, cidade, estado, cep);
        Contato co = new Contato(telefone1, telefone2, email);
        Cliente clie = new Cliente(codigoCliente, nome, cpf, rg, en, co);
        lista.adicionaCliente(clie);
        Venda venda = new Venda(clie, vendedor, projeto, formaPagamento, data);
        lista.adicionarVenda(venda);
    }
    
    public void imprime_vendas() {
        lista.exibeVendas();
    }
    
    public void imprime_clientes() {
        lista.exibeClientes();
    }
    
}
