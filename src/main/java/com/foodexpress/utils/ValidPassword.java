package com.foodexpress.utils;

import jakarta.validation.Constraint;

@Constraint(validatedBy = GenderValidator.class)
public @interface ValidPassword {
}
