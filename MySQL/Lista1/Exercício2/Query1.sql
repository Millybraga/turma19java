create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
 id bigint auto_increment,
 descricao varchar(25) not null,
 preco decimal (6,2) not null,
 marca varchar(25) not null,
 quantidade_estoque int(4) not null,
 primary key (id)
);


insert into tb_produtos (descricao, preco, marca, quantidade_estoque) values ("Geladeira", 2000.00, "Brastemp", 170);
insert into tb_produtos (descricao, preco, marca, quantidade_estoque) values ("Fogão", 1500.00, "Brastemp", 20);
insert into tb_produtos (descricao, preco, marca, quantidade_estoque) values ("Armario", 1000.00, "Bartira", 12);
insert into tb_produtos (descricao, preco, marca, quantidade_estoque) values ("Microondas", 350.00, "eletro", 20);
insert into tb_produtos (descricao, preco, marca, quantidade_estoque) values ("Torradeira", 110.00, "Harald", 15);
insert into tb_produtos (descricao, preco, marca, quantidade_estoque) values ("Mesa", 330.00, "Caras", 50);
insert into tb_produtos (descricao, preco, marca, quantidade_estoque) values ("Box de livros", 100.00, "Arqueiro", 40);
insert into tb_produtos (descricao, preco, marca, quantidade_estoque) values ("HeadPhone", 300.00, "Cheetos", 27);

select * from tb_produtos;