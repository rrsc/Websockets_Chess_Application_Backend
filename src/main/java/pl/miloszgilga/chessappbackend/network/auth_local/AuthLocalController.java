/*
 * Copyright (c) 2022 by MILOSZ GILGA <https://miloszgilga.pl>
 *
 * File name: AuthLocalController.java
 * Last modified: 10/09/2022, 19:10
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

package pl.miloszgilga.chessappbackend.network.auth_local;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import pl.miloszgilga.chessappbackend.dao.SimpleServerMessage;
import pl.miloszgilga.chessappbackend.network.auth_local.dto.LoginViaLocalRequestDto;
import pl.miloszgilga.chessappbackend.network.auth_local.dto.RegisterViaLocalRequestDto;
import pl.miloszgilga.chessappbackend.network.auth_local.dto.SuccessedLoginViaLocalResponseDto;


import static pl.miloszgilga.chessappbackend.config.ApplicationEndpoints.*;

//----------------------------------------------------------------------------------------------------------------------

@RestController
@RequestMapping(AUTH_LOCAL_ENDPOINT)
class AuthLocalController {

    private final AuthLocalService service;

    AuthLocalController(AuthLocalService service) {
        this.service = service;
    }

    @PostMapping(LOGIN_VIA_LOCAL)
    ResponseEntity<SuccessedLoginViaLocalResponseDto> loginViaLocal(@Valid @RequestBody LoginViaLocalRequestDto req) {
        return new ResponseEntity<>(service.loginViaLocal(req), HttpStatus.OK);
    }

    @PostMapping(REGISTER_VIA_LOCAL)
    ResponseEntity<SimpleServerMessage> registerViaLocal(@Valid @RequestBody RegisterViaLocalRequestDto req) {
        return new ResponseEntity<>(service.registerViaLocal(req), HttpStatus.CREATED);
    }
}