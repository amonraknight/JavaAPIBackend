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
 * StackTraceElement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class StackTraceElement {
    @SerializedName("classLoaderName")
    private String classLoaderName = null;

    @SerializedName("moduleName")
    private String moduleName = null;

    @SerializedName("moduleVersion")
    private String moduleVersion = null;

    @SerializedName("methodName")
    private String methodName = null;

    @SerializedName("fileName")
    private String fileName = null;

    @SerializedName("lineNumber")
    private Integer lineNumber = null;

    @SerializedName("className")
    private String className = null;

    @SerializedName("nativeMethod")
    private Boolean nativeMethod = null;

    public StackTraceElement classLoaderName(String classLoaderName) {
        this.classLoaderName = classLoaderName;
        return this;
    }

    /**
     * Get classLoaderName
     *
     * @return classLoaderName
     **/
    @ApiModelProperty(value = "")
    public String getClassLoaderName() {
        return classLoaderName;
    }

    public void setClassLoaderName(String classLoaderName) {
        this.classLoaderName = classLoaderName;
    }

    public StackTraceElement moduleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * Get moduleName
     *
     * @return moduleName
     **/
    @ApiModelProperty(value = "")
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public StackTraceElement moduleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }

    /**
     * Get moduleVersion
     *
     * @return moduleVersion
     **/
    @ApiModelProperty(value = "")
    public String getModuleVersion() {
        return moduleVersion;
    }

    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
    }

    public StackTraceElement methodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    /**
     * Get methodName
     *
     * @return methodName
     **/
    @ApiModelProperty(value = "")
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public StackTraceElement fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get fileName
     *
     * @return fileName
     **/
    @ApiModelProperty(value = "")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public StackTraceElement lineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * Get lineNumber
     *
     * @return lineNumber
     **/
    @ApiModelProperty(value = "")
    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public StackTraceElement className(String className) {
        this.className = className;
        return this;
    }

    /**
     * Get className
     *
     * @return className
     **/
    @ApiModelProperty(value = "")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public StackTraceElement nativeMethod(Boolean nativeMethod) {
        this.nativeMethod = nativeMethod;
        return this;
    }

    /**
     * Get nativeMethod
     *
     * @return nativeMethod
     **/
    @ApiModelProperty(value = "")
    public Boolean isNativeMethod() {
        return nativeMethod;
    }

    public void setNativeMethod(Boolean nativeMethod) {
        this.nativeMethod = nativeMethod;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StackTraceElement stackTraceElement = (StackTraceElement) o;
        return Objects.equals(this.classLoaderName, stackTraceElement.classLoaderName) &&
                Objects.equals(this.moduleName, stackTraceElement.moduleName) &&
                Objects.equals(this.moduleVersion, stackTraceElement.moduleVersion) &&
                Objects.equals(this.methodName, stackTraceElement.methodName) &&
                Objects.equals(this.fileName, stackTraceElement.fileName) &&
                Objects.equals(this.lineNumber, stackTraceElement.lineNumber) &&
                Objects.equals(this.className, stackTraceElement.className) &&
                Objects.equals(this.nativeMethod, stackTraceElement.nativeMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classLoaderName, moduleName, moduleVersion, methodName, fileName, lineNumber, className, nativeMethod);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackTraceElement {\n");

        sb.append("    classLoaderName: ").append(toIndentedString(classLoaderName)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    moduleVersion: ").append(toIndentedString(moduleVersion)).append("\n");
        sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
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

