/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2017_07_01_privatepreview.implementation;

import com.microsoft.azure.management.iotcentral.v2017_07_01_privatepreview.AppNameUnavailabilityReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties indicating whether a given IoT Central application name is
 * available.
 */
public class AppNameAvailabilityInfoInner {
    /**
     * The value which indicates whether the provided name is available.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /**
     * The reason for unavailability. Possible values include: 'Invalid',
     * 'AlreadyExists'.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private AppNameUnavailabilityReason reason;

    /**
     * The detailed reason message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the nameAvailable value.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public AppNameUnavailabilityReason reason() {
        return this.reason;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the AppNameAvailabilityInfoInner object itself.
     */
    public AppNameAvailabilityInfoInner withMessage(String message) {
        this.message = message;
        return this;
    }

}
