package by.siarhei.sample.constraint;

import by.siarhei.sample.validator.PersonValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = PersonValidator.class)
@Target(TYPE)
@Retention(RUNTIME)
public @interface PersonConstraint {

    String message() default "{error.person}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
