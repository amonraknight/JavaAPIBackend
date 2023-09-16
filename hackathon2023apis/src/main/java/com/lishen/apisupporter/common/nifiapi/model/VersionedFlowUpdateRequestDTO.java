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
 * VersionedFlowUpdateRequestDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class VersionedFlowUpdateRequestDTO {
    @SerializedName("requestId")
    private String requestId = null;

    @SerializedName("processGroupId")
    private String processGroupId = null;

    @SerializedName("uri")
    private String uri = null;

    @SerializedName("lastUpdated")
    private String lastUpdated = null;

    @SerializedName("complete")
    private Boolean complete = null;

    @SerializedName("failureReason")
    private String failureReason = null;

    @SerializedName("percentCompleted")
    private Integer percentCompleted = null;

    @SerializedName("state")
    private String state = null;

    @SerializedName("versionControlInformation")
    private VersionControlInformationDTO versionControlInformation = null;

    public VersionedFlowUpdateRequestDTO requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * The unique ID of this request.
     *
     * @return requestId
     **/
    @ApiModelProperty(value = "The unique ID of this request.")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public VersionedFlowUpdateRequestDTO processGroupId(String processGroupId) {
        this.processGroupId = processGroupId;
        return this;
    }

    /**
     * The unique ID of the Process Group being updated
     *
     * @return processGroupId
     **/
    @ApiModelProperty(value = "The unique ID of the Process Group being updated")
    public String getProcessGroupId() {
        return processGroupId;
    }

    public void setProcessGroupId(String processGroupId) {
        this.processGroupId = processGroupId;
    }

    public VersionedFlowUpdateRequestDTO uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The URI for future requests to this drop request.
     *
     * @return uri
     **/
    @ApiModelProperty(value = "The URI for future requests to this drop request.")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public VersionedFlowUpdateRequestDTO lastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * The last time this request was updated.
     *
     * @return lastUpdated
     **/
    @ApiModelProperty(value = "The last time this request was updated.")
    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public VersionedFlowUpdateRequestDTO complete(Boolean complete) {
        this.complete = complete;
        return this;
    }

    /**
     * Whether or not this request has completed
     *
     * @return complete
     **/
    @ApiModelProperty(value = "Whether or not this request has completed")
    public Boolean isComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public VersionedFlowUpdateRequestDTO failureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * An explanation of why this request failed, or null if this request has not failed
     *
     * @return failureReason
     **/
    @ApiModelProperty(value = "An explanation of why this request failed, or null if this request has not failed")
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public VersionedFlowUpdateRequestDTO percentCompleted(Integer percentCompleted) {
        this.percentCompleted = percentCompleted;
        return this;
    }

    /**
     * The percentage complete for the request, between 0 and 100
     *
     * @return percentCompleted
     **/
    @ApiModelProperty(value = "The percentage complete for the request, between 0 and 100")
    public Integer getPercentCompleted() {
        return percentCompleted;
    }

    public void setPercentCompleted(Integer percentCompleted) {
        this.percentCompleted = percentCompleted;
    }

    public VersionedFlowUpdateRequestDTO state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the request
     *
     * @return state
     **/
    @ApiModelProperty(value = "The state of the request")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public VersionedFlowUpdateRequestDTO versionControlInformation(VersionControlInformationDTO versionControlInformation) {
        this.versionControlInformation = versionControlInformation;
        return this;
    }

    /**
     * The VersionControlInformation that describes where the Versioned Flow is located; this may not be populated until the request is completed.
     *
     * @return versionControlInformation
     **/
    @ApiModelProperty(value = "The VersionControlInformation that describes where the Versioned Flow is located; this may not be populated until the request is completed.")
    public VersionControlInformationDTO getVersionControlInformation() {
        return versionControlInformation;
    }

    public void setVersionControlInformation(VersionControlInformationDTO versionControlInformation) {
        this.versionControlInformation = versionControlInformation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionedFlowUpdateRequestDTO versionedFlowUpdateRequestDTO = (VersionedFlowUpdateRequestDTO) o;
        return Objects.equals(this.requestId, versionedFlowUpdateRequestDTO.requestId) &&
                Objects.equals(this.processGroupId, versionedFlowUpdateRequestDTO.processGroupId) &&
                Objects.equals(this.uri, versionedFlowUpdateRequestDTO.uri) &&
                Objects.equals(this.lastUpdated, versionedFlowUpdateRequestDTO.lastUpdated) &&
                Objects.equals(this.complete, versionedFlowUpdateRequestDTO.complete) &&
                Objects.equals(this.failureReason, versionedFlowUpdateRequestDTO.failureReason) &&
                Objects.equals(this.percentCompleted, versionedFlowUpdateRequestDTO.percentCompleted) &&
                Objects.equals(this.state, versionedFlowUpdateRequestDTO.state) &&
                Objects.equals(this.versionControlInformation, versionedFlowUpdateRequestDTO.versionControlInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, processGroupId, uri, lastUpdated, complete, failureReason, percentCompleted, state, versionControlInformation);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionedFlowUpdateRequestDTO {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    processGroupId: ").append(toIndentedString(processGroupId)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
        sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    versionControlInformation: ").append(toIndentedString(versionControlInformation)).append("\n");
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

