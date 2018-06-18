/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2016_06_01.Maps;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerCallbackUrl;
import com.microsoft.azure.management.logic.v2016_06_01.GetCallbackUrlParameters;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountMap;

class MapsImpl extends WrapperImpl<MapsInner> implements Maps {
    private final LogicManager manager;

    MapsImpl(LogicManager manager) {
        super(manager.inner().maps());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountMapImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationAccountMapImpl wrapModel(IntegrationAccountMapInner inner) {
        return  new IntegrationAccountMapImpl(inner, manager());
    }

    private IntegrationAccountMapImpl wrapModel(String name) {
        return new IntegrationAccountMapImpl(name, this.manager());
    }

    @Override
    public Observable<WorkflowTriggerCallbackUrl> listContentCallbackUrlAsync(String resourceGroupName, String integrationAccountName, String mapName, GetCallbackUrlParameters listContentCallbackUrl) {
        MapsInner client = this.inner();
        return client.listContentCallbackUrlAsync(resourceGroupName, integrationAccountName, mapName, listContentCallbackUrl)
        .map(new Func1<WorkflowTriggerCallbackUrlInner, WorkflowTriggerCallbackUrl>() {
            @Override
            public WorkflowTriggerCallbackUrl call(WorkflowTriggerCallbackUrlInner inner) {
                return new WorkflowTriggerCallbackUrlImpl(inner, manager());
            }
        });
    }

    private Observable<Page<IntegrationAccountMapInner>> listByIntegrationAccountsNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        MapsInner client = this.inner();
        return client.listByIntegrationAccountsNextAsync(nextLink)
        .flatMap(new Func1<Page<IntegrationAccountMapInner>, Observable<Page<IntegrationAccountMapInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountMapInner>> call(Page<IntegrationAccountMapInner> page) {
                return Observable.just(page).concatWith(listByIntegrationAccountsNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<IntegrationAccountMap> listByIntegrationAccountsAsync(final String resourceGroupName, final String integrationAccountName) {
        MapsInner client = this.inner();
        return client.listByIntegrationAccountsAsync(resourceGroupName, integrationAccountName)
        .flatMap(new Func1<Page<IntegrationAccountMapInner>, Observable<Page<IntegrationAccountMapInner>>>() {
            @Override
            public Observable<Page<IntegrationAccountMapInner>> call(Page<IntegrationAccountMapInner> page) {
                return listByIntegrationAccountsNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<IntegrationAccountMapInner>, Iterable<IntegrationAccountMapInner>>() {
            @Override
            public Iterable<IntegrationAccountMapInner> call(Page<IntegrationAccountMapInner> page) {
                return page.items();
            }
       })
        .map(new Func1<IntegrationAccountMapInner, IntegrationAccountMap>() {
            @Override
            public IntegrationAccountMap call(IntegrationAccountMapInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<IntegrationAccountMap> getAsync(String resourceGroupName, String integrationAccountName, String mapName) {
        MapsInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, mapName)
        .map(new Func1<IntegrationAccountMapInner, IntegrationAccountMap>() {
            @Override
            public IntegrationAccountMap call(IntegrationAccountMapInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String mapName) {
        MapsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, mapName).toCompletable();
    }

}
