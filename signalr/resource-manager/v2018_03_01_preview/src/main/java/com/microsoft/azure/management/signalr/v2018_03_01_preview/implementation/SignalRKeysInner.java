/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A class represents the access keys of SignalR service.
 */
public class SignalRKeysInner {
    /**
     * The primary access key.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /**
     * The secondary access key.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /**
     * Get the primaryKey value.
     *
     * @return the primaryKey value
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey value.
     *
     * @param primaryKey the primaryKey value to set
     * @return the SignalRKeysInner object itself.
     */
    public SignalRKeysInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey value.
     *
     * @return the secondaryKey value
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey value.
     *
     * @param secondaryKey the secondaryKey value to set
     * @return the SignalRKeysInner object itself.
     */
    public SignalRKeysInner withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

}
