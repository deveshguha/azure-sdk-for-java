/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RouteNextHopType.
 */
public final class RouteNextHopType extends ExpandableStringEnum<RouteNextHopType> {
    /** Static value VirtualNetworkGateway for RouteNextHopType. */
    public static final RouteNextHopType VIRTUAL_NETWORK_GATEWAY = fromString("VirtualNetworkGateway");

    /** Static value VnetLocal for RouteNextHopType. */
    public static final RouteNextHopType VNET_LOCAL = fromString("VnetLocal");

    /** Static value Internet for RouteNextHopType. */
    public static final RouteNextHopType INTERNET = fromString("Internet");

    /** Static value VirtualAppliance for RouteNextHopType. */
    public static final RouteNextHopType VIRTUAL_APPLIANCE = fromString("VirtualAppliance");

    /** Static value None for RouteNextHopType. */
    public static final RouteNextHopType NONE = fromString("None");

    /**
     * Creates or finds a RouteNextHopType from its string representation.
     * @param name a name to look for
     * @return the corresponding RouteNextHopType
     */
    @JsonCreator
    public static RouteNextHopType fromString(String name) {
        return fromString(name, RouteNextHopType.class);
    }

    /**
     * @return known RouteNextHopType values
     */
    public static Collection<RouteNextHopType> values() {
        return values(RouteNextHopType.class);
    }
}
