create database f4life;

use f4life;

create table `f4life`.`cliente`(
`cpf_cliente` int not null,
`nome_cliente` varchar (20) not null,
`curso` varchar(20),
`sexo_cliente` enum ('M','F'),
`telefone_cliente` int not null,
`nascimento_cliente` date not null,
primary key (cpf_cliente)
);

describe cliente;
drop table cliente;

create table `f4life`.`imovel` (
`cnpj` int not null,
`quant_quartos` int not null,
primary key (cnpj)
);

describe imovel;
drop table imovel;

create table `f4life`.`proprietario` (
`cpf_proprietario` int not null,
`nome_proprietario` varchar (20) not null,
`sexo_proprietario` enum ('M','F'),
`telefone_proprietario` int not null,
`nascimento_proprietario` date not null,
primary key (cpf_proprietario)
);

describe proprietario;
drop table proprietario;

