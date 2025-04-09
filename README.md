# 🎒 Projet TP POO2 - Gestion d'Objets du Quotidien

Bienvenue dans ce projet réalisé dans le cadre du **TP 2 de Programmation Orientée Objet 2 (POO2)**.

Ce projet Java propose une application graphique permettant de gérer des objets du quotidien (voiture, télévision, etc.) via une interface utilisateur ergonomique construite avec **Swing**.

---

## 📁 Structure du projet

```
TPPOO_Kennedy/
├── dao/                    # Accès aux données (lecture/écriture dans les fichiers)
├── modèle/                # Classes représentant les objets (Voiture, Livre, etc.)
├── interface utilisateur/ # Fenêtres, onglets, champs dynamiques
├── Main.java              # Point d'entrée principal de l'application
├── objets.txt             # Base de données textuelle locale
└── README.md              # Documentation du projet
```

---

## 💼 Fonctionnalités principales

- 🆕 **Ajout d’un objet** via une interface dynamique
- 🔍 **Recherche** parmi les objets existants
- ✏️ Saisie des caractéristiques spécifiques selon le type d’objet
- 💾 Persistance locale via un fichier `objets.txt`
- 🧱 Architecture MVC claire (Modèle / Vue / Contrôleur / DAO)

---

## 🧠 Organisation des packages

- **`modèle`** : contient les classes représentant les objets réels (avec héritage si besoin).
- **`dao`** : gère la lecture/écriture dans le fichier texte, comme un mini système de base de données.
- **`interface utilisateur`** : contient la logique Swing, la création des fenêtres et des composants dynamiques.

---

## 🛠️ Technologies utilisées

- Langage : **Java**
- Interface : **Swing (javax.swing)**  
- Persistance : Fichier texte `objets.txt` (utilisé comme mini base de données)

---

## 🚀 Lancement de l’application

### 1. Compiler

Assurez-vous d’avoir Java installé, puis :

```bash
javac Main.java
```

### 2. Exécuter

```bash
java Main
```

L'interface graphique s’ouvrira automatiquement.

---

## 📌 Exemple de types d'objets gérés

- 🚗 Voiture : marque, modèle, année, couleur
- 📺 Téléviseur : marque, taille, technologie
- Téléphone

---

## ✍️ Auteur

Projet réalisé par **Matteo**, étudiant en POO2.  

---

## 📝 À venir

- Sauvegarde plus avancée (JSON, CSV ou base de données)
- Tri, suppression, modification d’objets
- Ajout de filtres dans la recherche
- Amélioration de l'interface graphique (flat design, styles CSS avec JavaFX ?)

---

## 📩 Contribution

Ce projet est librement modifiable dans un cadre éducatif.  
Forkez-le, explorez-le, améliorez-le ! 😎
