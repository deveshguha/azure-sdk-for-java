/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseAdvisors;
import com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseRecommendedActions;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ServerAdvisors;
import com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseBlobAuditingPolicies;
import com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseAutomaticTunings;
import com.microsoft.azure.management.sql.v2015_05_01_preview.EncryptionProtectors;
import com.microsoft.azure.management.sql.v2015_05_01_preview.FailoverGroups;
import com.microsoft.azure.management.sql.v2015_05_01_preview.FirewallRules;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ManagedInstances;
import com.microsoft.azure.management.sql.v2015_05_01_preview.Operations;
import com.microsoft.azure.management.sql.v2015_05_01_preview.ServerKeys;
import com.microsoft.azure.management.sql.v2015_05_01_preview.Servers;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncAgents;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncGroups;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncMembers;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SubscriptionUsages;
import com.microsoft.azure.management.sql.v2015_05_01_preview.VirtualNetworkRules;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Sql resource management.
 */
public final class SqlManager extends ManagerCore<SqlManager, SqlManagementClientImpl> {
    private DatabaseAdvisors databaseAdvisors;
    private DatabaseRecommendedActions databaseRecommendedActions;
    private ServerAdvisors serverAdvisors;
    private DatabaseBlobAuditingPolicies databaseBlobAuditingPolicies;
    private DatabaseAutomaticTunings databaseAutomaticTunings;
    private EncryptionProtectors encryptionProtectors;
    private FailoverGroups failoverGroups;
    private FirewallRules firewallRules;
    private ManagedInstances managedInstances;
    private Operations operations;
    private ServerKeys serverKeys;
    private Servers servers;
    private SyncAgents syncAgents;
    private SyncGroups syncGroups;
    private SyncMembers syncMembers;
    private SubscriptionUsages subscriptionUsages;
    private VirtualNetworkRules virtualNetworkRules;
    /**
    * Get a Configurable instance that can be used to create SqlManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new SqlManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of SqlManager that exposes Sql resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the SqlManager
    */
    public static SqlManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new SqlManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of SqlManager that exposes Sql resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the SqlManager
    */
    public static SqlManager authenticate(RestClient restClient, String subscriptionId) {
        return new SqlManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of SqlManager that exposes Sql management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Sql management API entry points that work across subscriptions
        */
        SqlManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage DatabaseAdvisors.
     */
    public DatabaseAdvisors databaseAdvisors() {
        if (this.databaseAdvisors == null) {
            this.databaseAdvisors = new DatabaseAdvisorsImpl(this);
        }
        return this.databaseAdvisors;
    }

    /**
     * @return Entry point to manage DatabaseRecommendedActions.
     */
    public DatabaseRecommendedActions databaseRecommendedActions() {
        if (this.databaseRecommendedActions == null) {
            this.databaseRecommendedActions = new DatabaseRecommendedActionsImpl(this);
        }
        return this.databaseRecommendedActions;
    }

    /**
     * @return Entry point to manage ServerAdvisors.
     */
    public ServerAdvisors serverAdvisors() {
        if (this.serverAdvisors == null) {
            this.serverAdvisors = new ServerAdvisorsImpl(this);
        }
        return this.serverAdvisors;
    }

    /**
     * @return Entry point to manage DatabaseBlobAuditingPolicies.
     */
    public DatabaseBlobAuditingPolicies databaseBlobAuditingPolicies() {
        if (this.databaseBlobAuditingPolicies == null) {
            this.databaseBlobAuditingPolicies = new DatabaseBlobAuditingPoliciesImpl(this);
        }
        return this.databaseBlobAuditingPolicies;
    }

    /**
     * @return Entry point to manage DatabaseAutomaticTunings.
     */
    public DatabaseAutomaticTunings databaseAutomaticTunings() {
        if (this.databaseAutomaticTunings == null) {
            this.databaseAutomaticTunings = new DatabaseAutomaticTuningsImpl(this);
        }
        return this.databaseAutomaticTunings;
    }

    /**
     * @return Entry point to manage EncryptionProtectors.
     */
    public EncryptionProtectors encryptionProtectors() {
        if (this.encryptionProtectors == null) {
            this.encryptionProtectors = new EncryptionProtectorsImpl(this);
        }
        return this.encryptionProtectors;
    }

    /**
     * @return Entry point to manage FailoverGroups.
     */
    public FailoverGroups failoverGroups() {
        if (this.failoverGroups == null) {
            this.failoverGroups = new FailoverGroupsImpl(this);
        }
        return this.failoverGroups;
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
     * @return Entry point to manage ManagedInstances.
     */
    public ManagedInstances managedInstances() {
        if (this.managedInstances == null) {
            this.managedInstances = new ManagedInstancesImpl(this);
        }
        return this.managedInstances;
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
     * @return Entry point to manage ServerKeys.
     */
    public ServerKeys serverKeys() {
        if (this.serverKeys == null) {
            this.serverKeys = new ServerKeysImpl(this);
        }
        return this.serverKeys;
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
     * @return Entry point to manage SyncAgents.
     */
    public SyncAgents syncAgents() {
        if (this.syncAgents == null) {
            this.syncAgents = new SyncAgentsImpl(this);
        }
        return this.syncAgents;
    }

    /**
     * @return Entry point to manage SyncGroups.
     */
    public SyncGroups syncGroups() {
        if (this.syncGroups == null) {
            this.syncGroups = new SyncGroupsImpl(this);
        }
        return this.syncGroups;
    }

    /**
     * @return Entry point to manage SyncMembers.
     */
    public SyncMembers syncMembers() {
        if (this.syncMembers == null) {
            this.syncMembers = new SyncMembersImpl(this);
        }
        return this.syncMembers;
    }

    /**
     * @return Entry point to manage SubscriptionUsages.
     */
    public SubscriptionUsages subscriptionUsages() {
        if (this.subscriptionUsages == null) {
            this.subscriptionUsages = new SubscriptionUsagesImpl(this);
        }
        return this.subscriptionUsages;
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
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public SqlManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return SqlManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private SqlManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new SqlManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
