/*
 * Copyright (c) 2022 by MILOSZ GILGA <https://miloszgilga.pl>
 *
 * File name: IAuthLocalService.java
 * Last modified: 11/09/2022, 01:38
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

package pl.miloszgilga.chessappbackend.network.auth;

import pl.miloszgilga.chessappbackend.dto.*;
import pl.miloszgilga.chessappbackend.oauth.AuthUser;
import pl.miloszgilga.chessappbackend.network.auth.dto.*;
import pl.miloszgilga.chessappbackend.oauth.dto.OAuth2RegistrationData;

//----------------------------------------------------------------------------------------------------------------------

interface ISignupService {
    SuccessedAttemptToFinishSignupResDto signupViaLocal(final SignupViaLocalReqDto req);
    SuccessedAttemptToFinishSignupResDto attemptToFinishSignup(final Long userId);
    SuccessedAttemptToFinishSignupResDto attemptToActivateAccount(final Long userId);
    SimpleServerMessageDto finishSignup(final FinishSignupReqDto req, final Long userId);
    AuthUser registrationProcessingFactory(final OAuth2RegistrationData registrationData);
    SimpleServerMessageDto resendVerificationEmailLink(final ResendEmailMessageReqDto req);
}
