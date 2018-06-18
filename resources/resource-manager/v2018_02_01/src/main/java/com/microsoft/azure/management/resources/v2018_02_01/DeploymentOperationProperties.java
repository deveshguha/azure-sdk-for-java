/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment operation properties.
 */
public class DeploymentOperationProperties {
    /**
     * The state of the provisioning.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The date and time of the operation.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestamp;

    /**
     * Deployment operation service request id.
     */
    @JsonProperty(value = "serviceRequestId", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceRequestId;

    /**
     * Operation status code.
     */
    @JsonProperty(value = "statusCode", access = JsonProperty.Access.WRITE_ONLY)
    private String statusCode;

    /**
     * Operation status message.
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private Object statusMessage;

    /**
     * The target resource.
     */
    @JsonProperty(value = "targetResource", access = JsonProperty.Access.WRITE_ONLY)
    private TargetResource targetResource;

    /**
     * The HTTP request message.
     */
    @JsonProperty(value = "request", access = JsonProperty.Access.WRITE_ONLY)
    private HttpMessage request;

    /**
     * The HTTP response message.
     */
    @JsonProperty(value = "response", access = JsonProperty.Access.WRITE_ONLY)
    private HttpMessage response;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the timestamp value.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the serviceRequestId value.
     *
     * @return the serviceRequestId value
     */
    public String serviceRequestId() {
        return this.serviceRequestId;
    }

    /**
     * Get the statusCode value.
     *
     * @return the statusCode value
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Get the statusMessage value.
     *
     * @return the statusMessage value
     */
    public Object statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get the targetResource value.
     *
     * @return the targetResource value
     */
    public TargetResource targetResource() {
        return this.targetResource;
    }

    /**
     * Get the request value.
     *
     * @return the request value
     */
    public HttpMessage request() {
        return this.request;
    }

    /**
     * Get the response value.
     *
     * @return the response value
     */
    public HttpMessage response() {
        return this.response;
    }

}
