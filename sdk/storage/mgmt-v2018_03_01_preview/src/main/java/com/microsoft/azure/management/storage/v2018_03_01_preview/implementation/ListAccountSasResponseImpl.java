/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview.implementation;

import com.microsoft.azure.management.storage.v2018_03_01_preview.ListAccountSasResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ListAccountSasResponseImpl extends WrapperImpl<ListAccountSasResponseInner> implements ListAccountSasResponse {
    private final StorageManager manager;
    ListAccountSasResponseImpl(ListAccountSasResponseInner inner, StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public String accountSasToken() {
        return this.inner().accountSasToken();
    }

}
