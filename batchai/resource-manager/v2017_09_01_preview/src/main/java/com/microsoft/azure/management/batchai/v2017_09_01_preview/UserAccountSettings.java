/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for user account that gets created on each on the nodes of a
 * cluster.
 */
public class UserAccountSettings {
    /**
     * Specifies the name of the administrator account.
     */
    @JsonProperty(value = "adminUserName", required = true)
    private String adminUserName;

    /**
     * SSH public keys used to authenticate with linux based VMs. This does not
     * get returned in a GET response body.
     */
    @JsonProperty(value = "adminUserSshPublicKey")
    private String adminUserSshPublicKey;

    /**
     * Admin user Password (linux only). This does not get returned in a GET
     * response body.
     */
    @JsonProperty(value = "adminUserPassword")
    private String adminUserPassword;

    /**
     * Get the adminUserName value.
     *
     * @return the adminUserName value
     */
    public String adminUserName() {
        return this.adminUserName;
    }

    /**
     * Set the adminUserName value.
     *
     * @param adminUserName the adminUserName value to set
     * @return the UserAccountSettings object itself.
     */
    public UserAccountSettings withAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
        return this;
    }

    /**
     * Get the adminUserSshPublicKey value.
     *
     * @return the adminUserSshPublicKey value
     */
    public String adminUserSshPublicKey() {
        return this.adminUserSshPublicKey;
    }

    /**
     * Set the adminUserSshPublicKey value.
     *
     * @param adminUserSshPublicKey the adminUserSshPublicKey value to set
     * @return the UserAccountSettings object itself.
     */
    public UserAccountSettings withAdminUserSshPublicKey(String adminUserSshPublicKey) {
        this.adminUserSshPublicKey = adminUserSshPublicKey;
        return this;
    }

    /**
     * Get the adminUserPassword value.
     *
     * @return the adminUserPassword value
     */
    public String adminUserPassword() {
        return this.adminUserPassword;
    }

    /**
     * Set the adminUserPassword value.
     *
     * @param adminUserPassword the adminUserPassword value to set
     * @return the UserAccountSettings object itself.
     */
    public UserAccountSettings withAdminUserPassword(String adminUserPassword) {
        this.adminUserPassword = adminUserPassword;
        return this;
    }

}
