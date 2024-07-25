USE revisaoava;

CREATE TABLE CLIENTE (
    ID NUMERIC(4) NOT NULL PRIMARY KEY,
    ENDERECO VARCHAR(200) NOT NULL,
    FONE NUMERIC(11) NOT NULL,
    EMAIL VARCHAR(100) NOT NULL
);

CREATE TABLE PJ (
    RAZAO_SOCIAL VARCHAR(100) NOT NULL,
    NM_FANTASIA VARCHAR(100) NOT NULL,
    CNPJ NUMERIC(14) NOT NULL,
    FK_ID_PJ NUMERIC(4) NOT NULL,
    CONSTRAINT FK_ID_PJ FOREIGN KEY (FK_ID_PJ) REFERENCES CLIENTE (ID)
);

CREATE TABLE PF (
    NOME VARCHAR(100) NOT NULL,
    APELIDO VARCHAR (100) NOT NULL,
    CPF NUMERIC(11) NOT NULL,
    FK_ID_PF NUMERIC(4) NOT NULL,
    CONSTRAINT FK_ID_PF FOREIGN KEY (FK_ID_PF) REFERENCES CLIENTE (ID)
);

INSERT INTO CLIENTE (ID, ENDERECO, FONE, EMAIL) VALUE
	(1, "Rua XV de Novembro, 2233, Centro, Joinville", 47977777777, "contato@totvs.com.br"),
	(2, "Rua 310, 301, Centro, Itapema", 47988888888, "rafael@gmail.com"),
	(3, "Rua Tuiuti, 1088, Universitário, Tijucas", 48999999999, "carla@femsa.com.br");

INSERT INTO PJ (RAZAO_SOCIAL, NM_FANTASIA, CNPJ, FK_ID_PJ) VALUE
("Totvs", "Totvs S. A.", 53113791000122, 1),
("FEMSA LOGISTICA BRASIL LTDA", "Coca-Cola FEMSA Brasil", 19031266000200, 3);

INSERT INTO PF (NOME, APELIDO, CPF, FK_ID_PF) VALUE
	("Rafael de Souza Silva", "Rafa", 11122233344, 2);