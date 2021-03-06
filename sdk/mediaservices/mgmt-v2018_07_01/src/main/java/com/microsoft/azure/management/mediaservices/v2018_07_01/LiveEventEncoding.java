/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Live Event encoding.
 */
public class LiveEventEncoding {
    /**
     * The encoding type for Live Event.  This value is specified at creation
     * time and cannot be updated. Possible values include: 'None', 'Basic',
     * 'Standard', 'Premium1080p'.
     */
    @JsonProperty(value = "encodingType")
    private LiveEventEncodingType encodingType;

    /**
     * The encoding preset name.  This value is specified at creation time and
     * cannot be updated.
     */
    @JsonProperty(value = "presetName")
    private String presetName;

    /**
     * Get the encoding type for Live Event.  This value is specified at creation time and cannot be updated. Possible values include: 'None', 'Basic', 'Standard', 'Premium1080p'.
     *
     * @return the encodingType value
     */
    public LiveEventEncodingType encodingType() {
        return this.encodingType;
    }

    /**
     * Set the encoding type for Live Event.  This value is specified at creation time and cannot be updated. Possible values include: 'None', 'Basic', 'Standard', 'Premium1080p'.
     *
     * @param encodingType the encodingType value to set
     * @return the LiveEventEncoding object itself.
     */
    public LiveEventEncoding withEncodingType(LiveEventEncodingType encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * Get the encoding preset name.  This value is specified at creation time and cannot be updated.
     *
     * @return the presetName value
     */
    public String presetName() {
        return this.presetName;
    }

    /**
     * Set the encoding preset name.  This value is specified at creation time and cannot be updated.
     *
     * @param presetName the presetName value to set
     * @return the LiveEventEncoding object itself.
     */
    public LiveEventEncoding withPresetName(String presetName) {
        this.presetName = presetName;
        return this;
    }

}
