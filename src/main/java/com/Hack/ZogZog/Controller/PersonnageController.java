package com.Hack.ZogZog.Controller;
import com.Hack.ZogZog.Modal.Personnage;
import com.Hack.ZogZog.Service.PersonnageService;
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
public class PersonnageController {

    @Autowired
    private PersonnageService personnageService;

    @GetMapping("/personnage")
    public List<Personnage> get() {

        return personnageService.get();
    }

    @PostMapping("/personnage")
    public Personnage save(@RequestBody Personnage personnage) {
        personnageService.save(personnage);
        return personnage;
    }

    @GetMapping("/personnage/{id}")
    public Personnage get(@PathVariable int idPerso) {

        return personnageService.get(idPerso);
    }

    @DeleteMapping("/personnage/{id}")
    public String delete(@PathVariable int idPerso) {
        personnageService.delete(idPerso);
        return ("Personnage removed with id" + idPerso);
    }

    @PutMapping("/personnage")
    public Personnage update(@RequestBody Personnage personnage) {
        personnageService.save(personnage);
        return personnage;
    }



}
