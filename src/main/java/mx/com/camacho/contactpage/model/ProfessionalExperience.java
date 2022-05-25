package mx.com.camacho.contactpage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProfessionalExperience {
    private @Id int id;
    private String roleTitle;
    private String company;
    @ElementCollection
    private List<String> achievements;
    private LocalDate startDate;
    private LocalDate endDate;

    public String getDuration () {
        StringBuilder durationBuilder = new StringBuilder();
        LocalDate realEndDate = endDate == null ? LocalDate.now() : endDate;
        Period between = Period.between(startDate, realEndDate);
        int years = between.getYears();
        int months = between.getMonths();
        durationBuilder.append(buildDurationString(years, "year"));
        durationBuilder.append(buildDurationString(months, "month"));
        return durationBuilder.toString().trim();
    }

    private static String buildDurationString (int qty, String s) {
        StringBuilder stringBuilder = new StringBuilder();
        if (qty >= 1) {
            stringBuilder.append(qty).append(" ").append(s);
            if (qty > 1) {
                stringBuilder.append("s");
            }
        }
        stringBuilder.append(" ");
        return stringBuilder.toString();
    }
}
