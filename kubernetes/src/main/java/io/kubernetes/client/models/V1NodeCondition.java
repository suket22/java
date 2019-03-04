/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * NodeCondition contains condition information for a node.
 */
@ApiModel(description = "NodeCondition contains condition information for a node.")

public class V1NodeCondition {
  @SerializedName("lastHeartbeatTime")
  private DateTime lastHeartbeatTime = null;

  @SerializedName("lastTransitionTime")
  private DateTime lastTransitionTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public V1NodeCondition lastHeartbeatTime(DateTime lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
    return this;
  }

   /**
   * Last time we got an update on a given condition.
   * @return lastHeartbeatTime
  **/
  @ApiModelProperty(value = "Last time we got an update on a given condition.")
  public DateTime getLastHeartbeatTime() {
    return lastHeartbeatTime;
  }

  public void setLastHeartbeatTime(DateTime lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
  }

  public V1NodeCondition lastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transit from one status to another.
   * @return lastTransitionTime
  **/
  @ApiModelProperty(value = "Last time the condition transit from one status to another.")
  public DateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public V1NodeCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Human readable message indicating details about last transition.
   * @return message
  **/
  @ApiModelProperty(value = "Human readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public V1NodeCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * (brief) reason for the condition&#39;s last transition.
   * @return reason
  **/
  @ApiModelProperty(value = "(brief) reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1NodeCondition status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the condition, one of True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1NodeCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of node condition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of node condition.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeCondition v1NodeCondition = (V1NodeCondition) o;
    return Objects.equals(this.lastHeartbeatTime, v1NodeCondition.lastHeartbeatTime) &&
        Objects.equals(this.lastTransitionTime, v1NodeCondition.lastTransitionTime) &&
        Objects.equals(this.message, v1NodeCondition.message) &&
        Objects.equals(this.reason, v1NodeCondition.reason) &&
        Objects.equals(this.status, v1NodeCondition.status) &&
        Objects.equals(this.type, v1NodeCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastHeartbeatTime, lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeCondition {\n");
    
    sb.append("    lastHeartbeatTime: ").append(toIndentedString(lastHeartbeatTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

