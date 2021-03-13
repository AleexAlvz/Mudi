# Spring Framework
<h4>
Curso de Spring Framework oferecido pela Alura

Projeto produzido durante os cursos 
"Spring MVC: Crie um web app com Thymeleaf e Bootstrap"
"Spring MVC: Autenticação com Spring Security, API Rest e AJAX"

Tecnologias utilizadas durante o curso:
-Spring Framework
-Thymeleaf
-Bootstrap
-HTML e CSS
-Mysql Database
</h4>

# Configurações
----------------------------------------------------------------------------------------------------------
<h2>O banco de dados utilizado no projeto foi o MySQL. Para usufruir do projeto corretamente, utilize o script
a seguir para gerar o banco de dados e as tabelas padrões:</h2>
----------------------------------------------------------------------------------------------------------
<h4>
create database springmvc;
use springmvc;

create table users(
    username varchar(50) not null primary key,
    password varchar(500) not null,
    enabled boolean not null
);

create table authorities (
    username varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities (username,authority);
</h4>
----------------------------------------------------------------------------------------------------------
