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
 * JVMDiagnosticsSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class JVMDiagnosticsSnapshotDTO {
    @SerializedName("systemDiagnosticsDto")
    private JVMSystemDiagnosticsSnapshotDTO systemDiagnosticsDto = null;

    @SerializedName("flowDiagnosticsDto")
    private JVMFlowDiagnosticsSnapshotDTO flowDiagnosticsDto = null;

    @SerializedName("controllerDiagnostics")
    private JVMControllerDiagnosticsSnapshotDTO controllerDiagnostics = null;

    public JVMDiagnosticsSnapshotDTO systemDiagnosticsDto(JVMSystemDiagnosticsSnapshotDTO systemDiagnosticsDto) {
        this.systemDiagnosticsDto = systemDiagnosticsDto;
        return this;
    }

    /**
     * System-related diagnostics information
     *
     * @return systemDiagnosticsDto
     **/
    @ApiModelProperty(value = "System-related diagnostics information")
    public JVMSystemDiagnosticsSnapshotDTO getSystemDiagnosticsDto() {
        return systemDiagnosticsDto;
    }

    public void setSystemDiagnosticsDto(JVMSystemDiagnosticsSnapshotDTO systemDiagnosticsDto) {
        this.systemDiagnosticsDto = systemDiagnosticsDto;
    }

    public JVMDiagnosticsSnapshotDTO flowDiagnosticsDto(JVMFlowDiagnosticsSnapshotDTO flowDiagnosticsDto) {
        this.flowDiagnosticsDto = flowDiagnosticsDto;
        return this;
    }

    /**
     * Flow-related diagnostics information
     *
     * @return flowDiagnosticsDto
     **/
    @ApiModelProperty(value = "Flow-related diagnostics information")
    public JVMFlowDiagnosticsSnapshotDTO getFlowDiagnosticsDto() {
        return flowDiagnosticsDto;
    }

    public void setFlowDiagnosticsDto(JVMFlowDiagnosticsSnapshotDTO flowDiagnosticsDto) {
        this.flowDiagnosticsDto = flowDiagnosticsDto;
    }

    public JVMDiagnosticsSnapshotDTO controllerDiagnostics(JVMControllerDiagnosticsSnapshotDTO controllerDiagnostics) {
        this.controllerDiagnostics = controllerDiagnostics;
        return this;
    }

    /**
     * Controller-related diagnostics information
     *
     * @return controllerDiagnostics
     **/
    @ApiModelProperty(value = "Controller-related diagnostics information")
    public JVMControllerDiagnosticsSnapshotDTO getControllerDiagnostics() {
        return controllerDiagnostics;
    }

    public void setControllerDiagnostics(JVMControllerDiagnosticsSnapshotDTO controllerDiagnostics) {
        this.controllerDiagnostics = controllerDiagnostics;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JVMDiagnosticsSnapshotDTO jvMDiagnosticsSnapshotDTO = (JVMDiagnosticsSnapshotDTO) o;
        return Objects.equals(this.systemDiagnosticsDto, jvMDiagnosticsSnapshotDTO.systemDiagnosticsDto) &&
                Objects.equals(this.flowDiagnosticsDto, jvMDiagnosticsSnapshotDTO.flowDiagnosticsDto) &&
                Objects.equals(this.controllerDiagnostics, jvMDiagnosticsSnapshotDTO.controllerDiagnostics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemDiagnosticsDto, flowDiagnosticsDto, controllerDiagnostics);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JVMDiagnosticsSnapshotDTO {\n");

        sb.append("    systemDiagnosticsDto: ").append(toIndentedString(systemDiagnosticsDto)).append("\n");
        sb.append("    flowDiagnosticsDto: ").append(toIndentedString(flowDiagnosticsDto)).append("\n");
        sb.append("    controllerDiagnostics: ").append(toIndentedString(controllerDiagnostics)).append("\n");
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

