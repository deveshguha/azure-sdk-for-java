/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.ResourceReferenceInner;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.WorkflowRunInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.LogicManager;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing RunWorkflowWorkflowRun.
 */
public interface RunWorkflowWorkflowRun extends HasInner<WorkflowRunInner>, Indexable, Refreshable<RunWorkflowWorkflowRun>, HasManager<LogicManager> {
    /**
     * @return the code value.
     */
    String code();

    /**
     * @return the correlation value.
     */
    Correlation correlation();

    /**
     * @return the correlationId value.
     */
    String correlationId();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the error value.
     */
    Object error();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outputs value.
     */
    Map<String, WorkflowOutputParameter> outputs();

    /**
     * @return the response value.
     */
    WorkflowRunTrigger response();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    WorkflowStatus status();

    /**
     * @return the trigger value.
     */
    WorkflowRunTrigger trigger();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the waitEndTime value.
     */
    DateTime waitEndTime();

    /**
     * @return the workflow value.
     */
    ResourceReferenceInner workflow();

}
