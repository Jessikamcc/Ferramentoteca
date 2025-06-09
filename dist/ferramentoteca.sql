CREATE DATABASE ferramentoteca;
USE ferramentoteca;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL,
    tipo ENUM('Administrador', 'Operador', 'Visualizador') NOT NULL,
    limiteEmprestimo INT DEFAULT 3
);

SELECT * FROM  usuario;

CREATE TABLE ferramenta (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    estado ENUM('Ativa', 'Inativa', 'Danificada') DEFAULT 'Ativa',
    localizacao VARCHAR(100),
    motivoDesativacao TEXT,
    previsaoRetorno DATE
);

SELECT * FROM  ferramenta;

CREATE TABLE emprestimo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuarioId INT NOT NULL,
    ferramentaId INT NOT NULL,
    dataEmprestimo DATE NOT NULL,
    dataDevolucao DATE,
    status ENUM('Emprestado', 'Devolvido') NOT NULL DEFAULT 'Emprestado',

    FOREIGN KEY (usuarioId) REFERENCES usuario(id),
    FOREIGN KEY (ferramentaId) REFERENCES ferramenta(id)
);

SELECT * FROM  emprestimo;



