package com.Hack.ZogZog.DAO;

import com.Hack.ZogZog.Modal.Personnage;

import java.util.List;

public interface PersonnageDAO {
    List<Personnage> get();

    Personnage get(int idPerso);

    void save(Personnage personnage);

    void delete(int idPerso);
}
