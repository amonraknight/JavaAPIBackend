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
 * ConnectionsEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ConnectionsEntity {
    @SerializedName("connections")
    private List<ConnectionEntity> connections = null;

    public ConnectionsEntity connections(List<ConnectionEntity> connections) {
        this.connections = connections;
        return this;
    }

    public ConnectionsEntity addConnectionsItem(ConnectionEntity connectionsItem) {
        if (this.connections == null) {
            this.connections = new ArrayList<ConnectionEntity>();
        }
        this.connections.add(connectionsItem);
        return this;
    }

    /**
     * Get connections
     *
     * @return connections
     **/
    @ApiModelProperty(value = "")
    public List<ConnectionEntity> getConnections() {
        return connections;
    }

    public void setConnections(List<ConnectionEntity> connections) {
        this.connections = connections;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectionsEntity connectionsEntity = (ConnectionsEntity) o;
        return Objects.equals(this.connections, connectionsEntity.connections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connections);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionsEntity {\n");

        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
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

