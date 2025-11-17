INSERT INTO Professor (nome, cpf, email, senha) VALUES
("Luiz Felipe", 48618388801, "luizfelipe123@gmail.com", "123456");

INSERT INTO Disciplina (nome, professor_id) VALUES
("Engenharia de Requisitos", 1);

INSERT INTO Turma (nome) VALUES
("Turma B");

INSERT INTO Curso (nome, turma_id, disciplina_id) VALUES
("Engenharia de Software", 1, 1);

INSERT INTO Aluno (nome, cpf, email, senha, curso_id, turma_id) VALUES
("Gabriel Hernandes", 15001356621, "gabrielhernandes123@gmail.com", 123456, 1, 1);


INSERT INTO Resumos (nome, aluno_id) VALUES
("Resumo MySQL", 1);

INSERT INTO VideoAulas (titulo, curso_id, turma_id, professor_id) VALUES
("Aula de MySQL", 1, 1, 1);