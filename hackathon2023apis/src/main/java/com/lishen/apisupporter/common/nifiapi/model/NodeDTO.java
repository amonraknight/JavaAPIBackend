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
 * NodeDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class NodeDTO {
    @SerializedName("nodeId")
    private String nodeId = null;

    @SerializedName("address")
    private String address = null;

    @SerializedName("apiPort")
    private Integer apiPort = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("heartbeat")
    private String heartbeat = null;

    @SerializedName("connectionRequested")
    private String connectionRequested = null;

    @SerializedName("roles")
    private List<String> roles = null;

    @SerializedName("activeThreadCount")
    private Integer activeThreadCount = null;

    @SerializedName("queued")
    private String queued = null;

    @SerializedName("events")
    private List<NodeEventDTO> events = null;

    @SerializedName("nodeStartTime")
    private String nodeStartTime = null;

    public NodeDTO nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The id of the node.
     *
     * @return nodeId
     **/
    @ApiModelProperty(value = "The id of the node.")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NodeDTO address(String address) {
        this.address = address;
        return this;
    }

    /**
     * The node&#39;s host/ip address.
     *
     * @return address
     **/
    @ApiModelProperty(value = "The node's host/ip address.")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public NodeDTO apiPort(Integer apiPort) {
        this.apiPort = apiPort;
        return this;
    }

    /**
     * The port the node is listening for API requests.
     *
     * @return apiPort
     **/
    @ApiModelProperty(value = "The port the node is listening for API requests.")
    public Integer getApiPort() {
        return apiPort;
    }

    public void setApiPort(Integer apiPort) {
        this.apiPort = apiPort;
    }

    public NodeDTO status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The node&#39;s status.
     *
     * @return status
     **/
    @ApiModelProperty(value = "The node's status.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NodeDTO heartbeat(String heartbeat) {
        this.heartbeat = heartbeat;
        return this;
    }

    /**
     * the time of the nodes&#39;s last heartbeat.
     *
     * @return heartbeat
     **/
    @ApiModelProperty(value = "the time of the nodes's last heartbeat.")
    public String getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(String heartbeat) {
        this.heartbeat = heartbeat;
    }

    public NodeDTO connectionRequested(String connectionRequested) {
        this.connectionRequested = connectionRequested;
        return this;
    }

    /**
     * The time of the node&#39;s last connection request.
     *
     * @return connectionRequested
     **/
    @ApiModelProperty(value = "The time of the node's last connection request.")
    public String getConnectionRequested() {
        return connectionRequested;
    }

    public void setConnectionRequested(String connectionRequested) {
        this.connectionRequested = connectionRequested;
    }

    public NodeDTO roles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public NodeDTO addRolesItem(String rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<String>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    /**
     * The roles of this node.
     *
     * @return roles
     **/
    @ApiModelProperty(value = "The roles of this node.")
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public NodeDTO activeThreadCount(Integer activeThreadCount) {
        this.activeThreadCount = activeThreadCount;
        return this;
    }

    /**
     * The active threads for the NiFi on the node.
     *
     * @return activeThreadCount
     **/
    @ApiModelProperty(value = "The active threads for the NiFi on the node.")
    public Integer getActiveThreadCount() {
        return activeThreadCount;
    }

    public void setActiveThreadCount(Integer activeThreadCount) {
        this.activeThreadCount = activeThreadCount;
    }

    public NodeDTO queued(String queued) {
        this.queued = queued;
        return this;
    }

    /**
     * The queue the NiFi on the node.
     *
     * @return queued
     **/
    @ApiModelProperty(value = "The queue the NiFi on the node.")
    public String getQueued() {
        return queued;
    }

    public void setQueued(String queued) {
        this.queued = queued;
    }

    public NodeDTO events(List<NodeEventDTO> events) {
        this.events = events;
        return this;
    }

    public NodeDTO addEventsItem(NodeEventDTO eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<NodeEventDTO>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * The node&#39;s events.
     *
     * @return events
     **/
    @ApiModelProperty(value = "The node's events.")
    public List<NodeEventDTO> getEvents() {
        return events;
    }

    public void setEvents(List<NodeEventDTO> events) {
        this.events = events;
    }

    public NodeDTO nodeStartTime(String nodeStartTime) {
        this.nodeStartTime = nodeStartTime;
        return this;
    }

    /**
     * The time at which this Node was last refreshed.
     *
     * @return nodeStartTime
     **/
    @ApiModelProperty(value = "The time at which this Node was last refreshed.")
    public String getNodeStartTime() {
        return nodeStartTime;
    }

    public void setNodeStartTime(String nodeStartTime) {
        this.nodeStartTime = nodeStartTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeDTO nodeDTO = (NodeDTO) o;
        return Objects.equals(this.nodeId, nodeDTO.nodeId) &&
                Objects.equals(this.address, nodeDTO.address) &&
                Objects.equals(this.apiPort, nodeDTO.apiPort) &&
                Objects.equals(this.status, nodeDTO.status) &&
                Objects.equals(this.heartbeat, nodeDTO.heartbeat) &&
                Objects.equals(this.connectionRequested, nodeDTO.connectionRequested) &&
                Objects.equals(this.roles, nodeDTO.roles) &&
                Objects.equals(this.activeThreadCount, nodeDTO.activeThreadCount) &&
                Objects.equals(this.queued, nodeDTO.queued) &&
                Objects.equals(this.events, nodeDTO.events) &&
                Objects.equals(this.nodeStartTime, nodeDTO.nodeStartTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, address, apiPort, status, heartbeat, connectionRequested, roles, activeThreadCount, queued, events, nodeStartTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeDTO {\n");

        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    heartbeat: ").append(toIndentedString(heartbeat)).append("\n");
        sb.append("    connectionRequested: ").append(toIndentedString(connectionRequested)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
        sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    nodeStartTime: ").append(toIndentedString(nodeStartTime)).append("\n");
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

