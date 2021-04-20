create database db_escola;

use db_escola;

create table tb_alunos(

id bigint auto_increment,
nome varchar (30) not null,
matéria varchar (15),
turma int not null,
nota int not null,

primary key (id)
);

insert into tb_alunos (nome, matéria, turma, nota) values ("Janaina", "Matemática", 5, 8);
insert into tb_alunos (nome, matéria, turma, nota) values ("Pedro", "História", 4, 9);
insert into tb_alunos (nome, matéria, turma, nota) values ("Fabiola", "Geografia", 5, 7);
insert into tb_alunos (nome, matéria, turma, nota) values ("Patrícia", "História", 4, 10);
insert into tb_alunos (nome, matéria, turma, nota) values ("Rodolfo", "Arte", 4, 9);
insert into tb_alunos (nome, matéria, turma, nota) values ("Rayane", "Matemática", 5, 5);
insert into tb_alunos (nome, matéria, turma, nota) values ("Arthur", "Arte", 4, 8);
insert into tb_alunos (nome, matéria, turma, nota) values ("Paulo", "Geografia", 5, 10);

select * from tb_alunos;
