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
 * JVMFlowDiagnosticsSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class JVMFlowDiagnosticsSnapshotDTO {
    @SerializedName("uptime")
    private String uptime = null;

    @SerializedName("timeZone")
    private String timeZone = null;

    @SerializedName("activeTimerDrivenThreads")
    private Integer activeTimerDrivenThreads = null;

    @SerializedName("activeEventDrivenThreads")
    private Integer activeEventDrivenThreads = null;

    @SerializedName("bundlesLoaded")
    private List<BundleDTO> bundlesLoaded = null;

    public JVMFlowDiagnosticsSnapshotDTO uptime(String uptime) {
        this.uptime = uptime;
        return this;
    }

    /**
     * How long this node has been running, formatted as hours:minutes:seconds.milliseconds
     *
     * @return uptime
     **/
    @ApiModelProperty(value = "How long this node has been running, formatted as hours:minutes:seconds.milliseconds")
    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public JVMFlowDiagnosticsSnapshotDTO timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * The name of the Time Zone that is configured, if available
     *
     * @return timeZone
     **/
    @ApiModelProperty(value = "The name of the Time Zone that is configured, if available")
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public JVMFlowDiagnosticsSnapshotDTO activeTimerDrivenThreads(Integer activeTimerDrivenThreads) {
        this.activeTimerDrivenThreads = activeTimerDrivenThreads;
        return this;
    }

    /**
     * The number of timer-driven threads that are active
     *
     * @return activeTimerDrivenThreads
     **/
    @ApiModelProperty(value = "The number of timer-driven threads that are active")
    public Integer getActiveTimerDrivenThreads() {
        return activeTimerDrivenThreads;
    }

    public void setActiveTimerDrivenThreads(Integer activeTimerDrivenThreads) {
        this.activeTimerDrivenThreads = activeTimerDrivenThreads;
    }

    public JVMFlowDiagnosticsSnapshotDTO activeEventDrivenThreads(Integer activeEventDrivenThreads) {
        this.activeEventDrivenThreads = activeEventDrivenThreads;
        return this;
    }

    /**
     * The number of event-driven threads that are active
     *
     * @return activeEventDrivenThreads
     **/
    @ApiModelProperty(value = "The number of event-driven threads that are active")
    public Integer getActiveEventDrivenThreads() {
        return activeEventDrivenThreads;
    }

    public void setActiveEventDrivenThreads(Integer activeEventDrivenThreads) {
        this.activeEventDrivenThreads = activeEventDrivenThreads;
    }

    public JVMFlowDiagnosticsSnapshotDTO bundlesLoaded(List<BundleDTO> bundlesLoaded) {
        this.bundlesLoaded = bundlesLoaded;
        return this;
    }

    public JVMFlowDiagnosticsSnapshotDTO addBundlesLoadedItem(BundleDTO bundlesLoadedItem) {
        if (this.bundlesLoaded == null) {
            this.bundlesLoaded = new ArrayList<BundleDTO>();
        }
        this.bundlesLoaded.add(bundlesLoadedItem);
        return this;
    }

    /**
     * The NiFi Bundles (NARs) that are loaded by NiFi
     *
     * @return bundlesLoaded
     **/
    @ApiModelProperty(value = "The NiFi Bundles (NARs) that are loaded by NiFi")
    public List<BundleDTO> getBundlesLoaded() {
        return bundlesLoaded;
    }

    public void setBundlesLoaded(List<BundleDTO> bundlesLoaded) {
        this.bundlesLoaded = bundlesLoaded;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JVMFlowDiagnosticsSnapshotDTO jvMFlowDiagnosticsSnapshotDTO = (JVMFlowDiagnosticsSnapshotDTO) o;
        return Objects.equals(this.uptime, jvMFlowDiagnosticsSnapshotDTO.uptime) &&
                Objects.equals(this.timeZone, jvMFlowDiagnosticsSnapshotDTO.timeZone) &&
                Objects.equals(this.activeTimerDrivenThreads, jvMFlowDiagnosticsSnapshotDTO.activeTimerDrivenThreads) &&
                Objects.equals(this.activeEventDrivenThreads, jvMFlowDiagnosticsSnapshotDTO.activeEventDrivenThreads) &&
                Objects.equals(this.bundlesLoaded, jvMFlowDiagnosticsSnapshotDTO.bundlesLoaded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uptime, timeZone, activeTimerDrivenThreads, activeEventDrivenThreads, bundlesLoaded);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JVMFlowDiagnosticsSnapshotDTO {\n");

        sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    activeTimerDrivenThreads: ").append(toIndentedString(activeTimerDrivenThreads)).append("\n");
        sb.append("    activeEventDrivenThreads: ").append(toIndentedString(activeEventDrivenThreads)).append("\n");
        sb.append("    bundlesLoaded: ").append(toIndentedString(bundlesLoaded)).append("\n");
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
