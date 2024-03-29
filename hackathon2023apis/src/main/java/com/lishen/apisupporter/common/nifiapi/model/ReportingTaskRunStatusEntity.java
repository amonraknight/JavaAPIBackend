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
 * ReportingTaskRunStatusEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ReportingTaskRunStatusEntity {
    @SerializedName("revision")
    private RevisionDTO revision = null;
    @SerializedName("state")
    private StateEnum state = null;
    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    public ReportingTaskRunStatusEntity revision(RevisionDTO revision) {
        this.revision = revision;
        return this;
    }

    /**
     * The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.
     *
     * @return revision
     **/
    @ApiModelProperty(value = "The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.")
    public RevisionDTO getRevision() {
        return revision;
    }

    public void setRevision(RevisionDTO revision) {
        this.revision = revision;
    }

    public ReportingTaskRunStatusEntity state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The run status of the ReportingTask.
     *
     * @return state
     **/
    @ApiModelProperty(value = "The run status of the ReportingTask.")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ReportingTaskRunStatusEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
        this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
        return this;
    }

    /**
     * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
     *
     * @return disconnectedNodeAcknowledged
     **/
    @ApiModelProperty(value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
    public Boolean isDisconnectedNodeAcknowledged() {
        return disconnectedNodeAcknowledged;
    }

    public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
        this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportingTaskRunStatusEntity reportingTaskRunStatusEntity = (ReportingTaskRunStatusEntity) o;
        return Objects.equals(this.revision, reportingTaskRunStatusEntity.revision) &&
                Objects.equals(this.state, reportingTaskRunStatusEntity.state) &&
                Objects.equals(this.disconnectedNodeAcknowledged, reportingTaskRunStatusEntity.disconnectedNodeAcknowledged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(revision, state, disconnectedNodeAcknowledged);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportingTaskRunStatusEntity {\n");

        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
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
     * The run status of the ReportingTask.
     */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        RUNNING("RUNNING"),

        STOPPED("STOPPED");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
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

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

