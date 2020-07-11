package com.Hack.ZogZog.Service;

import com.Hack.ZogZog.DAO.PersonnageDAO;
import com.Hack.ZogZog.Modal.Personnage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PersonnageServiceImp implements PersonnageService{

    @Autowired
    private PersonnageDAO personnageDAO;

    @Transactional
    @Override
    public List<Personnage> get() {
        return personnageDAO.get();
    }

    @Transactional
    @Override
    public Personnage get(int idPerso) {
        return personnageDAO.get(idPerso);
    }

    @Transactional
    @Override
    public void save(Personnage personnage) {
        personnageDAO.save(personnage);

    }

    @Transactional
    @Override
    public void delete(int idPerso) {
        personnageDAO.delete(idPerso);

    }
}
