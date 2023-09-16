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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class Response {
    @SerializedName("metadata")
    private Map<String, List<Object>> metadata = null;

    @SerializedName("status")
    private Integer status = null;

    @SerializedName("entity")
    private Object entity = null;

    public Response metadata(Map<String, List<Object>> metadata) {
        this.metadata = metadata;
        return this;
    }

    public Response putMetadataItem(String key, List<Object> metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<String, List<Object>>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     **/
    @ApiModelProperty(value = "")
    public Map<String, List<Object>> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, List<Object>> metadata) {
        this.metadata = metadata;
    }

    public Response status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(value = "")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Response entity(Object entity) {
        this.entity = entity;
        return this;
    }

    /**
     * Get entity
     *
     * @return entity
     **/
    @ApiModelProperty(value = "")
    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Response response = (Response) o;
        return Objects.equals(this.metadata, response.metadata) &&
                Objects.equals(this.status, response.status) &&
                Objects.equals(this.entity, response.entity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, status, entity);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Response {\n");

        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

