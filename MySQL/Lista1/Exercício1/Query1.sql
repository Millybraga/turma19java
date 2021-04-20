create database db_setor_RH;
  
  use db_setor_RH;
  
  create table tb_funcionaries(
  id bigint auto_increment,
  nome varchar(25) not null,
  -- quantidade de numeros antes e depois do ponto
  salario decimal (4, 3), 
  ponto_dia boolean,
  horas_semanais int(2),

  primary key(id)
  )
    