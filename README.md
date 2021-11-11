# Java Spring com o JPA e Store Procedure

Esse projeto consiste em um sistema que consumirá store procedures (Mysql) no Java/Spring JPA. 

## Preparar o ambiente de banco de dados - Mysql

Primeira etapa é criar um banco de dados db_teste, com duas tabelas (tb_carro, tb_pessoa) e criar store procedures para executar no projeto. 

```
CREATE TABLE tb_carro (
  id_carro int NOT NULL AUTO_INCREMENT,
  ds_carro varchar(50) NOT NULL,
  PRIMARY KEY (id_carro)
) 

insert into tb_carro (ds_carro) values ("ford ka");
insert into tb_carro (ds_carro) values ("ford fiesta");

CREATE TABLE tb_pessoa (
  id_pessoa int NOT NULL AUTO_INCREMENT,
  nm_pessoa varchar(50) NOT NULL,
  id_carro int,
  PRIMARY KEY (id_pessoa)
) 

CREATE PROCEDURE `GET_QUANT_CARROS` (OUT p_qtd INT)
BEGIN
 SELECT count(1) from tb_carro;
END

{ CALL db_teste.GET_QUANT_CARROS(?) }

CREATE PROCEDURE `GET_CARRO_BY_ID` (IN p_id INT)
BEGIN
 SELECT * from tb_carro where id_carro = p_id;
END

{ CALL db_teste.GET_CARRO_BY_ID(1) }

CREATE PROCEDURE `GET_CARROS` ()
BEGIN
 SELECT * from tb_carro;
END

{ CALL db_teste.GET_CARROS() }

```