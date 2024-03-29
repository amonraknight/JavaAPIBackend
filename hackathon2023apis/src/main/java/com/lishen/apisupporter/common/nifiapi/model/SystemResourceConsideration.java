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
 * SystemResourceConsideration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class SystemResourceConsideration {
    @SerializedName("resource")
    private String resource = null;

    @SerializedName("description")
    private String description = null;

    public SystemResourceConsideration resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * The resource to consider
     *
     * @return resource
     **/
    @ApiModelProperty(value = "The resource to consider")
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public SystemResourceConsideration description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of how the resource is affected
     *
     * @return description
     **/
    @ApiModelProperty(value = "The description of how the resource is affected")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemResourceConsideration systemResourceConsideration = (SystemResourceConsideration) o;
        return Objects.equals(this.resource, systemResourceConsideration.resource) &&
                Objects.equals(this.description, systemResourceConsideration.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, description);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemResourceConsideration {\n");

        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

