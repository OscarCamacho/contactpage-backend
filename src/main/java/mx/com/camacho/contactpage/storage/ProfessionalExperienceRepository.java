package mx.com.camacho.contactpage.storage;

import mx.com.camacho.contactpage.model.ProfessionalExperience;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessionalExperienceRepository
        extends JpaRepository<ProfessionalExperience, Integer> {
    @Cacheable("experiences")
    List<ProfessionalExperience> findAll ();
}
