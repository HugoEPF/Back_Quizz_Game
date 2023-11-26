INSERT INTO utilisateur (id, pseudo, email, score) VALUES (1, 'jules', 'jules.alfonsi@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (2, 'victor', 'victor.salles@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (3, 'thibault', 'thibault.collet@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (4, 'jade', 'jade@gmail.com', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (5, 'hugo', 'hugo@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (6, 'anthony', 'anthony@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (7, 'marion', 'marion@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (8, 'juliette', 'juliette@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (9, 'nico', 'nicolas@epfedu.fr', 0);
INSERT INTO utilisateur (id, pseudo, email, score) VALUES (10, 'pierre', 'pierre@epfedu.fr', 0);

INSERT INTO quizz (id, genre) VALUES (1, 'Culture générale');
INSERT INTO quizz (id, genre) VALUES (2, 'Sport');
INSERT INTO quizz (id, genre) VALUES (3, 'Musique');
INSERT INTO quizz (id, genre) VALUES (4, 'Cinéma');

INSERT INTO admin (id, nom, prenom, email) VALUES (1, 'fontaine', 'hugo', 'hugo.fontaine@epfedu.fr');
INSERT INTO admin (id, nom, prenom, email) VALUES (2, 'bonnefoy', 'paulin', 'paulin.bonnefoy@epfedu.fr');
INSERT INTO admin (id, nom, prenom, email) VALUES (3, 'balavoine', 'daniel', 'daniel.balavoine@gmail.com');
INSERT INTO admin (id, nom, prenom, email) VALUES (4, 'lennon', 'john', 'john.lennon@epfedu.fr');

INSERT INTO question (id, contenu, genre, quizz_id) VALUES (21, 'Qui a peint la Joconde ? ', 'Culture générale', 1);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (22, 'Quel est le plus haut sommet du monde ? ', 'Culture générale', 1);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (23, 'Quel animal est également connu sous le nom de pachyderme ? ', 'Culture générale', 1);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (24, 'Qui a écrit "Le Petit Prince" ?', 'Culture générale', 1);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (25, 'Qui a découvert la pénicilline ?', 'Culture générale', 1);


INSERT INTO question (id, contenu, genre, quizz_id) VALUES (26, 'Quelle est la distance officielle d’un marathon ?', 'Sport', 2);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (27, 'Quel joueur de basketball a le plus de points marqués en une seule saison de NBA ? ', 'Sport', 2);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (28, 'Quelle équipe a remporté la Coupe du Monde de football en 2006 ? ', 'Sport', 2);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (29, 'Quel joueur de tennis a remporté le plus de titres du Grand Chelem ? ', 'Sport', 2);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (30, 'Dans quel sport peut-on marquer un "touchdown" ?  ', 'Sport', 2);

INSERT INTO question (id, contenu, genre, quizz_id) VALUES (11, 'Quel chanteur a chanté Thriller ? ', 'Musique', 3);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (12, 'Qui chante les lacs du connemara ? ', 'Musique', 3);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (13, 'Comment appelle-t-on l’intervalle séparant deux notes de même nom ? ', 'Musique', 3);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (14, 'De qui est l’album Ceinture noire, le plus vendu en France en 2018 ?', 'Musique', 3);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (15, 'Qui a composé la Sonate au Clair de lune ? ', 'Musique', 3);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (16, 'De quelle nationalité était Freddie Mercury ? ', 'Musique', 3);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (17, 'Dans quel groupe jouaient David Gilmour et Roger Waters ? ', 'Musique', 3);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (18, 'Quel groupe ont fondé les frères Young en 1973 ? ', 'Musique', 3);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (19, 'De quel groupe faisait partie Beyoncé ? ', 'Musique', 3);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (20, 'Où a été tourné le clip Au D.D de PNL?  ', 'Musique', 3);

INSERT INTO question (id, contenu, genre, quizz_id) VALUES (1, 'Qui a réalisé le film Avatar?', 'Cinéma', 4);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (2, 'Qui a réalisé Jurassic Park?', 'Cinéma', 4);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (3, 'Quel est le premier film au box office mondial?', 'Cinéma', 4);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (4, 'De quel film est tiré la phrase culte "On attend pas patrick?', 'Cinéma', 4);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (5, 'Quelle est le studio derrière Avengers?', 'Cinéma', 4);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (6, 'Quel est le seul acteur français a avoir remporté un oscar?', 'Cinéma', 4);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (7, 'Quel acteur a le rôle principal dans the Truman show?', 'Cinéma', 4);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (8, 'Sur combien de jours se déroule le Festival de Cannes? ', 'Cinéma', 4);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (9, 'Quel est le nom de la mère de Simba dans "Le roi Lion" ?', 'Cinéma', 4);
INSERT INTO question (id, contenu, genre, quizz_id) VALUES (10, 'Qui a réalisé le film Shutter Island ? ', 'Cinéma', 4);


INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (1, 'James Cameron', true,1);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (2, 'Stanley Kubrick', false,1);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (3, 'Quentin Tarantino', false,1);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (4, 'David Fincher', false,1);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (5, 'Steven Spielberg', true,2);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (6, 'Martin Scorcese', false,2);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (7, 'Luc Besson', false,2);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (8, 'Sergio Leone', false,2);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (9, 'Avengers Endgame', false,3);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (10, 'Titanic', false,3);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (11, 'Avatar', true,3);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (12, 'Avatar 2', false,3);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (13, 'Les Tuches', false,4);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (14, 'Camping', true,4);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (15, 'Astérix et Obélix mission cléopatre', false,4);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (16, 'Didier', false,4);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (17, 'studio canal', false,5);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (18, 'warner bros', false,5);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (19, 'paramount pictures', false,5);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (20, 'marvel studio', true,5);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (21, 'Jean Dujardin', true,6);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (22, 'Alain Chabat', false,6);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (23, 'Vincent Cassel', false,6);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (24, 'Pierre Niney', false,6);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (25, 'Léonardo Dicaprio', false,7);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (26, 'Jim Carrey', true,7);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (27, 'Brad Pitt', false,7);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (28, 'Bruce Willis', false,7);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (29, '10', false,8);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (30, '12', true,8);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (31, '7', false,8);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (32, '8', false,8);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (33, 'Zira', false,9);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (34, 'Kiara', false,9);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (35, 'Nala', false,9);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (36, 'Sarabi', true,9);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (37, 'Martin Scorcese', true,10);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (38, 'Cristopher Nolan', false,10);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (39, 'Woody Allen', false,10);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (40, 'Lars von Trier', false,10);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (41, 'Michael Jackson', true,11);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (42, 'Freddie Mercury', false,11);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (43, 'John Lennon', false,11);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (44, 'David Bowie', false,11);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (45, 'Michel Sardou', true,12);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (46, 'Patrick Bruel', false,12);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (47, 'Francis Cabrel', false,12);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (48, 'Johnny Hallyday', false,12);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (49, 'Unisson', false,13);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (50, 'Tierce', false,13);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (51, 'Octave', true,13);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (52, 'Quinte', false,13);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (53, 'Soprano', false,14);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (54, 'Maitre Gims', true,14);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (55, 'Kaaris', false,14);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (56, 'Orelsan', false,14);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (57, 'Mozart', false,15);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (58, 'Bach', false,15);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (59, 'Chopin', false,15);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (60, 'Beethoven', true,15);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (61, 'Britannique', true,16);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (62, 'Américain', false,16);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (63, 'Indien', false,16);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (64, 'Australien', false,16);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (65, 'Led Zeppelin', false,17);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (66, 'Pink Floyd', true,17);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (67, 'The Rolling Stones', false,17);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (68, 'The Beatles', false,17);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (69, 'Queen', false,18);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (70, 'AC/DC', true,18);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (71, 'Pink Floyd', false,18);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (72, 'Slipknot', false,18);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (73, 'Spice girls', false,19);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (74, 'The Destiny Squad', false,19);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (75, 'Rhythm Divas', false,19);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (76, 'Destiny Child', true,19);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (77, 'Paris', true,20);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (78, 'New York', false,20);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (79, 'Dubaï', false,20);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (80, 'Tokyo', false,20);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (81, 'Leonard de Vinci', true,21);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (82, 'Vincent van Gogh', false,21);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (83, 'Pablo Picasso', false,21);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (84, 'Claude Monet', false,21);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (85, 'Mont Everest', true,22);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (86, 'Mont Blanc', false,22);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (87, 'Kilimandjaro', false,22);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (88, 'Mont McKinley', false,22);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (89, 'Gorille', false,23);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (90, 'Lion', false,23);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (91, 'Eléphant', true,23);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (92, 'Tigre', false,23);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (93, 'Victor Hugo', false,24);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (94, 'Antoine de Saint-Exupéry', true,24);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (95, 'Marcel Proust', false,24);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (96, 'Gustave Flaubert', false,24);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (97, 'Jonas Salk', false,25);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (98, 'Louis Pasteur', false,25);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (99, 'Marie Curie', false,25);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (100, 'Alexander Fleming', true,25);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (101, '42,195 kilomètres', true,26);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (102, '42 kilomètres', false,26);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (103, '40 kilomètres', false,26);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (104, '41,195 kilomètres', false,26);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (105, 'Michael Jordan', false,27);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (106, 'LeBron James', true,27);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (107, 'Kobe Briant', false,27);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (108, 'Tony Parker', false,27);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (109, 'France', false,28);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (110, 'Italie', true,28);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (111, 'Allemagne', false,28);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (112, 'Espagne', false,28);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (113, 'Pete Sampras', false,29);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (114, 'Roger Federer', false,29);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (115, 'Rafael Nadal', false,29);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (116, 'Novak Djokovic', true,29);

INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (117, 'Football Américain', true,30);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (118, 'Basketball', false,30);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (119, 'Baseball', false,30);
INSERT INTO reponse(id, contenu, isgood, question_id) VALUES (120, 'Handball', false,30);
