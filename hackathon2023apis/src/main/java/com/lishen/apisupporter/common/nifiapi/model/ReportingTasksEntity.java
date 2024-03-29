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
 * ReportingTasksEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ReportingTasksEntity {
    @SerializedName("reportingTasks")
    private List<ReportingTaskEntity> reportingTasks = null;

    public ReportingTasksEntity reportingTasks(List<ReportingTaskEntity> reportingTasks) {
        this.reportingTasks = reportingTasks;
        return this;
    }

    public ReportingTasksEntity addReportingTasksItem(ReportingTaskEntity reportingTasksItem) {
        if (this.reportingTasks == null) {
            this.reportingTasks = new ArrayList<ReportingTaskEntity>();
        }
        this.reportingTasks.add(reportingTasksItem);
        return this;
    }

    /**
     * Get reportingTasks
     *
     * @return reportingTasks
     **/
    @ApiModelProperty(value = "")
    public List<ReportingTaskEntity> getReportingTasks() {
        return reportingTasks;
    }

    public void setReportingTasks(List<ReportingTaskEntity> reportingTasks) {
        this.reportingTasks = reportingTasks;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportingTasksEntity reportingTasksEntity = (ReportingTasksEntity) o;
        return Objects.equals(this.reportingTasks, reportingTasksEntity.reportingTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportingTasks);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportingTasksEntity {\n");

        sb.append("    reportingTasks: ").append(toIndentedString(reportingTasks)).append("\n");
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

