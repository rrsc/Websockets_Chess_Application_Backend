/*
 * Copyright (c) 2022 by MILOSZ GILGA <https://miloszgilga.pl>
 *
 * File name: ValidateEnumValidator.java
 * Last modified: 11/09/2022, 19:01
 * Project name: chess-app-backend
 *
 * Licensed under the MIT license; you may not use this file except in compliance with the License.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * THE ABOVE COPYRIGHT NOTICE AND THIS PERMISSION NOTICE SHALL BE INCLUDED IN ALL
 * COPIES OR SUBSTANTIAL PORTIONS OF THE SOFTWARE.
 */

package pl.miloszgilga.chessappbackend.validator.constraint;

import pl.miloszgilga.chessappbackend.validator.annotation.ValidateEnum;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.util.Set;
import java.util.Locale;
import java.util.stream.Stream;
import java.util.stream.Collectors;

//----------------------------------------------------------------------------------------------------------------------

public class ValidateEnumValidator implements ConstraintValidator<ValidateEnum, String> {

    private Set<String> availableValues;

    @Override
    public void initialize(final ValidateEnum constraintAnnotation) {
        this.availableValues = Stream.of(constraintAnnotation.enumClazz().getEnumConstants())
                .map(v -> v.name().toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());
    }

    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        if (value == null) return false;
        return availableValues.contains(value.toLowerCase(Locale.ROOT));
    }
}