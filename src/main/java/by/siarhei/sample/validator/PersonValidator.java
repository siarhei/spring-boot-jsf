package by.siarhei.sample.validator;

import by.siarhei.sample.constraint.PersonConstraint;
import by.siarhei.sample.model.PersonInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Positive;
import java.time.LocalDate;
import java.time.Period;


public class PersonValidator implements ConstraintValidator<PersonConstraint, PersonInfo> {
    private static final Logger LOG = LoggerFactory.getLogger(PersonValidator.class);

    @Override
    public boolean isValid(PersonInfo personInfo, ConstraintValidatorContext constraintValidatorContext) {
        LOG.debug("Validating {}", personInfo);

        @Positive Integer age = personInfo.getAge();

        Period periodFromBirthToNow = Period.between(LocalDate.now(), personInfo.getBirthDate());

        return periodFromBirthToNow.getYears() == age;
    }
}
