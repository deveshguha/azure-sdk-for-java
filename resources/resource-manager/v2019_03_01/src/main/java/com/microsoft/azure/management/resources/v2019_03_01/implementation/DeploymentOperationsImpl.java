/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.resources.v2019_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_03_01.DeploymentOperations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resources.v2019_03_01.DeploymentOperation;

class DeploymentOperationsImpl extends WrapperImpl<DeploymentOperationsInner> implements DeploymentOperations {
    private final ResourcesManager manager;

    DeploymentOperationsImpl(ResourcesManager manager) {
        super(manager.inner().deploymentOperations());
        this.manager = manager;
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    private DeploymentOperationImpl wrapModel(DeploymentOperationInner inner) {
        return  new DeploymentOperationImpl(inner, manager());
    }

    @Override
    public Observable<DeploymentOperation> getAsync(String resourceGroupName, String deploymentName, String operationId) {
        DeploymentOperationsInner client = this.inner();
        return client.getAsync(resourceGroupName, deploymentName, operationId)
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return new DeploymentOperationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> listByResourceGroupAsync(final String resourceGroupName, final String deploymentName) {
        DeploymentOperationsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName, deploymentName)
        .flatMapIterable(new Func1<Page<DeploymentOperationInner>, Iterable<DeploymentOperationInner>>() {
            @Override
            public Iterable<DeploymentOperationInner> call(Page<DeploymentOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return new DeploymentOperationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> listAtSubscriptionScopeAsync(final String deploymentName) {
        DeploymentOperationsInner client = this.inner();
        return client.listAtSubscriptionScopeAsync(deploymentName)
        .flatMapIterable(new Func1<Page<DeploymentOperationInner>, Iterable<DeploymentOperationInner>>() {
            @Override
            public Iterable<DeploymentOperationInner> call(Page<DeploymentOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> getAtSubscriptionScopeAsync(String deploymentName, String operationId) {
        DeploymentOperationsInner client = this.inner();
        return client.getAtSubscriptionScopeAsync(deploymentName, operationId)
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
