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
 * PropertyDependencyDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class PropertyDependencyDTO {
    @SerializedName("propertyName")
    private String propertyName = null;

    @SerializedName("dependentValues")
    private List<String> dependentValues = null;

    public PropertyDependencyDTO propertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * The name of the property that is being depended upon
     *
     * @return propertyName
     **/
    @ApiModelProperty(value = "The name of the property that is being depended upon")
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public PropertyDependencyDTO dependentValues(List<String> dependentValues) {
        this.dependentValues = dependentValues;
        return this;
    }

    public PropertyDependencyDTO addDependentValuesItem(String dependentValuesItem) {
        if (this.dependentValues == null) {
            this.dependentValues = new ArrayList<String>();
        }
        this.dependentValues.add(dependentValuesItem);
        return this;
    }

    /**
     * The values for the property that satisfies the dependency, or null if the dependency is satisfied by the presence of any value for the associated property name
     *
     * @return dependentValues
     **/
    @ApiModelProperty(value = "The values for the property that satisfies the dependency, or null if the dependency is satisfied by the presence of any value for the associated property name")
    public List<String> getDependentValues() {
        return dependentValues;
    }

    public void setDependentValues(List<String> dependentValues) {
        this.dependentValues = dependentValues;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyDependencyDTO propertyDependencyDTO = (PropertyDependencyDTO) o;
        return Objects.equals(this.propertyName, propertyDependencyDTO.propertyName) &&
                Objects.equals(this.dependentValues, propertyDependencyDTO.dependentValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyName, dependentValues);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyDependencyDTO {\n");

        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
        sb.append("    dependentValues: ").append(toIndentedString(dependentValues)).append("\n");
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

