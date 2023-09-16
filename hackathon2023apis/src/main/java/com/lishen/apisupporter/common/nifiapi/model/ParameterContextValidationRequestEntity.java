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

import java.util.Objects;

/**
 * ParameterContextValidationRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ParameterContextValidationRequestEntity {
    @SerializedName("request")
    private ParameterContextValidationRequestDTO request = null;

    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    public ParameterContextValidationRequestEntity request(ParameterContextValidationRequestDTO request) {
        this.request = request;
        return this;
    }

    /**
     * The Update Request
     *
     * @return request
     **/
    @ApiModelProperty(value = "The Update Request")
    public ParameterContextValidationRequestDTO getRequest() {
        return request;
    }

    public void setRequest(ParameterContextValidationRequestDTO request) {
        this.request = request;
    }

    public ParameterContextValidationRequestEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
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
        ParameterContextValidationRequestEntity parameterContextValidationRequestEntity = (ParameterContextValidationRequestEntity) o;
        return Objects.equals(this.request, parameterContextValidationRequestEntity.request) &&
                Objects.equals(this.disconnectedNodeAcknowledged, parameterContextValidationRequestEntity.disconnectedNodeAcknowledged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, disconnectedNodeAcknowledged);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterContextValidationRequestEntity {\n");

        sb.append("    request: ").append(toIndentedString(request)).append("\n");
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

}

