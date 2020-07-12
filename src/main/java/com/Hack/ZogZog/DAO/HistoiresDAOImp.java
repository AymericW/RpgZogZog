package com.Hack.ZogZog.DAO;

import com.Hack.ZogZog.Modal.Histoires;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import java.util.List;

@Repository
public class HistoiresDAOImp implements HistoireDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Histoires> get() {

        Session currensession = entityManager.unwrap(Session.class);
        Query<Histoires> query = currensession.createQuery("from Histoires", Histoires.class);
        List<Histoires> list = query.getResultList();
        return list;
    }

    @Override
    public Histoires get(int idHistoire) {
        Session currentsession = entityManager.unwrap(Session.class);
        Histoires hist = currentsession.get(Histoires.class, idHistoire);
        return hist;
    }

    @Override
    public void save(Histoires histoires) {
        Session currentsession = entityManager.unwrap(Session.class);
        currentsession.saveOrUpdate(histoires);

    }

    @Override
    public void delete(int idHistoire) {
        Session currentsession = entityManager.unwrap(Session.class);
        Histoires hist = currentsession.get(Histoires.class, idHistoire);
        currentsession.delete(hist);

    }
}
