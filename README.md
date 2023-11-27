Ce répot contient le code source du backend de l'application KnowledgeCrunch. Cette application est un site web permettant de jouer à différents quizz. Il est composé d'une composante administrateur permettant la gestion de l'ensemble,
et d'une composante utilisateur permettant de jouer aux différents quizz.

Il y a plusieurs étapes à suivre afin de démarrer le backend :

1. Il faut copier-coller le .env.sample en .env et définir des valeurs pour les différentes variables.
2. Il faut exécuter la commande docker compose up depuis un terminal à la racine du projet
3. Il faut rajouter le plugin : https://plugins.jetbrains.com/plugin/7861-envfile pour activer les fichier env.
4. Enfin avant de démarrer l'application. Il faut se connecter à la base de données avec les informations du fichier env et y éxectuer les scipts SQL contenus dans initdb.
   Le premier script permet de créer les tables et le deuxième de les remplir.

6. Une fois cela fait, les données de l'application sont disponibles à l'adresse http://localhost:8080 en rajoutant des paramètres en fonction de ce qu'on veut obtenir :
   - /users pour obtenir tous les utilisateurs
   - /admins pour les administrateurs
   - /questions pour les questions
   - /quizz pour les quizz
   - /reponses

  Pour accéder à des informations plus précises, il faut regarder les différents paramètres de requêtes possibles dans les différents controller.
