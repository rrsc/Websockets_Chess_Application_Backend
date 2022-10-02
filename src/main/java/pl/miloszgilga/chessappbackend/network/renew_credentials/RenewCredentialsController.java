/*
 * Copyright (c) 2022 by MILOSZ GILGA <https://miloszgilga.pl>
 *
 * File name: RenewCredentialsController.java
 * Last modified: 10/09/2022, 19:13
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

package pl.miloszgilga.chessappbackend.network.renew_credentials;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import pl.miloszgilga.chessappbackend.dto.SimpleServerMessageDto;
import pl.miloszgilga.chessappbackend.network.renew_credentials.dto.AttemptToChangePasswordReqDto;

import static pl.miloszgilga.chessappbackend.config.ApplicationEndpoints.*;

//----------------------------------------------------------------------------------------------------------------------

@RestController
@RequestMapping(RENEW_CREDETIALS_LOCAL)
class RenewCredentialsController {

    private final IRenewCredentialsService service;

    RenewCredentialsController(IRenewCredentialsService service) {
        this.service = service;
    }

    @PostMapping(ATTEMPT_TO_CHANGE_PASSWORD)
    ResponseEntity<SimpleServerMessageDto> attemptToChangePassword(@RequestBody @Valid AttemptToChangePasswordReqDto req) {
        return new ResponseEntity<>(service.attemptToChangePassword(req), HttpStatus.OK);
    }
}
