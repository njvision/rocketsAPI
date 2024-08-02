package com.api.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PreviousMonthDataValidator implements ConstraintValidator<PreviousMonthData, String> {

    int days;

    @Override
    public void initialize(PreviousMonthData constraintAnnotation) {
        this.days = constraintAnnotation.days();
    }

    @Override
    public boolean isValid(String dateString, ConstraintValidatorContext constraintValidatorContext) {

        if(dateString == null || dateString.isEmpty()) {
            return true;
        }

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(dateString, formatter);
            LocalDate now = LocalDate.now();
            long daysBetween = ChronoUnit.DAYS.between(date, now);
            return daysBetween >= 0 && daysBetween <= days;
        } catch (Exception e) {
            return false;
        }
    }
}
