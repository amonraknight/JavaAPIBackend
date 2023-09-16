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
 * ConnectionStatusSnapshotEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ConnectionStatusSnapshotEntity {
    @SerializedName("id")
    private String id = null;

    @SerializedName("connectionStatusSnapshot")
    private ConnectionStatusSnapshotDTO connectionStatusSnapshot = null;

    @SerializedName("canRead")
    private Boolean canRead = null;

    public ConnectionStatusSnapshotEntity id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the connection.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The id of the connection.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConnectionStatusSnapshotEntity connectionStatusSnapshot(ConnectionStatusSnapshotDTO connectionStatusSnapshot) {
        this.connectionStatusSnapshot = connectionStatusSnapshot;
        return this;
    }

    /**
     * Get connectionStatusSnapshot
     *
     * @return connectionStatusSnapshot
     **/
    @ApiModelProperty(value = "")
    public ConnectionStatusSnapshotDTO getConnectionStatusSnapshot() {
        return connectionStatusSnapshot;
    }

    public void setConnectionStatusSnapshot(ConnectionStatusSnapshotDTO connectionStatusSnapshot) {
        this.connectionStatusSnapshot = connectionStatusSnapshot;
    }

    public ConnectionStatusSnapshotEntity canRead(Boolean canRead) {
        this.canRead = canRead;
        return this;
    }

    /**
     * Indicates whether the user can read a given resource.
     *
     * @return canRead
     **/
    @ApiModelProperty(value = "Indicates whether the user can read a given resource.")
    public Boolean isCanRead() {
        return canRead;
    }

    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectionStatusSnapshotEntity connectionStatusSnapshotEntity = (ConnectionStatusSnapshotEntity) o;
        return Objects.equals(this.id, connectionStatusSnapshotEntity.id) &&
                Objects.equals(this.connectionStatusSnapshot, connectionStatusSnapshotEntity.connectionStatusSnapshot) &&
                Objects.equals(this.canRead, connectionStatusSnapshotEntity.canRead);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, connectionStatusSnapshot, canRead);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionStatusSnapshotEntity {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    connectionStatusSnapshot: ").append(toIndentedString(connectionStatusSnapshot)).append("\n");
        sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
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

