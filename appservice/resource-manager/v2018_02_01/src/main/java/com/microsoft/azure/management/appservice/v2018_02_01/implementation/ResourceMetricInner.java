/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.ResourceMetricName;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.ResourceMetricValue;
import com.microsoft.azure.management.appservice.v2018_02_01.ResourceMetricProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object representing a metric for any resource .
 */
public class ResourceMetricInner {
    /**
     * Name of metric.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceMetricName name;

    /**
     * Metric unit.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * Metric granularity. E.g PT1H, PT5M, P1D.
     */
    @JsonProperty(value = "timeGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String timeGrain;

    /**
     * Metric start time.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * Metric end time.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * Metric resource Id.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /**
     * Resource Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Metric values.
     */
    @JsonProperty(value = "metricValues", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceMetricValue> metricValues;

    /**
     * Resource metric properties collection.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceMetricProperty> properties;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public ResourceMetricName name() {
        return this.name;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the timeGrain value.
     *
     * @return the timeGrain value
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
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
     * Get the metricValues value.
     *
     * @return the metricValues value
     */
    public List<ResourceMetricValue> metricValues() {
        return this.metricValues;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public List<ResourceMetricProperty> properties() {
        return this.properties;
    }

}
