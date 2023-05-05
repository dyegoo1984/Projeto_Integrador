create database Construtora_Oliveira;

create table Cargo (
	idCargo int not null auto_increment,
	cargo varchar(20) not null,
   	salarioBase decimal (8,2) not null,
    	primary key(idCargo)    
);

create table Endereco (
	idEndereco int not null auto_increment,
    	logradouro varchar(45) not null,
    	numero int not null,
    	complemento varchar(15),
    	bairro varchar(25),
    	cidade varchar(25),
    	estado varchar(2),
    	cep int not null,    
    	primary key(idEndereco)
    	);
    
create table Contato(
	idContato int not null auto_increment,
        telefone_1 varchar(12),
        telefone_2 varchar(12),
        email varchar(50),
        primary key(idContato)
    	);

create table Funcionarios (
	codigoFuncional int not null auto_increment,
    	nomeFuncionario varchar(45) not null,
	cpfFuncionario varchar(11) not null,
    	rgFuncionario varchar (15),
    	cargoFuncionario int not null,
    	enderecoFuncionario int not null,
    	contatoFuncionario int not null,   
    	primary key(codigoFuncional),
    	constraint fk_Funcionarios_Cargo_idx foreign key(cargoFuncionario) references Cargo (idCargo),
    	constraint fk_Funcionarios_Endereco_idx foreign key(enderecoFuncionario) references Endereco (idEndereco),
    	constraint fk_Funcionarios_Contato_idx foreign key(contatoFuncionario) references Contato (idContato)
	);

create table Cliente (
	codigoCliente int not null auto_increment,
    	nomeCliente varchar(45) not null,
	cpfCliente varchar(11) not null,
    	rgCliente varchar (15),
    	enderecoCliente int not null,
    	contatoCliente int not null,   
    	primary key(codigoCliente),
    	constraint fk_Cliente_Endereco_idx foreign key(enderecoCliente) references Endereco (idEndereco),
    	constraint fk_Cliente_Contato_idx foreign key(contatoCliente) references Contato (idContato)
	);

create table Catalogo (
	codigoProjeto int not null auto_increment,
    	descricao varchar(150) not null,
    	area decimal(4,2) not null,
    	valor decimal(8,2),
    	primary key(codigoProjeto)
	);

create table Vendas (
	codigoVenda int not null auto_increment,
    	vendedor int not null,
    	comprador int not null,
    	construcao int not null,
    	formaPagamento varchar(20) not null,
    	datavenda date not null,
    	primary key(codigoVenda),
    	constraint fk_Funcionarios_Venda_idx foreign key(vendedor) references Funcionarios(codigoFuncional),
    	constraint fk_Cliente_Venda_idx foreign key(comprador) references Cliente(codigoCliente),
    	constraint fk_Catalogo_Venda_idx foreign key(construcao) references Catalogo(codigoProjeto)
	);


