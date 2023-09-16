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
 * ConnectionStatusEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ConnectionStatusEntity {
    @SerializedName("connectionStatus")
    private ConnectionStatusDTO connectionStatus = null;

    @SerializedName("canRead")
    private Boolean canRead = null;

    public ConnectionStatusEntity connectionStatus(ConnectionStatusDTO connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }

    /**
     * Get connectionStatus
     *
     * @return connectionStatus
     **/
    @ApiModelProperty(value = "")
    public ConnectionStatusDTO getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(ConnectionStatusDTO connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public ConnectionStatusEntity canRead(Boolean canRead) {
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
        ConnectionStatusEntity connectionStatusEntity = (ConnectionStatusEntity) o;
        return Objects.equals(this.connectionStatus, connectionStatusEntity.connectionStatus) &&
                Objects.equals(this.canRead, connectionStatusEntity.canRead);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionStatus, canRead);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionStatusEntity {\n");

        sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
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

