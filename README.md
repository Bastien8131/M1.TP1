# Documentation des Routes de l'Application

Cette documentation répertorie toutes les routes disponibles dans l'application Spring Boot.

## Routes de base (WebController)

| Méthode | Route | Description |
|---------|-------|-------------|
| GET | `/hello/form` | Redirige vers le formulaire utilisateur (`/form-user.html`) |
| GET | `/form/entier` | Redirige vers la page des entiers (`/entier.html`) |

## Routes REST pour les salutations (TestRestController)

| Méthode | Route | Paramètres | Description |
|---------|-------|------------|-------------|
| GET | `/hello/world` | Aucun | Renvoie "Hello World" |
| GET | `/hello/person/{name}` | `name` (path variable) | Renvoie "Hello" suivi du nom fourni dans l'URL |
| GET | `/hello` | `name` (query parameter) | Renvoie "Hello" suivi du nom fourni en paramètre |

## Routes pour les opérations mathématiques (MathController)

| Méthode | Route | Paramètres | Description |
|---------|-------|------------|-------------|
| GET | `/math/entier` | `inf`, `sup` (query parameters) | Génère un tableau HTML contenant tous les nombres de `inf` à `sup-1` |

## Routes pour les réservations (ResaController)

| Méthode | Route | Description |
|---------|-------|-------------|
| GET | `/resa` | Affiche la page d'accueil du système de réservation |
| POST | `/resa/form/add` | Ajoute une nouvelle réservation (attend un objet Reservation au format JSON dans le corps de la requête) |
| GET | `/resa/confirmation` | Affiche la page de confirmation d'une réservation |
| GET | `/resa/list` | Affiche la liste de toutes les réservations enregistrées |

## Exemples d'utilisation

### Exemple 1: Afficher "Hello World"
```
GET /hello/world
```

### Exemple 2: Saluer un utilisateur via path variable
```
GET /hello/person/Jean
```
Réponse: "Hello Jean"

### Exemple 3: Saluer un utilisateur via query parameter
```
GET /hello?name=Marie
```
Réponse: "Hello Marie"

### Exemple 4: Générer un tableau de nombres
```
GET /math/entier?inf=5&sup=10
```
Réponse: Un tableau HTML contenant les nombres 5, 6, 7, 8, 9

### Exemple 5: Ajouter une réservation
```
POST /resa/form/add
Content-Type: application/json

{
  "nom": "Dupont",
  "prenom": "Jean",
  "email": "jean.dupont@example.com",
  "dateArrivee": "2025-04-15",
  "dateDepart": "2025-04-20"
}
```

### Exemple 6: Afficher la liste des réservations
```
GET /resa/list
```