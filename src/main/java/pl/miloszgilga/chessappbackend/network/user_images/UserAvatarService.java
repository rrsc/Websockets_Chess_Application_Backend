/*
 * Copyright (c) 2022 by MILOSZ GILGA <https://miloszgilga.pl>
 *
 *  File name: UserAvatarService.java
 *  Last modified: 26/10/2022, 11:53
 *  Project name: chess-app-backend
 *
 *  Licensed under the MIT license; you may not use this file except in compliance with the License.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 *  THE ABOVE COPYRIGHT NOTICE AND THIS PERMISSION NOTICE SHALL BE INCLUDED IN ALL
 *  COPIES OR SUBSTANTIAL PORTIONS OF THE SOFTWARE.
 */

package pl.miloszgilga.chessappbackend.network.user_images;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import pl.miloszgilga.chessappbackend.dto.SimpleServerMessageDto;

//----------------------------------------------------------------------------------------------------------------------

@Service
public class UserAvatarService implements IUserAvatarService {

    @Override
    public SimpleServerMessageDto addUserAvatar(final MultipartFile image, final Long userId) {
        // TODO: add user avatar into account via external sftp service

        return new SimpleServerMessageDto("User avatar image was sucessfuly added.");
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public SimpleServerMessageDto updateUserAvatar(final MultipartFile image, final Long userId) {
        // TODO: update user avatar in external sftp service

        return new SimpleServerMessageDto("User avatar image was successfuly updated.");
    }

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public SimpleServerMessageDto deleteUserAvatar(final Long userId) {
        // TODO: delete user avatar from external sftp service

        return new SimpleServerMessageDto("User avatar image was successfuly deleted.");
    }
}
