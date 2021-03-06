/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.features.v2015_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.features.v2015_12_01.implementation.FeatureResultInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.features.v2015_12_01.implementation.FeaturesManager;

/**
 * Type representing FeatureResult.
 */
public interface FeatureResult extends HasInner<FeatureResultInner>, Indexable, Refreshable<FeatureResult>, HasManager<FeaturesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    FeatureProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
