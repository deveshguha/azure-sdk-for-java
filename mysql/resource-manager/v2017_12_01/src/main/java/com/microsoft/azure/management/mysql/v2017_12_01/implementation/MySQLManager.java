/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.mysql.v2017_12_01.Servers;
import com.microsoft.azure.management.mysql.v2017_12_01.FirewallRules;
import com.microsoft.azure.management.mysql.v2017_12_01.VirtualNetworkRules;
import com.microsoft.azure.management.mysql.v2017_12_01.Databases;
import com.microsoft.azure.management.mysql.v2017_12_01.Configurations;
import com.microsoft.azure.management.mysql.v2017_12_01.LogFiles;
import com.microsoft.azure.management.mysql.v2017_12_01.LocationBasedPerformanceTiers;
import com.microsoft.azure.management.mysql.v2017_12_01.CheckNameAvailabilitys;
import com.microsoft.azure.management.mysql.v2017_12_01.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure DBforMySQL resource management.
 */
public final class MySQLManager extends ManagerCore<MySQLManager, MySQLManagementClientImpl> {
    private Servers servers;
    private FirewallRules firewallRules;
    private VirtualNetworkRules virtualNetworkRules;
    private Databases databases;
    private Configurations configurations;
    private LogFiles logFiles;
    private LocationBasedPerformanceTiers locationBasedPerformanceTiers;
    private CheckNameAvailabilitys checkNameAvailabilitys;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create MySQLManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new MySQLManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of MySQLManager that exposes DBforMySQL resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the MySQLManager
    */
    public static MySQLManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new MySQLManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of MySQLManager that exposes DBforMySQL resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the MySQLManager
    */
    public static MySQLManager authenticate(RestClient restClient, String subscriptionId) {
        return new MySQLManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of MySQLManager that exposes DBforMySQL management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing DBforMySQL management API entry points that work across subscriptions
        */
        MySQLManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Servers.
     */
    public Servers servers() {
        if (this.servers == null) {
            this.servers = new ServersImpl(this);
        }
        return this.servers;
    }

    /**
     * @return Entry point to manage FirewallRules.
     */
    public FirewallRules firewallRules() {
        if (this.firewallRules == null) {
            this.firewallRules = new FirewallRulesImpl(this);
        }
        return this.firewallRules;
    }

    /**
     * @return Entry point to manage VirtualNetworkRules.
     */
    public VirtualNetworkRules virtualNetworkRules() {
        if (this.virtualNetworkRules == null) {
            this.virtualNetworkRules = new VirtualNetworkRulesImpl(this);
        }
        return this.virtualNetworkRules;
    }

    /**
     * @return Entry point to manage Databases.
     */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(this);
        }
        return this.databases;
    }

    /**
     * @return Entry point to manage Configurations.
     */
    public Configurations configurations() {
        if (this.configurations == null) {
            this.configurations = new ConfigurationsImpl(this);
        }
        return this.configurations;
    }

    /**
     * @return Entry point to manage LogFiles.
     */
    public LogFiles logFiles() {
        if (this.logFiles == null) {
            this.logFiles = new LogFilesImpl(this);
        }
        return this.logFiles;
    }

    /**
     * @return Entry point to manage LocationBasedPerformanceTiers.
     */
    public LocationBasedPerformanceTiers locationBasedPerformanceTiers() {
        if (this.locationBasedPerformanceTiers == null) {
            this.locationBasedPerformanceTiers = new LocationBasedPerformanceTiersImpl(this);
        }
        return this.locationBasedPerformanceTiers;
    }

    /**
     * @return Entry point to manage CheckNameAvailabilitys.
     */
    public CheckNameAvailabilitys checkNameAvailabilitys() {
        if (this.checkNameAvailabilitys == null) {
            this.checkNameAvailabilitys = new CheckNameAvailabilitysImpl(this);
        }
        return this.checkNameAvailabilitys;
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
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public MySQLManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return MySQLManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private MySQLManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new MySQLManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
