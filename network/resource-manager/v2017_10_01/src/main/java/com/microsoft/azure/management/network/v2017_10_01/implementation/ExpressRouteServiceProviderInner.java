/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2017_10_01.ExpressRouteServiceProviderBandwidthsOffered;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A ExpressRouteResourceProvider object.
 */
@JsonFlatten
@SkipParentValidation
public class ExpressRouteServiceProviderInner extends Resource {
    /**
     * Get a list of peering locations.
     */
    @JsonProperty(value = "properties.peeringLocations")
    private List<String> peeringLocations;

    /**
     * Gets bandwidths offered.
     */
    @JsonProperty(value = "properties.bandwidthsOffered")
    private List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered;

    /**
     * Gets the provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the peeringLocations value.
     *
     * @return the peeringLocations value
     */
    public List<String> peeringLocations() {
        return this.peeringLocations;
    }

    /**
     * Set the peeringLocations value.
     *
     * @param peeringLocations the peeringLocations value to set
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withPeeringLocations(List<String> peeringLocations) {
        this.peeringLocations = peeringLocations;
        return this;
    }

    /**
     * Get the bandwidthsOffered value.
     *
     * @return the bandwidthsOffered value
     */
    public List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered() {
        return this.bandwidthsOffered;
    }

    /**
     * Set the bandwidthsOffered value.
     *
     * @param bandwidthsOffered the bandwidthsOffered value to set
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withBandwidthsOffered(List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered) {
        this.bandwidthsOffered = bandwidthsOffered;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ExpressRouteServiceProviderInner object itself.
     */
    public ExpressRouteServiceProviderInner withId(String id) {
        this.id = id;
        return this;
    }

}
