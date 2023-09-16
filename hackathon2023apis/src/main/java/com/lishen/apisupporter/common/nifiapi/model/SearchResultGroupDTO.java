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
 * SearchResultGroupDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class SearchResultGroupDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("name")
    private String name = null;

    public SearchResultGroupDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the group.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "The id of the group.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SearchResultGroupDTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the group.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the group.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchResultGroupDTO searchResultGroupDTO = (SearchResultGroupDTO) o;
        return Objects.equals(this.id, searchResultGroupDTO.id) &&
                Objects.equals(this.name, searchResultGroupDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResultGroupDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

