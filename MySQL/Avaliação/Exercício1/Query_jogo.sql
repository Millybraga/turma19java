create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
nivel bigint auto_increment,
descricao varchar(20) not null,
ativo boolean not null,
primary key (nivel)
);

insert tb_classe (descricao, ativo) values ("Luta", true);
insert tb_classe (descricao, ativo) values ("Atira", true);
insert tb_classe (descricao, ativo) values ("Velocidade", true);
insert tb_classe (descricao, ativo) values ("Atira", true);
insert tb_classe (descricao, ativo) values ("Arqueiro", true);
insert tb_classe (descricao, ativo) values ("Velocidade", true);

select * from tb_classe;

create table tb_personagem(
nivel bigint auto_increment,
nome varchar(20) not null,
vidas int not null,
genero varchar(15) not null,
poder_de_ataque bigint,
categoria_nivel bigint,
primary key (nivel),
FOREIGN KEY (categoria_nivel) REFERENCES tb_classe (nivel)
);

insert tb_personagem (nome, vidas, genero, poder_de_ataque, categoria_nivel) values ("Kishi", 5, "Feminino", 1500, 1);
insert tb_personagem (nome, vidas, genero, poder_de_ataque, categoria_nivel) values ("Ren", 5,"Masculino",1200, 3);
insert tb_personagem (nome, vidas, genero, poder_de_ataque, categoria_nivel) values ("Kishan", 5, "Neutro", 2300, 5);
insert tb_personagem (nome, vidas, genero, poder_de_ataque, categoria_nivel) values ("Lexi", 5, "Feminino", 2100, 1);
insert tb_personagem (nome, vidas, genero, poder_de_ataque, categoria_nivel) values ("Dark", 5, "Masculino", 1400,2);
insert tb_personagem (nome, vidas, genero, poder_de_ataque, categoria_nivel) values ("Nevoa", 5, "Neutro", 1900, 4);
insert tb_personagem (nome, vidas, genero, poder_de_ataque, categoria_nivel) values ("Verena", 5, "Feminino", 2400, 5);
insert tb_personagem (nome, vidas, genero, poder_de_ataque, categoria_nivel) values ("Merida", 5, "Neutro",1600, 2);
insert tb_personagem (nome, vidas, genero, poder_de_ataque, categoria_nivel) values ("Teca", 5, "Feminino", 2200, 1);
insert tb_personagem (nome, vidas, genero, poder_de_ataque, categoria_nivel) values ("Waca", 5, "Masculino", 1200, 4);

select * from tb_personagem;

select * from tb_personagem where poder_de_ataque > 2000;

SELECT * FROM tb_personagem WHERE poder_de_ataque BETWEEN 1000 AND 2000;

select * from tb_personagem WHERE nome Like "%C%";

select nome, vidas, genero, tb_classe.descricao as descricao_da_categoria, tb_classe.ativo as estado_da_classe
 from tb_personagem inner join tb_classe on  tb_classe.nivel = tb_personagem.categoria_nivel;
 
select nome, vidas, genero, tb_classe.descricao as descricao_da_categoria, tb_classe.ativo as estado_da_classe
 from tb_personagem inner join tb_classe on  tb_classe.nivel = tb_personagem.categoria_nivel where descricao = ("Arqueiro");
 
