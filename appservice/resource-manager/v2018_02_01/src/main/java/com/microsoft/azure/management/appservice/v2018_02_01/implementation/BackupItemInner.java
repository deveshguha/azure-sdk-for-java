/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.BackupItemStatus;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.DatabaseBackupSetting;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * Backup description.
 */
@JsonFlatten
public class BackupItemInner extends ProxyOnlyResource {
    /**
     * Id of the backup.
     */
    @JsonProperty(value = "properties.id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer backupId;

    /**
     * SAS URL for the storage account container which contains this backup.
     */
    @JsonProperty(value = "properties.storageAccountUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String storageAccountUrl;

    /**
     * Name of the blob which contains data for this backup.
     */
    @JsonProperty(value = "properties.blobName", access = JsonProperty.Access.WRITE_ONLY)
    private String blobName;

    /**
     * Name of this backup.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String backupItemName;

    /**
     * Backup status. Possible values include: 'InProgress', 'Failed',
     * 'Succeeded', 'TimedOut', 'Created', 'Skipped', 'PartiallySucceeded',
     * 'DeleteInProgress', 'DeleteFailed', 'Deleted'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private BackupItemStatus status;

    /**
     * Size of the backup in bytes.
     */
    @JsonProperty(value = "properties.sizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long sizeInBytes;

    /**
     * Timestamp of the backup creation.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * Details regarding this backup. Might contain an error message.
     */
    @JsonProperty(value = "properties.log", access = JsonProperty.Access.WRITE_ONLY)
    private String log;

    /**
     * List of databases included in the backup.
     */
    @JsonProperty(value = "properties.databases", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatabaseBackupSetting> databases;

    /**
     * True if this backup has been created due to a schedule being triggered.
     */
    @JsonProperty(value = "properties.scheduled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean scheduled;

    /**
     * Timestamp of a last restore operation which used this backup.
     */
    @JsonProperty(value = "properties.lastRestoreTimeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastRestoreTimeStamp;

    /**
     * Timestamp when this backup finished.
     */
    @JsonProperty(value = "properties.finishedTimeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime finishedTimeStamp;

    /**
     * Unique correlation identifier. Please use this along with the timestamp
     * while communicating with Azure support.
     */
    @JsonProperty(value = "properties.correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /**
     * Size of the original web app which has been backed up.
     */
    @JsonProperty(value = "properties.websiteSizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long websiteSizeInBytes;

    /**
     * Get the backupId value.
     *
     * @return the backupId value
     */
    public Integer backupId() {
        return this.backupId;
    }

    /**
     * Get the storageAccountUrl value.
     *
     * @return the storageAccountUrl value
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    /**
     * Get the blobName value.
     *
     * @return the blobName value
     */
    public String blobName() {
        return this.blobName;
    }

    /**
     * Get the backupItemName value.
     *
     * @return the backupItemName value
     */
    public String backupItemName() {
        return this.backupItemName;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public BackupItemStatus status() {
        return this.status;
    }

    /**
     * Get the sizeInBytes value.
     *
     * @return the sizeInBytes value
     */
    public Long sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the log value.
     *
     * @return the log value
     */
    public String log() {
        return this.log;
    }

    /**
     * Get the databases value.
     *
     * @return the databases value
     */
    public List<DatabaseBackupSetting> databases() {
        return this.databases;
    }

    /**
     * Get the scheduled value.
     *
     * @return the scheduled value
     */
    public Boolean scheduled() {
        return this.scheduled;
    }

    /**
     * Get the lastRestoreTimeStamp value.
     *
     * @return the lastRestoreTimeStamp value
     */
    public DateTime lastRestoreTimeStamp() {
        return this.lastRestoreTimeStamp;
    }

    /**
     * Get the finishedTimeStamp value.
     *
     * @return the finishedTimeStamp value
     */
    public DateTime finishedTimeStamp() {
        return this.finishedTimeStamp;
    }

    /**
     * Get the correlationId value.
     *
     * @return the correlationId value
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Get the websiteSizeInBytes value.
     *
     * @return the websiteSizeInBytes value
     */
    public Long websiteSizeInBytes() {
        return this.websiteSizeInBytes;
    }

}
