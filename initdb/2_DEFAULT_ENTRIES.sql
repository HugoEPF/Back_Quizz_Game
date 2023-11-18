INSERT INTO "user" (id, pseudo, email, score) VALUES (1, 'julesalf', 'jules.alfonsi@epfedu.fr', 0);

INSERT INTO "user" (id, pseudo, email, score) VALUES (3, 'victorsal', 'victor.salles@epfedu.fr', 0);

INSERT INTO "user" (id, pseudo, email, score) VALUES (2, 'thib', 'thibault.collet@epfedu.fr', 0);

INSERT INTO quizz (id, nombre_questions, genre) VALUES (1, 10, 'Culture générale');

INSERT INTO quizz (id, nombre_questions, genre) VALUES (2, 10, 'Sport');

INSERT INTO quizz (id, nombre_questions, genre) VALUES (3, 10, 'Musique');

INSERT INTO quizz (id, nombre_questions, genre) VALUES (4, 10, 'Cinema');

INSERT INTO admin (id, nom, prenom, email) VALUES (1, 'fontaine', 'hugo', 'hugo.fontaine@epfedu.fr');

INSERT INTO admin (id, nom, prenom, email) VALUES (2, 'bonnefoy', 'paulin', 'paulin.bonnefoy@epfedu.fr');

INSERT INTO question (id, contenu, genre) VALUES (1, 'Quel est le félin le plus rapide au monde?', 'Culture générale');

INSERT INTO question (id, contenu, genre) VALUES (2, 'Quel pays a gagné le mondial de foot en 2014', 'Sport');
INSERT INTO question (id, contenu, genre) VALUES (4, 'Qui a volé la coupe du monde de rugby 2023?', 'Sport');
INSERT INTO question (id, contenu, genre) VALUES (3, 'De quel groupe faisait partie beyonce?', 'Musique');

INSERT INTO reponse(id, contenu, isgood) VALUES (1, 'Jaguard', true);
INSERT INTO reponse(id, contenu, isgood) VALUES (2, 'Escargot', false);
INSERT INTO reponse(id, contenu, isgood) VALUES (3, 'Guepard', false);
INSERT INTO reponse(id, contenu, isgood) VALUES (4, 'Lion', false);