/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.SessionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Sessions.
 */
public interface Sessions extends SupportsCreating<IntegrationAccountSession.DefinitionStages.Blank>, HasInner<SessionsInner> {
    /**
     * Gets an integration account session.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param sessionName The integration account session name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationAccountSession> getAsync(String resourceGroupName, String integrationAccountName, String sessionName);

    /**
     * Gets a list of integration account sessions.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationAccountSession> listByIntegrationAccountsAsync(final String resourceGroupName, final String integrationAccountName);

    /**
     * Deletes an integration account session.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param sessionName The integration account session name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String integrationAccountName, String sessionName);

}
