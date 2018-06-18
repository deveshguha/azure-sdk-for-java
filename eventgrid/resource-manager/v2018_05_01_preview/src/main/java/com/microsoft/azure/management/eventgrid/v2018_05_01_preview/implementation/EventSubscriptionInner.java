/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview.implementation;

import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.EventSubscriptionProvisioningState;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.EventSubscriptionDestination;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.EventSubscriptionFilter;
import java.util.List;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.EventDeliverySchema;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.RetryPolicy;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.DeadLetterDestination;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Event Subscription.
 */
@JsonFlatten
public class EventSubscriptionInner extends ProxyResource {
    /**
     * Name of the topic of the event subscription.
     */
    @JsonProperty(value = "properties.topic", access = JsonProperty.Access.WRITE_ONLY)
    private String topic;

    /**
     * Provisioning state of the event subscription. Possible values include:
     * 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed',
     * 'AwaitingManualAction'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EventSubscriptionProvisioningState provisioningState;

    /**
     * Information about the destination where events have to be delivered for
     * the event subscription.
     */
    @JsonProperty(value = "properties.destination")
    private EventSubscriptionDestination destination;

    /**
     * Information about the filter for the event subscription.
     */
    @JsonProperty(value = "properties.filter")
    private EventSubscriptionFilter filter;

    /**
     * List of user defined labels.
     */
    @JsonProperty(value = "properties.labels")
    private List<String> labels;

    /**
     * The event delivery schema for the event subscription. Possible values
     * include: 'EventGridSchema', 'InputEventSchema', 'CloudEventV01Schema'.
     */
    @JsonProperty(value = "properties.eventDeliverySchema")
    private EventDeliverySchema eventDeliverySchema;

    /**
     * The retry policy for events. This can be used to configure maximum
     * number of delivery attempts and time to live for events.
     */
    @JsonProperty(value = "properties.retryPolicy")
    private RetryPolicy retryPolicy;

    /**
     * The DeadLetter destination of the event subscription.
     */
    @JsonProperty(value = "properties.deadLetterDestination")
    private DeadLetterDestination deadLetterDestination;

    /**
     * Get the topic value.
     *
     * @return the topic value
     */
    public String topic() {
        return this.topic;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public EventSubscriptionProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the destination value.
     *
     * @return the destination value
     */
    public EventSubscriptionDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination value.
     *
     * @param destination the destination value to set
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withDestination(EventSubscriptionDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the filter value.
     *
     * @return the filter value
     */
    public EventSubscriptionFilter filter() {
        return this.filter;
    }

    /**
     * Set the filter value.
     *
     * @param filter the filter value to set
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withFilter(EventSubscriptionFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the labels value.
     *
     * @return the labels value
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the labels value.
     *
     * @param labels the labels value to set
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the eventDeliverySchema value.
     *
     * @return the eventDeliverySchema value
     */
    public EventDeliverySchema eventDeliverySchema() {
        return this.eventDeliverySchema;
    }

    /**
     * Set the eventDeliverySchema value.
     *
     * @param eventDeliverySchema the eventDeliverySchema value to set
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withEventDeliverySchema(EventDeliverySchema eventDeliverySchema) {
        this.eventDeliverySchema = eventDeliverySchema;
        return this;
    }

    /**
     * Get the retryPolicy value.
     *
     * @return the retryPolicy value
     */
    public RetryPolicy retryPolicy() {
        return this.retryPolicy;
    }

    /**
     * Set the retryPolicy value.
     *
     * @param retryPolicy the retryPolicy value to set
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Get the deadLetterDestination value.
     *
     * @return the deadLetterDestination value
     */
    public DeadLetterDestination deadLetterDestination() {
        return this.deadLetterDestination;
    }

    /**
     * Set the deadLetterDestination value.
     *
     * @param deadLetterDestination the deadLetterDestination value to set
     * @return the EventSubscriptionInner object itself.
     */
    public EventSubscriptionInner withDeadLetterDestination(DeadLetterDestination deadLetterDestination) {
        this.deadLetterDestination = deadLetterDestination;
        return this;
    }

}
