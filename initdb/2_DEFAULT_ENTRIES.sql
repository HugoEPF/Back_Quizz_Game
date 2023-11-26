INSERT INTO utilisateur (id, pseudo, email, score) VALUES ( 1, 'julesalf', 'jules.alfonsi@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (2, 'victorsal', 'victor.salles@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (3, 'thib', 'thibault.collet@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (4, 'jade', 'jade@gmail.com', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (5, 'hug', 'hugo@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (6, 'le_T', 'titi@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (7, 'marmar', 'marion@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (8, 'juju', 'juliette@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (9, 'nico', 'nicolas@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (10, 'pierre', 'pierre@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (11, 'laura', 'laura@epfedu.fr', 0);

INSERT INTO quizz (id, genre) VALUES (1, 'Culture générale');

INSERT INTO quizz (id, genre) VALUES (2, 'Sport');

INSERT INTO quizz (id, genre) VALUES (3, 'Musique');

INSERT INTO quizz (id, genre) VALUES (4, 'Cinema');

INSERT INTO admin (id, nom, prenom, email) VALUES (1, 'fontaine', 'hugo', 'hugo.fontaine@epfedu.fr');

INSERT INTO admin (id, nom, prenom, email) VALUES (2, 'bonnefoy', 'paulin', 'paulin.bonnefoy@epfedu.fr');

INSERT INTO question (id, contenu, genre, quizz_id) VALUES (1, 'Quel est le félin le plus rapide au monde?', 'Culture générale', 1);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (2, 'Quel pays a gagné le mondial de foot en 2014', 'Sport', 2);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (4, 'Qui a volé la coupe du monde de rugby 2023?', 'Sport', 2);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (3, 'De quel groupe faisait partie beyonce?', 'Musique', 3);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (13, 'Quel est le film qui marqué des générations en horreur?', 'Cinema', 4);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (1, 'Jaguard', true,1);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (2, 'Escargot', false,1);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (3, 'Guepard', false,1);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (4, 'Lion', false,1);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (5, 'France', false,2);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (10, 'Allemagne', true,2);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (22, 'Argentine', false,2);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (6, 'Brésil', false,2);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (20, 'Conjuring', false,13);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (21, 'Bisounours', false,13);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (25, 'La None', false,13);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (37, 'Exorcisme', true,13);