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
 * PermissionsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class PermissionsDTO {
    @SerializedName("canRead")
    private Boolean canRead = null;

    @SerializedName("canWrite")
    private Boolean canWrite = null;

    public PermissionsDTO canRead(Boolean canRead) {
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

    public PermissionsDTO canWrite(Boolean canWrite) {
        this.canWrite = canWrite;
        return this;
    }

    /**
     * Indicates whether the user can write a given resource.
     *
     * @return canWrite
     **/
    @ApiModelProperty(value = "Indicates whether the user can write a given resource.")
    public Boolean isCanWrite() {
        return canWrite;
    }

    public void setCanWrite(Boolean canWrite) {
        this.canWrite = canWrite;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionsDTO permissionsDTO = (PermissionsDTO) o;
        return Objects.equals(this.canRead, permissionsDTO.canRead) &&
                Objects.equals(this.canWrite, permissionsDTO.canWrite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canRead, canWrite);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionsDTO {\n");

        sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
        sb.append("    canWrite: ").append(toIndentedString(canWrite)).append("\n");
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

