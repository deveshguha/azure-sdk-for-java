/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.ContinuousWebJobStatus;
import com.microsoft.azure.management.appservice.v2016_08_01.WebJobType;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_08_01.ProxyOnlyResource;

/**
 * Continuous Web Job Information.
 */
@JsonFlatten
public class ContinuousWebJobInner extends ProxyOnlyResource {
    /**
     * Job status. Possible values include: 'Initializing', 'Starting',
     * 'Running', 'PendingRestart', 'Stopped'.
     */
    @JsonProperty(value = "properties.status")
    private ContinuousWebJobStatus status;

    /**
     * Detailed status.
     */
    @JsonProperty(value = "properties.detailedStatus")
    private String detailedStatus;

    /**
     * Log URL.
     */
    @JsonProperty(value = "properties.logUrl")
    private String logUrl;

    /**
     * Job name. Used as job identifier in ARM resource URI.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String continuousWebJobName;

    /**
     * Run command.
     */
    @JsonProperty(value = "properties.runCommand")
    private String runCommand;

    /**
     * Job URL.
     */
    @JsonProperty(value = "properties.url")
    private String url;

    /**
     * Extra Info URL.
     */
    @JsonProperty(value = "properties.extraInfoUrl")
    private String extraInfoUrl;

    /**
     * Job type. Possible values include: 'Continuous', 'Triggered'.
     */
    @JsonProperty(value = "properties.jobType")
    private WebJobType jobType;

    /**
     * Error information.
     */
    @JsonProperty(value = "properties.error")
    private String error;

    /**
     * Using SDK?.
     */
    @JsonProperty(value = "properties.usingSdk")
    private Boolean usingSdk;

    /**
     * Job settings.
     */
    @JsonProperty(value = "properties.settings")
    private Map<String, Object> settings;

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public ContinuousWebJobStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withStatus(ContinuousWebJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the detailedStatus value.
     *
     * @return the detailedStatus value
     */
    public String detailedStatus() {
        return this.detailedStatus;
    }

    /**
     * Set the detailedStatus value.
     *
     * @param detailedStatus the detailedStatus value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
        return this;
    }

    /**
     * Get the logUrl value.
     *
     * @return the logUrl value
     */
    public String logUrl() {
        return this.logUrl;
    }

    /**
     * Set the logUrl value.
     *
     * @param logUrl the logUrl value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withLogUrl(String logUrl) {
        this.logUrl = logUrl;
        return this;
    }

    /**
     * Get the continuousWebJobName value.
     *
     * @return the continuousWebJobName value
     */
    public String continuousWebJobName() {
        return this.continuousWebJobName;
    }

    /**
     * Get the runCommand value.
     *
     * @return the runCommand value
     */
    public String runCommand() {
        return this.runCommand;
    }

    /**
     * Set the runCommand value.
     *
     * @param runCommand the runCommand value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withRunCommand(String runCommand) {
        this.runCommand = runCommand;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the extraInfoUrl value.
     *
     * @return the extraInfoUrl value
     */
    public String extraInfoUrl() {
        return this.extraInfoUrl;
    }

    /**
     * Set the extraInfoUrl value.
     *
     * @param extraInfoUrl the extraInfoUrl value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withExtraInfoUrl(String extraInfoUrl) {
        this.extraInfoUrl = extraInfoUrl;
        return this;
    }

    /**
     * Get the jobType value.
     *
     * @return the jobType value
     */
    public WebJobType jobType() {
        return this.jobType;
    }

    /**
     * Set the jobType value.
     *
     * @param jobType the jobType value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withJobType(WebJobType jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the usingSdk value.
     *
     * @return the usingSdk value
     */
    public Boolean usingSdk() {
        return this.usingSdk;
    }

    /**
     * Set the usingSdk value.
     *
     * @param usingSdk the usingSdk value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withUsingSdk(Boolean usingSdk) {
        this.usingSdk = usingSdk;
        return this;
    }

    /**
     * Get the settings value.
     *
     * @return the settings value
     */
    public Map<String, Object> settings() {
        return this.settings;
    }

    /**
     * Set the settings value.
     *
     * @param settings the settings value to set
     * @return the ContinuousWebJobInner object itself.
     */
    public ContinuousWebJobInner withSettings(Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

}
