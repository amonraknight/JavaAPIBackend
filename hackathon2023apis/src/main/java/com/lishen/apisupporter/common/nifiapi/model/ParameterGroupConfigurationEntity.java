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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ParameterGroupConfigurationEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ParameterGroupConfigurationEntity {
    @SerializedName("groupName")
    private String groupName = null;

    @SerializedName("parameterContextName")
    private String parameterContextName = null;
    @SerializedName("parameterSensitivities")
    private Map<String, InnerEnum> parameterSensitivities = null;
    @SerializedName("synchronized")
    private Boolean _synchronized = null;

    public ParameterGroupConfigurationEntity groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * The name of the external parameter group to which the provided parameter names apply.
     *
     * @return groupName
     **/
    @ApiModelProperty(value = "The name of the external parameter group to which the provided parameter names apply.")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ParameterGroupConfigurationEntity parameterContextName(String parameterContextName) {
        this.parameterContextName = parameterContextName;
        return this;
    }

    /**
     * The name of the ParameterContext that receives the parameters in this group
     *
     * @return parameterContextName
     **/
    @ApiModelProperty(value = "The name of the ParameterContext that receives the parameters in this group")
    public String getParameterContextName() {
        return parameterContextName;
    }

    public void setParameterContextName(String parameterContextName) {
        this.parameterContextName = parameterContextName;
    }

    public ParameterGroupConfigurationEntity parameterSensitivities(Map<String, InnerEnum> parameterSensitivities) {
        this.parameterSensitivities = parameterSensitivities;
        return this;
    }

    public ParameterGroupConfigurationEntity putParameterSensitivitiesItem(String key, InnerEnum parameterSensitivitiesItem) {
        if (this.parameterSensitivities == null) {
            this.parameterSensitivities = new HashMap<String, InnerEnum>();
        }
        this.parameterSensitivities.put(key, parameterSensitivitiesItem);
        return this;
    }

    /**
     * All fetched parameter names that should be applied.
     *
     * @return parameterSensitivities
     **/
    @ApiModelProperty(value = "All fetched parameter names that should be applied.")
    public Map<String, InnerEnum> getParameterSensitivities() {
        return parameterSensitivities;
    }

    public void setParameterSensitivities(Map<String, InnerEnum> parameterSensitivities) {
        this.parameterSensitivities = parameterSensitivities;
    }

    public ParameterGroupConfigurationEntity _synchronized(Boolean _synchronized) {
        this._synchronized = _synchronized;
        return this;
    }

    /**
     * True if this group should be synchronized to a ParameterContext, including creating one if it does not exist.
     *
     * @return _synchronized
     **/
    @ApiModelProperty(value = "True if this group should be synchronized to a ParameterContext, including creating one if it does not exist.")
    public Boolean isSynchronized() {
        return _synchronized;
    }

    public void setSynchronized(Boolean _synchronized) {
        this._synchronized = _synchronized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParameterGroupConfigurationEntity parameterGroupConfigurationEntity = (ParameterGroupConfigurationEntity) o;
        return Objects.equals(this.groupName, parameterGroupConfigurationEntity.groupName) &&
                Objects.equals(this.parameterContextName, parameterGroupConfigurationEntity.parameterContextName) &&
                Objects.equals(this.parameterSensitivities, parameterGroupConfigurationEntity.parameterSensitivities) &&
                Objects.equals(this._synchronized, parameterGroupConfigurationEntity._synchronized);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, parameterContextName, parameterSensitivities, _synchronized);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterGroupConfigurationEntity {\n");

        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    parameterContextName: ").append(toIndentedString(parameterContextName)).append("\n");
        sb.append("    parameterSensitivities: ").append(toIndentedString(parameterSensitivities)).append("\n");
        sb.append("    _synchronized: ").append(toIndentedString(_synchronized)).append("\n");
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
     * Gets or Sets inner
     */
    @JsonAdapter(InnerEnum.Adapter.class)
    public enum InnerEnum {
        SENSITIVE("SENSITIVE"),

        NON_SENSITIVE("NON_SENSITIVE");

        private String value;

        InnerEnum(String value) {
            this.value = value;
        }

        public static InnerEnum fromValue(String text) {
            for (InnerEnum b : InnerEnum.values()) {
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

        public static class Adapter extends TypeAdapter<InnerEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final InnerEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public InnerEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return InnerEnum.fromValue(String.valueOf(value));
            }
        }
    }

}
