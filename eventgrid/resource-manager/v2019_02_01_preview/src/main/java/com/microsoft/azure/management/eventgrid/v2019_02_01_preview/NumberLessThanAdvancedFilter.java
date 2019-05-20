/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NumberLessThan Advanced Filter.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operatorType")
@JsonTypeName("NumberLessThan")
public class NumberLessThanAdvancedFilter extends AdvancedFilter {
    /**
     * The filter value.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Get the filter value.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the filter value.
     *
     * @param value the value value to set
     * @return the NumberLessThanAdvancedFilter object itself.
     */
    public NumberLessThanAdvancedFilter withValue(Double value) {
        this.value = value;
        return this;
    }

}
