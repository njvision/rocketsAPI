package com.api.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PreviousMonthDataValidator implements ConstraintValidator<PreviousMonthData, LocalDate> {

    int days;

    @Override
    public void initialize(PreviousMonthData constraintAnnotation) {
        this.days = constraintAnnotation.days();
    }

    @Override
    public boolean isValid(LocalDate date, ConstraintValidatorContext constraintValidatorContext) {

        if(date == null) {
            return true;
        }

        try {
            LocalDate now = LocalDate.now();
            long daysBetween = ChronoUnit.DAYS.between(date, now);
            return daysBetween >= 0 && daysBetween <= days;
        } catch (Exception e) {
            return false;
        }
    }
}
