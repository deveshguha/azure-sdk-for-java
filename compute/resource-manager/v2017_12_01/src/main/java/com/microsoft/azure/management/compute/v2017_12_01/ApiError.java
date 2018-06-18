/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Api error.
 */
public class ApiError {
    /**
     * The Api error details.
     */
    @JsonProperty(value = "details")
    private List<ApiErrorBase> details;

    /**
     * The Api inner error.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * The error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The target of the particular error.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public List<ApiErrorBase> details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the ApiError object itself.
     */
    public ApiError withDetails(List<ApiErrorBase> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innererror value.
     *
     * @return the innererror value
     */
    public InnerError innererror() {
        return this.innererror;
    }

    /**
     * Set the innererror value.
     *
     * @param innererror the innererror value to set
     * @return the ApiError object itself.
     */
    public ApiError withInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the ApiError object itself.
     */
    public ApiError withCode(String code) {
        this.code = code;
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
     * @return the ApiError object itself.
     */
    public ApiError withTarget(String target) {
        this.target = target;
        return this;
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
     * @return the ApiError object itself.
     */
    public ApiError withMessage(String message) {
        this.message = message;
        return this;
    }

}
