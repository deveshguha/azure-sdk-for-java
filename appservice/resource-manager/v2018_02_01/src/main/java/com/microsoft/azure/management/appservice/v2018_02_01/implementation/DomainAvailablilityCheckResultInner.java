/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.DomainType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain availablility check result.
 */
public class DomainAvailablilityCheckResultInner {
    /**
     * Name of the domain.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * &lt;code&gt;true&lt;/code&gt; if domain can be purchased using
     * CreateDomain API; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "available")
    private Boolean available;

    /**
     * Valid values are Regular domain: Azure will charge the full price of
     * domain registration, SoftDeleted: Purchasing this domain will simply
     * restore it and this operation will not cost anything. Possible values
     * include: 'Regular', 'SoftDeleted'.
     */
    @JsonProperty(value = "domainType")
    private DomainType domainType;

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
     * @return the DomainAvailablilityCheckResultInner object itself.
     */
    public DomainAvailablilityCheckResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the available value.
     *
     * @return the available value
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set the available value.
     *
     * @param available the available value to set
     * @return the DomainAvailablilityCheckResultInner object itself.
     */
    public DomainAvailablilityCheckResultInner withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the domainType value.
     *
     * @return the domainType value
     */
    public DomainType domainType() {
        return this.domainType;
    }

    /**
     * Set the domainType value.
     *
     * @param domainType the domainType value to set
     * @return the DomainAvailablilityCheckResultInner object itself.
     */
    public DomainAvailablilityCheckResultInner withDomainType(DomainType domainType) {
        this.domainType = domainType;
        return this;
    }

}
