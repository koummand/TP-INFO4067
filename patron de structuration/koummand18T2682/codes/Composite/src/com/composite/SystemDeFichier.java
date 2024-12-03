package com.composite;

public abstract class SystemDeFichier {
    protected String nom;
    protected String type;

    // Constructeur pour initialiser les attributs nom et type
    public SystemDeFichier(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    // Méthode de description (commune à tous les éléments)
    public void decrire() {
        System.out.println("nom: " + this.nom + " de type: " + this.type);
    }

    // Méthodes à implémenter dans les classes concrètes
    public abstract void ajouter(SystemDeFichier fichier);

    public abstract void supprimer(SystemDeFichier fichier);

    public abstract SystemDeFichier obtenir(int indice);
}
