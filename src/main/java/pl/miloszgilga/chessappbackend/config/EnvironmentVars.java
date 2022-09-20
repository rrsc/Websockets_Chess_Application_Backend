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

import lombok.Getter;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//----------------------------------------------------------------------------------------------------------------------

@Getter
@Primary
@Component
@NoArgsConstructor
public class EnvironmentVars {
    @Value("${config.authorization.jwt-key}")                                   private String jwtSecretKey;
    @Value("${authorization.one-time-access-token.token-length}")               private Integer otaTokenLenght;
    @Value("${authorization.one-time-access-token.token-expired-minutes}")      private Integer otaTokenExpiredMinutes;
    @Value("${spring.profiles.active}")                                         private String applicationMode;
    @Value("${config.newsletter-unsubscribe-path}")                             private String newsletterUnsubscribePath;
    @Value("${config.frontend-cors-url}")                                       private String frontEndUrl;
    @Value("${spring.mail.username}")                                           private String serverMailClient;
    @Value("${config.frontend-name}")                                           private String frontendName;
    @Value("${config.mail-helpdesk-agent}")                                     private String mailHelpdeskAgent;
    @Value("${config.authorization.jwt-issuer}")                                private String jwtIssuer;
    @Value("${config.cors-max-age-seconds}")                                    private Integer corsMaxAgeSeconds;
    @Value("${config.authorization.password-encoder-strength}")                 private Integer passwordEncoderStrength;
    @Value("${authorization.bearer-token.token-expired-minutes}")               private Integer bearerTokenExpiredMinutes;
    @Value("${oauth2-custom.token-secret}")                                     private String oauth2TokenSecret;
    @Value("${oauth2-custom.token-expiration-hours}")                           private Integer oauth2TokenExpirationHours;
    @Value("${oauth2-custom.redirect-uris}")                                    private List<String> oauth2RedirectUris;
}
