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
 * ClusterDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ClusterDTO {
    @SerializedName("nodes")
    private List<NodeDTO> nodes = null;

    @SerializedName("generated")
    private String generated = null;

    public ClusterDTO nodes(List<NodeDTO> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ClusterDTO addNodesItem(NodeDTO nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<NodeDTO>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    /**
     * The collection of nodes that are part of the cluster.
     *
     * @return nodes
     **/
    @ApiModelProperty(value = "The collection of nodes that are part of the cluster.")
    public List<NodeDTO> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeDTO> nodes) {
        this.nodes = nodes;
    }

    public ClusterDTO generated(String generated) {
        this.generated = generated;
        return this;
    }

    /**
     * The timestamp the report was generated.
     *
     * @return generated
     **/
    @ApiModelProperty(value = "The timestamp the report was generated.")
    public String getGenerated() {
        return generated;
    }

    public void setGenerated(String generated) {
        this.generated = generated;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterDTO clusterDTO = (ClusterDTO) o;
        return Objects.equals(this.nodes, clusterDTO.nodes) &&
                Objects.equals(this.generated, clusterDTO.generated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, generated);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterDTO {\n");

        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
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

