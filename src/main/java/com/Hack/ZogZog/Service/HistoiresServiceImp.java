package com.Hack.ZogZog.Service;

import com.Hack.ZogZog.DAO.HistoireDAO;
import com.Hack.ZogZog.Modal.Histoires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class HistoiresServiceImp implements HistoiresService {

    @Autowired
    private HistoireDAO histoireDAO;

    @Transactional
    @Override
    public List<Histoires> get() {
        return histoireDAO.get();
    }

    @Transactional
    @Override
    public Histoires get(int idHistoire) {
        return histoireDAO.get(idHistoire);
    }

    @Transactional
    @Override
    public void save(Histoires histoires) {
        histoireDAO.save(histoires);
    }

    @Transactional
    @Override
    public void delete(int idHistoire) {
        histoireDAO.delete(idHistoire);
    }
}
