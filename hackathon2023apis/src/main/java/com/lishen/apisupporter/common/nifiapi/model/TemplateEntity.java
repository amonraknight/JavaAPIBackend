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
 * TemplateEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class TemplateEntity {
    @SerializedName("revision")
    private RevisionDTO revision = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("uri")
    private String uri = null;

    @SerializedName("position")
    private PositionDTO position = null;

    @SerializedName("permissions")
    private PermissionsDTO permissions = null;

    @SerializedName("bulletins")
    private List<BulletinEntity> bulletins = null;

    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    @SerializedName("template")
    private TemplateDTO template = null;

    public TemplateEntity revision(RevisionDTO revision) {
        this.revision = revision;
        return this;
    }

    /**
     * The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.
     *
     * @return revision
     **/
    @ApiModelProperty(value = "The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.")
    public RevisionDTO getRevision() {
        return revision;
    }

    public void setRevision(RevisionDTO revision) {
        this.revision = revision;
    }

    public TemplateEntity id(String id) {
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

    public TemplateEntity uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * The URI for futures requests to the component.
     *
     * @return uri
     **/
    @ApiModelProperty(value = "The URI for futures requests to the component.")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TemplateEntity position(PositionDTO position) {
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

    public TemplateEntity permissions(PermissionsDTO permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * The permissions for this component.
     *
     * @return permissions
     **/
    @ApiModelProperty(value = "The permissions for this component.")
    public PermissionsDTO getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionsDTO permissions) {
        this.permissions = permissions;
    }

    public TemplateEntity bulletins(List<BulletinEntity> bulletins) {
        this.bulletins = bulletins;
        return this;
    }

    public TemplateEntity addBulletinsItem(BulletinEntity bulletinsItem) {
        if (this.bulletins == null) {
            this.bulletins = new ArrayList<BulletinEntity>();
        }
        this.bulletins.add(bulletinsItem);
        return this;
    }

    /**
     * The bulletins for this component.
     *
     * @return bulletins
     **/
    @ApiModelProperty(value = "The bulletins for this component.")
    public List<BulletinEntity> getBulletins() {
        return bulletins;
    }

    public void setBulletins(List<BulletinEntity> bulletins) {
        this.bulletins = bulletins;
    }

    public TemplateEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
        this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
        return this;
    }

    /**
     * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
     *
     * @return disconnectedNodeAcknowledged
     **/
    @ApiModelProperty(value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
    public Boolean isDisconnectedNodeAcknowledged() {
        return disconnectedNodeAcknowledged;
    }

    public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
        this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    }

    public TemplateEntity template(TemplateDTO template) {
        this.template = template;
        return this;
    }

    /**
     * Get template
     *
     * @return template
     **/
    @ApiModelProperty(value = "")
    public TemplateDTO getTemplate() {
        return template;
    }

    public void setTemplate(TemplateDTO template) {
        this.template = template;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateEntity templateEntity = (TemplateEntity) o;
        return Objects.equals(this.revision, templateEntity.revision) &&
                Objects.equals(this.id, templateEntity.id) &&
                Objects.equals(this.uri, templateEntity.uri) &&
                Objects.equals(this.position, templateEntity.position) &&
                Objects.equals(this.permissions, templateEntity.permissions) &&
                Objects.equals(this.bulletins, templateEntity.bulletins) &&
                Objects.equals(this.disconnectedNodeAcknowledged, templateEntity.disconnectedNodeAcknowledged) &&
                Objects.equals(this.template, templateEntity.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(revision, id, uri, position, permissions, bulletins, disconnectedNodeAcknowledged, template);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateEntity {\n");

        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
        sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
