package mx.com.camacho.contactpage.storage;

import mx.com.camacho.contactpage.model.Skill;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, String> {
    @Cacheable("skills")
    List<Skill> findAll ();
}
