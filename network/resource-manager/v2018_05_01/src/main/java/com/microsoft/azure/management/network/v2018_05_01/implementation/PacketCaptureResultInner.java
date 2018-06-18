/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.management.network.v2018_05_01.PacketCaptureStorageLocation;
import java.util.List;
import com.microsoft.azure.management.network.v2018_05_01.PacketCaptureFilter;
import com.microsoft.azure.management.network.v2018_05_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Information about packet capture session.
 */
@JsonFlatten
public class PacketCaptureResultInner {
    /**
     * Name of the packet capture session.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * ID of the packet capture operation.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The etag property.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * The ID of the targeted resource, only VM is currently supported.
     */
    @JsonProperty(value = "properties.target", required = true)
    private String target;

    /**
     * Number of bytes captured per packet, the remaining bytes are truncated.
     */
    @JsonProperty(value = "properties.bytesToCapturePerPacket")
    private Integer bytesToCapturePerPacket;

    /**
     * Maximum size of the capture output.
     */
    @JsonProperty(value = "properties.totalBytesPerSession")
    private Integer totalBytesPerSession;

    /**
     * Maximum duration of the capture session in seconds.
     */
    @JsonProperty(value = "properties.timeLimitInSeconds")
    private Integer timeLimitInSeconds;

    /**
     * The storageLocation property.
     */
    @JsonProperty(value = "properties.storageLocation", required = true)
    private PacketCaptureStorageLocation storageLocation;

    /**
     * The filters property.
     */
    @JsonProperty(value = "properties.filters")
    private List<PacketCaptureFilter> filters;

    /**
     * The provisioning state of the packet capture session. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
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
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the bytesToCapturePerPacket value.
     *
     * @return the bytesToCapturePerPacket value
     */
    public Integer bytesToCapturePerPacket() {
        return this.bytesToCapturePerPacket;
    }

    /**
     * Set the bytesToCapturePerPacket value.
     *
     * @param bytesToCapturePerPacket the bytesToCapturePerPacket value to set
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withBytesToCapturePerPacket(Integer bytesToCapturePerPacket) {
        this.bytesToCapturePerPacket = bytesToCapturePerPacket;
        return this;
    }

    /**
     * Get the totalBytesPerSession value.
     *
     * @return the totalBytesPerSession value
     */
    public Integer totalBytesPerSession() {
        return this.totalBytesPerSession;
    }

    /**
     * Set the totalBytesPerSession value.
     *
     * @param totalBytesPerSession the totalBytesPerSession value to set
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTotalBytesPerSession(Integer totalBytesPerSession) {
        this.totalBytesPerSession = totalBytesPerSession;
        return this;
    }

    /**
     * Get the timeLimitInSeconds value.
     *
     * @return the timeLimitInSeconds value
     */
    public Integer timeLimitInSeconds() {
        return this.timeLimitInSeconds;
    }

    /**
     * Set the timeLimitInSeconds value.
     *
     * @param timeLimitInSeconds the timeLimitInSeconds value to set
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        this.timeLimitInSeconds = timeLimitInSeconds;
        return this;
    }

    /**
     * Get the storageLocation value.
     *
     * @return the storageLocation value
     */
    public PacketCaptureStorageLocation storageLocation() {
        return this.storageLocation;
    }

    /**
     * Set the storageLocation value.
     *
     * @param storageLocation the storageLocation value to set
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    /**
     * Get the filters value.
     *
     * @return the filters value
     */
    public List<PacketCaptureFilter> filters() {
        return this.filters;
    }

    /**
     * Set the filters value.
     *
     * @param filters the filters value to set
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withFilters(List<PacketCaptureFilter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the PacketCaptureResultInner object itself.
     */
    public PacketCaptureResultInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
