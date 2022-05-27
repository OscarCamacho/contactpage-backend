package mx.com.camacho.contactpage.controllers;

import mx.com.camacho.contactpage.model.BasicInformation;
import mx.com.camacho.contactpage.storage.BasicInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/basic-info")
@CrossOrigin
public class BasicInfoController {

    @Autowired
    private BasicInformationRepository repository;

    @GetMapping
    public BasicInformation get () {
        return repository.findAll().stream().findAny().orElseThrow();
    }

}
