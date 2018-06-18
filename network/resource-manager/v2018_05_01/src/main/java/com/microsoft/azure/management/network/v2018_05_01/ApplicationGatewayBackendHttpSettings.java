/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.SubResource;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Backend address pool settings of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayBackendHttpSettings extends SubResource {
    /**
     * The destination port on the backend.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * The protocol used to communicate with the backend. Possible values are
     * 'Http' and 'Https'. Possible values include: 'Http', 'Https'.
     */
    @JsonProperty(value = "properties.protocol")
    private ApplicationGatewayProtocol protocol;

    /**
     * Cookie based affinity. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.cookieBasedAffinity")
    private ApplicationGatewayCookieBasedAffinity cookieBasedAffinity;

    /**
     * Request timeout in seconds. Application Gateway will fail the request if
     * response is not received within RequestTimeout. Acceptable values are
     * from 1 second to 86400 seconds.
     */
    @JsonProperty(value = "properties.requestTimeout")
    private Integer requestTimeout;

    /**
     * Probe resource of an application gateway.
     */
    @JsonProperty(value = "properties.probe")
    private SubResource probe;

    /**
     * Array of references to application gateway authentication certificates.
     */
    @JsonProperty(value = "properties.authenticationCertificates")
    private List<SubResource> authenticationCertificates;

    /**
     * Connection draining of the backend http settings resource.
     */
    @JsonProperty(value = "properties.connectionDraining")
    private ApplicationGatewayConnectionDraining connectionDraining;

    /**
     * Host header to be sent to the backend servers.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostName;

    /**
     * Whether to pick host header should be picked from the host name of the
     * backend server. Default value is false.
     */
    @JsonProperty(value = "properties.pickHostNameFromBackendAddress")
    private Boolean pickHostNameFromBackendAddress;

    /**
     * Cookie name to use for the affinity cookie.
     */
    @JsonProperty(value = "properties.affinityCookieName")
    private String affinityCookieName;

    /**
     * Whether the probe is enabled. Default value is false.
     */
    @JsonProperty(value = "properties.probeEnabled")
    private Boolean probeEnabled;

    /**
     * Path which should be used as a prefix for all HTTP requests. Null means
     * no path will be prefixed. Default value is null.
     */
    @JsonProperty(value = "properties.path")
    private String path;

    /**
     * Provisioning state of the backend http settings resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the backend http settings that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the cookieBasedAffinity value.
     *
     * @return the cookieBasedAffinity value
     */
    public ApplicationGatewayCookieBasedAffinity cookieBasedAffinity() {
        return this.cookieBasedAffinity;
    }

    /**
     * Set the cookieBasedAffinity value.
     *
     * @param cookieBasedAffinity the cookieBasedAffinity value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withCookieBasedAffinity(ApplicationGatewayCookieBasedAffinity cookieBasedAffinity) {
        this.cookieBasedAffinity = cookieBasedAffinity;
        return this;
    }

    /**
     * Get the requestTimeout value.
     *
     * @return the requestTimeout value
     */
    public Integer requestTimeout() {
        return this.requestTimeout;
    }

    /**
     * Set the requestTimeout value.
     *
     * @param requestTimeout the requestTimeout value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

    /**
     * Get the probe value.
     *
     * @return the probe value
     */
    public SubResource probe() {
        return this.probe;
    }

    /**
     * Set the probe value.
     *
     * @param probe the probe value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withProbe(SubResource probe) {
        this.probe = probe;
        return this;
    }

    /**
     * Get the authenticationCertificates value.
     *
     * @return the authenticationCertificates value
     */
    public List<SubResource> authenticationCertificates() {
        return this.authenticationCertificates;
    }

    /**
     * Set the authenticationCertificates value.
     *
     * @param authenticationCertificates the authenticationCertificates value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withAuthenticationCertificates(List<SubResource> authenticationCertificates) {
        this.authenticationCertificates = authenticationCertificates;
        return this;
    }

    /**
     * Get the connectionDraining value.
     *
     * @return the connectionDraining value
     */
    public ApplicationGatewayConnectionDraining connectionDraining() {
        return this.connectionDraining;
    }

    /**
     * Set the connectionDraining value.
     *
     * @param connectionDraining the connectionDraining value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withConnectionDraining(ApplicationGatewayConnectionDraining connectionDraining) {
        this.connectionDraining = connectionDraining;
        return this;
    }

    /**
     * Get the hostName value.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Set the hostName value.
     *
     * @param hostName the hostName value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the pickHostNameFromBackendAddress value.
     *
     * @return the pickHostNameFromBackendAddress value
     */
    public Boolean pickHostNameFromBackendAddress() {
        return this.pickHostNameFromBackendAddress;
    }

    /**
     * Set the pickHostNameFromBackendAddress value.
     *
     * @param pickHostNameFromBackendAddress the pickHostNameFromBackendAddress value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withPickHostNameFromBackendAddress(Boolean pickHostNameFromBackendAddress) {
        this.pickHostNameFromBackendAddress = pickHostNameFromBackendAddress;
        return this;
    }

    /**
     * Get the affinityCookieName value.
     *
     * @return the affinityCookieName value
     */
    public String affinityCookieName() {
        return this.affinityCookieName;
    }

    /**
     * Set the affinityCookieName value.
     *
     * @param affinityCookieName the affinityCookieName value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withAffinityCookieName(String affinityCookieName) {
        this.affinityCookieName = affinityCookieName;
        return this;
    }

    /**
     * Get the probeEnabled value.
     *
     * @return the probeEnabled value
     */
    public Boolean probeEnabled() {
        return this.probeEnabled;
    }

    /**
     * Set the probeEnabled value.
     *
     * @param probeEnabled the probeEnabled value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withProbeEnabled(Boolean probeEnabled) {
        this.probeEnabled = probeEnabled;
        return this;
    }

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withType(String type) {
        this.type = type;
        return this;
    }

}
