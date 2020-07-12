package com.Hack.ZogZog.Modal;

import javax.persistence.*;


@Entity
@Table(name= "histoires")
public class Histoires {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idHistoires;
    @Column
    private String descriptif;

    @Override
    public String toString() {
        return "Histoire [idHistoires= "+ idHistoires + ", descriptif= " + descriptif + "]";
    }

    public Integer getIdHistoires() { return idHistoires;}

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }


    public String getDescriptif() { return descriptif;}

    public void setIdHistoires(Integer idHistoires) {
        this.idHistoires = idHistoires;
    }
}
