# SpaceInvaders

- [Semaine n°1 : du 19 au 25 avril](#semaine1)
- [Semaine n°2 : du 26 avril au 2 mai](#semaine2)
- [Glossaire](#glossaire)

## Semaine n°1 : du 19 au 25 avril <a name="semaine1"></a>

### Fonctionnalité en cours d'implémentation

**Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de Jeu**

- Story 1 : Créer un espace de jeu

----
## Semaine n°2 : du 26 avril au 2 mai <a name="semaine2"></a>

### Sprints et fonctionnalités réalisés

#### Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu

- Story 2 : Positionner un nouveau vaisseau dans l'espace de jeu
Un nouveau vaisseau est créé
Le vaisseau est positionné aux coordonnées transmises

- Story 3 : Déplacer le vaisseau vers la droite dans l'espace de jeu
Le vaisseau se déplace d'un pas vers la droite
Si le vaisseau se trouve sur la bordure droite de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).

- Story 4 : Déplacer le vaisseau vers la gauche dans l'espace de jeu
Le vaisseau se déplace d'un pas vers la gauche
Si le vaisseau se trouve sur la bordure gauche de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).

### Diagramme de classe

![Diagramme de classe Semaine 1](./images/diagClasseS1.png)

### Nuage de mots

![Nuage de mots Semaine 1](./images/nuageMotsS1.png)

### Difficultés rencontrés

Aucune

### Remarques diverses

Aucune

----

## Glossaire <a name="glossaire"></a>

- **Vaisseau** : véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.
