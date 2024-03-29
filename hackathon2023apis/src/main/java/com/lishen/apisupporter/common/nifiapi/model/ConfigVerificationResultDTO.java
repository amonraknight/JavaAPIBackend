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
 * ConfigVerificationResultDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ConfigVerificationResultDTO {
    @SerializedName("outcome")
    private OutcomeEnum outcome = null;
    @SerializedName("verificationStepName")
    private String verificationStepName = null;
    @SerializedName("explanation")
    private String explanation = null;

    public ConfigVerificationResultDTO outcome(OutcomeEnum outcome) {
        this.outcome = outcome;
        return this;
    }

    /**
     * The outcome of the verification
     *
     * @return outcome
     **/
    @ApiModelProperty(value = "The outcome of the verification")
    public OutcomeEnum getOutcome() {
        return outcome;
    }

    public void setOutcome(OutcomeEnum outcome) {
        this.outcome = outcome;
    }

    public ConfigVerificationResultDTO verificationStepName(String verificationStepName) {
        this.verificationStepName = verificationStepName;
        return this;
    }

    /**
     * The name of the verification step
     *
     * @return verificationStepName
     **/
    @ApiModelProperty(value = "The name of the verification step")
    public String getVerificationStepName() {
        return verificationStepName;
    }

    public void setVerificationStepName(String verificationStepName) {
        this.verificationStepName = verificationStepName;
    }

    public ConfigVerificationResultDTO explanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    /**
     * An explanation of why the step was or was not successful
     *
     * @return explanation
     **/
    @ApiModelProperty(value = "An explanation of why the step was or was not successful")
    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigVerificationResultDTO configVerificationResultDTO = (ConfigVerificationResultDTO) o;
        return Objects.equals(this.outcome, configVerificationResultDTO.outcome) &&
                Objects.equals(this.verificationStepName, configVerificationResultDTO.verificationStepName) &&
                Objects.equals(this.explanation, configVerificationResultDTO.explanation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outcome, verificationStepName, explanation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigVerificationResultDTO {\n");

        sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
        sb.append("    verificationStepName: ").append(toIndentedString(verificationStepName)).append("\n");
        sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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
     * The outcome of the verification
     */
    @JsonAdapter(OutcomeEnum.Adapter.class)
    public enum OutcomeEnum {
        SUCCESSFUL("SUCCESSFUL"),

        FAILED("FAILED"),

        SKIPPED("SKIPPED");

        private String value;

        OutcomeEnum(String value) {
            this.value = value;
        }

        public static OutcomeEnum fromValue(String text) {
            for (OutcomeEnum b : OutcomeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<OutcomeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OutcomeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OutcomeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OutcomeEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

