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
 * PropertyHistoryDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class PropertyHistoryDTO {
    @SerializedName("previousValues")
    private List<PreviousValueDTO> previousValues = null;

    public PropertyHistoryDTO previousValues(List<PreviousValueDTO> previousValues) {
        this.previousValues = previousValues;
        return this;
    }

    public PropertyHistoryDTO addPreviousValuesItem(PreviousValueDTO previousValuesItem) {
        if (this.previousValues == null) {
            this.previousValues = new ArrayList<PreviousValueDTO>();
        }
        this.previousValues.add(previousValuesItem);
        return this;
    }

    /**
     * Previous values for a given property.
     *
     * @return previousValues
     **/
    @ApiModelProperty(value = "Previous values for a given property.")
    public List<PreviousValueDTO> getPreviousValues() {
        return previousValues;
    }

    public void setPreviousValues(List<PreviousValueDTO> previousValues) {
        this.previousValues = previousValues;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyHistoryDTO propertyHistoryDTO = (PropertyHistoryDTO) o;
        return Objects.equals(this.previousValues, propertyHistoryDTO.previousValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previousValues);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyHistoryDTO {\n");

        sb.append("    previousValues: ").append(toIndentedString(previousValues)).append("\n");
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

