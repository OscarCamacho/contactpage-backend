package mx.com.camacho.contactpage.storage;

import mx.com.camacho.contactpage.model.BasicInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicInformationRepository extends JpaRepository<BasicInformation, Long> {}
