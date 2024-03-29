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
 * FlowSnippetDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class FlowSnippetDTO {
    @SerializedName("processGroups")
    private List<ProcessGroupDTO> processGroups = null;

    @SerializedName("remoteProcessGroups")
    private List<RemoteProcessGroupDTO> remoteProcessGroups = null;

    @SerializedName("processors")
    private List<ProcessorDTO> processors = null;

    @SerializedName("inputPorts")
    private List<PortDTO> inputPorts = null;

    @SerializedName("outputPorts")
    private List<PortDTO> outputPorts = null;

    @SerializedName("connections")
    private List<ConnectionDTO> connections = null;

    @SerializedName("labels")
    private List<LabelDTO> labels = null;

    @SerializedName("funnels")
    private List<FunnelDTO> funnels = null;

    @SerializedName("controllerServices")
    private List<ControllerServiceDTO> controllerServices = null;

    public FlowSnippetDTO processGroups(List<ProcessGroupDTO> processGroups) {
        this.processGroups = processGroups;
        return this;
    }

    public FlowSnippetDTO addProcessGroupsItem(ProcessGroupDTO processGroupsItem) {
        if (this.processGroups == null) {
            this.processGroups = new ArrayList<ProcessGroupDTO>();
        }
        this.processGroups.add(processGroupsItem);
        return this;
    }

    /**
     * The process groups in this flow snippet.
     *
     * @return processGroups
     **/
    @ApiModelProperty(value = "The process groups in this flow snippet.")
    public List<ProcessGroupDTO> getProcessGroups() {
        return processGroups;
    }

    public void setProcessGroups(List<ProcessGroupDTO> processGroups) {
        this.processGroups = processGroups;
    }

    public FlowSnippetDTO remoteProcessGroups(List<RemoteProcessGroupDTO> remoteProcessGroups) {
        this.remoteProcessGroups = remoteProcessGroups;
        return this;
    }

    public FlowSnippetDTO addRemoteProcessGroupsItem(RemoteProcessGroupDTO remoteProcessGroupsItem) {
        if (this.remoteProcessGroups == null) {
            this.remoteProcessGroups = new ArrayList<RemoteProcessGroupDTO>();
        }
        this.remoteProcessGroups.add(remoteProcessGroupsItem);
        return this;
    }

    /**
     * The remote process groups in this flow snippet.
     *
     * @return remoteProcessGroups
     **/
    @ApiModelProperty(value = "The remote process groups in this flow snippet.")
    public List<RemoteProcessGroupDTO> getRemoteProcessGroups() {
        return remoteProcessGroups;
    }

    public void setRemoteProcessGroups(List<RemoteProcessGroupDTO> remoteProcessGroups) {
        this.remoteProcessGroups = remoteProcessGroups;
    }

    public FlowSnippetDTO processors(List<ProcessorDTO> processors) {
        this.processors = processors;
        return this;
    }

    public FlowSnippetDTO addProcessorsItem(ProcessorDTO processorsItem) {
        if (this.processors == null) {
            this.processors = new ArrayList<ProcessorDTO>();
        }
        this.processors.add(processorsItem);
        return this;
    }

    /**
     * The processors in this flow snippet.
     *
     * @return processors
     **/
    @ApiModelProperty(value = "The processors in this flow snippet.")
    public List<ProcessorDTO> getProcessors() {
        return processors;
    }

    public void setProcessors(List<ProcessorDTO> processors) {
        this.processors = processors;
    }

    public FlowSnippetDTO inputPorts(List<PortDTO> inputPorts) {
        this.inputPorts = inputPorts;
        return this;
    }

    public FlowSnippetDTO addInputPortsItem(PortDTO inputPortsItem) {
        if (this.inputPorts == null) {
            this.inputPorts = new ArrayList<PortDTO>();
        }
        this.inputPorts.add(inputPortsItem);
        return this;
    }

    /**
     * The input ports in this flow snippet.
     *
     * @return inputPorts
     **/
    @ApiModelProperty(value = "The input ports in this flow snippet.")
    public List<PortDTO> getInputPorts() {
        return inputPorts;
    }

    public void setInputPorts(List<PortDTO> inputPorts) {
        this.inputPorts = inputPorts;
    }

    public FlowSnippetDTO outputPorts(List<PortDTO> outputPorts) {
        this.outputPorts = outputPorts;
        return this;
    }

    public FlowSnippetDTO addOutputPortsItem(PortDTO outputPortsItem) {
        if (this.outputPorts == null) {
            this.outputPorts = new ArrayList<PortDTO>();
        }
        this.outputPorts.add(outputPortsItem);
        return this;
    }

    /**
     * The output ports in this flow snippet.
     *
     * @return outputPorts
     **/
    @ApiModelProperty(value = "The output ports in this flow snippet.")
    public List<PortDTO> getOutputPorts() {
        return outputPorts;
    }

    public void setOutputPorts(List<PortDTO> outputPorts) {
        this.outputPorts = outputPorts;
    }

    public FlowSnippetDTO connections(List<ConnectionDTO> connections) {
        this.connections = connections;
        return this;
    }

    public FlowSnippetDTO addConnectionsItem(ConnectionDTO connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<ConnectionDTO>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    /**
     * The connections in this flow snippet.
     *
     * @return connections
     **/
    @ApiModelProperty(value = "The connections in this flow snippet.")
    public List<ConnectionDTO> getConnections() {
        return connections;
    }

    public void setConnections(List<ConnectionDTO> connections) {
        this.connections = connections;
    }

    public FlowSnippetDTO labels(List<LabelDTO> labels) {
        this.labels = labels;
        return this;
    }

    public FlowSnippetDTO addLabelsItem(LabelDTO labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<LabelDTO>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * The labels in this flow snippet.
     *
     * @return labels
     **/
    @ApiModelProperty(value = "The labels in this flow snippet.")
    public List<LabelDTO> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelDTO> labels) {
        this.labels = labels;
    }

    public FlowSnippetDTO funnels(List<FunnelDTO> funnels) {
        this.funnels = funnels;
        return this;
    }

    public FlowSnippetDTO addFunnelsItem(FunnelDTO funnelsItem) {
        if (this.funnels == null) {
            this.funnels = new ArrayList<FunnelDTO>();
        }
        this.funnels.add(funnelsItem);
        return this;
    }

    /**
     * The funnels in this flow snippet.
     *
     * @return funnels
     **/
    @ApiModelProperty(value = "The funnels in this flow snippet.")
    public List<FunnelDTO> getFunnels() {
        return funnels;
    }

    public void setFunnels(List<FunnelDTO> funnels) {
        this.funnels = funnels;
    }

    public FlowSnippetDTO controllerServices(List<ControllerServiceDTO> controllerServices) {
        this.controllerServices = controllerServices;
        return this;
    }

    public FlowSnippetDTO addControllerServicesItem(ControllerServiceDTO controllerServicesItem) {
        if (this.controllerServices == null) {
            this.controllerServices = new ArrayList<ControllerServiceDTO>();
        }
        this.controllerServices.add(controllerServicesItem);
        return this;
    }

    /**
     * The controller services in this flow snippet.
     *
     * @return controllerServices
     **/
    @ApiModelProperty(value = "The controller services in this flow snippet.")
    public List<ControllerServiceDTO> getControllerServices() {
        return controllerServices;
    }

    public void setControllerServices(List<ControllerServiceDTO> controllerServices) {
        this.controllerServices = controllerServices;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowSnippetDTO flowSnippetDTO = (FlowSnippetDTO) o;
        return Objects.equals(this.processGroups, flowSnippetDTO.processGroups) &&
                Objects.equals(this.remoteProcessGroups, flowSnippetDTO.remoteProcessGroups) &&
                Objects.equals(this.processors, flowSnippetDTO.processors) &&
                Objects.equals(this.inputPorts, flowSnippetDTO.inputPorts) &&
                Objects.equals(this.outputPorts, flowSnippetDTO.outputPorts) &&
                Objects.equals(this.connections, flowSnippetDTO.connections) &&
                Objects.equals(this.labels, flowSnippetDTO.labels) &&
                Objects.equals(this.funnels, flowSnippetDTO.funnels) &&
                Objects.equals(this.controllerServices, flowSnippetDTO.controllerServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processGroups, remoteProcessGroups, processors, inputPorts, outputPorts, connections, labels, funnels, controllerServices);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowSnippetDTO {\n");

        sb.append("    processGroups: ").append(toIndentedString(processGroups)).append("\n");
        sb.append("    remoteProcessGroups: ").append(toIndentedString(remoteProcessGroups)).append("\n");
        sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
        sb.append("    inputPorts: ").append(toIndentedString(inputPorts)).append("\n");
        sb.append("    outputPorts: ").append(toIndentedString(outputPorts)).append("\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    funnels: ").append(toIndentedString(funnels)).append("\n");
        sb.append("    controllerServices: ").append(toIndentedString(controllerServices)).append("\n");
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

