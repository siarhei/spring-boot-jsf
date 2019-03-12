package by.siarhei.sample.model;

import by.siarhei.sample.constraint.PersonConstraint;
import by.siarhei.sample.validator.groups.PersonValidationGroup;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
@Scope("request")
@Component("person")
@PersonConstraint(groups = PersonValidationGroup.class)
public class PersonInfo {
    @Past
    @NotNull
    private Date birthDate = new Date();

    @Positive
    @NotNull
    private Integer age;
}
