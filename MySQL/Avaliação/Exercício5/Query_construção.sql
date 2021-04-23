create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, ativo) values ("Ferramentas e utensílios", true);
insert tb_categoria (descricao, ativo) values ("Materiais de construção", true);
insert tb_categoria (descricao, ativo) values ("Materiais de construção", true);
insert tb_categoria (descricao, ativo) values ("Ferramentas e utensílios", true);
insert tb_categoria (descricao, ativo) values ("Ferramentas e utensílios", true);

select * from tb_categoria;

create table tb_produto(
id bigint(5) auto_increment,
nome varchar(255) not null,
preco decimal not null,
quantidade int not null,
categoria_id bigint not null,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produto (nome, preco, quantidade, categoria_id) values ("Martelo", 30.00, 5, 1);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Cimento", 35.00, 7, 2);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Blocos", 60.00, 30, 2);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Trena", 20.00, 5, 4);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Parafusos", 15.00, 20, 5);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Vigas", 55.00, 10, 2);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Chave de fenda", 14.00, 3, 4);
insert tb_produto (nome, preco, quantidade, categoria_id) values ("Areia", 46.00, 5, 3);

select * from tb_produto;

select * from tb_produto where preco > 50.00;

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

select * from tb_produto where nome Like "%C%";

SELECT 
    nome,
    preco,
    quantidade,
    tb_categoria.descricao AS descricao_da_categoria,
    tb_categoria.ativo AS estado_da_categoria
FROM
    tb_produto
        INNER JOIN
    tb_categoria ON tb_categoria.id = tb_produto.categoria_id;

select nome, preco, quantidade, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id where descricao = ("Ferramentas e utensílios");
