package com.Hack.ZogZog.Modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name = "personnages")
public class Personnage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idPerso;
    @Column
    private String Name;
    @Column
    private int PV;
    @Column
    private int XP;
    @Column
    private int Fuite;
    @Column
    private int FK_idRace;
    @Column
    private int FK_idClasse;


    @Override
    public String toString() {
        return "Personnage [idPerso= " + idPerso + ", Name= " + Name + ", PV= " + PV + ", XP= " + XP + ", Fuite= " + Fuite + ", IdRace= " + FK_idRace + ", IdClasse= " + FK_idClasse + "]";
    }

    public int getidRace() {
        return FK_idRace;
    }

    public void setidRace(int idRace) {
        this.FK_idRace = idRace;
    }

    public int getidClasse() {
        return FK_idClasse;
    }

    public void setidClasse(int idClasse) {
        this.FK_idClasse = idClasse;
    }


    public Integer getId() {
        return idPerso;
    }

    public void setId(Integer id) {
        this.idPerso = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    public int getHp() {
        return PV;
    }

    public void setHp(Integer hp) {
        this.PV = hp;
    }

    public int getXp() {
        return XP;
    }

    public void setXp(Integer xp) {
        this.XP = xp;
    }

    public int getfuite() {
        return Fuite;
    }

    public void setFuite(int fuite){
        this.Fuite = fuite;
    }
}


