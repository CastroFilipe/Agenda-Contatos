USE AGENDA;

CREATE TABLE PESSOA(
	IDPESSOA INT PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(45) NOT NULL,
    SOBRENOME VARCHAR(45) NOT NULL,
    SEXO ENUM('M', 'F') NOT NULL
);

CREATE TABLE CONTATO(
	IDCONTATO INT PRIMARY KEY AUTO_INCREMENT,
    TIPO ENUM('COM','RES','CEL'),
    REGISTRO VARCHAR(255) NOT NULL,
    ID_PESSOA INT NOT NULL,
    
    FOREIGN KEY (ID_PESSOA) REFERENCES PESSOA(IDPESSOA)
);

