/*
 * Copyright (c) 2022 by MILOSZ GILGA <https://miloszgilga.pl>
 *
 * File name: CountryPropertiesLoader.java
 * Last modified: 16/09/2022, 15:22
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

package pl.miloszgilga.chessappbackend.loader.country_data;

import org.springframework.stereotype.Component;

import pl.miloszgilga.chessappbackend.loader.StaticDataLoader;
import static pl.miloszgilga.chessappbackend.loader.StaticDataLoaderFileName.COUNTRY_STATIC_DATA;

//----------------------------------------------------------------------------------------------------------------------

@Component
public class CountryPropertiesLoader {

    private final StaticDataLoader<CountryPropertiesModel> loader;

    //------------------------------------------------------------------------------------------------------------------

    public CountryPropertiesLoader() {
        this.loader = new StaticDataLoader<>(COUNTRY_STATIC_DATA, CountryPropertiesModel.class);
    }

    //------------------------------------------------------------------------------------------------------------------

    public CountryPropertiesModel getLoadedData() {
        return loader.getLoadedData();
    }
}
