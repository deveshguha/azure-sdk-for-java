/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import com.microsoft.azure.management.network.v2017_10_01.AzureReachabilityReportLocation;
import java.util.List;
import com.microsoft.azure.management.network.v2017_10_01.AzureReachabilityReportItem;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure reachability report details.
 */
public class AzureReachabilityReportInner {
    /**
     * The aggregation level of Azure reachability report. Can be Country,
     * State or City.
     */
    @JsonProperty(value = "aggregationLevel", required = true)
    private String aggregationLevel;

    /**
     * The providerLocation property.
     */
    @JsonProperty(value = "providerLocation", required = true)
    private AzureReachabilityReportLocation providerLocation;

    /**
     * List of Azure reachability report items.
     */
    @JsonProperty(value = "reachabilityReport", required = true)
    private List<AzureReachabilityReportItem> reachabilityReport;

    /**
     * Get the aggregationLevel value.
     *
     * @return the aggregationLevel value
     */
    public String aggregationLevel() {
        return this.aggregationLevel;
    }

    /**
     * Set the aggregationLevel value.
     *
     * @param aggregationLevel the aggregationLevel value to set
     * @return the AzureReachabilityReportInner object itself.
     */
    public AzureReachabilityReportInner withAggregationLevel(String aggregationLevel) {
        this.aggregationLevel = aggregationLevel;
        return this;
    }

    /**
     * Get the providerLocation value.
     *
     * @return the providerLocation value
     */
    public AzureReachabilityReportLocation providerLocation() {
        return this.providerLocation;
    }

    /**
     * Set the providerLocation value.
     *
     * @param providerLocation the providerLocation value to set
     * @return the AzureReachabilityReportInner object itself.
     */
    public AzureReachabilityReportInner withProviderLocation(AzureReachabilityReportLocation providerLocation) {
        this.providerLocation = providerLocation;
        return this;
    }

    /**
     * Get the reachabilityReport value.
     *
     * @return the reachabilityReport value
     */
    public List<AzureReachabilityReportItem> reachabilityReport() {
        return this.reachabilityReport;
    }

    /**
     * Set the reachabilityReport value.
     *
     * @param reachabilityReport the reachabilityReport value to set
     * @return the AzureReachabilityReportInner object itself.
     */
    public AzureReachabilityReportInner withReachabilityReport(List<AzureReachabilityReportItem> reachabilityReport) {
        this.reachabilityReport = reachabilityReport;
        return this;
    }

}
