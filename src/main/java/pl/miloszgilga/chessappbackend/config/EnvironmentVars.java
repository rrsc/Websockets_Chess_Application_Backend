/*
 * Copyright (c) 2022 by MILOSZ GILGA <https://miloszgilga.pl>
 *
 * File name: Environment.java
 * Last modified: 02/09/2022, 22:41
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

package pl.miloszgilga.chessappbackend.config;

import lombok.*;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Value;

//----------------------------------------------------------------------------------------------------------------------

@Getter
@Primary
@Component
@NoArgsConstructor
public class EnvironmentVars {
    @Value("${config.base-url}")                                             private String baseUrl;
    @Value("${authorization.one-time-access-token.token-expired-minutes}")   private Integer otaTokenExpiredMinutes;
    @Value("${config.frontend-cors-url}")                                    private String frontEndUrl;
    @Value("${spring.mail.username}")                                        private String serverMailClient;
    @Value("${config.frontend-name}")                                        private String frontendName;
    @Value("${config.mail-helpdesk-agent}")                                  private String mailHelpdeskAgent;
    @Value("${config.cors-max-age-seconds}")                                 private Integer corsMaxAgeSeconds;
    @Value("${authorization.bearer-token.token-expired-minutes}")            private Integer bearerTokenExpiredMinutes;
    @Value("${oauth2-custom.token-secret}")                                  private String oauth2TokenSecret;
    @Value("${oauth2-custom.token-expiration-hours}")                        private Integer oauth2TokenExpirationHours;
    @Value("${authorization.refresh-token.token-expired-months}")            private Integer refreshTokenExpiredMonths;
    @Value("${authorization.oauth2-custom.password-replacer}")               private String oauth2PasswordReplacer;
    @Value("${config.redirects.change-password-uri}")                        private String changePasswordRedirectUri;
    @Value("${config.redirects.activate-account-uri}")                       private String activateAccountRedirectUri;
    @Value("${config.redirects.unsubscribe-newsletter-uri}")                 private String unsubscribeNewsletterUri;
}
