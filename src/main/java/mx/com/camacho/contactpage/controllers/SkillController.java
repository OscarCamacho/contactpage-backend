package mx.com.camacho.contactpage.controllers;

import mx.com.camacho.contactpage.model.Skill;
import mx.com.camacho.contactpage.storage.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    private SkillRepository skillRepository;

    @GetMapping
    public List<String> getSkills () {
        return skillRepository.findAll().stream()
                .map(Skill::getDisplayName)
                .collect(Collectors.toList());
    }

    @GetMapping("/{skillName}")
    public Skill getSkill (@PathVariable String skillName) {
        return skillRepository.findById(skillName)
                .orElseThrow();
    }

}
