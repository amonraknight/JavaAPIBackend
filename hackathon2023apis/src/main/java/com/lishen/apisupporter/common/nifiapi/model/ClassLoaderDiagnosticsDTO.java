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
 * ClassLoaderDiagnosticsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ClassLoaderDiagnosticsDTO {
    @SerializedName("bundle")
    private BundleDTO bundle = null;

    @SerializedName("parentClassLoader")
    private ClassLoaderDiagnosticsDTO parentClassLoader = null;

    public ClassLoaderDiagnosticsDTO bundle(BundleDTO bundle) {
        this.bundle = bundle;
        return this;
    }

    /**
     * Information about the Bundle that the ClassLoader belongs to, if any
     *
     * @return bundle
     **/
    @ApiModelProperty(value = "Information about the Bundle that the ClassLoader belongs to, if any")
    public BundleDTO getBundle() {
        return bundle;
    }

    public void setBundle(BundleDTO bundle) {
        this.bundle = bundle;
    }

    public ClassLoaderDiagnosticsDTO parentClassLoader(ClassLoaderDiagnosticsDTO parentClassLoader) {
        this.parentClassLoader = parentClassLoader;
        return this;
    }

    /**
     * A ClassLoaderDiagnosticsDTO that provides information about the parent ClassLoader
     *
     * @return parentClassLoader
     **/
    @ApiModelProperty(value = "A ClassLoaderDiagnosticsDTO that provides information about the parent ClassLoader")
    public ClassLoaderDiagnosticsDTO getParentClassLoader() {
        return parentClassLoader;
    }

    public void setParentClassLoader(ClassLoaderDiagnosticsDTO parentClassLoader) {
        this.parentClassLoader = parentClassLoader;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClassLoaderDiagnosticsDTO classLoaderDiagnosticsDTO = (ClassLoaderDiagnosticsDTO) o;
        return Objects.equals(this.bundle, classLoaderDiagnosticsDTO.bundle) &&
                Objects.equals(this.parentClassLoader, classLoaderDiagnosticsDTO.parentClassLoader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bundle, parentClassLoader);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassLoaderDiagnosticsDTO {\n");

        sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
        sb.append("    parentClassLoader: ").append(toIndentedString(parentClassLoader)).append("\n");
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

