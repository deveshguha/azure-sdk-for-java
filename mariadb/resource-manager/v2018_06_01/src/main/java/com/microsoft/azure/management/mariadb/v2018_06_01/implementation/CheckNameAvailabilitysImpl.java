/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mariadb.v2018_06_01.CheckNameAvailabilitys;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.mariadb.v2018_06_01.NameAvailability;
import com.microsoft.azure.management.mariadb.v2018_06_01.NameAvailabilityRequest;

class CheckNameAvailabilitysImpl extends WrapperImpl<CheckNameAvailabilitysInner> implements CheckNameAvailabilitys {
    private final DBforMariaDBManager manager;

    CheckNameAvailabilitysImpl(DBforMariaDBManager manager) {
        super(manager.inner().checkNameAvailabilitys());
        this.manager = manager;
    }

    public DBforMariaDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<NameAvailability> executeAsync(NameAvailabilityRequest nameAvailabilityRequest) {
        CheckNameAvailabilitysInner client = this.inner();
        return client.executeAsync(nameAvailabilityRequest)
        .map(new Func1<NameAvailabilityInner, NameAvailability>() {
            @Override
            public NameAvailability call(NameAvailabilityInner inner) {
                return new NameAvailabilityImpl(inner, manager());
            }
        });
    }

}
