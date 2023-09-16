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
 * VariableRegistryDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class VariableRegistryDTO {
    @SerializedName("variables")
    private List<VariableEntity> variables = null;

    @SerializedName("processGroupId")
    private String processGroupId = null;

    public VariableRegistryDTO variables(List<VariableEntity> variables) {
        this.variables = variables;
        return this;
    }

    public VariableRegistryDTO addVariablesItem(VariableEntity variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<VariableEntity>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    /**
     * The variables that are available in this Variable Registry
     *
     * @return variables
     **/
    @ApiModelProperty(value = "The variables that are available in this Variable Registry")
    public List<VariableEntity> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableEntity> variables) {
        this.variables = variables;
    }

    public VariableRegistryDTO processGroupId(String processGroupId) {
        this.processGroupId = processGroupId;
        return this;
    }

    /**
     * The UUID of the Process Group that this Variable Registry belongs to
     *
     * @return processGroupId
     **/
    @ApiModelProperty(value = "The UUID of the Process Group that this Variable Registry belongs to")
    public String getProcessGroupId() {
        return processGroupId;
    }

    public void setProcessGroupId(String processGroupId) {
        this.processGroupId = processGroupId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VariableRegistryDTO variableRegistryDTO = (VariableRegistryDTO) o;
        return Objects.equals(this.variables, variableRegistryDTO.variables) &&
                Objects.equals(this.processGroupId, variableRegistryDTO.processGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variables, processGroupId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableRegistryDTO {\n");

        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    processGroupId: ").append(toIndentedString(processGroupId)).append("\n");
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

