package com.Hack.ZogZog.Service;

import com.Hack.ZogZog.Modal.Histoires;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HistoiresService {
    List<Histoires> get();

    Histoires get(int idHistoire);

    void save(Histoires histoires);

    void delete(int idHistoire);
}
