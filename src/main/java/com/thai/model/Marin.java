package com.thai.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="MarinTable")
public class Marin {

    @EmbeddedId()
    private NomPrenom nomPrenom;

    @Temporal(TemporalType.DATE)
    @Column(name="date_de_naissance", length=16)
    private Date dateDeNaissance;

    public String getNom() {
        if (nomPrenom == null) {
            return null;
        }
        return this.nomPrenom.getNom();
    }

    public void setNom(String nom) {
        if (nomPrenom == null) {
            nomPrenom = new NomPrenom();
        }
        this.nomPrenom.setNom(nom);
    }

    public String getPrenom() {
        if (nomPrenom == null) {
            return null;
        }
        return this.nomPrenom.getPrenom();
    }

    public void setPrenom(String prenom) {
        if (nomPrenom == null) {
            nomPrenom = new NomPrenom();
        }
        this.nomPrenom.setPrenom(prenom);
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String toString() {
        return getNom() + " " + getPrenom() + ", date_de_naissance = " + dateDeNaissance.toString();
    }

}
