create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria (
id bigint auto_increment,
descricao varchar (10) not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, ativo) values ("Genérico", true);
insert tb_categoria (descricao, ativo) values ("Similar", true);
insert tb_categoria (descricao, ativo) values ("Similar", false);
insert tb_categoria (descricao, ativo) values ("Genérico", true);
insert tb_categoria (descricao, ativo) values ("Similar", true);

create table tb_produto(
id bigint auto_increment,
nome varchar (10) not null,
preco decimal not null,
quantidade_estoque int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produto (nome, preco, quantidade_estoque, categoria_id) values ("Buscofem", 7.00, 25, 1);
insert tb_produto (nome, preco, quantidade_estoque, categoria_id) values ("Doril", 10.00, 30, 1);
insert tb_produto (nome, preco, quantidade_estoque, categoria_id) values ("Dipirona", 20.00, 10, 2);
insert tb_produto (nome, preco, quantidade_estoque, categoria_id) values ("Dramin", 18.00, 22, 3);
insert tb_produto (nome, preco, quantidade_estoque, categoria_id) values ("Omeprazol", 45.00, 12, 2);
insert tb_produto (nome, preco, quantidade_estoque, categoria_id) values ("Cefaxelina", 57.00, 19, 4);
insert tb_produto (nome, preco, quantidade_estoque, categoria_id) values ("Cefaxelina", 54.00, 19, 4);
insert tb_produto (nome, preco, quantidade_estoque, categoria_id) values ("Buscopam", 5.00, 14, 1);

select * from tb_produto where preco > 50;

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

select * from tb_produto where nome Like "%B%";

select nome, preco, quantidade_estoque, tb_categoria.descricao, tb_categoria.ativo as estado_da_categoria
 from tb_categoria Inner join tb_produto on  tb_categoria.id = tb_produto.categoria_id;
 
 select * from tb_categoria where descricao = "Genérico";

 
