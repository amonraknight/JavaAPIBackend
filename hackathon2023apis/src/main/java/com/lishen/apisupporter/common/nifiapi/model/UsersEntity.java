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
 * UsersEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class UsersEntity {
    @SerializedName("generated")
    private String generated = null;

    @SerializedName("users")
    private List<UserEntity> users = null;

    public UsersEntity generated(String generated) {
        this.generated = generated;
        return this;
    }

    /**
     * When this content was generated.
     *
     * @return generated
     **/
    @ApiModelProperty(value = "When this content was generated.")
    public String getGenerated() {
        return generated;
    }

    public void setGenerated(String generated) {
        this.generated = generated;
    }

    public UsersEntity users(List<UserEntity> users) {
        this.users = users;
        return this;
    }

    public UsersEntity addUsersItem(UserEntity usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<UserEntity>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * Get users
     *
     * @return users
     **/
    @ApiModelProperty(value = "")
    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsersEntity usersEntity = (UsersEntity) o;
        return Objects.equals(this.generated, usersEntity.generated) &&
                Objects.equals(this.users, usersEntity.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generated, users);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersEntity {\n");

        sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

