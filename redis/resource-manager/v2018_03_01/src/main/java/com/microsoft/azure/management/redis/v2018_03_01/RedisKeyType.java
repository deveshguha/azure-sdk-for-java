/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2018_03_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RedisKeyType.
 */
public enum RedisKeyType {
    /** Enum value Primary. */
    PRIMARY("Primary"),

    /** Enum value Secondary. */
    SECONDARY("Secondary");

    /** The actual serialized value for a RedisKeyType instance. */
    private String value;

    RedisKeyType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RedisKeyType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RedisKeyType object, or null if unable to parse.
     */
    @JsonCreator
    public static RedisKeyType fromString(String value) {
        RedisKeyType[] items = RedisKeyType.values();
        for (RedisKeyType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
