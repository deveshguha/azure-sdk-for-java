/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2015_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role assignment properties.
 */
public class RoleAssignmentProperties {
    /**
     * The role definition ID used in the role assignment.
     */
    @JsonProperty(value = "roleDefinitionId")
    private String roleDefinitionId;

    /**
     * The principal ID assigned to the role. This maps to the ID inside the
     * Active Directory. It can point to a user, service principal, or security
     * group.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * Get the roleDefinitionId value.
     *
     * @return the roleDefinitionId value
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId value.
     *
     * @param roleDefinitionId the roleDefinitionId value to set
     * @return the RoleAssignmentProperties object itself.
     */
    public RoleAssignmentProperties withRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId value.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId value.
     *
     * @param principalId the principalId value to set
     * @return the RoleAssignmentProperties object itself.
     */
    public RoleAssignmentProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

}
