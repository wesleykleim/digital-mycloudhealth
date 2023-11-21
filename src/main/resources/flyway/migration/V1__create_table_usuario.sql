CREATE TABLE IF NOT EXISTS USUARIO(
    id int auto_increment,
    cpf varchar (20),
    nome varchar (30),
    sobrenome varchar (30),
    dataNascimento timestamp,
    peso decimal (4,2),
    altura decimal (2,1),
    sexo varchar (10),
    primary key (id)
);