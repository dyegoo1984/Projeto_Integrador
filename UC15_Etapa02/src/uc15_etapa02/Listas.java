package uc15_etapa02;

import java.util.ArrayList;

public class Listas {

    Menu menu = new Menu();

    //Catalogo
    protected ArrayList<Catalogo> catalogo = new ArrayList<>();

    public void adicionarCatalogo(Catalogo novo) {
        this.catalogo.add(novo);
    }

    public void exibeCatalogo() {
        for (int i = 0; i < this.catalogo.size(); i++) {
            System.out.println("\nCódigo:.......... " + this.catalogo.get(i).codigoProjeto);
            System.out.println("Tamanho:......... " + this.catalogo.get(i).area);
            System.out.println("Descrição:....... " + this.catalogo.get(i).descricao);
            System.out.println("Valor:........... R$" + this.catalogo.get(i).getValor() + "\n");
            menu.imagem();
            menu.separador();
        }
    }

    //Funcionário
    protected ArrayList<Funcionario> funcionario = new ArrayList<>();

    public void adicionarFuncionario(Funcionario novo) {
        this.funcionario.add(novo);
    }

    public void exibeFuncionarios() {
        for (int j = 0; j < this.funcionario.size(); j++) {
            System.out.println("\nCódigo Funcional..... " + this.funcionario.get(j).codigoFuncional);
            System.out.println("Nome................. " + this.funcionario.get(j).getNome());
            System.out.println("CPF.................. " + this.funcionario.get(j).getCpf());
            System.out.println("RG................... " + this.funcionario.get(j).getRg());
            System.out.println("Cargo................ " + this.funcionario.get(j).cargo.getCargo());
            System.out.println("Remuneração.......... R$ " + this.funcionario.get(j).cargo.getRemuneracao());
            System.out.println("    Endereço: ");
            System.out.println("    Rua.............. " + this.funcionario.get(j).getEndereco().getRua() + ", " + this.funcionario.get(j).getEndereco().getNumero() + ", " + this.funcionario.get(j).getEndereco().getComplemento());
            System.out.println("    Bairro........... " + this.funcionario.get(j).getEndereco().getBairro());
            System.out.println("    Cidade / Estado.. " + this.funcionario.get(j).getEndereco().getCidade() + " / " + this.funcionario.get(j).getEndereco().getEstado());
            System.out.println("    Cep.............. " + this.funcionario.get(j).getEndereco().getCep());
            System.out.println("    Contato: ");
            System.out.println("    Telefone 1....... " + this.funcionario.get(j).getContato().getTelefone1());
            System.out.println("    Telefone 2....... " + this.funcionario.get(j).getContato().getTelefone2());
            System.out.println("    E-mail........... " + this.funcionario.get(j).getContato().getEmail() + "\n");
            menu.separador();
        }
    }

    //Venda
    protected ArrayList<Venda> venda = new ArrayList<>();

    public void adicionarVenda(Venda novo) {
        this.venda.add(novo);
    }

    public void exibeVendas() {
        for (int k = 0; k < this.venda.size(); k++) {
            System.out.println("\nVendedor............. " + this.venda.get(k).vendedor.getNome());
            System.out.println("Data da venda........ " + this.venda.get(k).data);
            System.out.println("Comprador............ " + this.venda.get(k).cliente.getNome());
            System.out.println("CPF do Comprador..... " + this.venda.get(k).cliente.getCpf());
            System.out.println("Projeto Nº........... " + this.venda.get(k).projeto.getCodigoProjeto());
            System.out.println("Descrição do Projeto. " + this.venda.get(k).projeto.getDescricao());
            System.out.println("Área construída...... " + this.venda.get(k).projeto.getArea());
            System.out.println("Custo da Construção.. R$" + this.venda.get(k).projeto.getValor());
            System.out.println("Forma de pagamento... " + this.venda.get(k).formaPagamento + "\n");
            menu.separador();
        }
    }

    //Cliente
    protected ArrayList<Cliente> cliente = new ArrayList<>();

    public void adicionaCliente(Cliente novo) {
        this.cliente.add(novo);
    }

    public void exibeClientes() {
        for (int l = 0; l < this.cliente.size(); l++) {
            System.out.println("\nCódigo do Cliente.... " + this.cliente.get(l).codigoCliente);
            System.out.println("Nome................. " + this.cliente.get(l).getNome());
            System.out.println("CPF.................. " + this.cliente.get(l).getCpf());
            System.out.println("RG................... " + this.cliente.get(l).getRg());
            System.out.println("    Endereço: ");
            System.out.println("    Rua.............. " + this.cliente.get(l).getEndereco().getRua() + ", " + this.cliente.get(l).getEndereco().getNumero() + ", " + this.cliente.get(l).getEndereco().getComplemento());
            System.out.println("    Bairro........... " + this.cliente.get(l).getEndereco().getBairro());
            System.out.println("    Cidade / Estado.. " + this.cliente.get(l).getEndereco().getCidade() + " / " + this.cliente.get(l).getEndereco().getEstado());
            System.out.println("    Cep.............. " + this.cliente.get(l).getEndereco().getCep());
            System.out.println("    Contato: ");
            System.out.println("    Telefone 1....... " + this.cliente.get(l).getContato().getTelefone1());
            System.out.println("    Telefone 2....... " + this.cliente.get(l).getContato().getTelefone2());
            System.out.println("    E-mail........... " + this.cliente.get(l).getContato().getEmail() + "\n");
            menu.separador();
        }
    }

}
