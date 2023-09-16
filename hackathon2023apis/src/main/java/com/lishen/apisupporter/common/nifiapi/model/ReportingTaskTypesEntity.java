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
 * ReportingTaskTypesEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ReportingTaskTypesEntity {
    @SerializedName("reportingTaskTypes")
    private List<DocumentedTypeDTO> reportingTaskTypes = null;

    public ReportingTaskTypesEntity reportingTaskTypes(List<DocumentedTypeDTO> reportingTaskTypes) {
        this.reportingTaskTypes = reportingTaskTypes;
        return this;
    }

    public ReportingTaskTypesEntity addReportingTaskTypesItem(DocumentedTypeDTO reportingTaskTypesItem) {
        if (this.reportingTaskTypes == null) {
            this.reportingTaskTypes = new ArrayList<DocumentedTypeDTO>();
        }
        this.reportingTaskTypes.add(reportingTaskTypesItem);
        return this;
    }

    /**
     * Get reportingTaskTypes
     *
     * @return reportingTaskTypes
     **/
    @ApiModelProperty(value = "")
    public List<DocumentedTypeDTO> getReportingTaskTypes() {
        return reportingTaskTypes;
    }

    public void setReportingTaskTypes(List<DocumentedTypeDTO> reportingTaskTypes) {
        this.reportingTaskTypes = reportingTaskTypes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportingTaskTypesEntity reportingTaskTypesEntity = (ReportingTaskTypesEntity) o;
        return Objects.equals(this.reportingTaskTypes, reportingTaskTypesEntity.reportingTaskTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportingTaskTypes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportingTaskTypesEntity {\n");

        sb.append("    reportingTaskTypes: ").append(toIndentedString(reportingTaskTypes)).append("\n");
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

