/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2016_06_01.implementation.Manager;
import com.microsoft.azure.management.resources.v2016_06_01.implementation.TenantIdDescriptionInner;

/**
 * Type representing TenantIdDescription.
 */
public interface TenantIdDescription extends HasInner<TenantIdDescriptionInner>, HasManager<Manager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the tenantId value.
     */
    String tenantId();

}
