/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_01_01.implementation;

import com.microsoft.azure.management.eventgrid.v2018_01_01.ResourceRegionType;
import com.microsoft.azure.management.eventgrid.v2018_01_01.TopicTypeProvisioningState;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Properties of a topic type info.
 */
@JsonFlatten
public class TopicTypeInfoInner extends ProxyResource {
    /**
     * Namespace of the provider of the topic type.
     */
    @JsonProperty(value = "properties.provider")
    private String provider;

    /**
     * Display Name for the topic type.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Description of the topic type.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Region type of the resource. Possible values include:
     * 'RegionalResource', 'GlobalResource'.
     */
    @JsonProperty(value = "properties.resourceRegionType")
    private ResourceRegionType resourceRegionType;

    /**
     * Provisioning state of the topic type. Possible values include:
     * 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private TopicTypeProvisioningState provisioningState;

    /**
     * List of locations supported by this topic type.
     */
    @JsonProperty(value = "properties.supportedLocations")
    private List<String> supportedLocations;

    /**
     * Get the provider value.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider value.
     *
     * @param provider the provider value to set
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withDisplayName(String displayName) {
        this.displayName = displayName;
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
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the resourceRegionType value.
     *
     * @return the resourceRegionType value
     */
    public ResourceRegionType resourceRegionType() {
        return this.resourceRegionType;
    }

    /**
     * Set the resourceRegionType value.
     *
     * @param resourceRegionType the resourceRegionType value to set
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withResourceRegionType(ResourceRegionType resourceRegionType) {
        this.resourceRegionType = resourceRegionType;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public TopicTypeProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withProvisioningState(TopicTypeProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the supportedLocations value.
     *
     * @return the supportedLocations value
     */
    public List<String> supportedLocations() {
        return this.supportedLocations;
    }

    /**
     * Set the supportedLocations value.
     *
     * @param supportedLocations the supportedLocations value to set
     * @return the TopicTypeInfoInner object itself.
     */
    public TopicTypeInfoInner withSupportedLocations(List<String> supportedLocations) {
        this.supportedLocations = supportedLocations;
        return this;
    }

}
