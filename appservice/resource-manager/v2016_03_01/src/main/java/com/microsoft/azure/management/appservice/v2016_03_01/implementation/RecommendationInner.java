/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import org.joda.time.DateTime;
import java.util.UUID;
import com.microsoft.azure.management.appservice.v2016_03_01.ResourceScopeType;
import com.microsoft.azure.management.appservice.v2016_03_01.NotificationLevel;
import com.microsoft.azure.management.appservice.v2016_03_01.Channels;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2016_03_01.ProxyOnlyResource;

/**
 * Represents a recommendation result generated by the recommendation engine.
 */
@JsonFlatten
public class RecommendationInner extends ProxyOnlyResource {
    /**
     * Timestamp when this instance was created.
     */
    @JsonProperty(value = "properties.creationTime")
    private DateTime creationTime;

    /**
     * A GUID value that each recommendation object is associated with.
     */
    @JsonProperty(value = "properties.recommendationId")
    private UUID recommendationId;

    /**
     * Full ARM resource ID string that this recommendation object is
     * associated with.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * Name of a resource type this recommendation applies, e.g. Subscription,
     * ServerFarm, Site. Possible values include: 'ServerFarm', 'Subscription',
     * 'WebSite'.
     */
    @JsonProperty(value = "properties.resourceScope")
    private ResourceScopeType resourceScope;

    /**
     * Unique name of the rule.
     */
    @JsonProperty(value = "properties.ruleName")
    private String ruleName;

    /**
     * UI friendly name of the rule (may not be unique).
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Recommendation text.
     */
    @JsonProperty(value = "properties.message")
    private String message;

    /**
     * Level indicating how critical this recommendation can impact. Possible
     * values include: 'Critical', 'Warning', 'Information',
     * 'NonUrgentSuggestion'.
     */
    @JsonProperty(value = "properties.level")
    private NotificationLevel level;

    /**
     * List of channels that this recommendation can apply. Possible values
     * include: 'Notification', 'Api', 'Email', 'Webhook', 'All'.
     */
    @JsonProperty(value = "properties.channels")
    private Channels channels;

    /**
     * The list of category tags that this recommendation belongs to.
     */
    @JsonProperty(value = "properties.tags")
    private List<String> tags;

    /**
     * Name of action recommended by this object.
     */
    @JsonProperty(value = "properties.actionName")
    private String actionName;

    /**
     * The beginning time in UTC of a range that the recommendation refers to.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * The end time in UTC of a range that the recommendation refers to.
     */
    @JsonProperty(value = "properties.endTime")
    private DateTime endTime;

    /**
     * When to notify this recommendation next in UTC. Null means that this
     * will never be notified anymore.
     */
    @JsonProperty(value = "properties.nextNotificationTime")
    private DateTime nextNotificationTime;

    /**
     * Date and time in UTC when this notification expires.
     */
    @JsonProperty(value = "properties.notificationExpirationTime")
    private DateTime notificationExpirationTime;

    /**
     * Last timestamp in UTC this instance was actually notified. Null means
     * that this recommendation hasn't been notified yet.
     */
    @JsonProperty(value = "properties.notifiedTime")
    private DateTime notifiedTime;

    /**
     * A metric value measured by the rule.
     */
    @JsonProperty(value = "properties.score")
    private Double score;

    /**
     * True if this is associated with a dynamically added rule.
     */
    @JsonProperty(value = "properties.isDynamic")
    private Boolean isDynamic;

    /**
     * Extension name of the portal if exists.
     */
    @JsonProperty(value = "properties.extensionName")
    private String extensionName;

    /**
     * Deep link to a blade on the portal.
     */
    @JsonProperty(value = "properties.bladeName")
    private String bladeName;

    /**
     * Forward link to an external document associated with the rule.
     */
    @JsonProperty(value = "properties.forwardLink")
    private String forwardLink;

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime value.
     *
     * @param creationTime the creationTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the recommendationId value.
     *
     * @return the recommendationId value
     */
    public UUID recommendationId() {
        return this.recommendationId;
    }

    /**
     * Set the recommendationId value.
     *
     * @param recommendationId the recommendationId value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withRecommendationId(UUID recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId value.
     *
     * @param resourceId the resourceId value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceScope value.
     *
     * @return the resourceScope value
     */
    public ResourceScopeType resourceScope() {
        return this.resourceScope;
    }

    /**
     * Set the resourceScope value.
     *
     * @param resourceScope the resourceScope value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withResourceScope(ResourceScopeType resourceScope) {
        this.resourceScope = resourceScope;
        return this;
    }

    /**
     * Get the ruleName value.
     *
     * @return the ruleName value
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set the ruleName value.
     *
     * @param ruleName the ruleName value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the level value.
     *
     * @return the level value
     */
    public NotificationLevel level() {
        return this.level;
    }

    /**
     * Set the level value.
     *
     * @param level the level value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withLevel(NotificationLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get the channels value.
     *
     * @return the channels value
     */
    public Channels channels() {
        return this.channels;
    }

    /**
     * Set the channels value.
     *
     * @param channels the channels value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withChannels(Channels channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the actionName value.
     *
     * @return the actionName value
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Set the actionName value.
     *
     * @param actionName the actionName value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the nextNotificationTime value.
     *
     * @return the nextNotificationTime value
     */
    public DateTime nextNotificationTime() {
        return this.nextNotificationTime;
    }

    /**
     * Set the nextNotificationTime value.
     *
     * @param nextNotificationTime the nextNotificationTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNextNotificationTime(DateTime nextNotificationTime) {
        this.nextNotificationTime = nextNotificationTime;
        return this;
    }

    /**
     * Get the notificationExpirationTime value.
     *
     * @return the notificationExpirationTime value
     */
    public DateTime notificationExpirationTime() {
        return this.notificationExpirationTime;
    }

    /**
     * Set the notificationExpirationTime value.
     *
     * @param notificationExpirationTime the notificationExpirationTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNotificationExpirationTime(DateTime notificationExpirationTime) {
        this.notificationExpirationTime = notificationExpirationTime;
        return this;
    }

    /**
     * Get the notifiedTime value.
     *
     * @return the notifiedTime value
     */
    public DateTime notifiedTime() {
        return this.notifiedTime;
    }

    /**
     * Set the notifiedTime value.
     *
     * @param notifiedTime the notifiedTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNotifiedTime(DateTime notifiedTime) {
        this.notifiedTime = notifiedTime;
        return this;
    }

    /**
     * Get the score value.
     *
     * @return the score value
     */
    public Double score() {
        return this.score;
    }

    /**
     * Set the score value.
     *
     * @param score the score value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the isDynamic value.
     *
     * @return the isDynamic value
     */
    public Boolean isDynamic() {
        return this.isDynamic;
    }

    /**
     * Set the isDynamic value.
     *
     * @param isDynamic the isDynamic value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    /**
     * Get the extensionName value.
     *
     * @return the extensionName value
     */
    public String extensionName() {
        return this.extensionName;
    }

    /**
     * Set the extensionName value.
     *
     * @param extensionName the extensionName value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * Get the bladeName value.
     *
     * @return the bladeName value
     */
    public String bladeName() {
        return this.bladeName;
    }

    /**
     * Set the bladeName value.
     *
     * @param bladeName the bladeName value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withBladeName(String bladeName) {
        this.bladeName = bladeName;
        return this;
    }

    /**
     * Get the forwardLink value.
     *
     * @return the forwardLink value
     */
    public String forwardLink() {
        return this.forwardLink;
    }

    /**
     * Set the forwardLink value.
     *
     * @param forwardLink the forwardLink value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withForwardLink(String forwardLink) {
        this.forwardLink = forwardLink;
        return this;
    }

}
