create table Utilisateur
(
    id BIGSERIAL PRIMARY KEY,
    pseudo VARCHAR(255) not null,
    email VARCHAR(255) not null,
    score INTEGER
);

create table Admin
(
    id SERIAL PRIMARY KEY,
    nom VARCHAR(255) not null,
    prenom VARCHAR(255) not null,
    email VARCHAR(255) not null
);

create table Question
(
    id SERIAL PRIMARY KEY,
    contenu VARCHAR(255) not null,
    genre VARCHAR(255) not null,
    quizz_id INTEGER not null
);

create table Quizz
(
    id SERIAL PRIMARY KEY,
    nombre_questions INTEGER not null,
    genre VARCHAR(255) not null
);

create table Reponse
(
    id SERIAL PRIMARY KEY,
    contenu VARCHAR(255) not null,
    isGood BOOLEAN NOT NULL,
    question_id INTEGER not null
);

ALTER SEQUENCE utilisateur_id_seq RESTART 100 INCREMENT BY 50;
ALTER SEQUENCE admin_id_seq RESTART 100 INCREMENT BY 50;
ALTER SEQUENCE question_id_seq RESTART 100 INCREMENT BY 50;
ALTER SEQUENCE quizz_id_seq RESTART 100 INCREMENT BY 50;
ALTER SEQUENCE reponse_id_seq RESTART 100 INCREMENT BY 50;
