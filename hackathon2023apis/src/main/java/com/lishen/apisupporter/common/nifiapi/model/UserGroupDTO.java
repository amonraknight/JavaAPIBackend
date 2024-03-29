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
 * UserGroupDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class UserGroupDTO {
    @SerializedName("id")
    private String id = null;

    @SerializedName("versionedComponentId")
    private String versionedComponentId = null;

    @SerializedName("parentGroupId")
    private String parentGroupId = null;

    @SerializedName("position")
    private PositionDTO position = null;

    @SerializedName("identity")
    private String identity = null;

    @SerializedName("configurable")
    private Boolean configurable = null;

    @SerializedName("users")
    private List<TenantEntity> users = null;

    @SerializedName("accessPolicies")
    private List<AccessPolicyEntity> accessPolicies = null;

    public UserGroupDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the component.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The id of the component.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserGroupDTO versionedComponentId(String versionedComponentId) {
        this.versionedComponentId = versionedComponentId;
        return this;
    }

    /**
     * The ID of the corresponding component that is under version control
     *
     * @return versionedComponentId
     **/
    @ApiModelProperty(value = "The ID of the corresponding component that is under version control")
    public String getVersionedComponentId() {
        return versionedComponentId;
    }

    public void setVersionedComponentId(String versionedComponentId) {
        this.versionedComponentId = versionedComponentId;
    }

    public UserGroupDTO parentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }

    /**
     * The id of parent process group of this component if applicable.
     *
     * @return parentGroupId
     **/
    @ApiModelProperty(value = "The id of parent process group of this component if applicable.")
    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public UserGroupDTO position(PositionDTO position) {
        this.position = position;
        return this;
    }

    /**
     * The position of this component in the UI if applicable.
     *
     * @return position
     **/
    @ApiModelProperty(value = "The position of this component in the UI if applicable.")
    public PositionDTO getPosition() {
        return position;
    }

    public void setPosition(PositionDTO position) {
        this.position = position;
    }

    public UserGroupDTO identity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * The identity of the tenant.
     *
     * @return identity
     **/
    @ApiModelProperty(value = "The identity of the tenant.")
    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public UserGroupDTO configurable(Boolean configurable) {
        this.configurable = configurable;
        return this;
    }

    /**
     * Whether this tenant is configurable.
     *
     * @return configurable
     **/
    @ApiModelProperty(value = "Whether this tenant is configurable.")
    public Boolean isConfigurable() {
        return configurable;
    }

    public void setConfigurable(Boolean configurable) {
        this.configurable = configurable;
    }

    public UserGroupDTO users(List<TenantEntity> users) {
        this.users = users;
        return this;
    }

    public UserGroupDTO addUsersItem(TenantEntity usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<TenantEntity>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * The users that belong to the user group.
     *
     * @return users
     **/
    @ApiModelProperty(value = "The users that belong to the user group.")
    public List<TenantEntity> getUsers() {
        return users;
    }

    public void setUsers(List<TenantEntity> users) {
        this.users = users;
    }

    public UserGroupDTO accessPolicies(List<AccessPolicyEntity> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    public UserGroupDTO addAccessPoliciesItem(AccessPolicyEntity accessPoliciesItem) {
        if (this.accessPolicies == null) {
            this.accessPolicies = new ArrayList<AccessPolicyEntity>();
        }
        this.accessPolicies.add(accessPoliciesItem);
        return this;
    }

    /**
     * The access policies this user group belongs to. This field was incorrectly defined as an AccessPolicyEntity. For compatibility reasons the field will remain of this type, however only the fields that are present in the AccessPolicySummaryEntity will be populated here.
     *
     * @return accessPolicies
     **/
    @ApiModelProperty(value = "The access policies this user group belongs to. This field was incorrectly defined as an AccessPolicyEntity. For compatibility reasons the field will remain of this type, however only the fields that are present in the AccessPolicySummaryEntity will be populated here.")
    public List<AccessPolicyEntity> getAccessPolicies() {
        return accessPolicies;
    }

    public void setAccessPolicies(List<AccessPolicyEntity> accessPolicies) {
        this.accessPolicies = accessPolicies;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserGroupDTO userGroupDTO = (UserGroupDTO) o;
        return Objects.equals(this.id, userGroupDTO.id) &&
                Objects.equals(this.versionedComponentId, userGroupDTO.versionedComponentId) &&
                Objects.equals(this.parentGroupId, userGroupDTO.parentGroupId) &&
                Objects.equals(this.position, userGroupDTO.position) &&
                Objects.equals(this.identity, userGroupDTO.identity) &&
                Objects.equals(this.configurable, userGroupDTO.configurable) &&
                Objects.equals(this.users, userGroupDTO.users) &&
                Objects.equals(this.accessPolicies, userGroupDTO.accessPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, versionedComponentId, parentGroupId, position, identity, configurable, users, accessPolicies);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserGroupDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
        sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
        sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    accessPolicies: ").append(toIndentedString(accessPolicies)).append("\n");
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

