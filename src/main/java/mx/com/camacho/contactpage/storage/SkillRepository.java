package mx.com.camacho.contactpage.storage;

import mx.com.camacho.contactpage.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, String> {}
