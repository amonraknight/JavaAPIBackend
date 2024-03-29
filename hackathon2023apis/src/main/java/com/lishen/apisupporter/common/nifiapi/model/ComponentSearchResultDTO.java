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
 * ComponentSearchResultDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ComponentSearchResultDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("groupId")
    private String groupId = null;

    @SerializedName("parentGroup")
    private SearchResultGroupDTO parentGroup = null;

    @SerializedName("versionedGroup")
    private SearchResultGroupDTO versionedGroup = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("matches")
    private List<String> matches = null;

    public ComponentSearchResultDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the component that matched the search.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The id of the component that matched the search.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComponentSearchResultDTO groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * The group id of the component that matched the search.
     *
     * @return groupId
     **/
    @ApiModelProperty(value = "The group id of the component that matched the search.")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ComponentSearchResultDTO parentGroup(SearchResultGroupDTO parentGroup) {
        this.parentGroup = parentGroup;
        return this;
    }

    /**
     * The parent group of the component that matched the search.
     *
     * @return parentGroup
     **/
    @ApiModelProperty(value = "The parent group of the component that matched the search.")
    public SearchResultGroupDTO getParentGroup() {
        return parentGroup;
    }

    public void setParentGroup(SearchResultGroupDTO parentGroup) {
        this.parentGroup = parentGroup;
    }

    public ComponentSearchResultDTO versionedGroup(SearchResultGroupDTO versionedGroup) {
        this.versionedGroup = versionedGroup;
        return this;
    }

    /**
     * The nearest versioned ancestor group of the component that matched the search.
     *
     * @return versionedGroup
     **/
    @ApiModelProperty(value = "The nearest versioned ancestor group of the component that matched the search.")
    public SearchResultGroupDTO getVersionedGroup() {
        return versionedGroup;
    }

    public void setVersionedGroup(SearchResultGroupDTO versionedGroup) {
        this.versionedGroup = versionedGroup;
    }

    public ComponentSearchResultDTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the component that matched the search.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the component that matched the search.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentSearchResultDTO matches(List<String> matches) {
        this.matches = matches;
        return this;
    }

    public ComponentSearchResultDTO addMatchesItem(String matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<String>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    /**
     * What matched the search from the component.
     *
     * @return matches
     **/
    @ApiModelProperty(value = "What matched the search from the component.")
    public List<String> getMatches() {
        return matches;
    }

    public void setMatches(List<String> matches) {
        this.matches = matches;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentSearchResultDTO componentSearchResultDTO = (ComponentSearchResultDTO) o;
        return Objects.equals(this.id, componentSearchResultDTO.id) &&
                Objects.equals(this.groupId, componentSearchResultDTO.groupId) &&
                Objects.equals(this.parentGroup, componentSearchResultDTO.parentGroup) &&
                Objects.equals(this.versionedGroup, componentSearchResultDTO.versionedGroup) &&
                Objects.equals(this.name, componentSearchResultDTO.name) &&
                Objects.equals(this.matches, componentSearchResultDTO.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupId, parentGroup, versionedGroup, name, matches);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentSearchResultDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    parentGroup: ").append(toIndentedString(parentGroup)).append("\n");
        sb.append("    versionedGroup: ").append(toIndentedString(versionedGroup)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

