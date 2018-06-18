/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerProvisioningState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowState;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowStatus;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerRecurrence;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * The workflow trigger.
 */
@JsonFlatten
public class WorkflowTriggerInner extends SubResource {
    /**
     * Gets the provisioning state. Possible values include: 'NotSpecified',
     * 'Accepted', 'Running', 'Ready', 'Creating', 'Created', 'Deleting',
     * 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Moving', 'Updating',
     * 'Registering', 'Registered', 'Unregistering', 'Unregistered',
     * 'Completed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowTriggerProvisioningState provisioningState;

    /**
     * Gets the created time.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTime;

    /**
     * Gets the changed time.
     */
    @JsonProperty(value = "properties.changedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime changedTime;

    /**
     * Gets the state. Possible values include: 'NotSpecified', 'Completed',
     * 'Enabled', 'Disabled', 'Deleted', 'Suspended'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowState state;

    /**
     * Gets the status. Possible values include: 'NotSpecified', 'Paused',
     * 'Running', 'Waiting', 'Succeeded', 'Skipped', 'Suspended', 'Cancelled',
     * 'Failed', 'Faulted', 'TimedOut', 'Aborted', 'Ignored'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowStatus status;

    /**
     * Gets the last execution time.
     */
    @JsonProperty(value = "properties.lastExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastExecutionTime;

    /**
     * Gets the next execution time.
     */
    @JsonProperty(value = "properties.nextExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime nextExecutionTime;

    /**
     * Gets the workflow trigger recurrence.
     */
    @JsonProperty(value = "properties.recurrence", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowTriggerRecurrence recurrence;

    /**
     * Gets the reference to workflow.
     */
    @JsonProperty(value = "properties.workflow", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceReferenceInner workflow;

    /**
     * Gets the workflow trigger name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets the workflow trigger type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public WorkflowTriggerProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createdTime value.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changedTime value.
     *
     * @return the changedTime value
     */
    public DateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public WorkflowState state() {
        return this.state;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Get the lastExecutionTime value.
     *
     * @return the lastExecutionTime value
     */
    public DateTime lastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * Get the nextExecutionTime value.
     *
     * @return the nextExecutionTime value
     */
    public DateTime nextExecutionTime() {
        return this.nextExecutionTime;
    }

    /**
     * Get the recurrence value.
     *
     * @return the recurrence value
     */
    public WorkflowTriggerRecurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Get the workflow value.
     *
     * @return the workflow value
     */
    public ResourceReferenceInner workflow() {
        return this.workflow;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
