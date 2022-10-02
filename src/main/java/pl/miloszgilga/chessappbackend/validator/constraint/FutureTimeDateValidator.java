/*
 * Copyright (c) 2022 by MILOSZ GILGA <https://miloszgilga.pl>
 *
 * File name: FutureTimeDateValidator.java
 * Last modified: 11/09/2022, 18:48
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import javax.validation.*;

import pl.miloszgilga.chessappbackend.utils.TimeHelper;
import pl.miloszgilga.chessappbackend.validator.annotation.ValidateFutureTimeDate;

//----------------------------------------------------------------------------------------------------------------------

public class FutureTimeDateValidator implements ConstraintValidator<ValidateFutureTimeDate, String> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FutureTimeDateValidator.class);

    private final TimeHelper timeHelper;

    //------------------------------------------------------------------------------------------------------------------

    public FutureTimeDateValidator(TimeHelper timeHelper) {
        this.timeHelper = timeHelper;
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public boolean isValid(String birthDateString, ConstraintValidatorContext context) {
        final Date birthDate = timeHelper.convertStringDateToDateObject(birthDateString);
        if (birthDateString == null || birthDate.after(new Date())) {
            LOGGER.error("Attempt to add birth date which is after the current date.");
            return false;
        }
        return true;
    }
}
