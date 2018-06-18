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
 * Network access control entry.
 */
public class NetworkAccessControlEntry {
    /**
     * Action object. Possible values include: 'Permit', 'Deny'.
     */
    @JsonProperty(value = "action")
    private AccessControlEntryAction action;

    /**
     * Description of network access control entry.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Order of precedence.
     */
    @JsonProperty(value = "order")
    private Integer order;

    /**
     * Remote subnet.
     */
    @JsonProperty(value = "remoteSubnet")
    private String remoteSubnet;

    /**
     * Get the action value.
     *
     * @return the action value
     */
    public AccessControlEntryAction action() {
        return this.action;
    }

    /**
     * Set the action value.
     *
     * @param action the action value to set
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withAction(AccessControlEntryAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the order value.
     *
     * @return the order value
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order value.
     *
     * @param order the order value to set
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the remoteSubnet value.
     *
     * @return the remoteSubnet value
     */
    public String remoteSubnet() {
        return this.remoteSubnet;
    }

    /**
     * Set the remoteSubnet value.
     *
     * @param remoteSubnet the remoteSubnet value to set
     * @return the NetworkAccessControlEntry object itself.
     */
    public NetworkAccessControlEntry withRemoteSubnet(String remoteSubnet) {
        this.remoteSubnet = remoteSubnet;
        return this;
    }

}
