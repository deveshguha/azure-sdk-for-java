/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachine;
import rx.Observable;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineUpdate;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_12_01.Plan;
import com.microsoft.azure.management.compute.v2017_12_01.HardwareProfile;
import com.microsoft.azure.management.compute.v2017_12_01.StorageProfile;
import com.microsoft.azure.management.compute.v2017_12_01.OSProfile;
import com.microsoft.azure.management.compute.v2017_12_01.NetworkProfile;
import com.microsoft.azure.management.compute.v2017_12_01.DiagnosticsProfile;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineIdentity;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineInstanceView;
import java.util.ArrayList;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineExtension;
import rx.functions.Func1;

class VirtualMachineImpl extends GroupableResourceCoreImpl<VirtualMachine, VirtualMachineInner, VirtualMachineImpl, ComputeManager> implements VirtualMachine, VirtualMachine.Definition, VirtualMachine.Update {
    private VirtualMachineUpdate updateParameter;
    VirtualMachineImpl(String name, VirtualMachineInner inner, ComputeManager manager) {
        super(name, inner, manager);
        this.updateParameter = new VirtualMachineUpdate();
    }

    @Override
    public Observable<VirtualMachine> createResourceAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<VirtualMachineInner, VirtualMachineInner>() {
               @Override
               public VirtualMachineInner call(VirtualMachineInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualMachine> updateResourceAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<VirtualMachineInner, VirtualMachineInner>() {
               @Override
               public VirtualMachineInner call(VirtualMachineInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualMachineInner> getInnerAsync() {
        VirtualMachinesInner client = this.manager().inner().virtualMachines();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new VirtualMachineUpdate();
    }

    @Override
    public SubResource availabilitySet() {
        return this.inner().availabilitySet();
    }

    @Override
    public DiagnosticsProfile diagnosticsProfile() {
        return this.inner().diagnosticsProfile();
    }

    @Override
    public HardwareProfile hardwareProfile() {
        return this.inner().hardwareProfile();
    }

    @Override
    public VirtualMachineIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public VirtualMachineInstanceView instanceView() {
        VirtualMachineInstanceViewInner inner = this.inner().instanceView();
        if (inner != null) {
            return  new VirtualMachineInstanceViewImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public String licenseType() {
        return this.inner().licenseType();
    }

    @Override
    public NetworkProfile networkProfile() {
        return this.inner().networkProfile();
    }

    @Override
    public OSProfile osProfile() {
        return this.inner().osProfile();
    }

    @Override
    public Plan plan() {
        return this.inner().plan();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<VirtualMachineExtension> resources() {
        List<VirtualMachineExtension> lst = new ArrayList<VirtualMachineExtension>();
        if (this.inner().resources() != null) {
            for (VirtualMachineExtensionInner inner : this.inner().resources()) {
                lst.add( new VirtualMachineExtensionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public StorageProfile storageProfile() {
        return this.inner().storageProfile();
    }

    @Override
    public String vmId() {
        return this.inner().vmId();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public VirtualMachineImpl withAvailabilitySet(SubResource availabilitySet) {
        if (isInCreateMode()) {
            this.inner().withAvailabilitySet(availabilitySet);
        } else {
            this.updateParameter.withAvailabilitySet(availabilitySet);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        if (isInCreateMode()) {
            this.inner().withDiagnosticsProfile(diagnosticsProfile);
        } else {
            this.updateParameter.withDiagnosticsProfile(diagnosticsProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withHardwareProfile(HardwareProfile hardwareProfile) {
        if (isInCreateMode()) {
            this.inner().withHardwareProfile(hardwareProfile);
        } else {
            this.updateParameter.withHardwareProfile(hardwareProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withIdentity(VirtualMachineIdentity identity) {
        if (isInCreateMode()) {
            this.inner().withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withLicenseType(String licenseType) {
        if (isInCreateMode()) {
            this.inner().withLicenseType(licenseType);
        } else {
            this.updateParameter.withLicenseType(licenseType);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withNetworkProfile(NetworkProfile networkProfile) {
        if (isInCreateMode()) {
            this.inner().withNetworkProfile(networkProfile);
        } else {
            this.updateParameter.withNetworkProfile(networkProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withOsProfile(OSProfile osProfile) {
        if (isInCreateMode()) {
            this.inner().withOsProfile(osProfile);
        } else {
            this.updateParameter.withOsProfile(osProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withPlan(Plan plan) {
        if (isInCreateMode()) {
            this.inner().withPlan(plan);
        } else {
            this.updateParameter.withPlan(plan);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withStorageProfile(StorageProfile storageProfile) {
        if (isInCreateMode()) {
            this.inner().withStorageProfile(storageProfile);
        } else {
            this.updateParameter.withStorageProfile(storageProfile);
        }
        return this;
    }

    @Override
    public VirtualMachineImpl withZones(List<String> zones) {
        if (isInCreateMode()) {
            this.inner().withZones(zones);
        } else {
            this.updateParameter.withZones(zones);
        }
        return this;
    }

}
