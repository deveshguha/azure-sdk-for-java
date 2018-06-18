/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.LiveEventInput;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.LiveEventPreview;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.LiveEventEncoding;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.LiveEventResourceState;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.CrossSiteAccessPolicies;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.StreamOptionsFlag;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The Live Event.
 */
@JsonFlatten
@SkipParentValidation
public class LiveEventInner extends Resource {
    /**
     * The Live Event description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The Live Event input.
     */
    @JsonProperty(value = "properties.input", required = true)
    private LiveEventInput input;

    /**
     * The Live Event preview.
     */
    @JsonProperty(value = "properties.preview")
    private LiveEventPreview preview;

    /**
     * The Live Event encoding.
     */
    @JsonProperty(value = "properties.encoding")
    private LiveEventEncoding encoding;

    /**
     * The provisioning state of the Live Event.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The resource state of the Live Event. Possible values include:
     * 'Stopped', 'Starting', 'Running', 'Stopping', 'Deleting'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private LiveEventResourceState resourceState;

    /**
     * The Live Event access policies.
     */
    @JsonProperty(value = "properties.crossSiteAccessPolicies")
    private CrossSiteAccessPolicies crossSiteAccessPolicies;

    /**
     * The Live Event vanity URL flag.
     */
    @JsonProperty(value = "properties.vanityUrl")
    private Boolean vanityUrl;

    /**
     * The stream options.
     */
    @JsonProperty(value = "properties.streamOptions")
    private List<StreamOptionsFlag> streamOptions;

    /**
     * The exact time the Live Event was created.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The exact time the Live Event was last modified.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

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
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the input value.
     *
     * @return the input value
     */
    public LiveEventInput input() {
        return this.input;
    }

    /**
     * Set the input value.
     *
     * @param input the input value to set
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withInput(LiveEventInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the preview value.
     *
     * @return the preview value
     */
    public LiveEventPreview preview() {
        return this.preview;
    }

    /**
     * Set the preview value.
     *
     * @param preview the preview value to set
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withPreview(LiveEventPreview preview) {
        this.preview = preview;
        return this;
    }

    /**
     * Get the encoding value.
     *
     * @return the encoding value
     */
    public LiveEventEncoding encoding() {
        return this.encoding;
    }

    /**
     * Set the encoding value.
     *
     * @param encoding the encoding value to set
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withEncoding(LiveEventEncoding encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceState value.
     *
     * @return the resourceState value
     */
    public LiveEventResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the crossSiteAccessPolicies value.
     *
     * @return the crossSiteAccessPolicies value
     */
    public CrossSiteAccessPolicies crossSiteAccessPolicies() {
        return this.crossSiteAccessPolicies;
    }

    /**
     * Set the crossSiteAccessPolicies value.
     *
     * @param crossSiteAccessPolicies the crossSiteAccessPolicies value to set
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies) {
        this.crossSiteAccessPolicies = crossSiteAccessPolicies;
        return this;
    }

    /**
     * Get the vanityUrl value.
     *
     * @return the vanityUrl value
     */
    public Boolean vanityUrl() {
        return this.vanityUrl;
    }

    /**
     * Set the vanityUrl value.
     *
     * @param vanityUrl the vanityUrl value to set
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withVanityUrl(Boolean vanityUrl) {
        this.vanityUrl = vanityUrl;
        return this;
    }

    /**
     * Get the streamOptions value.
     *
     * @return the streamOptions value
     */
    public List<StreamOptionsFlag> streamOptions() {
        return this.streamOptions;
    }

    /**
     * Set the streamOptions value.
     *
     * @param streamOptions the streamOptions value to set
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withStreamOptions(List<StreamOptionsFlag> streamOptions) {
        this.streamOptions = streamOptions;
        return this;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

}
