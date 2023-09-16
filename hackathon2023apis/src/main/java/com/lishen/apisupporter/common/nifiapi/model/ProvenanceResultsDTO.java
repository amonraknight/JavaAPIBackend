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
 * ProvenanceResultsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ProvenanceResultsDTO {
    @SerializedName("provenanceEvents")
    private List<ProvenanceEventDTO> provenanceEvents = null;

    @SerializedName("total")
    private String total = null;

    @SerializedName("totalCount")
    private Long totalCount = null;

    @SerializedName("generated")
    private String generated = null;

    @SerializedName("oldestEvent")
    private String oldestEvent = null;

    @SerializedName("timeOffset")
    private Integer timeOffset = null;

    @SerializedName("errors")
    private List<String> errors = null;

    public ProvenanceResultsDTO provenanceEvents(List<ProvenanceEventDTO> provenanceEvents) {
        this.provenanceEvents = provenanceEvents;
        return this;
    }

    public ProvenanceResultsDTO addProvenanceEventsItem(ProvenanceEventDTO provenanceEventsItem) {
        if (this.provenanceEvents == null) {
            this.provenanceEvents = new ArrayList<ProvenanceEventDTO>();
        }
        this.provenanceEvents.add(provenanceEventsItem);
        return this;
    }

    /**
     * The provenance events that matched the search criteria.
     *
     * @return provenanceEvents
     **/
    @ApiModelProperty(value = "The provenance events that matched the search criteria.")
    public List<ProvenanceEventDTO> getProvenanceEvents() {
        return provenanceEvents;
    }

    public void setProvenanceEvents(List<ProvenanceEventDTO> provenanceEvents) {
        this.provenanceEvents = provenanceEvents;
    }

    public ProvenanceResultsDTO total(String total) {
        this.total = total;
        return this;
    }

    /**
     * The total number of results formatted.
     *
     * @return total
     **/
    @ApiModelProperty(value = "The total number of results formatted.")
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public ProvenanceResultsDTO totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * The total number of results.
     *
     * @return totalCount
     **/
    @ApiModelProperty(value = "The total number of results.")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ProvenanceResultsDTO generated(String generated) {
        this.generated = generated;
        return this;
    }

    /**
     * Then the search was performed.
     *
     * @return generated
     **/
    @ApiModelProperty(value = "Then the search was performed.")
    public String getGenerated() {
        return generated;
    }

    public void setGenerated(String generated) {
        this.generated = generated;
    }

    public ProvenanceResultsDTO oldestEvent(String oldestEvent) {
        this.oldestEvent = oldestEvent;
        return this;
    }

    /**
     * The oldest event available in the provenance repository.
     *
     * @return oldestEvent
     **/
    @ApiModelProperty(value = "The oldest event available in the provenance repository.")
    public String getOldestEvent() {
        return oldestEvent;
    }

    public void setOldestEvent(String oldestEvent) {
        this.oldestEvent = oldestEvent;
    }

    public ProvenanceResultsDTO timeOffset(Integer timeOffset) {
        this.timeOffset = timeOffset;
        return this;
    }

    /**
     * The time offset of the server that&#39;s used for event time.
     *
     * @return timeOffset
     **/
    @ApiModelProperty(value = "The time offset of the server that's used for event time.")
    public Integer getTimeOffset() {
        return timeOffset;
    }

    public void setTimeOffset(Integer timeOffset) {
        this.timeOffset = timeOffset;
    }

    public ProvenanceResultsDTO errors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public ProvenanceResultsDTO addErrorsItem(String errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<String>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Any errors that occurred while performing the provenance request.
     *
     * @return errors
     **/
    @ApiModelProperty(value = "Any errors that occurred while performing the provenance request.")
    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProvenanceResultsDTO provenanceResultsDTO = (ProvenanceResultsDTO) o;
        return Objects.equals(this.provenanceEvents, provenanceResultsDTO.provenanceEvents) &&
                Objects.equals(this.total, provenanceResultsDTO.total) &&
                Objects.equals(this.totalCount, provenanceResultsDTO.totalCount) &&
                Objects.equals(this.generated, provenanceResultsDTO.generated) &&
                Objects.equals(this.oldestEvent, provenanceResultsDTO.oldestEvent) &&
                Objects.equals(this.timeOffset, provenanceResultsDTO.timeOffset) &&
                Objects.equals(this.errors, provenanceResultsDTO.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provenanceEvents, total, totalCount, generated, oldestEvent, timeOffset, errors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvenanceResultsDTO {\n");

        sb.append("    provenanceEvents: ").append(toIndentedString(provenanceEvents)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
        sb.append("    oldestEvent: ").append(toIndentedString(oldestEvent)).append("\n");
        sb.append("    timeOffset: ").append(toIndentedString(timeOffset)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

