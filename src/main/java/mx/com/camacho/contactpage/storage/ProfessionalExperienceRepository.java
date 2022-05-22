package mx.com.camacho.contactpage.storage;

import mx.com.camacho.contactpage.model.ProfessionalExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionalExperienceRepository
        extends JpaRepository<ProfessionalExperience, Integer> {}
