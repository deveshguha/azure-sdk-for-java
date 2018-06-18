/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.mediaservices.v2015_10_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.mediaservices.v2015_10_01.MediaServices;
import com.microsoft.azure.management.mediaservices.v2015_10_01.MediaService;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mediaservices.v2015_10_01.RegenerateKeyOutput;
import com.microsoft.azure.management.mediaservices.v2015_10_01.ServiceKeys;
import com.microsoft.azure.management.mediaservices.v2015_10_01.CheckNameAvailabilityOutput;
import com.microsoft.azure.management.mediaservices.v2015_10_01.KeyType;

class MediaServicesImpl extends GroupableResourcesCoreImpl<MediaService, MediaServiceImpl, MediaServiceInner, MediaServicesInner, MediaManager>  implements MediaServices {
    protected MediaServicesImpl(MediaManager manager) {
        super(manager.inner().mediaServices(), manager);
    }

    @Override
    protected Observable<MediaServiceInner> getInnerAsync(String resourceGroupName, String name) {
        MediaServicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        MediaServicesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<MediaService> listByResourceGroup(String resourceGroupName) {
        MediaServicesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<MediaService> listByResourceGroupAsync(String resourceGroupName) {
        MediaServicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<MediaServiceInner>, Observable<MediaServiceInner>>() {
            @Override
            public Observable<MediaServiceInner> call(Page<MediaServiceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<MediaServiceInner, MediaService>() {
            @Override
            public MediaService call(MediaServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public MediaServiceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<RegenerateKeyOutput> regenerateKeyAsync(String resourceGroupName, String mediaServiceName, KeyType keyType) {
        MediaServicesInner client = this.inner();
        return client.regenerateKeyAsync(resourceGroupName, mediaServiceName, keyType)
        .map(new Func1<RegenerateKeyOutputInner, RegenerateKeyOutput>() {
            @Override
            public RegenerateKeyOutput call(RegenerateKeyOutputInner inner) {
                return new RegenerateKeyOutputImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceKeys> listKeysAsync(String resourceGroupName, String mediaServiceName) {
        MediaServicesInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, mediaServiceName)
        .map(new Func1<ServiceKeysInner, ServiceKeys>() {
            @Override
            public ServiceKeys call(ServiceKeysInner inner) {
                return new ServiceKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable syncStorageKeysAsync(String resourceGroupName, String mediaServiceName, String id) {
        MediaServicesInner client = this.inner();
        return client.syncStorageKeysAsync(resourceGroupName, mediaServiceName, id).toCompletable();
    }

    @Override
    public Observable<CheckNameAvailabilityOutput> checkNameAvailabilityAsync(String name) {
        MediaServicesInner client = this.inner();
        return client.checkNameAvailabilityAsync(name)
        .map(new Func1<CheckNameAvailabilityOutputInner, CheckNameAvailabilityOutput>() {
            @Override
            public CheckNameAvailabilityOutput call(CheckNameAvailabilityOutputInner inner) {
                return new CheckNameAvailabilityOutputImpl(inner, manager());
            }
        });
    }

    @Override
    protected MediaServiceImpl wrapModel(MediaServiceInner inner) {
        return  new MediaServiceImpl(inner.name(), inner, manager());
    }

    @Override
    protected MediaServiceImpl wrapModel(String name) {
        return new MediaServiceImpl(name, new MediaServiceInner(), this.manager());
    }

}
