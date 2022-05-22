package mx.com.camacho.contactpage.controllers;

import mx.com.camacho.contactpage.model.ProfessionalExperience;
import mx.com.camacho.contactpage.storage.ProfessionalExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/experience")
public class ProfessionalExperienceController {

    @Autowired
    private ProfessionalExperienceRepository repository;

    @GetMapping
    public Map<Integer, String> getAll () {
        return repository.findAll().stream()
                .collect(Collectors.toMap(ProfessionalExperience::getId,
                        experience -> String.format("%s at %s",
                        experience.getRoleTitle(),
                        experience.getCompany())));
    }

    @GetMapping("/{id}")
    public ProfessionalExperience get (@PathVariable Integer id) {
        return repository.findById(id).orElseThrow();
    }

}
