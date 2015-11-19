package com.thai.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NomPrenom implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name="nom", nullable=false, length=40)
    private String nom;

    @Column(name="prenom", nullable=false, length=40)
    private String prenom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NomPrenom)) {
            return false;
        }
        NomPrenom pk = (NomPrenom) obj;
        return Objects.equals(pk.nom, nom) && Objects.equals(pk.prenom, prenom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode() + prenom.hashCode();
    }

}
