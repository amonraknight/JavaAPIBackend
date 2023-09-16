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

import java.util.Objects;

/**
 * RegisteredFlowSnapshotMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class RegisteredFlowSnapshotMetadata {
    @SerializedName("bucketIdentifier")
    private String bucketIdentifier = null;

    @SerializedName("flowIdentifier")
    private String flowIdentifier = null;

    @SerializedName("version")
    private Integer version = null;

    @SerializedName("timestamp")
    private Long timestamp = null;

    @SerializedName("author")
    private String author = null;

    @SerializedName("comments")
    private String comments = null;

    public RegisteredFlowSnapshotMetadata bucketIdentifier(String bucketIdentifier) {
        this.bucketIdentifier = bucketIdentifier;
        return this;
    }

    /**
     * Get bucketIdentifier
     *
     * @return bucketIdentifier
     **/
    @ApiModelProperty(value = "")
    public String getBucketIdentifier() {
        return bucketIdentifier;
    }

    public void setBucketIdentifier(String bucketIdentifier) {
        this.bucketIdentifier = bucketIdentifier;
    }

    public RegisteredFlowSnapshotMetadata flowIdentifier(String flowIdentifier) {
        this.flowIdentifier = flowIdentifier;
        return this;
    }

    /**
     * Get flowIdentifier
     *
     * @return flowIdentifier
     **/
    @ApiModelProperty(value = "")
    public String getFlowIdentifier() {
        return flowIdentifier;
    }

    public void setFlowIdentifier(String flowIdentifier) {
        this.flowIdentifier = flowIdentifier;
    }

    public RegisteredFlowSnapshotMetadata version(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     **/
    @ApiModelProperty(value = "")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public RegisteredFlowSnapshotMetadata timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @ApiModelProperty(value = "")
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public RegisteredFlowSnapshotMetadata author(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     *
     * @return author
     **/
    @ApiModelProperty(value = "")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public RegisteredFlowSnapshotMetadata comments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Get comments
     *
     * @return comments
     **/
    @ApiModelProperty(value = "")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegisteredFlowSnapshotMetadata registeredFlowSnapshotMetadata = (RegisteredFlowSnapshotMetadata) o;
        return Objects.equals(this.bucketIdentifier, registeredFlowSnapshotMetadata.bucketIdentifier) &&
                Objects.equals(this.flowIdentifier, registeredFlowSnapshotMetadata.flowIdentifier) &&
                Objects.equals(this.version, registeredFlowSnapshotMetadata.version) &&
                Objects.equals(this.timestamp, registeredFlowSnapshotMetadata.timestamp) &&
                Objects.equals(this.author, registeredFlowSnapshotMetadata.author) &&
                Objects.equals(this.comments, registeredFlowSnapshotMetadata.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketIdentifier, flowIdentifier, version, timestamp, author, comments);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisteredFlowSnapshotMetadata {\n");

        sb.append("    bucketIdentifier: ").append(toIndentedString(bucketIdentifier)).append("\n");
        sb.append("    flowIdentifier: ").append(toIndentedString(flowIdentifier)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

