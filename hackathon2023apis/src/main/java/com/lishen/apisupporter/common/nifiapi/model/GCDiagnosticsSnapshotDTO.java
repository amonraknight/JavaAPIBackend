/*
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.23.2
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.lishen.apisupporter.common.nifiapi.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * GCDiagnosticsSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class GCDiagnosticsSnapshotDTO {
    @SerializedName("timestamp")
    private OffsetDateTime timestamp = null;

    @SerializedName("collectionCount")
    private Long collectionCount = null;

    @SerializedName("collectionMillis")
    private Long collectionMillis = null;

    public GCDiagnosticsSnapshotDTO timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The timestamp of when the Snapshot was taken
     *
     * @return timestamp
     **/
    @ApiModelProperty(value = "The timestamp of when the Snapshot was taken")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public GCDiagnosticsSnapshotDTO collectionCount(Long collectionCount) {
        this.collectionCount = collectionCount;
        return this;
    }

    /**
     * The number of times that Garbage Collection has occurred
     *
     * @return collectionCount
     **/
    @ApiModelProperty(value = "The number of times that Garbage Collection has occurred")
    public Long getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(Long collectionCount) {
        this.collectionCount = collectionCount;
    }

    public GCDiagnosticsSnapshotDTO collectionMillis(Long collectionMillis) {
        this.collectionMillis = collectionMillis;
        return this;
    }

    /**
     * The number of milliseconds that the Garbage Collector spent performing Garbage Collection duties
     *
     * @return collectionMillis
     **/
    @ApiModelProperty(value = "The number of milliseconds that the Garbage Collector spent performing Garbage Collection duties")
    public Long getCollectionMillis() {
        return collectionMillis;
    }

    public void setCollectionMillis(Long collectionMillis) {
        this.collectionMillis = collectionMillis;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GCDiagnosticsSnapshotDTO gcDiagnosticsSnapshotDTO = (GCDiagnosticsSnapshotDTO) o;
        return Objects.equals(this.timestamp, gcDiagnosticsSnapshotDTO.timestamp) &&
                Objects.equals(this.collectionCount, gcDiagnosticsSnapshotDTO.collectionCount) &&
                Objects.equals(this.collectionMillis, gcDiagnosticsSnapshotDTO.collectionMillis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, collectionCount, collectionMillis);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GCDiagnosticsSnapshotDTO {\n");

        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    collectionCount: ").append(toIndentedString(collectionCount)).append("\n");
        sb.append("    collectionMillis: ").append(toIndentedString(collectionMillis)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

