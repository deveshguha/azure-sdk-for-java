/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_03_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.resources.v2019_03_01.Operations;
import com.microsoft.azure.management.resources.v2019_03_01.Deployments;
import com.microsoft.azure.management.resources.v2019_03_01.Providers;
import com.microsoft.azure.management.resources.v2019_03_01.Resources;
import com.microsoft.azure.management.resources.v2019_03_01.ResourceGroups;
import com.microsoft.azure.management.resources.v2019_03_01.Tags;
import com.microsoft.azure.management.resources.v2019_03_01.DeploymentOperations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Resources resource management.
 */
public final class ResourcesManager extends ManagerCore<ResourcesManager, ResourceManagementClientImpl> {
    private Operations operations;
    private Deployments deployments;
    private Providers providers;
    private Resources resources;
    private ResourceGroups resourceGroups;
    private Tags tags;
    private DeploymentOperations deploymentOperations;
    /**
    * Get a Configurable instance that can be used to create ResourcesManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ResourcesManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ResourcesManager that exposes Resources resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the ResourcesManager
    */
    public static ResourcesManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new ResourcesManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of ResourcesManager that exposes Resources resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the ResourcesManager
    */
    public static ResourcesManager authenticate(RestClient restClient, String subscriptionId) {
        return new ResourcesManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ResourcesManager that exposes Resources management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Resources management API entry points that work across subscriptions
        */
        ResourcesManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Deployments.
     */
    public Deployments deployments() {
        if (this.deployments == null) {
            this.deployments = new DeploymentsImpl(this);
        }
        return this.deployments;
    }

    /**
     * @return Entry point to manage Providers.
     */
    public Providers providers() {
        if (this.providers == null) {
            this.providers = new ProvidersImpl(this);
        }
        return this.providers;
    }

    /**
     * @return Entry point to manage Resources.
     */
    public Resources resources() {
        if (this.resources == null) {
            this.resources = new ResourcesImpl(this);
        }
        return this.resources;
    }

    /**
     * @return Entry point to manage ResourceGroups.
     */
    public ResourceGroups resourceGroups() {
        if (this.resourceGroups == null) {
            this.resourceGroups = new ResourceGroupsImpl(this);
        }
        return this.resourceGroups;
    }

    /**
     * @return Entry point to manage Tags.
     */
    public Tags tags() {
        if (this.tags == null) {
            this.tags = new TagsImpl(this);
        }
        return this.tags;
    }

    /**
     * @return Entry point to manage DeploymentOperations.
     */
    public DeploymentOperations deploymentOperations() {
        if (this.deploymentOperations == null) {
            this.deploymentOperations = new DeploymentOperationsImpl(this);
        }
        return this.deploymentOperations;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ResourcesManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return ResourcesManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private ResourcesManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ResourceManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
