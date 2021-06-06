create database auth;

use auth;

create table usuario(
	codigo int primary key auto_increment,
    nome varchar(50),
    email varchar(50),
    senha varchar(20)
);

create database app;

use app;

create table app(
	codigo int primary key auto_increment,
    titulo varchar(50),
    autor varchar(50),
    tema varchar(50),
    nome_usuario varchar(50)
);