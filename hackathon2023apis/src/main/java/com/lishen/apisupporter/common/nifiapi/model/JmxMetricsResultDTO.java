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
 * JmxMetricsResultDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class JmxMetricsResultDTO {
    @SerializedName("beanName")
    private String beanName = null;

    @SerializedName("attributeName")
    private String attributeName = null;

    @SerializedName("attributeValue")
    private Object attributeValue = null;

    public JmxMetricsResultDTO beanName(String beanName) {
        this.beanName = beanName;
        return this;
    }

    /**
     * The bean name of the metrics bean.
     *
     * @return beanName
     **/
    @ApiModelProperty(value = "The bean name of the metrics bean.")
    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public JmxMetricsResultDTO attributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * The attribute name of the metrics bean&#39;s attribute.
     *
     * @return attributeName
     **/
    @ApiModelProperty(value = "The attribute name of the metrics bean's attribute.")
    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public JmxMetricsResultDTO attributeValue(Object attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }

    /**
     * The attribute value of the the metrics bean&#39;s attribute
     *
     * @return attributeValue
     **/
    @ApiModelProperty(value = "The attribute value of the the metrics bean's attribute")
    public Object getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(Object attributeValue) {
        this.attributeValue = attributeValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JmxMetricsResultDTO jmxMetricsResultDTO = (JmxMetricsResultDTO) o;
        return Objects.equals(this.beanName, jmxMetricsResultDTO.beanName) &&
                Objects.equals(this.attributeName, jmxMetricsResultDTO.attributeName) &&
                Objects.equals(this.attributeValue, jmxMetricsResultDTO.attributeValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beanName, attributeName, attributeValue);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JmxMetricsResultDTO {\n");

        sb.append("    beanName: ").append(toIndentedString(beanName)).append("\n");
        sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
        sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
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
