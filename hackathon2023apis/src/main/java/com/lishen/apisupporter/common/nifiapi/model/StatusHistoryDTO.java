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

import java.util.*;

/**
 * StatusHistoryDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class StatusHistoryDTO {
    @SerializedName("generated")
    private String generated = null;

    @SerializedName("componentDetails")
    private Map<String, String> componentDetails = null;

    @SerializedName("fieldDescriptors")
    private List<StatusDescriptorDTO> fieldDescriptors = null;

    @SerializedName("aggregateSnapshots")
    private List<StatusSnapshotDTO> aggregateSnapshots = null;

    @SerializedName("nodeSnapshots")
    private List<NodeStatusSnapshotsDTO> nodeSnapshots = null;

    public StatusHistoryDTO generated(String generated) {
        this.generated = generated;
        return this;
    }

    /**
     * When the status history was generated.
     *
     * @return generated
     **/
    @ApiModelProperty(value = "When the status history was generated.")
    public String getGenerated() {
        return generated;
    }

    public void setGenerated(String generated) {
        this.generated = generated;
    }

    public StatusHistoryDTO componentDetails(Map<String, String> componentDetails) {
        this.componentDetails = componentDetails;
        return this;
    }

    public StatusHistoryDTO putComponentDetailsItem(String key, String componentDetailsItem) {
        if (this.componentDetails == null) {
            this.componentDetails = new HashMap<String, String>();
        }
        this.componentDetails.put(key, componentDetailsItem);
        return this;
    }

    /**
     * A Map of key/value pairs that describe the component that the status history belongs to
     *
     * @return componentDetails
     **/
    @ApiModelProperty(value = "A Map of key/value pairs that describe the component that the status history belongs to")
    public Map<String, String> getComponentDetails() {
        return componentDetails;
    }

    public void setComponentDetails(Map<String, String> componentDetails) {
        this.componentDetails = componentDetails;
    }

    public StatusHistoryDTO fieldDescriptors(List<StatusDescriptorDTO> fieldDescriptors) {
        this.fieldDescriptors = fieldDescriptors;
        return this;
    }

    public StatusHistoryDTO addFieldDescriptorsItem(StatusDescriptorDTO fieldDescriptorsItem) {
        if (this.fieldDescriptors == null) {
            this.fieldDescriptors = new ArrayList<StatusDescriptorDTO>();
        }
        this.fieldDescriptors.add(fieldDescriptorsItem);
        return this;
    }

    /**
     * The Descriptors that provide information on each of the metrics provided in the status history
     *
     * @return fieldDescriptors
     **/
    @ApiModelProperty(value = "The Descriptors that provide information on each of the metrics provided in the status history")
    public List<StatusDescriptorDTO> getFieldDescriptors() {
        return fieldDescriptors;
    }

    public void setFieldDescriptors(List<StatusDescriptorDTO> fieldDescriptors) {
        this.fieldDescriptors = fieldDescriptors;
    }

    public StatusHistoryDTO aggregateSnapshots(List<StatusSnapshotDTO> aggregateSnapshots) {
        this.aggregateSnapshots = aggregateSnapshots;
        return this;
    }

    public StatusHistoryDTO addAggregateSnapshotsItem(StatusSnapshotDTO aggregateSnapshotsItem) {
        if (this.aggregateSnapshots == null) {
            this.aggregateSnapshots = new ArrayList<StatusSnapshotDTO>();
        }
        this.aggregateSnapshots.add(aggregateSnapshotsItem);
        return this;
    }

    /**
     * A list of StatusSnapshotDTO objects that provide the actual metric values for the component. If the NiFi instance is clustered, this will represent the aggregate status across all nodes. If the NiFi instance is not clustered, this will represent the status of the entire NiFi instance.
     *
     * @return aggregateSnapshots
     **/
    @ApiModelProperty(value = "A list of StatusSnapshotDTO objects that provide the actual metric values for the component. If the NiFi instance is clustered, this will represent the aggregate status across all nodes. If the NiFi instance is not clustered, this will represent the status of the entire NiFi instance.")
    public List<StatusSnapshotDTO> getAggregateSnapshots() {
        return aggregateSnapshots;
    }

    public void setAggregateSnapshots(List<StatusSnapshotDTO> aggregateSnapshots) {
        this.aggregateSnapshots = aggregateSnapshots;
    }

    public StatusHistoryDTO nodeSnapshots(List<NodeStatusSnapshotsDTO> nodeSnapshots) {
        this.nodeSnapshots = nodeSnapshots;
        return this;
    }

    public StatusHistoryDTO addNodeSnapshotsItem(NodeStatusSnapshotsDTO nodeSnapshotsItem) {
        if (this.nodeSnapshots == null) {
            this.nodeSnapshots = new ArrayList<NodeStatusSnapshotsDTO>();
        }
        this.nodeSnapshots.add(nodeSnapshotsItem);
        return this;
    }

    /**
     * The NodeStatusSnapshotsDTO objects that provide the actual metric values for the component, for each node. If the NiFi instance is not clustered, this value will be null.
     *
     * @return nodeSnapshots
     **/
    @ApiModelProperty(value = "The NodeStatusSnapshotsDTO objects that provide the actual metric values for the component, for each node. If the NiFi instance is not clustered, this value will be null.")
    public List<NodeStatusSnapshotsDTO> getNodeSnapshots() {
        return nodeSnapshots;
    }

    public void setNodeSnapshots(List<NodeStatusSnapshotsDTO> nodeSnapshots) {
        this.nodeSnapshots = nodeSnapshots;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatusHistoryDTO statusHistoryDTO = (StatusHistoryDTO) o;
        return Objects.equals(this.generated, statusHistoryDTO.generated) &&
                Objects.equals(this.componentDetails, statusHistoryDTO.componentDetails) &&
                Objects.equals(this.fieldDescriptors, statusHistoryDTO.fieldDescriptors) &&
                Objects.equals(this.aggregateSnapshots, statusHistoryDTO.aggregateSnapshots) &&
                Objects.equals(this.nodeSnapshots, statusHistoryDTO.nodeSnapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generated, componentDetails, fieldDescriptors, aggregateSnapshots, nodeSnapshots);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusHistoryDTO {\n");

        sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
        sb.append("    componentDetails: ").append(toIndentedString(componentDetails)).append("\n");
        sb.append("    fieldDescriptors: ").append(toIndentedString(fieldDescriptors)).append("\n");
        sb.append("    aggregateSnapshots: ").append(toIndentedString(aggregateSnapshots)).append("\n");
        sb.append("    nodeSnapshots: ").append(toIndentedString(nodeSnapshots)).append("\n");
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

