/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview;

import rx.Observable;
import com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview.CognitiveServicesAccount;
import rx.Completable;

/**
 * Type representing CognitiveServicesAccounts.
 */
public interface CognitiveServicesAccounts {
    CognitiveServicesAccount.DefinitionStages.Blank defineAccount(String name);

    /**
     * Returns a Cognitive Services account specified by the parameters.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CognitiveServicesAccount> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Returns all the resources of a particular type belonging to a resource group.
     *
     * @param resourceGroupName resource group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CognitiveServicesAccount> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Returns all the resources of a particular type belonging to a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CognitiveServicesAccount> listAsync();

    /**
     * Deletes a Cognitive Services account from the resource group.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String name);

    /**
     * Lists the account keys for the specified Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the cognitive services account within the specified resource group. Congitive Services account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CognitiveServicesAccountKeys> listKeysAsync(String resourceGroupName, String accountName);

    /**
     * Regenerates the specified account key for the specified Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the cognitive services account within the specified resource group. Cognitive Services account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CognitiveServicesAccountKeys> regenerateKeyAsync(String resourceGroupName, String accountName);

    /**
     * List available SKUs for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of the cognitive services account within the specified resource group. Cognitive Services account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CognitiveServicesAccountEnumerateSkusResult> listSkusAsync(String resourceGroupName, String accountName);

}
