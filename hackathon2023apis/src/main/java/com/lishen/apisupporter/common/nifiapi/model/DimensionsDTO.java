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
 * DimensionsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class DimensionsDTO {
    @SerializedName("width")
    private Double width = null;

    @SerializedName("height")
    private Double height = null;

    public DimensionsDTO width(Double width) {
        this.width = width;
        return this;
    }

    /**
     * The width of the label in pixels when at a 1:1 scale.
     *
     * @return width
     **/
    @ApiModelProperty(value = "The width of the label in pixels when at a 1:1 scale.")
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public DimensionsDTO height(Double height) {
        this.height = height;
        return this;
    }

    /**
     * The height of the label in pixels when at a 1:1 scale.
     *
     * @return height
     **/
    @ApiModelProperty(value = "The height of the label in pixels when at a 1:1 scale.")
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DimensionsDTO dimensionsDTO = (DimensionsDTO) o;
        return Objects.equals(this.width, dimensionsDTO.width) &&
                Objects.equals(this.height, dimensionsDTO.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionsDTO {\n");

        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
