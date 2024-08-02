package com.api.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PreviousMonthDataValidator.class)
public @interface PreviousMonthData {
    String message() default "The date must be within the last 30 days";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
