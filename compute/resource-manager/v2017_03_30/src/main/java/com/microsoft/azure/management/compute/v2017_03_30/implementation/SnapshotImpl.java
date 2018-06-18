/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2017_03_30.Snapshot;
import rx.Observable;
import com.microsoft.azure.management.compute.v2017_03_30.SnapshotUpdate;
import com.microsoft.azure.management.compute.v2017_03_30.DiskSku;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2017_03_30.OperatingSystemTypes;
import com.microsoft.azure.management.compute.v2017_03_30.CreationData;
import com.microsoft.azure.management.compute.v2017_03_30.EncryptionSettings;
import rx.functions.Func1;

class SnapshotImpl extends GroupableResourceCoreImpl<Snapshot, SnapshotInner, SnapshotImpl, ComputeManager> implements Snapshot, Snapshot.Definition, Snapshot.Update {
    private SnapshotUpdate updateParameter;
    SnapshotImpl(String name, SnapshotInner inner, ComputeManager manager) {
        super(name, inner, manager);
        this.updateParameter = new SnapshotUpdate();
    }

    @Override
    public Observable<Snapshot> createResourceAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<SnapshotInner, SnapshotInner>() {
               @Override
               public SnapshotInner call(SnapshotInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Snapshot> updateResourceAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<SnapshotInner, SnapshotInner>() {
               @Override
               public SnapshotInner call(SnapshotInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SnapshotInner> getInnerAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new SnapshotUpdate();
    }

    @Override
    public CreationData creationData() {
        return this.inner().creationData();
    }

    @Override
    public Integer diskSizeGB() {
        return this.inner().diskSizeGB();
    }

    @Override
    public EncryptionSettings encryptionSettings() {
        return this.inner().encryptionSettings();
    }

    @Override
    public String managedBy() {
        return this.inner().managedBy();
    }

    @Override
    public OperatingSystemTypes osType() {
        return this.inner().osType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public DiskSku sku() {
        return this.inner().sku();
    }

    @Override
    public DateTime timeCreated() {
        return this.inner().timeCreated();
    }

    @Override
    public SnapshotImpl withCreationData(CreationData creationData) {
        this.inner().withCreationData(creationData);
        return this;
    }

    @Override
    public SnapshotImpl withDiskSizeGB(Integer diskSizeGB) {
        if (isInCreateMode()) {
            this.inner().withDiskSizeGB(diskSizeGB);
        } else {
            this.updateParameter.withDiskSizeGB(diskSizeGB);
        }
        return this;
    }

    @Override
    public SnapshotImpl withEncryptionSettings(EncryptionSettings encryptionSettings) {
        if (isInCreateMode()) {
            this.inner().withEncryptionSettings(encryptionSettings);
        } else {
            this.updateParameter.withEncryptionSettings(encryptionSettings);
        }
        return this;
    }

    @Override
    public SnapshotImpl withOsType(OperatingSystemTypes osType) {
        if (isInCreateMode()) {
            this.inner().withOsType(osType);
        } else {
            this.updateParameter.withOsType(osType);
        }
        return this;
    }

    @Override
    public SnapshotImpl withSku(DiskSku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

}
