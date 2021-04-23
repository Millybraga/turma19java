create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint(5) auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, ativo) values ("Bovino",true);
insert tb_categoria (descricao, ativo) values ("Suino",true);
insert tb_categoria (descricao, ativo) values ("Aves",true);
insert tb_categoria (descricao, ativo) values ("pertence feijoada",true);
insert tb_categoria (descricao, ativo) values ("imbutidos",true);
insert tb_categoria (descricao, ativo) values ("outros",true);

select * from tb_categoria;

create table tb_produto (
id bigint(5) auto_increment,
nome varchar (255) not null,
preco decimal not null,
qtProduto int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produto (nome, preco, qtProduto, categoria_id) values ("ASA",40.00,30,3);
insert tb_produto (nome, preco, qtProduto, categoria_id) values ("Picanha",20.00,30,1);
insert tb_produto (nome, preco, qtProduto, categoria_id) values ("coxa de frango",20.00,30,3);
insert tb_produto (nome, preco, qtProduto, categoria_id) values ("Bacon",30.00,30,1);
insert tb_produto (nome, preco, qtProduto, categoria_id) values ("hamburguer",60.00,30,5);
insert tb_produto (nome, preco, qtProduto, categoria_id) values ("Cupim",20.00,30,1);
insert tb_produto (nome, preco, qtProduto, categoria_id) values ("Peito de frango",25.00,30,3);
insert tb_produto (nome, preco, qtProduto, categoria_id) values ("Orelha de porco",20.00,30,4);


select * from tb_produto;

select * from tb_produto where nome Like "%C%";

SELECT * FROM tb_produto WHERE preco IN (20, 30, 40);

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

SELECT COUNT(*) FROM tb_produto;

SELECT AVG(preco) AS media FROM tb_produto;

SELECT SUM(preco)FROM tb_produto ;

select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id;
 
 select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produto left join tb_categoria on  tb_categoria.id = tb_produto.categoria_id;
 
  select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produto right join tb_categoria on  tb_categoria.id = tb_produto.categoria_id;
 
 