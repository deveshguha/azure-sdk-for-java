/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.storage.v2017_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2017_10_01.Usages;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.arm.utils.PagedListConverter;
import com.microsoft.azure.management.storage.v2017_10_01.Usage;

class UsagesImpl extends WrapperImpl<UsagesInner> implements Usages {
    private PagedListConverter<UsageInner, Usage> converter;
    private final StorageManager manager;

    UsagesImpl(StorageManager manager) {
        super(manager.inner().usages());
        this.manager = manager;
        this.converter = new PagedListConverter<UsageInner, Usage>() {
            @Override
            public Observable<Usage> typeConvertAsync(UsageInner inner) {
                return Observable.just((Usage) wrapModel(inner));
            }
        };
    }

    public StorageManager manager() {
        return this.manager;
    }

    private UsageImpl wrapModel(UsageInner inner) {
        return  new UsageImpl(inner, manager());
    }

    @Override
    public PagedList<Usage> list() {
        UsagesInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<Usage> listAsync() {
        UsagesInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<UsageInner>, Observable<UsageInner>>() {
            @Override
            public Observable<UsageInner> call(Page<UsageInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<UsageInner, Usage>() {
            @Override
            public Usage call(UsageInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
