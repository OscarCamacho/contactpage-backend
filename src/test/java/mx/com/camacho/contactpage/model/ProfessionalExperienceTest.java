package mx.com.camacho.contactpage.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfessionalExperienceTest {

    @Test
    public void getDuration_shouldReturnExpectedString () {
        ProfessionalExperience experience = new ProfessionalExperience(1, "Role", "Company",
                List.of("achievement"), LocalDate.of(2021,1,1 ),
                LocalDate.of(2022, 3, 1));

        String obtained = experience.getDuration();

        assertThat(obtained).isEqualTo("1 year 2 months");
    }

    @Test
    public void getDuration_shouldGetDifferenceBetweenTodayAndStartDate () {
        LocalDate start = LocalDate.of(2020,1,1 );
        ProfessionalExperience experience = new ProfessionalExperience(1, "Role", "Company",
                List.of("achievement"), start,null);
        Period diff = Period.between(start, LocalDate.now());

        String obtained = experience.getDuration();


        assertThat(obtained).isEqualTo(String.format("%d years %d months", diff.getYears(), diff.getMonths()));
    }

}
