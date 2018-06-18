/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the web app that snapshot contents will be written to.
 */
public class SnapshotRecoveryTarget {
    /**
     * Geographical location of the target web app, e.g. SouthEastAsia,
     * SouthCentralUS.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * ARM resource ID of the target app.
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}
     * for production slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the SnapshotRecoveryTarget object itself.
     */
    public SnapshotRecoveryTarget withLocation(String location) {
        this.location = location;
        return this;
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
     * Set the id value.
     *
     * @param id the id value to set
     * @return the SnapshotRecoveryTarget object itself.
     */
    public SnapshotRecoveryTarget withId(String id) {
        this.id = id;
        return this;
    }

}
