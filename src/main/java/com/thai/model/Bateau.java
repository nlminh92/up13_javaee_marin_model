package com.thai.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name="t_bateau")
public class Bateau {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="nom", length=40)
    private String nom;

    @OneToMany(
            cascade=CascadeType.PERSIST,
            fetch=FetchType.EAGER)
    @OrderBy("name")
    private Collection<Marin> equipage = new ArrayList<Marin>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection<Marin> getEquipage() {
        return equipage;
    }

    public void setEquipage(Collection<Marin> equipage) {
        this.equipage = equipage;
    }
}
