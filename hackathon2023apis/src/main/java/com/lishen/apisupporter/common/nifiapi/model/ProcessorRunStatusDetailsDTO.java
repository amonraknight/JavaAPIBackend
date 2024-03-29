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
 * ProcessorRunStatusDetailsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ProcessorRunStatusDetailsDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("name")
    private String name = null;
    @SerializedName("runStatus")
    private RunStatusEnum runStatus = null;
    @SerializedName("validationErrors")
    private List<String> validationErrors = null;
    @SerializedName("activeThreadCount")
    private Integer activeThreadCount = null;

    public ProcessorRunStatusDetailsDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the processor
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID of the processor")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessorRunStatusDetailsDTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the processor
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the processor")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessorRunStatusDetailsDTO runStatus(RunStatusEnum runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * The run status of the processor
     *
     * @return runStatus
     **/
    @ApiModelProperty(value = "The run status of the processor")
    public RunStatusEnum getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(RunStatusEnum runStatus) {
        this.runStatus = runStatus;
    }

    public ProcessorRunStatusDetailsDTO validationErrors(List<String> validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

    public ProcessorRunStatusDetailsDTO addValidationErrorsItem(String validationErrorsItem) {
        if (this.validationErrors == null) {
            this.validationErrors = new ArrayList<String>();
        }
        this.validationErrors.add(validationErrorsItem);
        return this;
    }

    /**
     * The processor&#39;s validation errors
     *
     * @return validationErrors
     **/
    @ApiModelProperty(value = "The processor's validation errors")
    public List<String> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(List<String> validationErrors) {
        this.validationErrors = validationErrors;
    }

    public ProcessorRunStatusDetailsDTO activeThreadCount(Integer activeThreadCount) {
        this.activeThreadCount = activeThreadCount;
        return this;
    }

    /**
     * The current number of threads that the processor is currently using
     *
     * @return activeThreadCount
     **/
    @ApiModelProperty(value = "The current number of threads that the processor is currently using")
    public Integer getActiveThreadCount() {
        return activeThreadCount;
    }

    public void setActiveThreadCount(Integer activeThreadCount) {
        this.activeThreadCount = activeThreadCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessorRunStatusDetailsDTO processorRunStatusDetailsDTO = (ProcessorRunStatusDetailsDTO) o;
        return Objects.equals(this.id, processorRunStatusDetailsDTO.id) &&
                Objects.equals(this.name, processorRunStatusDetailsDTO.name) &&
                Objects.equals(this.runStatus, processorRunStatusDetailsDTO.runStatus) &&
                Objects.equals(this.validationErrors, processorRunStatusDetailsDTO.validationErrors) &&
                Objects.equals(this.activeThreadCount, processorRunStatusDetailsDTO.activeThreadCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, runStatus, validationErrors, activeThreadCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessorRunStatusDetailsDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
        sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
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
     * The run status of the processor
     */
    @JsonAdapter(RunStatusEnum.Adapter.class)
    public enum RunStatusEnum {
        RUNNING("Running"),

        STOPPED("Stopped"),

        INVALID("Invalid"),

        VALIDATING("Validating"),

        DISABLED("Disabled");

        private String value;

        RunStatusEnum(String value) {
            this.value = value;
        }

        public static RunStatusEnum fromValue(String text) {
            for (RunStatusEnum b : RunStatusEnum.values()) {
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

        public static class Adapter extends TypeAdapter<RunStatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RunStatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RunStatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RunStatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

