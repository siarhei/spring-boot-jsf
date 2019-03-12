package by.siarhei.sample.model;

import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

@Data
public class PersonInfo {
    @Past
    private LocalDate birthDate;

    @Positive
    private Integer age;
}
