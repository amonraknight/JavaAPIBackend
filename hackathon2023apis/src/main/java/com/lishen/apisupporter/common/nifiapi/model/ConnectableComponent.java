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
 * ConnectableComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ConnectableComponent {
    @SerializedName("id")
    private String id = null;
    @SerializedName("type")
    private TypeEnum type = null;
    @SerializedName("groupId")
    private String groupId = null;
    @SerializedName("name")
    private String name = null;
    @SerializedName("comments")
    private String comments = null;
    @SerializedName("instanceIdentifier")
    private String instanceIdentifier = null;

    public ConnectableComponent id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the connectable component.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "The id of the connectable component.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConnectableComponent type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of component the connectable is.
     *
     * @return type
     **/
    @ApiModelProperty(required = true, value = "The type of component the connectable is.")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ConnectableComponent groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * The id of the group that the connectable component resides in
     *
     * @return groupId
     **/
    @ApiModelProperty(required = true, value = "The id of the group that the connectable component resides in")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ConnectableComponent name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the connectable component
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the connectable component")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConnectableComponent comments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * The comments for the connectable component.
     *
     * @return comments
     **/
    @ApiModelProperty(value = "The comments for the connectable component.")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ConnectableComponent instanceIdentifier(String instanceIdentifier) {
        this.instanceIdentifier = instanceIdentifier;
        return this;
    }

    /**
     * The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component
     *
     * @return instanceIdentifier
     **/
    @ApiModelProperty(value = "The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component")
    public String getInstanceIdentifier() {
        return instanceIdentifier;
    }

    public void setInstanceIdentifier(String instanceIdentifier) {
        this.instanceIdentifier = instanceIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectableComponent connectableComponent = (ConnectableComponent) o;
        return Objects.equals(this.id, connectableComponent.id) &&
                Objects.equals(this.type, connectableComponent.type) &&
                Objects.equals(this.groupId, connectableComponent.groupId) &&
                Objects.equals(this.name, connectableComponent.name) &&
                Objects.equals(this.comments, connectableComponent.comments) &&
                Objects.equals(this.instanceIdentifier, connectableComponent.instanceIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, groupId, name, comments, instanceIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectableComponent {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    instanceIdentifier: ").append(toIndentedString(instanceIdentifier)).append("\n");
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
     * The type of component the connectable is.
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        PROCESSOR("PROCESSOR"),

        REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),

        REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),

        INPUT_PORT("INPUT_PORT"),

        OUTPUT_PORT("OUTPUT_PORT"),

        FUNNEL("FUNNEL");

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

