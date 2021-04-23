create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint(5) auto_increment,
descricao varchar(25) not null,
disponivel boolean not null,
primary key (id)
);

insert tb_categoria (descricao, disponivel) values ("EXATAS",true);
insert tb_categoria (descricao, disponivel) values ("HUMANAS",true);
insert tb_categoria (descricao, disponivel) values ("BIOLÓGICAS",true);
insert tb_categoria (descricao, disponivel) values ("BIOLÓGICAS",true);
insert tb_categoria (descricao, disponivel) values ("HUMANAS",true);
insert tb_categoria (descricao, disponivel) values ("EXATAS",true);

select * from tb_categoria;

create table tb_produto (
id bigint(5) auto_increment,
materia varchar (25) not null,
duracao_em_horas varchar(10) not null,
qtExercicios int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produto (materia, duracao_em_horas, qtExercicios, categoria_id) values ("Matemática","2 Horas",18,1);
insert tb_produto (materia, duracao_em_horas, qtExercicios, categoria_id) values ("História","3 Horas",15,2);
insert tb_produto (materia, duracao_em_horas, qtExercicios, categoria_id) values ("Ciências Humanas","1 Hora",16,3);
insert tb_produto (materia, duracao_em_horas, qtExercicios, categoria_id) values ("Ciências da Natureza","4 Horas",12,3);
insert tb_produto (materia, duracao_em_horas, qtExercicios, categoria_id) values ("Literatura","1 Hora",13,5);
insert tb_produto (materia, duracao_em_horas, qtExercicios, categoria_id) values ("Algebra","3 Horas",20,1);
insert tb_produto (materia, duracao_em_horas, qtExercicios, categoria_id) values ("Física","2 Horas",17,6);
insert tb_produto (materia, duracao_em_horas, qtExercicios, categoria_id) values ("Filosofia","5 Horas",10,2);

select * from tb_produto;

select * from tb_produto where duracao_em_horas > ("3 Horas");

SELECT * FROM tb_produto where duracao_em_horas BETWEEN ("2 Horas") AND ("4 Horas");

select * from tb_produto where materia Like "%H%";

select materia, duracao_em_horas, qtExercicios, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.disponivel as disponivel
 from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id;
 
select materia, duracao_em_horas, qtExercicios, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.disponivel as disponivel
 from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id where descricao = ("EXATAS")
 

