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
import java.util.Objects;

/**
 * ReplayLastEventRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ReplayLastEventRequestEntity {
    @SerializedName("componentId")
    private String componentId = null;
    @SerializedName("nodes")
    private NodesEnum nodes = null;

    public ReplayLastEventRequestEntity componentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * The UUID of the component whose last event should be replayed.
     *
     * @return componentId
     **/
    @ApiModelProperty(value = "The UUID of the component whose last event should be replayed.")
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ReplayLastEventRequestEntity nodes(NodesEnum nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * Which nodes are to replay their last provenance event.
     *
     * @return nodes
     **/
    @ApiModelProperty(value = "Which nodes are to replay their last provenance event.")
    public NodesEnum getNodes() {
        return nodes;
    }

    public void setNodes(NodesEnum nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplayLastEventRequestEntity replayLastEventRequestEntity = (ReplayLastEventRequestEntity) o;
        return Objects.equals(this.componentId, replayLastEventRequestEntity.componentId) &&
                Objects.equals(this.nodes, replayLastEventRequestEntity.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplayLastEventRequestEntity {\n");

        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
     * Which nodes are to replay their last provenance event.
     */
    @JsonAdapter(NodesEnum.Adapter.class)
    public enum NodesEnum {
        ALL("ALL"),

        PRIMARY("PRIMARY");

        private String value;

        NodesEnum(String value) {
            this.value = value;
        }

        public static NodesEnum fromValue(String text) {
            for (NodesEnum b : NodesEnum.values()) {
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

        public static class Adapter extends TypeAdapter<NodesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final NodesEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public NodesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return NodesEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

