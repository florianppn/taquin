# Jeu du Taquin

## Description
Jeu du Taquin implémenté en Java à l'aide de la bibliothèque graphique Swing.

## Règles du jeu
Le taquin est un jeu de puzzle qui se joue sur une grille carrée, en 4x4, où il manque une case. 
Le but du jeu est de réorganiser les tuiles numérotées en les faisant glisser dans l'espace vide, afin de reconstituer une image ou un ordre numérique prédéfini.

## Fonctionnalités principales

+ Reconstituer une image.

+ Reconstituer un ordre numérique.

+ Possiblité de mettre une image personnalisé.

## Comment lancer le jeu

+ LINUX : lancer le fichier `dist/run.sh`

+ WINDOWS : lancer le fichier `dist/run.bat`

+ Vous pouvez également lancer le jeu avec ANT via la commande `ant run-taquin`

## Comment mettre une image personnalisé

J'ai mis à votre disposition un splitter permettant de découper une image en plusieurs morceaux.

+ LINUX : lancer le fichier `dist/splitter.sh <chemin image> <lignes> <columns>`

+ WINDOWS : lancer le fichier `dist/splitter.bat <chemin image> <lignes> <columns>`

+ Exemple : `dist/splitter.sh /home/user/image.jpg 4 4`
+ Exemple : `dist/splitter.bat C:\Users\user\image.jpg 4 4`
+ Exemple : `dist/splitter.bat image.jpg 4 4`

## Contribuer

+ N'hésitez pas à signaler des bugs.

+ N'hésitez pas à améliorer le code existant.

## Licence

Ce projet est sous licence [MIT].

## Captures d'écran

Soon ...
