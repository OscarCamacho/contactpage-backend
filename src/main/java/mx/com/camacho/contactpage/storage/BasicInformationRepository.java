package mx.com.camacho.contactpage.storage;

import mx.com.camacho.contactpage.model.BasicInformation;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasicInformationRepository extends JpaRepository<BasicInformation, Long> {
    @Cacheable("basicInfo")
    List<BasicInformation> findAll ();
}
