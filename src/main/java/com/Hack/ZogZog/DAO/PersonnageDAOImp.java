package com.Hack.ZogZog.DAO;

import com.Hack.ZogZog.Modal.Personnage;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import org.hibernate.query.Query;

import java.util.List;

@Repository
public class PersonnageDAOImp implements PersonnageDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Personnage> get() {

        Session currentsession = entityManager.unwrap(Session.class);
        Query<Personnage> query = currentsession.createQuery("from Personnage", Personnage.class);
        List<Personnage> list = query.getResultList();
        return list;
    }

    @Override
    public Personnage get(int idPerso) {
        Session currentsession = entityManager.unwrap(Session.class);
        Personnage perso  = currentsession.get(Personnage.class, idPerso);
        return perso;
    }

    @Override
    public void save(Personnage personnage) {
        Session currentsession = entityManager.unwrap(Session.class);
        currentsession.saveOrUpdate(personnage);
    }

    @Override
    public void delete(int idPerso) {
        Session currentsession = entityManager.unwrap(Session.class);
        Personnage perso = currentsession.get(Personnage.class, idPerso);
        currentsession.delete(perso);
    }
}
