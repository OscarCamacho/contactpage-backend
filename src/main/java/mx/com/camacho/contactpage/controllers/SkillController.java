package mx.com.camacho.contactpage.controllers;

import mx.com.camacho.contactpage.model.Skill;
import mx.com.camacho.contactpage.storage.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/skills")
@CrossOrigin
public class SkillController {

    @Autowired
    private SkillRepository skillRepository;

    @GetMapping
    public List<Skill> getSkills () {
        return skillRepository.findAll();
    }

}
