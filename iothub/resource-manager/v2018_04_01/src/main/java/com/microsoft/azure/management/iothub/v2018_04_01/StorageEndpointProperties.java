/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the Azure Storage endpoint for file upload.
 */
public class StorageEndpointProperties {
    /**
     * The period of time for which the the SAS URI generated by IoT Hub for
     * file upload is valid. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload#file-upload-notification-configuration-options.
     */
    @JsonProperty(value = "sasTtlAsIso8601")
    private Period sasTtlAsIso8601;

    /**
     * The connection string for the Azure Storage account to which files are
     * uploaded.
     */
    @JsonProperty(value = "connectionString", required = true)
    private String connectionString;

    /**
     * The name of the root container where you upload files. The container
     * need not exist but should be creatable using the connectionString
     * specified.
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /**
     * Get the sasTtlAsIso8601 value.
     *
     * @return the sasTtlAsIso8601 value
     */
    public Period sasTtlAsIso8601() {
        return this.sasTtlAsIso8601;
    }

    /**
     * Set the sasTtlAsIso8601 value.
     *
     * @param sasTtlAsIso8601 the sasTtlAsIso8601 value to set
     * @return the StorageEndpointProperties object itself.
     */
    public StorageEndpointProperties withSasTtlAsIso8601(Period sasTtlAsIso8601) {
        this.sasTtlAsIso8601 = sasTtlAsIso8601;
        return this;
    }

    /**
     * Get the connectionString value.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString value.
     *
     * @param connectionString the connectionString value to set
     * @return the StorageEndpointProperties object itself.
     */
    public StorageEndpointProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the containerName value.
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName value.
     *
     * @param containerName the containerName value to set
     * @return the StorageEndpointProperties object itself.
     */
    public StorageEndpointProperties withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

}
