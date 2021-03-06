/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.KeyVaultKeyAttributes;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key vault key.
 */
public class KeyVaultKeyInner {
    /**
     * The key id.
     */
    @JsonProperty(value = "kid")
    private String kid;

    /**
     * The key attributes.
     */
    @JsonProperty(value = "attributes")
    private KeyVaultKeyAttributes attributes;

    /**
     * Get the key id.
     *
     * @return the kid value
     */
    public String kid() {
        return this.kid;
    }

    /**
     * Set the key id.
     *
     * @param kid the kid value to set
     * @return the KeyVaultKeyInner object itself.
     */
    public KeyVaultKeyInner withKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get the key attributes.
     *
     * @return the attributes value
     */
    public KeyVaultKeyAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the key attributes.
     *
     * @param attributes the attributes value to set
     * @return the KeyVaultKeyInner object itself.
     */
    public KeyVaultKeyInner withAttributes(KeyVaultKeyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

}
