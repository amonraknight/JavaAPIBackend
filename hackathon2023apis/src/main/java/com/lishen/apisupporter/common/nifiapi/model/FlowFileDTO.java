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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * FlowFileDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class FlowFileDTO {
    @SerializedName("uri")
    private String uri = null;

    @SerializedName("uuid")
    private String uuid = null;

    @SerializedName("filename")
    private String filename = null;

    @SerializedName("position")
    private Integer position = null;

    @SerializedName("size")
    private Long size = null;

    @SerializedName("queuedDuration")
    private Long queuedDuration = null;

    @SerializedName("lineageDuration")
    private Long lineageDuration = null;

    @SerializedName("penaltyExpiresIn")
    private Long penaltyExpiresIn = null;

    @SerializedName("clusterNodeId")
    private String clusterNodeId = null;

    @SerializedName("clusterNodeAddress")
    private String clusterNodeAddress = null;

    @SerializedName("attributes")
    private Map<String, String> attributes = null;

    @SerializedName("contentClaimSection")
    private String contentClaimSection = null;

    @SerializedName("contentClaimContainer")
    private String contentClaimContainer = null;

    @SerializedName("contentClaimIdentifier")
    private String contentClaimIdentifier = null;

    @SerializedName("contentClaimOffset")
    private Long contentClaimOffset = null;

    @SerializedName("contentClaimFileSize")
    private String contentClaimFileSize = null;

    @SerializedName("contentClaimFileSizeBytes")
    private Long contentClaimFileSizeBytes = null;

    @SerializedName("penalized")
    private Boolean penalized = null;

    public FlowFileDTO uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The URI that can be used to access this FlowFile.
     *
     * @return uri
     **/
    @ApiModelProperty(value = "The URI that can be used to access this FlowFile.")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public FlowFileDTO uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * The FlowFile UUID.
     *
     * @return uuid
     **/
    @ApiModelProperty(value = "The FlowFile UUID.")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public FlowFileDTO filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * The FlowFile filename.
     *
     * @return filename
     **/
    @ApiModelProperty(value = "The FlowFile filename.")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public FlowFileDTO position(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * The FlowFile&#39;s position in the queue.
     *
     * @return position
     **/
    @ApiModelProperty(value = "The FlowFile's position in the queue.")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public FlowFileDTO size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * The FlowFile file size.
     *
     * @return size
     **/
    @ApiModelProperty(value = "The FlowFile file size.")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public FlowFileDTO queuedDuration(Long queuedDuration) {
        this.queuedDuration = queuedDuration;
        return this;
    }

    /**
     * How long this FlowFile has been enqueued.
     *
     * @return queuedDuration
     **/
    @ApiModelProperty(value = "How long this FlowFile has been enqueued.")
    public Long getQueuedDuration() {
        return queuedDuration;
    }

    public void setQueuedDuration(Long queuedDuration) {
        this.queuedDuration = queuedDuration;
    }

    public FlowFileDTO lineageDuration(Long lineageDuration) {
        this.lineageDuration = lineageDuration;
        return this;
    }

    /**
     * Duration since the FlowFile&#39;s greatest ancestor entered the flow.
     *
     * @return lineageDuration
     **/
    @ApiModelProperty(value = "Duration since the FlowFile's greatest ancestor entered the flow.")
    public Long getLineageDuration() {
        return lineageDuration;
    }

    public void setLineageDuration(Long lineageDuration) {
        this.lineageDuration = lineageDuration;
    }

    public FlowFileDTO penaltyExpiresIn(Long penaltyExpiresIn) {
        this.penaltyExpiresIn = penaltyExpiresIn;
        return this;
    }

    /**
     * How long in milliseconds until the FlowFile penalty expires.
     *
     * @return penaltyExpiresIn
     **/
    @ApiModelProperty(value = "How long in milliseconds until the FlowFile penalty expires.")
    public Long getPenaltyExpiresIn() {
        return penaltyExpiresIn;
    }

    public void setPenaltyExpiresIn(Long penaltyExpiresIn) {
        this.penaltyExpiresIn = penaltyExpiresIn;
    }

    public FlowFileDTO clusterNodeId(String clusterNodeId) {
        this.clusterNodeId = clusterNodeId;
        return this;
    }

    /**
     * The id of the node where this FlowFile resides.
     *
     * @return clusterNodeId
     **/
    @ApiModelProperty(value = "The id of the node where this FlowFile resides.")
    public String getClusterNodeId() {
        return clusterNodeId;
    }

    public void setClusterNodeId(String clusterNodeId) {
        this.clusterNodeId = clusterNodeId;
    }

    public FlowFileDTO clusterNodeAddress(String clusterNodeAddress) {
        this.clusterNodeAddress = clusterNodeAddress;
        return this;
    }

    /**
     * The label for the node where this FlowFile resides.
     *
     * @return clusterNodeAddress
     **/
    @ApiModelProperty(value = "The label for the node where this FlowFile resides.")
    public String getClusterNodeAddress() {
        return clusterNodeAddress;
    }

    public void setClusterNodeAddress(String clusterNodeAddress) {
        this.clusterNodeAddress = clusterNodeAddress;
    }

    public FlowFileDTO attributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    public FlowFileDTO putAttributesItem(String key, String attributesItem) {
        if (this.attributes == null) {
            this.attributes = new HashMap<String, String>();
        }
        this.attributes.put(key, attributesItem);
        return this;
    }

    /**
     * The FlowFile attributes.
     *
     * @return attributes
     **/
    @ApiModelProperty(value = "The FlowFile attributes.")
    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public FlowFileDTO contentClaimSection(String contentClaimSection) {
        this.contentClaimSection = contentClaimSection;
        return this;
    }

    /**
     * The section in which the content claim lives.
     *
     * @return contentClaimSection
     **/
    @ApiModelProperty(value = "The section in which the content claim lives.")
    public String getContentClaimSection() {
        return contentClaimSection;
    }

    public void setContentClaimSection(String contentClaimSection) {
        this.contentClaimSection = contentClaimSection;
    }

    public FlowFileDTO contentClaimContainer(String contentClaimContainer) {
        this.contentClaimContainer = contentClaimContainer;
        return this;
    }

    /**
     * The container in which the content claim lives.
     *
     * @return contentClaimContainer
     **/
    @ApiModelProperty(value = "The container in which the content claim lives.")
    public String getContentClaimContainer() {
        return contentClaimContainer;
    }

    public void setContentClaimContainer(String contentClaimContainer) {
        this.contentClaimContainer = contentClaimContainer;
    }

    public FlowFileDTO contentClaimIdentifier(String contentClaimIdentifier) {
        this.contentClaimIdentifier = contentClaimIdentifier;
        return this;
    }

    /**
     * The identifier of the content claim.
     *
     * @return contentClaimIdentifier
     **/
    @ApiModelProperty(value = "The identifier of the content claim.")
    public String getContentClaimIdentifier() {
        return contentClaimIdentifier;
    }

    public void setContentClaimIdentifier(String contentClaimIdentifier) {
        this.contentClaimIdentifier = contentClaimIdentifier;
    }

    public FlowFileDTO contentClaimOffset(Long contentClaimOffset) {
        this.contentClaimOffset = contentClaimOffset;
        return this;
    }

    /**
     * The offset into the content claim where the flowfile&#39;s content begins.
     *
     * @return contentClaimOffset
     **/
    @ApiModelProperty(value = "The offset into the content claim where the flowfile's content begins.")
    public Long getContentClaimOffset() {
        return contentClaimOffset;
    }

    public void setContentClaimOffset(Long contentClaimOffset) {
        this.contentClaimOffset = contentClaimOffset;
    }

    public FlowFileDTO contentClaimFileSize(String contentClaimFileSize) {
        this.contentClaimFileSize = contentClaimFileSize;
        return this;
    }

    /**
     * The file size of the content claim formatted.
     *
     * @return contentClaimFileSize
     **/
    @ApiModelProperty(value = "The file size of the content claim formatted.")
    public String getContentClaimFileSize() {
        return contentClaimFileSize;
    }

    public void setContentClaimFileSize(String contentClaimFileSize) {
        this.contentClaimFileSize = contentClaimFileSize;
    }

    public FlowFileDTO contentClaimFileSizeBytes(Long contentClaimFileSizeBytes) {
        this.contentClaimFileSizeBytes = contentClaimFileSizeBytes;
        return this;
    }

    /**
     * The file size of the content claim in bytes.
     *
     * @return contentClaimFileSizeBytes
     **/
    @ApiModelProperty(value = "The file size of the content claim in bytes.")
    public Long getContentClaimFileSizeBytes() {
        return contentClaimFileSizeBytes;
    }

    public void setContentClaimFileSizeBytes(Long contentClaimFileSizeBytes) {
        this.contentClaimFileSizeBytes = contentClaimFileSizeBytes;
    }

    public FlowFileDTO penalized(Boolean penalized) {
        this.penalized = penalized;
        return this;
    }

    /**
     * If the FlowFile is penalized.
     *
     * @return penalized
     **/
    @ApiModelProperty(value = "If the FlowFile is penalized.")
    public Boolean isPenalized() {
        return penalized;
    }

    public void setPenalized(Boolean penalized) {
        this.penalized = penalized;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowFileDTO flowFileDTO = (FlowFileDTO) o;
        return Objects.equals(this.uri, flowFileDTO.uri) &&
                Objects.equals(this.uuid, flowFileDTO.uuid) &&
                Objects.equals(this.filename, flowFileDTO.filename) &&
                Objects.equals(this.position, flowFileDTO.position) &&
                Objects.equals(this.size, flowFileDTO.size) &&
                Objects.equals(this.queuedDuration, flowFileDTO.queuedDuration) &&
                Objects.equals(this.lineageDuration, flowFileDTO.lineageDuration) &&
                Objects.equals(this.penaltyExpiresIn, flowFileDTO.penaltyExpiresIn) &&
                Objects.equals(this.clusterNodeId, flowFileDTO.clusterNodeId) &&
                Objects.equals(this.clusterNodeAddress, flowFileDTO.clusterNodeAddress) &&
                Objects.equals(this.attributes, flowFileDTO.attributes) &&
                Objects.equals(this.contentClaimSection, flowFileDTO.contentClaimSection) &&
                Objects.equals(this.contentClaimContainer, flowFileDTO.contentClaimContainer) &&
                Objects.equals(this.contentClaimIdentifier, flowFileDTO.contentClaimIdentifier) &&
                Objects.equals(this.contentClaimOffset, flowFileDTO.contentClaimOffset) &&
                Objects.equals(this.contentClaimFileSize, flowFileDTO.contentClaimFileSize) &&
                Objects.equals(this.contentClaimFileSizeBytes, flowFileDTO.contentClaimFileSizeBytes) &&
                Objects.equals(this.penalized, flowFileDTO.penalized);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, uuid, filename, position, size, queuedDuration, lineageDuration, penaltyExpiresIn, clusterNodeId, clusterNodeAddress, attributes, contentClaimSection, contentClaimContainer, contentClaimIdentifier, contentClaimOffset, contentClaimFileSize, contentClaimFileSizeBytes, penalized);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowFileDTO {\n");

        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    queuedDuration: ").append(toIndentedString(queuedDuration)).append("\n");
        sb.append("    lineageDuration: ").append(toIndentedString(lineageDuration)).append("\n");
        sb.append("    penaltyExpiresIn: ").append(toIndentedString(penaltyExpiresIn)).append("\n");
        sb.append("    clusterNodeId: ").append(toIndentedString(clusterNodeId)).append("\n");
        sb.append("    clusterNodeAddress: ").append(toIndentedString(clusterNodeAddress)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    contentClaimSection: ").append(toIndentedString(contentClaimSection)).append("\n");
        sb.append("    contentClaimContainer: ").append(toIndentedString(contentClaimContainer)).append("\n");
        sb.append("    contentClaimIdentifier: ").append(toIndentedString(contentClaimIdentifier)).append("\n");
        sb.append("    contentClaimOffset: ").append(toIndentedString(contentClaimOffset)).append("\n");
        sb.append("    contentClaimFileSize: ").append(toIndentedString(contentClaimFileSize)).append("\n");
        sb.append("    contentClaimFileSizeBytes: ").append(toIndentedString(contentClaimFileSizeBytes)).append("\n");
        sb.append("    penalized: ").append(toIndentedString(penalized)).append("\n");
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

