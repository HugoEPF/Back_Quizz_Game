INSERT INTO "user" (id, pseudo, email, score) VALUES (1, 'julesalf', 'jules.alfonsi@epfedu.fr', 0);

INSERT INTO admin (id, nom, prenom, email) VALUES (1, 'fontaine', 'hugo', 'hugo.fontaine@epfedu.fr');

INSERT INTO question (id, contenu, genre, quizz_id) VALUES (1, 'Quel est le félin le plus rapide au monde?', 'Culture générale', 1);

INSERT INTO quizz (id, nombre_questions, genre) VALUES (1, 10, 'Culture générale');

INSERT INTO "user" (id, pseudo, email, score) VALUES (2, 'thib', 'thibault.collet@epfedu.fr', 0);

INSERT INTO admin (id, nom, prenom, email) VALUES (2, 'bonnefoy', 'paulin', 'paulin.bonnefoy@epfedu.fr');

INSERT INTO question (id, contenu, genre, quizz_id) VALUES (2, 'Quel pays a gagné le mondial de foot en 2014', 'Sport', 2);

INSERT INTO quizz (id, nombre_questions, genre) VALUES (2, 10, 'Sport');

INSERT INTO "user" (id, pseudo, email, score) VALUES (3, 'victorsal', 'victor.salles@epfedu.fr', 0);

INSERT INTO question (id, contenu, genre, quizz_id) VALUES (3, 'De quel groupe faisait partie beyonce?', 'Musique', 3);

INSERT INTO quizz (id, nombre_questions, genre) VALUES (3, 10, 'Musique');