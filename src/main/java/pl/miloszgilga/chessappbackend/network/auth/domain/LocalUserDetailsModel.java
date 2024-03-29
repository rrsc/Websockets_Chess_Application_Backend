/*
 * Copyright (c) 2022 by MILOSZ GILGA <https://miloszgilga.pl>
 *
 * File name: LocalUserDetailsModel.java
 * Last modified: 16/09/2022, 21:52
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

package pl.miloszgilga.chessappbackend.network.auth.domain;

import lombok.*;

import java.util.Date;
import java.io.Serializable;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

import pl.miloszgilga.chessappbackend.audit.AuditableEntity;
import pl.miloszgilga.chessappbackend.utils.UserGenderSpecific;

//----------------------------------------------------------------------------------------------------------------------

@Entity
@Table(name = "LOCAL_USER_DETAILS")
@Getter @Setter
@NoArgsConstructor
public class LocalUserDetailsModel extends AuditableEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "SECOND_EMAIL_ADDRESS")  private String secondEmailAddress;
    @Column(name = "BIRTH_DATE")            private Date birthDate;
    @Column(name = "COUNTRY")               private String country;
    @Column(name = "GENDER")                private UserGenderSpecific gender;
    @Column(name = "HAS_NEWSLETTER_ACCEPT") private Boolean hasNewsletterAccept;
    @Column(name = "IS_DATA_FILLED")        private Boolean isDataFilled;

    @OneToOne(cascade = { PERSIST, MERGE }, fetch = LAZY)
    @JoinColumn(name = "LOCAL_USER_ID", referencedColumnName = "ID")
    private LocalUserModel localUser;

    //------------------------------------------------------------------------------------------------------------------

    public LocalUserDetailsModel(String secondEmailAddress, Date birthDate, String country, UserGenderSpecific gender,
                                 Boolean hasNewsletterAccept, Boolean isDataFilled) {
        this.secondEmailAddress = secondEmailAddress;
        this.birthDate = birthDate;
        this.country = country;
        this.gender = gender;
        this.hasNewsletterAccept = hasNewsletterAccept;
        this.isDataFilled = isDataFilled;
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "LocalUserDetailsModel{" +
                "secondEmailAddress='" + secondEmailAddress + '\'' +
                ", birthDate=" + birthDate +
                ", country='" + country + '\'' +
                ", gender=" + gender +
                ", hasNewsletterAccept=" + hasNewsletterAccept +
                ", isDataFilled=" + isDataFilled +
                "} " + super.toString();
    }
}
