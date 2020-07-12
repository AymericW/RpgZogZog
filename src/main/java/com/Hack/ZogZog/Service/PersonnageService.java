package com.Hack.ZogZog.Service;
import com.Hack.ZogZog.Service.PersonnageService;
import com.Hack.ZogZog.Modal.Personnage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonnageService{
    List<Personnage> get ();

    Personnage get(int idPerso);

    void save(Personnage personnage);

    void delete(int idPerso);
}


