/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains SKU in an ExpressRouteCircuit.
 */
public class ExpressRouteCircuitSku {
    /**
     * The name of the SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The tier of the SKU. Possible values are 'Standard' and 'Premium'.
     * Possible values include: 'Standard', 'Premium'.
     */
    @JsonProperty(value = "tier")
    private ExpressRouteCircuitSkuTier tier;

    /**
     * The family of the SKU. Possible values are: 'UnlimitedData' and
     * 'MeteredData'. Possible values include: 'UnlimitedData', 'MeteredData'.
     */
    @JsonProperty(value = "family")
    private ExpressRouteCircuitSkuFamily family;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ExpressRouteCircuitSku object itself.
     */
    public ExpressRouteCircuitSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public ExpressRouteCircuitSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier value.
     *
     * @param tier the tier value to set
     * @return the ExpressRouteCircuitSku object itself.
     */
    public ExpressRouteCircuitSku withTier(ExpressRouteCircuitSkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the family value.
     *
     * @return the family value
     */
    public ExpressRouteCircuitSkuFamily family() {
        return this.family;
    }

    /**
     * Set the family value.
     *
     * @param family the family value to set
     * @return the ExpressRouteCircuitSku object itself.
     */
    public ExpressRouteCircuitSku withFamily(ExpressRouteCircuitSkuFamily family) {
        this.family = family;
        return this;
    }

}
