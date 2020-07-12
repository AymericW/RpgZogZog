package com.Hack.ZogZog.Controller;
import com.Hack.ZogZog.Modal.Histoires;
import com.Hack.ZogZog.Service.HistoiresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class HistoireController {

    @Autowired
    private HistoiresService histoiresService;

    @GetMapping("/histoires")
    public List<Histoires> get() {
        return histoiresService.get();
    }
    @PostMapping("/histoires")
    public Histoires save(@RequestBody Histoires histoires) {
        histoiresService.save(histoires);
        return histoires;
    }

    @GetMapping("/histoires/{id}")
    public Histoires get(@PathVariable int idHistoire) {
        return histoiresService.get(idHistoire);
    }

    @DeleteMapping("/histoires/{id}")
    public String delete(@PathVariable int idHistoire) {
        histoiresService.delete(idHistoire);
        return ("Histoire removed with id" + idHistoire);
    }

    @PutMapping("/histoires")
    public Histoires update(@RequestBody Histoires histoires) {
        histoiresService.save(histoires);
        return histoires;
    }

}
