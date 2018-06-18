/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.appservice.v2016_03_01.DiagnosticMetricSet;
import com.microsoft.azure.management.appservice.v2016_03_01.DetectorAbnormalTimePeriod;
import com.microsoft.azure.management.appservice.v2016_03_01.NameValuePair;
import com.microsoft.azure.management.appservice.v2016_03_01.ResponseMetaData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_03_01.ProxyOnlyResource;

/**
 * Class representing Reponse from Diagnostic Detectors.
 */
@JsonFlatten
public class DiagnosticDetectorResponseInner extends ProxyOnlyResource {
    /**
     * Start time of the period.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * End time of the period.
     */
    @JsonProperty(value = "properties.endTime")
    private DateTime endTime;

    /**
     * Flag representing Issue was detected.
     */
    @JsonProperty(value = "properties.issueDetected")
    private Boolean issueDetected;

    /**
     * Detector's definition.
     */
    @JsonProperty(value = "properties.detectorDefinition")
    private DetectorDefinitionInner detectorDefinition;

    /**
     * Metrics provided by the detector.
     */
    @JsonProperty(value = "properties.metrics")
    private List<DiagnosticMetricSet> metrics;

    /**
     * List of Correlated events found by the detector.
     */
    @JsonProperty(value = "properties.abnormalTimePeriods")
    private List<DetectorAbnormalTimePeriod> abnormalTimePeriods;

    /**
     * Additional Data that detector wants to send.
     */
    @JsonProperty(value = "properties.data")
    private List<List<NameValuePair>> data;

    /**
     * Meta Data.
     */
    @JsonProperty(value = "properties.responseMetaData")
    private ResponseMetaData responseMetaData;

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
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
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the issueDetected value.
     *
     * @return the issueDetected value
     */
    public Boolean issueDetected() {
        return this.issueDetected;
    }

    /**
     * Set the issueDetected value.
     *
     * @param issueDetected the issueDetected value to set
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withIssueDetected(Boolean issueDetected) {
        this.issueDetected = issueDetected;
        return this;
    }

    /**
     * Get the detectorDefinition value.
     *
     * @return the detectorDefinition value
     */
    public DetectorDefinitionInner detectorDefinition() {
        return this.detectorDefinition;
    }

    /**
     * Set the detectorDefinition value.
     *
     * @param detectorDefinition the detectorDefinition value to set
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withDetectorDefinition(DetectorDefinitionInner detectorDefinition) {
        this.detectorDefinition = detectorDefinition;
        return this;
    }

    /**
     * Get the metrics value.
     *
     * @return the metrics value
     */
    public List<DiagnosticMetricSet> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics value.
     *
     * @param metrics the metrics value to set
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withMetrics(List<DiagnosticMetricSet> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the abnormalTimePeriods value.
     *
     * @return the abnormalTimePeriods value
     */
    public List<DetectorAbnormalTimePeriod> abnormalTimePeriods() {
        return this.abnormalTimePeriods;
    }

    /**
     * Set the abnormalTimePeriods value.
     *
     * @param abnormalTimePeriods the abnormalTimePeriods value to set
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withAbnormalTimePeriods(List<DetectorAbnormalTimePeriod> abnormalTimePeriods) {
        this.abnormalTimePeriods = abnormalTimePeriods;
        return this;
    }

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public List<List<NameValuePair>> data() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withData(List<List<NameValuePair>> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the responseMetaData value.
     *
     * @return the responseMetaData value
     */
    public ResponseMetaData responseMetaData() {
        return this.responseMetaData;
    }

    /**
     * Set the responseMetaData value.
     *
     * @param responseMetaData the responseMetaData value to set
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withResponseMetaData(ResponseMetaData responseMetaData) {
        this.responseMetaData = responseMetaData;
        return this;
    }

}
