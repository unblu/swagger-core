/*
 * 
 * 
 *
 * 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.models.links;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.headers.Headers;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Link
 *
 * @link https://github.com/OAI/OpenAPI-Specification/blob/3.0.0-rc0/versions/3.0.md#linkObject
 */

public class Link {
  @JsonProperty("href")
  private String href = null;
  @JsonProperty("operationId")
  private String operationId = null;
  @JsonProperty("parameters")
  private LinkParameters parameters = null;
  @JsonProperty("headers")
  private Headers headers = null;
  @JsonProperty("description")
  private String description = null;
  private java.util.Map<String, Object> extensions = null;

  /**
   * returns the href property from a Link instance.
   *
   * @return String href
   **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Link href(String href) {
    this.href = href;
    return this;
  }

  /**
   * returns the operationId property from a Link instance.
   *
   * @return String operationId
   **/
  @ApiModelProperty(value = "")
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public Link operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * returns the parameters property from a Link instance.
   *
   * @return LinkParameters parameters
   **/
  @ApiModelProperty(value = "")
  public LinkParameters getParameters() {
    return parameters;
  }

  public void setParameters(LinkParameters parameters) {
    this.parameters = parameters;
  }

  public Link parameters(LinkParameters parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * returns the headers property from a Link instance.
   *
   * @return Headers headers
   **/
  @ApiModelProperty(value = "")
  public Headers getHeaders() {
    return headers;
  }

  public void setHeaders(Headers headers) {
    this.headers = headers;
  }

  public Link headers(Headers headers) {
    this.headers = headers;
    return this;
  }

  /**
   * returns the description property from a Link instance.
   *
   * @return String description
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Link description(String description) {
    this.description = description;
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.href, link.href) &&
        Objects.equals(this.operationId, link.operationId) &&
        Objects.equals(this.parameters, link.parameters) &&
        Objects.equals(this.headers, link.headers) &&
        Objects.equals(this.description, link.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, operationId, parameters, headers, description);
  }


  public java.util.Map<String, Object> getExtensions() {
    return extensions;
  }

  public void addExtension(String name, Object value) {
    if(this.extensions == null) {
      this.extensions = new java.util.HashMap<>();
    }
    this.extensions.put(name, value);
  }

  public void setExtensions(java.util.Map<String, Object> extensions) {
    this.extensions = extensions;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
