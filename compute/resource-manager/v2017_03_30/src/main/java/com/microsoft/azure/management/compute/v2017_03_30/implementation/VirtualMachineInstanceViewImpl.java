/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineInstanceView;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_03_30.BootDiagnosticsInstanceView;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_03_30.DiskInstanceView;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineExtensionInstanceView;
import com.microsoft.azure.management.compute.v2017_03_30.MaintenanceRedeployStatus;
import com.microsoft.azure.management.compute.v2017_03_30.InstanceViewStatus;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineAgentInstanceView;

class VirtualMachineInstanceViewImpl extends WrapperImpl<VirtualMachineInstanceViewInner> implements VirtualMachineInstanceView {
    private final ComputeManager manager;
    VirtualMachineInstanceViewImpl(VirtualMachineInstanceViewInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public BootDiagnosticsInstanceView bootDiagnostics() {
        return this.inner().bootDiagnostics();
    }

    @Override
    public List<DiskInstanceView> disks() {
        return this.inner().disks();
    }

    @Override
    public List<VirtualMachineExtensionInstanceView> extensions() {
        return this.inner().extensions();
    }

    @Override
    public MaintenanceRedeployStatus maintenanceRedeployStatus() {
        return this.inner().maintenanceRedeployStatus();
    }

    @Override
    public Integer platformFaultDomain() {
        return this.inner().platformFaultDomain();
    }

    @Override
    public Integer platformUpdateDomain() {
        return this.inner().platformUpdateDomain();
    }

    @Override
    public String rdpThumbPrint() {
        return this.inner().rdpThumbPrint();
    }

    @Override
    public List<InstanceViewStatus> statuses() {
        return this.inner().statuses();
    }

    @Override
    public VirtualMachineAgentInstanceView vmAgent() {
        return this.inner().vmAgent();
    }

}
