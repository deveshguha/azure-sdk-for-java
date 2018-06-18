/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.ProcessThreadInfoInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.AppServiceManager;
import org.joda.time.DateTime;

/**
 * Type representing ProcessThreadInfo.
 */
public interface ProcessThreadInfo extends HasInner<ProcessThreadInfoInner>, Indexable, Refreshable<ProcessThreadInfo>, HasManager<AppServiceManager> {
    /**
     * @return the basePriority value.
     */
    Integer basePriority();

    /**
     * @return the currentPriority value.
     */
    Integer currentPriority();

    /**
     * @return the href value.
     */
    String href();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the priorityLevel value.
     */
    String priorityLevel();

    /**
     * @return the priviledgedProcessorTime value.
     */
    String priviledgedProcessorTime();

    /**
     * @return the process value.
     */
    String process();

    /**
     * @return the processThreadInfoId value.
     */
    Integer processThreadInfoId();

    /**
     * @return the startAddress value.
     */
    String startAddress();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the totalProcessorTime value.
     */
    String totalProcessorTime();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userProcessorTime value.
     */
    String userProcessorTime();

    /**
     * @return the waitReason value.
     */
    String waitReason();

}
