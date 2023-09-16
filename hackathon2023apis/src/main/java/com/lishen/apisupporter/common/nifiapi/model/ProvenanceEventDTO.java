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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProvenanceEventDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ProvenanceEventDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("eventId")
    private Long eventId = null;

    @SerializedName("eventTime")
    private String eventTime = null;

    @SerializedName("eventDuration")
    private Long eventDuration = null;

    @SerializedName("lineageDuration")
    private Long lineageDuration = null;

    @SerializedName("eventType")
    private String eventType = null;

    @SerializedName("flowFileUuid")
    private String flowFileUuid = null;

    @SerializedName("fileSize")
    private String fileSize = null;

    @SerializedName("fileSizeBytes")
    private Long fileSizeBytes = null;

    @SerializedName("clusterNodeId")
    private String clusterNodeId = null;

    @SerializedName("clusterNodeAddress")
    private String clusterNodeAddress = null;

    @SerializedName("groupId")
    private String groupId = null;

    @SerializedName("componentId")
    private String componentId = null;

    @SerializedName("componentType")
    private String componentType = null;

    @SerializedName("componentName")
    private String componentName = null;

    @SerializedName("sourceSystemFlowFileId")
    private String sourceSystemFlowFileId = null;

    @SerializedName("alternateIdentifierUri")
    private String alternateIdentifierUri = null;

    @SerializedName("attributes")
    private List<AttributeDTO> attributes = null;

    @SerializedName("parentUuids")
    private List<String> parentUuids = null;

    @SerializedName("childUuids")
    private List<String> childUuids = null;

    @SerializedName("transitUri")
    private String transitUri = null;

    @SerializedName("relationship")
    private String relationship = null;

    @SerializedName("details")
    private String details = null;

    @SerializedName("contentEqual")
    private Boolean contentEqual = null;

    @SerializedName("inputContentAvailable")
    private Boolean inputContentAvailable = null;

    @SerializedName("inputContentClaimSection")
    private String inputContentClaimSection = null;

    @SerializedName("inputContentClaimContainer")
    private String inputContentClaimContainer = null;

    @SerializedName("inputContentClaimIdentifier")
    private String inputContentClaimIdentifier = null;

    @SerializedName("inputContentClaimOffset")
    private Long inputContentClaimOffset = null;

    @SerializedName("inputContentClaimFileSize")
    private String inputContentClaimFileSize = null;

    @SerializedName("inputContentClaimFileSizeBytes")
    private Long inputContentClaimFileSizeBytes = null;

    @SerializedName("outputContentAvailable")
    private Boolean outputContentAvailable = null;

    @SerializedName("outputContentClaimSection")
    private String outputContentClaimSection = null;

    @SerializedName("outputContentClaimContainer")
    private String outputContentClaimContainer = null;

    @SerializedName("outputContentClaimIdentifier")
    private String outputContentClaimIdentifier = null;

    @SerializedName("outputContentClaimOffset")
    private Long outputContentClaimOffset = null;

    @SerializedName("outputContentClaimFileSize")
    private String outputContentClaimFileSize = null;

    @SerializedName("outputContentClaimFileSizeBytes")
    private Long outputContentClaimFileSizeBytes = null;

    @SerializedName("replayAvailable")
    private Boolean replayAvailable = null;

    @SerializedName("replayExplanation")
    private String replayExplanation = null;

    @SerializedName("sourceConnectionIdentifier")
    private String sourceConnectionIdentifier = null;

    public ProvenanceEventDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The event uuid.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The event uuid.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProvenanceEventDTO eventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * The event id. This is a one up number thats unique per node.
     *
     * @return eventId
     **/
    @ApiModelProperty(value = "The event id. This is a one up number thats unique per node.")
    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public ProvenanceEventDTO eventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * The timestamp of the event.
     *
     * @return eventTime
     **/
    @ApiModelProperty(value = "The timestamp of the event.")
    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public ProvenanceEventDTO eventDuration(Long eventDuration) {
        this.eventDuration = eventDuration;
        return this;
    }

    /**
     * The event duration in milliseconds.
     *
     * @return eventDuration
     **/
    @ApiModelProperty(value = "The event duration in milliseconds.")
    public Long getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(Long eventDuration) {
        this.eventDuration = eventDuration;
    }

    public ProvenanceEventDTO lineageDuration(Long lineageDuration) {
        this.lineageDuration = lineageDuration;
        return this;
    }

    /**
     * The duration since the lineage began, in milliseconds.
     *
     * @return lineageDuration
     **/
    @ApiModelProperty(value = "The duration since the lineage began, in milliseconds.")
    public Long getLineageDuration() {
        return lineageDuration;
    }

    public void setLineageDuration(Long lineageDuration) {
        this.lineageDuration = lineageDuration;
    }

    public ProvenanceEventDTO eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * The type of the event.
     *
     * @return eventType
     **/
    @ApiModelProperty(value = "The type of the event.")
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ProvenanceEventDTO flowFileUuid(String flowFileUuid) {
        this.flowFileUuid = flowFileUuid;
        return this;
    }

    /**
     * The uuid of the flowfile for the event.
     *
     * @return flowFileUuid
     **/
    @ApiModelProperty(value = "The uuid of the flowfile for the event.")
    public String getFlowFileUuid() {
        return flowFileUuid;
    }

    public void setFlowFileUuid(String flowFileUuid) {
        this.flowFileUuid = flowFileUuid;
    }

    public ProvenanceEventDTO fileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * The size of the flowfile for the event.
     *
     * @return fileSize
     **/
    @ApiModelProperty(value = "The size of the flowfile for the event.")
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public ProvenanceEventDTO fileSizeBytes(Long fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
        return this;
    }

    /**
     * The size of the flowfile in bytes for the event.
     *
     * @return fileSizeBytes
     **/
    @ApiModelProperty(value = "The size of the flowfile in bytes for the event.")
    public Long getFileSizeBytes() {
        return fileSizeBytes;
    }

    public void setFileSizeBytes(Long fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    public ProvenanceEventDTO clusterNodeId(String clusterNodeId) {
        this.clusterNodeId = clusterNodeId;
        return this;
    }

    /**
     * The identifier for the node where the event originated.
     *
     * @return clusterNodeId
     **/
    @ApiModelProperty(value = "The identifier for the node where the event originated.")
    public String getClusterNodeId() {
        return clusterNodeId;
    }

    public void setClusterNodeId(String clusterNodeId) {
        this.clusterNodeId = clusterNodeId;
    }

    public ProvenanceEventDTO clusterNodeAddress(String clusterNodeAddress) {
        this.clusterNodeAddress = clusterNodeAddress;
        return this;
    }

    /**
     * The label for the node where the event originated.
     *
     * @return clusterNodeAddress
     **/
    @ApiModelProperty(value = "The label for the node where the event originated.")
    public String getClusterNodeAddress() {
        return clusterNodeAddress;
    }

    public void setClusterNodeAddress(String clusterNodeAddress) {
        this.clusterNodeAddress = clusterNodeAddress;
    }

    public ProvenanceEventDTO groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * The id of the group that the component resides in. If the component is no longer in the flow, the group id will not be set.
     *
     * @return groupId
     **/
    @ApiModelProperty(value = "The id of the group that the component resides in. If the component is no longer in the flow, the group id will not be set.")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ProvenanceEventDTO componentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * The id of the component that generated the event.
     *
     * @return componentId
     **/
    @ApiModelProperty(value = "The id of the component that generated the event.")
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ProvenanceEventDTO componentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * The type of the component that generated the event.
     *
     * @return componentType
     **/
    @ApiModelProperty(value = "The type of the component that generated the event.")
    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    public ProvenanceEventDTO componentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * The name of the component that generated the event.
     *
     * @return componentName
     **/
    @ApiModelProperty(value = "The name of the component that generated the event.")
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public ProvenanceEventDTO sourceSystemFlowFileId(String sourceSystemFlowFileId) {
        this.sourceSystemFlowFileId = sourceSystemFlowFileId;
        return this;
    }

    /**
     * The source system flowfile id.
     *
     * @return sourceSystemFlowFileId
     **/
    @ApiModelProperty(value = "The source system flowfile id.")
    public String getSourceSystemFlowFileId() {
        return sourceSystemFlowFileId;
    }

    public void setSourceSystemFlowFileId(String sourceSystemFlowFileId) {
        this.sourceSystemFlowFileId = sourceSystemFlowFileId;
    }

    public ProvenanceEventDTO alternateIdentifierUri(String alternateIdentifierUri) {
        this.alternateIdentifierUri = alternateIdentifierUri;
        return this;
    }

    /**
     * The alternate identifier uri for the fileflow for the event.
     *
     * @return alternateIdentifierUri
     **/
    @ApiModelProperty(value = "The alternate identifier uri for the fileflow for the event.")
    public String getAlternateIdentifierUri() {
        return alternateIdentifierUri;
    }

    public void setAlternateIdentifierUri(String alternateIdentifierUri) {
        this.alternateIdentifierUri = alternateIdentifierUri;
    }

    public ProvenanceEventDTO attributes(List<AttributeDTO> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProvenanceEventDTO addAttributesItem(AttributeDTO attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<AttributeDTO>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    /**
     * The attributes of the flowfile for the event.
     *
     * @return attributes
     **/
    @ApiModelProperty(value = "The attributes of the flowfile for the event.")
    public List<AttributeDTO> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeDTO> attributes) {
        this.attributes = attributes;
    }

    public ProvenanceEventDTO parentUuids(List<String> parentUuids) {
        this.parentUuids = parentUuids;
        return this;
    }

    public ProvenanceEventDTO addParentUuidsItem(String parentUuidsItem) {
        if (this.parentUuids == null) {
            this.parentUuids = new ArrayList<String>();
        }
        this.parentUuids.add(parentUuidsItem);
        return this;
    }

    /**
     * The parent uuids for the event.
     *
     * @return parentUuids
     **/
    @ApiModelProperty(value = "The parent uuids for the event.")
    public List<String> getParentUuids() {
        return parentUuids;
    }

    public void setParentUuids(List<String> parentUuids) {
        this.parentUuids = parentUuids;
    }

    public ProvenanceEventDTO childUuids(List<String> childUuids) {
        this.childUuids = childUuids;
        return this;
    }

    public ProvenanceEventDTO addChildUuidsItem(String childUuidsItem) {
        if (this.childUuids == null) {
            this.childUuids = new ArrayList<String>();
        }
        this.childUuids.add(childUuidsItem);
        return this;
    }

    /**
     * The child uuids for the event.
     *
     * @return childUuids
     **/
    @ApiModelProperty(value = "The child uuids for the event.")
    public List<String> getChildUuids() {
        return childUuids;
    }

    public void setChildUuids(List<String> childUuids) {
        this.childUuids = childUuids;
    }

    public ProvenanceEventDTO transitUri(String transitUri) {
        this.transitUri = transitUri;
        return this;
    }

    /**
     * The source/destination system uri if the event was a RECEIVE/SEND.
     *
     * @return transitUri
     **/
    @ApiModelProperty(value = "The source/destination system uri if the event was a RECEIVE/SEND.")
    public String getTransitUri() {
        return transitUri;
    }

    public void setTransitUri(String transitUri) {
        this.transitUri = transitUri;
    }

    public ProvenanceEventDTO relationship(String relationship) {
        this.relationship = relationship;
        return this;
    }

    /**
     * The relationship to which the flowfile was routed if the event is of type ROUTE.
     *
     * @return relationship
     **/
    @ApiModelProperty(value = "The relationship to which the flowfile was routed if the event is of type ROUTE.")
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public ProvenanceEventDTO details(String details) {
        this.details = details;
        return this;
    }

    /**
     * The event details.
     *
     * @return details
     **/
    @ApiModelProperty(value = "The event details.")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public ProvenanceEventDTO contentEqual(Boolean contentEqual) {
        this.contentEqual = contentEqual;
        return this;
    }

    /**
     * Whether the input and output content claim is the same.
     *
     * @return contentEqual
     **/
    @ApiModelProperty(value = "Whether the input and output content claim is the same.")
    public Boolean isContentEqual() {
        return contentEqual;
    }

    public void setContentEqual(Boolean contentEqual) {
        this.contentEqual = contentEqual;
    }

    public ProvenanceEventDTO inputContentAvailable(Boolean inputContentAvailable) {
        this.inputContentAvailable = inputContentAvailable;
        return this;
    }

    /**
     * Whether the input content is still available.
     *
     * @return inputContentAvailable
     **/
    @ApiModelProperty(value = "Whether the input content is still available.")
    public Boolean isInputContentAvailable() {
        return inputContentAvailable;
    }

    public void setInputContentAvailable(Boolean inputContentAvailable) {
        this.inputContentAvailable = inputContentAvailable;
    }

    public ProvenanceEventDTO inputContentClaimSection(String inputContentClaimSection) {
        this.inputContentClaimSection = inputContentClaimSection;
        return this;
    }

    /**
     * The section in which the input content claim lives.
     *
     * @return inputContentClaimSection
     **/
    @ApiModelProperty(value = "The section in which the input content claim lives.")
    public String getInputContentClaimSection() {
        return inputContentClaimSection;
    }

    public void setInputContentClaimSection(String inputContentClaimSection) {
        this.inputContentClaimSection = inputContentClaimSection;
    }

    public ProvenanceEventDTO inputContentClaimContainer(String inputContentClaimContainer) {
        this.inputContentClaimContainer = inputContentClaimContainer;
        return this;
    }

    /**
     * The container in which the input content claim lives.
     *
     * @return inputContentClaimContainer
     **/
    @ApiModelProperty(value = "The container in which the input content claim lives.")
    public String getInputContentClaimContainer() {
        return inputContentClaimContainer;
    }

    public void setInputContentClaimContainer(String inputContentClaimContainer) {
        this.inputContentClaimContainer = inputContentClaimContainer;
    }

    public ProvenanceEventDTO inputContentClaimIdentifier(String inputContentClaimIdentifier) {
        this.inputContentClaimIdentifier = inputContentClaimIdentifier;
        return this;
    }

    /**
     * The identifier of the input content claim.
     *
     * @return inputContentClaimIdentifier
     **/
    @ApiModelProperty(value = "The identifier of the input content claim.")
    public String getInputContentClaimIdentifier() {
        return inputContentClaimIdentifier;
    }

    public void setInputContentClaimIdentifier(String inputContentClaimIdentifier) {
        this.inputContentClaimIdentifier = inputContentClaimIdentifier;
    }

    public ProvenanceEventDTO inputContentClaimOffset(Long inputContentClaimOffset) {
        this.inputContentClaimOffset = inputContentClaimOffset;
        return this;
    }

    /**
     * The offset into the input content claim where the flowfiles content begins.
     *
     * @return inputContentClaimOffset
     **/
    @ApiModelProperty(value = "The offset into the input content claim where the flowfiles content begins.")
    public Long getInputContentClaimOffset() {
        return inputContentClaimOffset;
    }

    public void setInputContentClaimOffset(Long inputContentClaimOffset) {
        this.inputContentClaimOffset = inputContentClaimOffset;
    }

    public ProvenanceEventDTO inputContentClaimFileSize(String inputContentClaimFileSize) {
        this.inputContentClaimFileSize = inputContentClaimFileSize;
        return this;
    }

    /**
     * The file size of the input content claim formatted.
     *
     * @return inputContentClaimFileSize
     **/
    @ApiModelProperty(value = "The file size of the input content claim formatted.")
    public String getInputContentClaimFileSize() {
        return inputContentClaimFileSize;
    }

    public void setInputContentClaimFileSize(String inputContentClaimFileSize) {
        this.inputContentClaimFileSize = inputContentClaimFileSize;
    }

    public ProvenanceEventDTO inputContentClaimFileSizeBytes(Long inputContentClaimFileSizeBytes) {
        this.inputContentClaimFileSizeBytes = inputContentClaimFileSizeBytes;
        return this;
    }

    /**
     * The file size of the intput content claim in bytes.
     *
     * @return inputContentClaimFileSizeBytes
     **/
    @ApiModelProperty(value = "The file size of the intput content claim in bytes.")
    public Long getInputContentClaimFileSizeBytes() {
        return inputContentClaimFileSizeBytes;
    }

    public void setInputContentClaimFileSizeBytes(Long inputContentClaimFileSizeBytes) {
        this.inputContentClaimFileSizeBytes = inputContentClaimFileSizeBytes;
    }

    public ProvenanceEventDTO outputContentAvailable(Boolean outputContentAvailable) {
        this.outputContentAvailable = outputContentAvailable;
        return this;
    }

    /**
     * Whether the output content is still available.
     *
     * @return outputContentAvailable
     **/
    @ApiModelProperty(value = "Whether the output content is still available.")
    public Boolean isOutputContentAvailable() {
        return outputContentAvailable;
    }

    public void setOutputContentAvailable(Boolean outputContentAvailable) {
        this.outputContentAvailable = outputContentAvailable;
    }

    public ProvenanceEventDTO outputContentClaimSection(String outputContentClaimSection) {
        this.outputContentClaimSection = outputContentClaimSection;
        return this;
    }

    /**
     * The section in which the output content claim lives.
     *
     * @return outputContentClaimSection
     **/
    @ApiModelProperty(value = "The section in which the output content claim lives.")
    public String getOutputContentClaimSection() {
        return outputContentClaimSection;
    }

    public void setOutputContentClaimSection(String outputContentClaimSection) {
        this.outputContentClaimSection = outputContentClaimSection;
    }

    public ProvenanceEventDTO outputContentClaimContainer(String outputContentClaimContainer) {
        this.outputContentClaimContainer = outputContentClaimContainer;
        return this;
    }

    /**
     * The container in which the output content claim lives.
     *
     * @return outputContentClaimContainer
     **/
    @ApiModelProperty(value = "The container in which the output content claim lives.")
    public String getOutputContentClaimContainer() {
        return outputContentClaimContainer;
    }

    public void setOutputContentClaimContainer(String outputContentClaimContainer) {
        this.outputContentClaimContainer = outputContentClaimContainer;
    }

    public ProvenanceEventDTO outputContentClaimIdentifier(String outputContentClaimIdentifier) {
        this.outputContentClaimIdentifier = outputContentClaimIdentifier;
        return this;
    }

    /**
     * The identifier of the output content claim.
     *
     * @return outputContentClaimIdentifier
     **/
    @ApiModelProperty(value = "The identifier of the output content claim.")
    public String getOutputContentClaimIdentifier() {
        return outputContentClaimIdentifier;
    }

    public void setOutputContentClaimIdentifier(String outputContentClaimIdentifier) {
        this.outputContentClaimIdentifier = outputContentClaimIdentifier;
    }

    public ProvenanceEventDTO outputContentClaimOffset(Long outputContentClaimOffset) {
        this.outputContentClaimOffset = outputContentClaimOffset;
        return this;
    }

    /**
     * The offset into the output content claim where the flowfiles content begins.
     *
     * @return outputContentClaimOffset
     **/
    @ApiModelProperty(value = "The offset into the output content claim where the flowfiles content begins.")
    public Long getOutputContentClaimOffset() {
        return outputContentClaimOffset;
    }

    public void setOutputContentClaimOffset(Long outputContentClaimOffset) {
        this.outputContentClaimOffset = outputContentClaimOffset;
    }

    public ProvenanceEventDTO outputContentClaimFileSize(String outputContentClaimFileSize) {
        this.outputContentClaimFileSize = outputContentClaimFileSize;
        return this;
    }

    /**
     * The file size of the output content claim formatted.
     *
     * @return outputContentClaimFileSize
     **/
    @ApiModelProperty(value = "The file size of the output content claim formatted.")
    public String getOutputContentClaimFileSize() {
        return outputContentClaimFileSize;
    }

    public void setOutputContentClaimFileSize(String outputContentClaimFileSize) {
        this.outputContentClaimFileSize = outputContentClaimFileSize;
    }

    public ProvenanceEventDTO outputContentClaimFileSizeBytes(Long outputContentClaimFileSizeBytes) {
        this.outputContentClaimFileSizeBytes = outputContentClaimFileSizeBytes;
        return this;
    }

    /**
     * The file size of the output content claim in bytes.
     *
     * @return outputContentClaimFileSizeBytes
     **/
    @ApiModelProperty(value = "The file size of the output content claim in bytes.")
    public Long getOutputContentClaimFileSizeBytes() {
        return outputContentClaimFileSizeBytes;
    }

    public void setOutputContentClaimFileSizeBytes(Long outputContentClaimFileSizeBytes) {
        this.outputContentClaimFileSizeBytes = outputContentClaimFileSizeBytes;
    }

    public ProvenanceEventDTO replayAvailable(Boolean replayAvailable) {
        this.replayAvailable = replayAvailable;
        return this;
    }

    /**
     * Whether or not replay is available.
     *
     * @return replayAvailable
     **/
    @ApiModelProperty(value = "Whether or not replay is available.")
    public Boolean isReplayAvailable() {
        return replayAvailable;
    }

    public void setReplayAvailable(Boolean replayAvailable) {
        this.replayAvailable = replayAvailable;
    }

    public ProvenanceEventDTO replayExplanation(String replayExplanation) {
        this.replayExplanation = replayExplanation;
        return this;
    }

    /**
     * Explanation as to why replay is unavailable.
     *
     * @return replayExplanation
     **/
    @ApiModelProperty(value = "Explanation as to why replay is unavailable.")
    public String getReplayExplanation() {
        return replayExplanation;
    }

    public void setReplayExplanation(String replayExplanation) {
        this.replayExplanation = replayExplanation;
    }

    public ProvenanceEventDTO sourceConnectionIdentifier(String sourceConnectionIdentifier) {
        this.sourceConnectionIdentifier = sourceConnectionIdentifier;
        return this;
    }

    /**
     * The identifier of the queue/connection from which the flowfile was pulled to genereate this event. May be null if the queue/connection is unknown or the flowfile was generated from this event.
     *
     * @return sourceConnectionIdentifier
     **/
    @ApiModelProperty(value = "The identifier of the queue/connection from which the flowfile was pulled to genereate this event. May be null if the queue/connection is unknown or the flowfile was generated from this event.")
    public String getSourceConnectionIdentifier() {
        return sourceConnectionIdentifier;
    }

    public void setSourceConnectionIdentifier(String sourceConnectionIdentifier) {
        this.sourceConnectionIdentifier = sourceConnectionIdentifier;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProvenanceEventDTO provenanceEventDTO = (ProvenanceEventDTO) o;
        return Objects.equals(this.id, provenanceEventDTO.id) &&
                Objects.equals(this.eventId, provenanceEventDTO.eventId) &&
                Objects.equals(this.eventTime, provenanceEventDTO.eventTime) &&
                Objects.equals(this.eventDuration, provenanceEventDTO.eventDuration) &&
                Objects.equals(this.lineageDuration, provenanceEventDTO.lineageDuration) &&
                Objects.equals(this.eventType, provenanceEventDTO.eventType) &&
                Objects.equals(this.flowFileUuid, provenanceEventDTO.flowFileUuid) &&
                Objects.equals(this.fileSize, provenanceEventDTO.fileSize) &&
                Objects.equals(this.fileSizeBytes, provenanceEventDTO.fileSizeBytes) &&
                Objects.equals(this.clusterNodeId, provenanceEventDTO.clusterNodeId) &&
                Objects.equals(this.clusterNodeAddress, provenanceEventDTO.clusterNodeAddress) &&
                Objects.equals(this.groupId, provenanceEventDTO.groupId) &&
                Objects.equals(this.componentId, provenanceEventDTO.componentId) &&
                Objects.equals(this.componentType, provenanceEventDTO.componentType) &&
                Objects.equals(this.componentName, provenanceEventDTO.componentName) &&
                Objects.equals(this.sourceSystemFlowFileId, provenanceEventDTO.sourceSystemFlowFileId) &&
                Objects.equals(this.alternateIdentifierUri, provenanceEventDTO.alternateIdentifierUri) &&
                Objects.equals(this.attributes, provenanceEventDTO.attributes) &&
                Objects.equals(this.parentUuids, provenanceEventDTO.parentUuids) &&
                Objects.equals(this.childUuids, provenanceEventDTO.childUuids) &&
                Objects.equals(this.transitUri, provenanceEventDTO.transitUri) &&
                Objects.equals(this.relationship, provenanceEventDTO.relationship) &&
                Objects.equals(this.details, provenanceEventDTO.details) &&
                Objects.equals(this.contentEqual, provenanceEventDTO.contentEqual) &&
                Objects.equals(this.inputContentAvailable, provenanceEventDTO.inputContentAvailable) &&
                Objects.equals(this.inputContentClaimSection, provenanceEventDTO.inputContentClaimSection) &&
                Objects.equals(this.inputContentClaimContainer, provenanceEventDTO.inputContentClaimContainer) &&
                Objects.equals(this.inputContentClaimIdentifier, provenanceEventDTO.inputContentClaimIdentifier) &&
                Objects.equals(this.inputContentClaimOffset, provenanceEventDTO.inputContentClaimOffset) &&
                Objects.equals(this.inputContentClaimFileSize, provenanceEventDTO.inputContentClaimFileSize) &&
                Objects.equals(this.inputContentClaimFileSizeBytes, provenanceEventDTO.inputContentClaimFileSizeBytes) &&
                Objects.equals(this.outputContentAvailable, provenanceEventDTO.outputContentAvailable) &&
                Objects.equals(this.outputContentClaimSection, provenanceEventDTO.outputContentClaimSection) &&
                Objects.equals(this.outputContentClaimContainer, provenanceEventDTO.outputContentClaimContainer) &&
                Objects.equals(this.outputContentClaimIdentifier, provenanceEventDTO.outputContentClaimIdentifier) &&
                Objects.equals(this.outputContentClaimOffset, provenanceEventDTO.outputContentClaimOffset) &&
                Objects.equals(this.outputContentClaimFileSize, provenanceEventDTO.outputContentClaimFileSize) &&
                Objects.equals(this.outputContentClaimFileSizeBytes, provenanceEventDTO.outputContentClaimFileSizeBytes) &&
                Objects.equals(this.replayAvailable, provenanceEventDTO.replayAvailable) &&
                Objects.equals(this.replayExplanation, provenanceEventDTO.replayExplanation) &&
                Objects.equals(this.sourceConnectionIdentifier, provenanceEventDTO.sourceConnectionIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventId, eventTime, eventDuration, lineageDuration, eventType, flowFileUuid, fileSize, fileSizeBytes, clusterNodeId, clusterNodeAddress, groupId, componentId, componentType, componentName, sourceSystemFlowFileId, alternateIdentifierUri, attributes, parentUuids, childUuids, transitUri, relationship, details, contentEqual, inputContentAvailable, inputContentClaimSection, inputContentClaimContainer, inputContentClaimIdentifier, inputContentClaimOffset, inputContentClaimFileSize, inputContentClaimFileSizeBytes, outputContentAvailable, outputContentClaimSection, outputContentClaimContainer, outputContentClaimIdentifier, outputContentClaimOffset, outputContentClaimFileSize, outputContentClaimFileSizeBytes, replayAvailable, replayExplanation, sourceConnectionIdentifier);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvenanceEventDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
        sb.append("    eventDuration: ").append(toIndentedString(eventDuration)).append("\n");
        sb.append("    lineageDuration: ").append(toIndentedString(lineageDuration)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    flowFileUuid: ").append(toIndentedString(flowFileUuid)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileSizeBytes: ").append(toIndentedString(fileSizeBytes)).append("\n");
        sb.append("    clusterNodeId: ").append(toIndentedString(clusterNodeId)).append("\n");
        sb.append("    clusterNodeAddress: ").append(toIndentedString(clusterNodeAddress)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    sourceSystemFlowFileId: ").append(toIndentedString(sourceSystemFlowFileId)).append("\n");
        sb.append("    alternateIdentifierUri: ").append(toIndentedString(alternateIdentifierUri)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    parentUuids: ").append(toIndentedString(parentUuids)).append("\n");
        sb.append("    childUuids: ").append(toIndentedString(childUuids)).append("\n");
        sb.append("    transitUri: ").append(toIndentedString(transitUri)).append("\n");
        sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    contentEqual: ").append(toIndentedString(contentEqual)).append("\n");
        sb.append("    inputContentAvailable: ").append(toIndentedString(inputContentAvailable)).append("\n");
        sb.append("    inputContentClaimSection: ").append(toIndentedString(inputContentClaimSection)).append("\n");
        sb.append("    inputContentClaimContainer: ").append(toIndentedString(inputContentClaimContainer)).append("\n");
        sb.append("    inputContentClaimIdentifier: ").append(toIndentedString(inputContentClaimIdentifier)).append("\n");
        sb.append("    inputContentClaimOffset: ").append(toIndentedString(inputContentClaimOffset)).append("\n");
        sb.append("    inputContentClaimFileSize: ").append(toIndentedString(inputContentClaimFileSize)).append("\n");
        sb.append("    inputContentClaimFileSizeBytes: ").append(toIndentedString(inputContentClaimFileSizeBytes)).append("\n");
        sb.append("    outputContentAvailable: ").append(toIndentedString(outputContentAvailable)).append("\n");
        sb.append("    outputContentClaimSection: ").append(toIndentedString(outputContentClaimSection)).append("\n");
        sb.append("    outputContentClaimContainer: ").append(toIndentedString(outputContentClaimContainer)).append("\n");
        sb.append("    outputContentClaimIdentifier: ").append(toIndentedString(outputContentClaimIdentifier)).append("\n");
        sb.append("    outputContentClaimOffset: ").append(toIndentedString(outputContentClaimOffset)).append("\n");
        sb.append("    outputContentClaimFileSize: ").append(toIndentedString(outputContentClaimFileSize)).append("\n");
        sb.append("    outputContentClaimFileSizeBytes: ").append(toIndentedString(outputContentClaimFileSizeBytes)).append("\n");
        sb.append("    replayAvailable: ").append(toIndentedString(replayAvailable)).append("\n");
        sb.append("    replayExplanation: ").append(toIndentedString(replayExplanation)).append("\n");
        sb.append("    sourceConnectionIdentifier: ").append(toIndentedString(sourceConnectionIdentifier)).append("\n");
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

