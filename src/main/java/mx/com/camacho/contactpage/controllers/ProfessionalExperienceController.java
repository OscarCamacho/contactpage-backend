package mx.com.camacho.contactpage.controllers;

import mx.com.camacho.contactpage.model.ProfessionalExperience;
import mx.com.camacho.contactpage.storage.ProfessionalExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/experience")
public class ProfessionalExperienceController {

    @Autowired
    private ProfessionalExperienceRepository repository;

    @GetMapping
    public List<ProfessionalExperience> getAll () {
        return repository.findAll();
    }

}
