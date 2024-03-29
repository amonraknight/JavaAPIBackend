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
 * Stateful
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class Stateful {
    @SerializedName("description")
    private String description = null;
    @SerializedName("scopes")
    private List<ScopesEnum> scopes = null;

    public Stateful description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of what information is being stored in the StateManager
     *
     * @return description
     **/
    @ApiModelProperty(value = "Description of what information is being stored in the StateManager")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Stateful scopes(List<ScopesEnum> scopes) {
        this.scopes = scopes;
        return this;
    }

    public Stateful addScopesItem(ScopesEnum scopesItem) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<ScopesEnum>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    /**
     * Indicates the Scope(s) associated with the State that is stored and retrieved
     *
     * @return scopes
     **/
    @ApiModelProperty(value = "Indicates the Scope(s) associated with the State that is stored and retrieved")
    public List<ScopesEnum> getScopes() {
        return scopes;
    }

    public void setScopes(List<ScopesEnum> scopes) {
        this.scopes = scopes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stateful stateful = (Stateful) o;
        return Objects.equals(this.description, stateful.description) &&
                Objects.equals(this.scopes, stateful.scopes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, scopes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Stateful {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
     * Gets or Sets scopes
     */
    @JsonAdapter(ScopesEnum.Adapter.class)
    public enum ScopesEnum {
        CLUSTER("CLUSTER"),

        LOCAL("LOCAL");

        private String value;

        ScopesEnum(String value) {
            this.value = value;
        }

        public static ScopesEnum fromValue(String text) {
            for (ScopesEnum b : ScopesEnum.values()) {
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

        public static class Adapter extends TypeAdapter<ScopesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ScopesEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ScopesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ScopesEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

