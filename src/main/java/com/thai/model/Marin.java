package com.thai.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_marin")
public class Marin {

    @EmbeddedId
    private NomPrenom nomPrenom;

    @Temporal(TemporalType.DATE)
    @Column(name="date_de_naissance", length=16)
    private Date dateDeNaissance;

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String toString() {
        return "Nom: " + getNom() + " " + getPrenom() + ", date_de_naissance = " + dateDeNaissance.toString();
    }

    public NomPrenom getNomPrenom() {
        return nomPrenom;
    }

    public void setNomPrenom(NomPrenom nomPrenom) {
        this.nomPrenom = nomPrenom;
    }

    private String getNom() {
        return nomPrenom == null ? null : nomPrenom.getNom();
    }

    private String getPrenom() {
        return nomPrenom == null ? null : nomPrenom.getPrenom();
    }


}
