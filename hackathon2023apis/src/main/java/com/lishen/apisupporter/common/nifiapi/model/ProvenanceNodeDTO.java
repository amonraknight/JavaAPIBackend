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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProvenanceNodeDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ProvenanceNodeDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("flowFileUuid")
    private String flowFileUuid = null;

    @SerializedName("parentUuids")
    private List<String> parentUuids = null;

    @SerializedName("childUuids")
    private List<String> childUuids = null;

    @SerializedName("clusterNodeIdentifier")
    private String clusterNodeIdentifier = null;
    @SerializedName("type")
    private TypeEnum type = null;
    @SerializedName("eventType")
    private String eventType = null;
    @SerializedName("millis")
    private Long millis = null;
    @SerializedName("timestamp")
    private String timestamp = null;

    public ProvenanceNodeDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the node.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The id of the node.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProvenanceNodeDTO flowFileUuid(String flowFileUuid) {
        this.flowFileUuid = flowFileUuid;
        return this;
    }

    /**
     * The uuid of the flowfile associated with the provenance event.
     *
     * @return flowFileUuid
     **/
    @ApiModelProperty(value = "The uuid of the flowfile associated with the provenance event.")
    public String getFlowFileUuid() {
        return flowFileUuid;
    }

    public void setFlowFileUuid(String flowFileUuid) {
        this.flowFileUuid = flowFileUuid;
    }

    public ProvenanceNodeDTO parentUuids(List<String> parentUuids) {
        this.parentUuids = parentUuids;
        return this;
    }

    public ProvenanceNodeDTO addParentUuidsItem(String parentUuidsItem) {
        if (this.parentUuids == null) {
            this.parentUuids = new ArrayList<String>();
        }
        this.parentUuids.add(parentUuidsItem);
        return this;
    }

    /**
     * The uuid of the parent flowfiles of the provenance event.
     *
     * @return parentUuids
     **/
    @ApiModelProperty(value = "The uuid of the parent flowfiles of the provenance event.")
    public List<String> getParentUuids() {
        return parentUuids;
    }

    public void setParentUuids(List<String> parentUuids) {
        this.parentUuids = parentUuids;
    }

    public ProvenanceNodeDTO childUuids(List<String> childUuids) {
        this.childUuids = childUuids;
        return this;
    }

    public ProvenanceNodeDTO addChildUuidsItem(String childUuidsItem) {
        if (this.childUuids == null) {
            this.childUuids = new ArrayList<String>();
        }
        this.childUuids.add(childUuidsItem);
        return this;
    }

    /**
     * The uuid of the childrent flowfiles of the provenance event.
     *
     * @return childUuids
     **/
    @ApiModelProperty(value = "The uuid of the childrent flowfiles of the provenance event.")
    public List<String> getChildUuids() {
        return childUuids;
    }

    public void setChildUuids(List<String> childUuids) {
        this.childUuids = childUuids;
    }

    public ProvenanceNodeDTO clusterNodeIdentifier(String clusterNodeIdentifier) {
        this.clusterNodeIdentifier = clusterNodeIdentifier;
        return this;
    }

    /**
     * The identifier of the node that this event/flowfile originated from.
     *
     * @return clusterNodeIdentifier
     **/
    @ApiModelProperty(value = "The identifier of the node that this event/flowfile originated from.")
    public String getClusterNodeIdentifier() {
        return clusterNodeIdentifier;
    }

    public void setClusterNodeIdentifier(String clusterNodeIdentifier) {
        this.clusterNodeIdentifier = clusterNodeIdentifier;
    }

    public ProvenanceNodeDTO type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the node.
     *
     * @return type
     **/
    @ApiModelProperty(value = "The type of the node.")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ProvenanceNodeDTO eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * If the type is EVENT, this is the type of event.
     *
     * @return eventType
     **/
    @ApiModelProperty(value = "If the type is EVENT, this is the type of event.")
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ProvenanceNodeDTO millis(Long millis) {
        this.millis = millis;
        return this;
    }

    /**
     * The timestamp of the node in milliseconds.
     *
     * @return millis
     **/
    @ApiModelProperty(value = "The timestamp of the node in milliseconds.")
    public Long getMillis() {
        return millis;
    }

    public void setMillis(Long millis) {
        this.millis = millis;
    }

    public ProvenanceNodeDTO timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The timestamp of the node formatted.
     *
     * @return timestamp
     **/
    @ApiModelProperty(value = "The timestamp of the node formatted.")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProvenanceNodeDTO provenanceNodeDTO = (ProvenanceNodeDTO) o;
        return Objects.equals(this.id, provenanceNodeDTO.id) &&
                Objects.equals(this.flowFileUuid, provenanceNodeDTO.flowFileUuid) &&
                Objects.equals(this.parentUuids, provenanceNodeDTO.parentUuids) &&
                Objects.equals(this.childUuids, provenanceNodeDTO.childUuids) &&
                Objects.equals(this.clusterNodeIdentifier, provenanceNodeDTO.clusterNodeIdentifier) &&
                Objects.equals(this.type, provenanceNodeDTO.type) &&
                Objects.equals(this.eventType, provenanceNodeDTO.eventType) &&
                Objects.equals(this.millis, provenanceNodeDTO.millis) &&
                Objects.equals(this.timestamp, provenanceNodeDTO.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flowFileUuid, parentUuids, childUuids, clusterNodeIdentifier, type, eventType, millis, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvenanceNodeDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    flowFileUuid: ").append(toIndentedString(flowFileUuid)).append("\n");
        sb.append("    parentUuids: ").append(toIndentedString(parentUuids)).append("\n");
        sb.append("    childUuids: ").append(toIndentedString(childUuids)).append("\n");
        sb.append("    clusterNodeIdentifier: ").append(toIndentedString(clusterNodeIdentifier)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    millis: ").append(toIndentedString(millis)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

    /**
     * The type of the node.
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        FLOWFILE("FLOWFILE"),

        EVENT("EVENT");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

