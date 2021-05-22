package com.example.Validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class DepartmentValidator implements ConstraintValidator<DepartmentCode, String> {
    private String[] deptPrefix;
    @Override
    public void initialize(DepartmentCode constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
