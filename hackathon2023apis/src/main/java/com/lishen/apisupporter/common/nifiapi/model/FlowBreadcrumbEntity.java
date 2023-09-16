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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * FlowBreadcrumbEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class FlowBreadcrumbEntity {
    @SerializedName("id")
    private String id = null;

    @SerializedName("permissions")
    private PermissionsDTO permissions = null;
    @SerializedName("versionedFlowState")
    private VersionedFlowStateEnum versionedFlowState = null;
    @SerializedName("breadcrumb")
    private FlowBreadcrumbDTO breadcrumb = null;
    @SerializedName("parentBreadcrumb")
    private FlowBreadcrumbEntity parentBreadcrumb = null;

    public FlowBreadcrumbEntity id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The id of this ancestor ProcessGroup.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The id of this ancestor ProcessGroup.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowBreadcrumbEntity permissions(PermissionsDTO permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * The permissions for this ancestor ProcessGroup.
     *
     * @return permissions
     **/
    @ApiModelProperty(value = "The permissions for this ancestor ProcessGroup.")
    public PermissionsDTO getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionsDTO permissions) {
        this.permissions = permissions;
    }

    public FlowBreadcrumbEntity versionedFlowState(VersionedFlowStateEnum versionedFlowState) {
        this.versionedFlowState = versionedFlowState;
        return this;
    }

    /**
     * The current state of the Process Group, as it relates to the Versioned Flow
     *
     * @return versionedFlowState
     **/
    @ApiModelProperty(value = "The current state of the Process Group, as it relates to the Versioned Flow")
    public VersionedFlowStateEnum getVersionedFlowState() {
        return versionedFlowState;
    }

    public void setVersionedFlowState(VersionedFlowStateEnum versionedFlowState) {
        this.versionedFlowState = versionedFlowState;
    }

    public FlowBreadcrumbEntity breadcrumb(FlowBreadcrumbDTO breadcrumb) {
        this.breadcrumb = breadcrumb;
        return this;
    }

    /**
     * This breadcrumb.
     *
     * @return breadcrumb
     **/
    @ApiModelProperty(value = "This breadcrumb.")
    public FlowBreadcrumbDTO getBreadcrumb() {
        return breadcrumb;
    }

    public void setBreadcrumb(FlowBreadcrumbDTO breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    public FlowBreadcrumbEntity parentBreadcrumb(FlowBreadcrumbEntity parentBreadcrumb) {
        this.parentBreadcrumb = parentBreadcrumb;
        return this;
    }

    /**
     * The parent breadcrumb for this breadcrumb.
     *
     * @return parentBreadcrumb
     **/
    @ApiModelProperty(value = "The parent breadcrumb for this breadcrumb.")
    public FlowBreadcrumbEntity getParentBreadcrumb() {
        return parentBreadcrumb;
    }

    public void setParentBreadcrumb(FlowBreadcrumbEntity parentBreadcrumb) {
        this.parentBreadcrumb = parentBreadcrumb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowBreadcrumbEntity flowBreadcrumbEntity = (FlowBreadcrumbEntity) o;
        return Objects.equals(this.id, flowBreadcrumbEntity.id) &&
                Objects.equals(this.permissions, flowBreadcrumbEntity.permissions) &&
                Objects.equals(this.versionedFlowState, flowBreadcrumbEntity.versionedFlowState) &&
                Objects.equals(this.breadcrumb, flowBreadcrumbEntity.breadcrumb) &&
                Objects.equals(this.parentBreadcrumb, flowBreadcrumbEntity.parentBreadcrumb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permissions, versionedFlowState, breadcrumb, parentBreadcrumb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowBreadcrumbEntity {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    versionedFlowState: ").append(toIndentedString(versionedFlowState)).append("\n");
        sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
        sb.append("    parentBreadcrumb: ").append(toIndentedString(parentBreadcrumb)).append("\n");
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

    /**
     * The current state of the Process Group, as it relates to the Versioned Flow
     */
    @JsonAdapter(VersionedFlowStateEnum.Adapter.class)
    public enum VersionedFlowStateEnum {
        LOCALLY_MODIFIED("LOCALLY_MODIFIED"),

        STALE("STALE"),

        LOCALLY_MODIFIED_AND_STALE("LOCALLY_MODIFIED_AND_STALE"),

        UP_TO_DATE("UP_TO_DATE"),

        SYNC_FAILURE("SYNC_FAILURE");

        private String value;

        VersionedFlowStateEnum(String value) {
            this.value = value;
        }

        public static VersionedFlowStateEnum fromValue(String text) {
            for (VersionedFlowStateEnum b : VersionedFlowStateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<VersionedFlowStateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final VersionedFlowStateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public VersionedFlowStateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return VersionedFlowStateEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

