package mx.com.camacho.contactpage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BasicInformation {

    private @GeneratedValue @Id long id;
    private String displayName;
    private String fullName;
    private String displayTitle;

}
