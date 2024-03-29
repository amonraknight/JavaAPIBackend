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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SchedulingDefaults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class SchedulingDefaults {
    @SerializedName("defaultSchedulingStrategy")
    private DefaultSchedulingStrategyEnum defaultSchedulingStrategy = null;
    @SerializedName("defaultSchedulingPeriodMillis")
    private Long defaultSchedulingPeriodMillis = null;
    @SerializedName("penalizationPeriodMillis")
    private Long penalizationPeriodMillis = null;
    @SerializedName("yieldDurationMillis")
    private Long yieldDurationMillis = null;
    @SerializedName("defaultRunDurationNanos")
    private Long defaultRunDurationNanos = null;
    @SerializedName("defaultMaxConcurrentTasks")
    private String defaultMaxConcurrentTasks = null;
    @SerializedName("defaultConcurrentTasksBySchedulingStrategy")
    private Map<String, Integer> defaultConcurrentTasksBySchedulingStrategy = null;
    @SerializedName("defaultSchedulingPeriodsBySchedulingStrategy")
    private Map<String, String> defaultSchedulingPeriodsBySchedulingStrategy = null;

    public SchedulingDefaults defaultSchedulingStrategy(DefaultSchedulingStrategyEnum defaultSchedulingStrategy) {
        this.defaultSchedulingStrategy = defaultSchedulingStrategy;
        return this;
    }

    /**
     * The name of the default scheduling strategy
     *
     * @return defaultSchedulingStrategy
     **/
    @ApiModelProperty(value = "The name of the default scheduling strategy")
    public DefaultSchedulingStrategyEnum getDefaultSchedulingStrategy() {
        return defaultSchedulingStrategy;
    }

    public void setDefaultSchedulingStrategy(DefaultSchedulingStrategyEnum defaultSchedulingStrategy) {
        this.defaultSchedulingStrategy = defaultSchedulingStrategy;
    }

    public SchedulingDefaults defaultSchedulingPeriodMillis(Long defaultSchedulingPeriodMillis) {
        this.defaultSchedulingPeriodMillis = defaultSchedulingPeriodMillis;
        return this;
    }

    /**
     * The default scheduling period in milliseconds
     *
     * @return defaultSchedulingPeriodMillis
     **/
    @ApiModelProperty(value = "The default scheduling period in milliseconds")
    public Long getDefaultSchedulingPeriodMillis() {
        return defaultSchedulingPeriodMillis;
    }

    public void setDefaultSchedulingPeriodMillis(Long defaultSchedulingPeriodMillis) {
        this.defaultSchedulingPeriodMillis = defaultSchedulingPeriodMillis;
    }

    public SchedulingDefaults penalizationPeriodMillis(Long penalizationPeriodMillis) {
        this.penalizationPeriodMillis = penalizationPeriodMillis;
        return this;
    }

    /**
     * The default penalization period in milliseconds
     *
     * @return penalizationPeriodMillis
     **/
    @ApiModelProperty(value = "The default penalization period in milliseconds")
    public Long getPenalizationPeriodMillis() {
        return penalizationPeriodMillis;
    }

    public void setPenalizationPeriodMillis(Long penalizationPeriodMillis) {
        this.penalizationPeriodMillis = penalizationPeriodMillis;
    }

    public SchedulingDefaults yieldDurationMillis(Long yieldDurationMillis) {
        this.yieldDurationMillis = yieldDurationMillis;
        return this;
    }

    /**
     * The default yield duration in milliseconds
     *
     * @return yieldDurationMillis
     **/
    @ApiModelProperty(value = "The default yield duration in milliseconds")
    public Long getYieldDurationMillis() {
        return yieldDurationMillis;
    }

    public void setYieldDurationMillis(Long yieldDurationMillis) {
        this.yieldDurationMillis = yieldDurationMillis;
    }

    public SchedulingDefaults defaultRunDurationNanos(Long defaultRunDurationNanos) {
        this.defaultRunDurationNanos = defaultRunDurationNanos;
        return this;
    }

    /**
     * The default run duration in nano-seconds
     *
     * @return defaultRunDurationNanos
     **/
    @ApiModelProperty(value = "The default run duration in nano-seconds")
    public Long getDefaultRunDurationNanos() {
        return defaultRunDurationNanos;
    }

    public void setDefaultRunDurationNanos(Long defaultRunDurationNanos) {
        this.defaultRunDurationNanos = defaultRunDurationNanos;
    }

    public SchedulingDefaults defaultMaxConcurrentTasks(String defaultMaxConcurrentTasks) {
        this.defaultMaxConcurrentTasks = defaultMaxConcurrentTasks;
        return this;
    }

    /**
     * The default concurrent tasks
     *
     * @return defaultMaxConcurrentTasks
     **/
    @ApiModelProperty(value = "The default concurrent tasks")
    public String getDefaultMaxConcurrentTasks() {
        return defaultMaxConcurrentTasks;
    }

    public void setDefaultMaxConcurrentTasks(String defaultMaxConcurrentTasks) {
        this.defaultMaxConcurrentTasks = defaultMaxConcurrentTasks;
    }

    public SchedulingDefaults defaultConcurrentTasksBySchedulingStrategy(Map<String, Integer> defaultConcurrentTasksBySchedulingStrategy) {
        this.defaultConcurrentTasksBySchedulingStrategy = defaultConcurrentTasksBySchedulingStrategy;
        return this;
    }

    public SchedulingDefaults putDefaultConcurrentTasksBySchedulingStrategyItem(String key, Integer defaultConcurrentTasksBySchedulingStrategyItem) {
        if (this.defaultConcurrentTasksBySchedulingStrategy == null) {
            this.defaultConcurrentTasksBySchedulingStrategy = new HashMap<String, Integer>();
        }
        this.defaultConcurrentTasksBySchedulingStrategy.put(key, defaultConcurrentTasksBySchedulingStrategyItem);
        return this;
    }

    /**
     * The default concurrent tasks for each scheduling strategy
     *
     * @return defaultConcurrentTasksBySchedulingStrategy
     **/
    @ApiModelProperty(value = "The default concurrent tasks for each scheduling strategy")
    public Map<String, Integer> getDefaultConcurrentTasksBySchedulingStrategy() {
        return defaultConcurrentTasksBySchedulingStrategy;
    }

    public void setDefaultConcurrentTasksBySchedulingStrategy(Map<String, Integer> defaultConcurrentTasksBySchedulingStrategy) {
        this.defaultConcurrentTasksBySchedulingStrategy = defaultConcurrentTasksBySchedulingStrategy;
    }

    public SchedulingDefaults defaultSchedulingPeriodsBySchedulingStrategy(Map<String, String> defaultSchedulingPeriodsBySchedulingStrategy) {
        this.defaultSchedulingPeriodsBySchedulingStrategy = defaultSchedulingPeriodsBySchedulingStrategy;
        return this;
    }

    public SchedulingDefaults putDefaultSchedulingPeriodsBySchedulingStrategyItem(String key, String defaultSchedulingPeriodsBySchedulingStrategyItem) {
        if (this.defaultSchedulingPeriodsBySchedulingStrategy == null) {
            this.defaultSchedulingPeriodsBySchedulingStrategy = new HashMap<String, String>();
        }
        this.defaultSchedulingPeriodsBySchedulingStrategy.put(key, defaultSchedulingPeriodsBySchedulingStrategyItem);
        return this;
    }

    /**
     * The default scheduling period for each scheduling strategy
     *
     * @return defaultSchedulingPeriodsBySchedulingStrategy
     **/
    @ApiModelProperty(value = "The default scheduling period for each scheduling strategy")
    public Map<String, String> getDefaultSchedulingPeriodsBySchedulingStrategy() {
        return defaultSchedulingPeriodsBySchedulingStrategy;
    }

    public void setDefaultSchedulingPeriodsBySchedulingStrategy(Map<String, String> defaultSchedulingPeriodsBySchedulingStrategy) {
        this.defaultSchedulingPeriodsBySchedulingStrategy = defaultSchedulingPeriodsBySchedulingStrategy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SchedulingDefaults schedulingDefaults = (SchedulingDefaults) o;
        return Objects.equals(this.defaultSchedulingStrategy, schedulingDefaults.defaultSchedulingStrategy) &&
                Objects.equals(this.defaultSchedulingPeriodMillis, schedulingDefaults.defaultSchedulingPeriodMillis) &&
                Objects.equals(this.penalizationPeriodMillis, schedulingDefaults.penalizationPeriodMillis) &&
                Objects.equals(this.yieldDurationMillis, schedulingDefaults.yieldDurationMillis) &&
                Objects.equals(this.defaultRunDurationNanos, schedulingDefaults.defaultRunDurationNanos) &&
                Objects.equals(this.defaultMaxConcurrentTasks, schedulingDefaults.defaultMaxConcurrentTasks) &&
                Objects.equals(this.defaultConcurrentTasksBySchedulingStrategy, schedulingDefaults.defaultConcurrentTasksBySchedulingStrategy) &&
                Objects.equals(this.defaultSchedulingPeriodsBySchedulingStrategy, schedulingDefaults.defaultSchedulingPeriodsBySchedulingStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultSchedulingStrategy, defaultSchedulingPeriodMillis, penalizationPeriodMillis, yieldDurationMillis, defaultRunDurationNanos, defaultMaxConcurrentTasks, defaultConcurrentTasksBySchedulingStrategy, defaultSchedulingPeriodsBySchedulingStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchedulingDefaults {\n");

        sb.append("    defaultSchedulingStrategy: ").append(toIndentedString(defaultSchedulingStrategy)).append("\n");
        sb.append("    defaultSchedulingPeriodMillis: ").append(toIndentedString(defaultSchedulingPeriodMillis)).append("\n");
        sb.append("    penalizationPeriodMillis: ").append(toIndentedString(penalizationPeriodMillis)).append("\n");
        sb.append("    yieldDurationMillis: ").append(toIndentedString(yieldDurationMillis)).append("\n");
        sb.append("    defaultRunDurationNanos: ").append(toIndentedString(defaultRunDurationNanos)).append("\n");
        sb.append("    defaultMaxConcurrentTasks: ").append(toIndentedString(defaultMaxConcurrentTasks)).append("\n");
        sb.append("    defaultConcurrentTasksBySchedulingStrategy: ").append(toIndentedString(defaultConcurrentTasksBySchedulingStrategy)).append("\n");
        sb.append("    defaultSchedulingPeriodsBySchedulingStrategy: ").append(toIndentedString(defaultSchedulingPeriodsBySchedulingStrategy)).append("\n");
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
     * The name of the default scheduling strategy
     */
    @JsonAdapter(DefaultSchedulingStrategyEnum.Adapter.class)
    public enum DefaultSchedulingStrategyEnum {
        EVENT_DRIVEN("EVENT_DRIVEN"),

        TIMER_DRIVEN("TIMER_DRIVEN"),

        PRIMARY_NODE_ONLY("PRIMARY_NODE_ONLY"),

        CRON_DRIVEN("CRON_DRIVEN");

        private String value;

        DefaultSchedulingStrategyEnum(String value) {
            this.value = value;
        }

        public static DefaultSchedulingStrategyEnum fromValue(String text) {
            for (DefaultSchedulingStrategyEnum b : DefaultSchedulingStrategyEnum.values()) {
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

        public static class Adapter extends TypeAdapter<DefaultSchedulingStrategyEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DefaultSchedulingStrategyEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DefaultSchedulingStrategyEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DefaultSchedulingStrategyEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

