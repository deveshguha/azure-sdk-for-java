/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.anomalydetector.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LabelRequest model.
 */
public class LabelRequest {
    /**
     * begin of a detection time range.
     */
    @JsonProperty(value = "begin", required = true)
    private DateTime begin;

    /**
     * end of a detection time range.
     */
    @JsonProperty(value = "end", required = true)
    private DateTime end;

    /**
     * Possible values include: 'changePoint', 'anomaly'.
     */
    @JsonProperty(value = "type", required = true)
    private LabelType type;

    /**
     * Possible values include: 'positiveAnomaly', 'negativeAnomaly',
     * 'positiveChangePoint', 'negativeChangePoint'.
     */
    @JsonProperty(value = "value", required = true)
    private LabelValue value;

    /**
     * Get begin of a detection time range.
     *
     * @return the begin value
     */
    public DateTime begin() {
        return this.begin;
    }

    /**
     * Set begin of a detection time range.
     *
     * @param begin the begin value to set
     * @return the LabelRequest object itself.
     */
    public LabelRequest withBegin(DateTime begin) {
        this.begin = begin;
        return this;
    }

    /**
     * Get end of a detection time range.
     *
     * @return the end value
     */
    public DateTime end() {
        return this.end;
    }

    /**
     * Set end of a detection time range.
     *
     * @param end the end value to set
     * @return the LabelRequest object itself.
     */
    public LabelRequest withEnd(DateTime end) {
        this.end = end;
        return this;
    }

    /**
     * Get possible values include: 'changePoint', 'anomaly'.
     *
     * @return the type value
     */
    public LabelType type() {
        return this.type;
    }

    /**
     * Set possible values include: 'changePoint', 'anomaly'.
     *
     * @param type the type value to set
     * @return the LabelRequest object itself.
     */
    public LabelRequest withType(LabelType type) {
        this.type = type;
        return this;
    }

    /**
     * Get possible values include: 'positiveAnomaly', 'negativeAnomaly', 'positiveChangePoint', 'negativeChangePoint'.
     *
     * @return the value value
     */
    public LabelValue value() {
        return this.value;
    }

    /**
     * Set possible values include: 'positiveAnomaly', 'negativeAnomaly', 'positiveChangePoint', 'negativeChangePoint'.
     *
     * @param value the value value to set
     * @return the LabelRequest object itself.
     */
    public LabelRequest withValue(LabelValue value) {
        this.value = value;
        return this;
    }

}
