/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.microsoft.azure.SubResource;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a set of certificates which are all in the same Key Vault.
 */
public class VaultSecretGroup {
    /**
     * The relative URL of the Key Vault containing all of the certificates in
     * VaultCertificates.
     */
    @JsonProperty(value = "sourceVault")
    private SubResource sourceVault;

    /**
     * The list of key vault references in SourceVault which contain
     * certificates.
     */
    @JsonProperty(value = "vaultCertificates")
    private List<VaultCertificate> vaultCertificates;

    /**
     * Get the sourceVault value.
     *
     * @return the sourceVault value
     */
    public SubResource sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault value.
     *
     * @param sourceVault the sourceVault value to set
     * @return the VaultSecretGroup object itself.
     */
    public VaultSecretGroup withSourceVault(SubResource sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get the vaultCertificates value.
     *
     * @return the vaultCertificates value
     */
    public List<VaultCertificate> vaultCertificates() {
        return this.vaultCertificates;
    }

    /**
     * Set the vaultCertificates value.
     *
     * @param vaultCertificates the vaultCertificates value to set
     * @return the VaultSecretGroup object itself.
     */
    public VaultSecretGroup withVaultCertificates(List<VaultCertificate> vaultCertificates) {
        this.vaultCertificates = vaultCertificates;
        return this;
    }

}
