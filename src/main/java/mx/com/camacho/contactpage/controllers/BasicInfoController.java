package mx.com.camacho.contactpage.controllers;

import lombok.extern.slf4j.Slf4j;
import mx.com.camacho.contactpage.model.BasicInformation;
import mx.com.camacho.contactpage.storage.BasicInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic-info")
@Slf4j
public class BasicInfoController {

    @Autowired
    private BasicInformationRepository repository;

    @GetMapping
    public BasicInformation get () {
        return repository.findAll().stream().findAny().orElseThrow();
    }

}
