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
 * VersionedFlowSnapshotEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class VersionedFlowSnapshotEntity {
    @SerializedName("versionedFlowSnapshot")
    private RegisteredFlowSnapshot versionedFlowSnapshot = null;

    @SerializedName("processGroupRevision")
    private RevisionDTO processGroupRevision = null;

    @SerializedName("registryId")
    private String registryId = null;

    @SerializedName("updateDescendantVersionedFlows")
    private Boolean updateDescendantVersionedFlows = null;

    @SerializedName("disconnectedNodeAcknowledged")
    private Boolean disconnectedNodeAcknowledged = null;

    public VersionedFlowSnapshotEntity versionedFlowSnapshot(RegisteredFlowSnapshot versionedFlowSnapshot) {
        this.versionedFlowSnapshot = versionedFlowSnapshot;
        return this;
    }

    /**
     * The versioned flow snapshot
     *
     * @return versionedFlowSnapshot
     **/
    @ApiModelProperty(value = "The versioned flow snapshot")
    public RegisteredFlowSnapshot getVersionedFlowSnapshot() {
        return versionedFlowSnapshot;
    }

    public void setVersionedFlowSnapshot(RegisteredFlowSnapshot versionedFlowSnapshot) {
        this.versionedFlowSnapshot = versionedFlowSnapshot;
    }

    public VersionedFlowSnapshotEntity processGroupRevision(RevisionDTO processGroupRevision) {
        this.processGroupRevision = processGroupRevision;
        return this;
    }

    /**
     * The Revision of the Process Group under Version Control
     *
     * @return processGroupRevision
     **/
    @ApiModelProperty(value = "The Revision of the Process Group under Version Control")
    public RevisionDTO getProcessGroupRevision() {
        return processGroupRevision;
    }

    public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
        this.processGroupRevision = processGroupRevision;
    }

    public VersionedFlowSnapshotEntity registryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * The ID of the Registry that this flow belongs to
     *
     * @return registryId
     **/
    @ApiModelProperty(value = "The ID of the Registry that this flow belongs to")
    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public VersionedFlowSnapshotEntity updateDescendantVersionedFlows(Boolean updateDescendantVersionedFlows) {
        this.updateDescendantVersionedFlows = updateDescendantVersionedFlows;
        return this;
    }

    /**
     * If the Process Group to be updated has a child or descendant Process Group that is also under Version Control, this specifies whether or not the contents of that child/descendant Process Group should be updated.
     *
     * @return updateDescendantVersionedFlows
     **/
    @ApiModelProperty(value = "If the Process Group to be updated has a child or descendant Process Group that is also under Version Control, this specifies whether or not the contents of that child/descendant Process Group should be updated.")
    public Boolean isUpdateDescendantVersionedFlows() {
        return updateDescendantVersionedFlows;
    }

    public void setUpdateDescendantVersionedFlows(Boolean updateDescendantVersionedFlows) {
        this.updateDescendantVersionedFlows = updateDescendantVersionedFlows;
    }

    public VersionedFlowSnapshotEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionedFlowSnapshotEntity versionedFlowSnapshotEntity = (VersionedFlowSnapshotEntity) o;
        return Objects.equals(this.versionedFlowSnapshot, versionedFlowSnapshotEntity.versionedFlowSnapshot) &&
                Objects.equals(this.processGroupRevision, versionedFlowSnapshotEntity.processGroupRevision) &&
                Objects.equals(this.registryId, versionedFlowSnapshotEntity.registryId) &&
                Objects.equals(this.updateDescendantVersionedFlows, versionedFlowSnapshotEntity.updateDescendantVersionedFlows) &&
                Objects.equals(this.disconnectedNodeAcknowledged, versionedFlowSnapshotEntity.disconnectedNodeAcknowledged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionedFlowSnapshot, processGroupRevision, registryId, updateDescendantVersionedFlows, disconnectedNodeAcknowledged);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionedFlowSnapshotEntity {\n");

        sb.append("    versionedFlowSnapshot: ").append(toIndentedString(versionedFlowSnapshot)).append("\n");
        sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
        sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
        sb.append("    updateDescendantVersionedFlows: ").append(toIndentedString(updateDescendantVersionedFlows)).append("\n");
        sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
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

