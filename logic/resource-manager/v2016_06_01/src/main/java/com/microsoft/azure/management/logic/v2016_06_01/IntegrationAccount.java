/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.LogicManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.IntegrationAccountInner;

/**
 * Type representing IntegrationAccount.
 */
public interface IntegrationAccount extends HasInner<IntegrationAccountInner>, Resource, GroupableResourceCore<LogicManager, IntegrationAccountInner>, HasResourceGroup, Refreshable<IntegrationAccount>, Updatable<IntegrationAccount.Update>, HasManager<LogicManager> {
    /**
     * @return the properties value.
     */
    Object properties();

    /**
     * @return the sku value.
     */
    IntegrationAccountSku sku();

    /**
     * The entirety of the IntegrationAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of IntegrationAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a IntegrationAccount definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the IntegrationAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the integrationaccount update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             */
            WithCreate withProperties(Object properties);
        }

        /**
         * The stage of the integrationaccount update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(IntegrationAccountSku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<IntegrationAccount>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithProperties, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a IntegrationAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<IntegrationAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithProperties, UpdateStages.WithSku {
    }

    /**
     * Grouping of IntegrationAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the integrationaccount {0} allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             */
            Update withProperties(Object properties);
        }

        /**
         * The stage of the integrationaccount {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(IntegrationAccountSku sku);
        }

    }
}
