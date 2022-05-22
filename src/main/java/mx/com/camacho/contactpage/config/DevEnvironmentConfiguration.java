package mx.com.camacho.contactpage.config;

import lombok.extern.slf4j.Slf4j;
import mx.com.camacho.contactpage.model.BasicInformation;
import mx.com.camacho.contactpage.model.ProfessionalExperience;
import mx.com.camacho.contactpage.model.Skill;
import mx.com.camacho.contactpage.storage.BasicInformationRepository;
import mx.com.camacho.contactpage.storage.ProfessionalExperienceRepository;
import mx.com.camacho.contactpage.storage.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@Profile("dev")
@Slf4j
public final class DevEnvironmentConfiguration implements CommandLineRunner {

    @Autowired
    private BasicInformationRepository basicInformationRepository;
    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private ProfessionalExperienceRepository professionalExperienceRepository;

    private static final BasicInformation BASIC_INFORMATION = new BasicInformation(
            1L,
            "Oscar Camacho",
            "Oscar Uriel Camacho Hernandez",
            "Lead Software Engineer");
    private static final List<Skill> SKILL_LIST = List.of(
            new Skill("Skill 1", 1.0, "novice", "category 1"),
            new Skill("Skill 2", 2.0, "intermediate", "category 2"),
            new Skill("Skill 3", 3.0, "expert", "category 2"));

    private static final List<ProfessionalExperience> PROFESSIONAL_EXPERIENCES = List.of(
            new ProfessionalExperience(1, "Role 1", "Company 1",
                    List.of("Achievement 1", "Achievement 2", "Achievement 3"),
                    LocalDate.of(2022,1,1),
                    LocalDate.of(2022,1,2)),
            new ProfessionalExperience(2, "Role 2", "Company 2",
                    List.of("Achievement 1", "Achievement 2", "Achievement 3"),
                    LocalDate.of(2022,1,1),
                    LocalDate.of(2022,1,2)),
            new ProfessionalExperience(3, "Role 3", "Company 3",
                    List.of("Achievement 1", "Achievement 2", "Achievement 3"),
                    LocalDate.of(2022,1,1),
                    LocalDate.of(2022,1,2)));

    @Override
    public void run(String... args) {
        log.warn("Executing dev configuration");
        basicInformationRepository.save(BASIC_INFORMATION);
        skillRepository.saveAll(SKILL_LIST);
        professionalExperienceRepository.saveAll(PROFESSIONAL_EXPERIENCES);
    }
}
