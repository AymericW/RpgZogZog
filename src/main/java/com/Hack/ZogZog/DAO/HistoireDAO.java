package com.Hack.ZogZog.DAO;

import com.Hack.ZogZog.Modal.Histoires;

import java.util.List;

public interface HistoireDAO {
    List<Histoires> get();

    Histoires get(int idHistoire);

    void save(Histoires histoires);

    void delete(int idHistoire);
}
