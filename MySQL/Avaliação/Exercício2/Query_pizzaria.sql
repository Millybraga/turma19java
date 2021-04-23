create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
numero_do_pedido bigint auto_increment,
descricao varchar (15) not null,
pagamento varchar (10) not null,
primary key (numero_do_pedido)
);

insert tb_categoria (descricao, pagamento) values ("Doce", "Crédito");
insert tb_categoria (descricao, pagamento) values ("Salgada", "Dinheiro");
insert tb_categoria (descricao, pagamento) values ("Doce", "Dinheiro");
insert tb_categoria (descricao, pagamento) values ("Salgada", "Débito");
insert tb_categoria (descricao, pagamento) values ("Salgada", "Crédito");

select * from tb_categoria;

create table tb_pizza(
numero_do_pedido bigint auto_increment,
sabor varchar (15) not null,
valor decimal not null,
quantidade int not null,
categoria_numero_do_pedido bigint,
primary key (numero_do_pedido),
FOREIGN KEY (categoria_numero_do_pedido) REFERENCES tb_categoria (numero_do_pedido)
);

insert tb_pizza (sabor, valor, quantidade, categoria_numero_do_pedido) values ("Romeu e Julieta", 55.00, 3, 1);
insert tb_pizza (sabor, valor, quantidade, categoria_numero_do_pedido) values ("Portuguesa", 40.00,2, 2);
insert tb_pizza (sabor, valor, quantidade, categoria_numero_do_pedido) values ("Brigadeiro", 30.00, 1, 3 );
insert tb_pizza (sabor, valor, quantidade, categoria_numero_do_pedido) values ("Baiana", 50.00, 2, 5);
insert tb_pizza (sabor, valor, quantidade, categoria_numero_do_pedido) values ("Palmito", 27.00, 1, 5);
insert tb_pizza (sabor, valor, quantidade, categoria_numero_do_pedido) values ("Calabresa", 48.00, 1, 2);
insert tb_pizza (sabor, valor, quantidade, categoria_numero_do_pedido) values ("Chocolate", 33.00, 1, 1);
insert tb_pizza (sabor, valor, quantidade, categoria_numero_do_pedido) values ("Brócolis", 51.00, 1, 4);

select * from tb_pizza;
select * from tb_pizza where valor > 45.00;

SELECT *
FROM tb_pizza
WHERE valor BETWEEN 29 AND 60;

select * from tb_pizza where sabor Like "%C%";

select sabor, valor, quantidade, tb_categoria.descricao as descricao_da_categoria, tb_categoria.pagamento as forma_de_pagamento
 from tb_pizza inner join tb_categoria on  tb_categoria.numero_do_pedido = tb_pizza.categoria_numero_do_pedido;
 
select sabor, valor, quantidade, tb_categoria.descricao as descricao_da_categoria, tb_categoria.pagamento as forma_de_pagamento
 from tb_pizza inner join tb_categoria on  tb_categoria.numero_do_pedido = tb_pizza.categoria_numero_do_pedido where descricao = ("Doce");
 


