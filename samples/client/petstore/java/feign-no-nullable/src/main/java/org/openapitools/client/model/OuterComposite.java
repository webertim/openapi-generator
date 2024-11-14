/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OuterComposite
 */
@JsonPropertyOrder({
  OuterComposite.JSON_PROPERTY_MY_NUMBER,
  OuterComposite.JSON_PROPERTY_MY_STRING,
  OuterComposite.JSON_PROPERTY_MY_BOOLEAN
})
@javax.annotation.concurrent.Immutable
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0-SNAPSHOT")
public class OuterComposite {
  public static final String JSON_PROPERTY_MY_NUMBER = "my_number";
  @javax.annotation.Nullable
  private BigDecimal myNumber;

  public static final String JSON_PROPERTY_MY_STRING = "my_string";
  @javax.annotation.Nullable
  private String myString;

  public static final String JSON_PROPERTY_MY_BOOLEAN = "my_boolean";
  @javax.annotation.Nullable
  private Boolean myBoolean;

  public OuterComposite() {
  }

  public OuterComposite myNumber(@javax.annotation.Nullable BigDecimal myNumber) {
    
    this.myNumber = myNumber;
    return this;
  }

  /**
   * Get myNumber
   * @return myNumber
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMyNumber() {
    return myNumber;
  }


  @JsonProperty(JSON_PROPERTY_MY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMyNumber(@javax.annotation.Nullable BigDecimal myNumber) {
    this.myNumber = myNumber;
  }


  public OuterComposite myString(@javax.annotation.Nullable String myString) {
    
    this.myString = myString;
    return this;
  }

  /**
   * Get myString
   * @return myString
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMyString() {
    return myString;
  }


  @JsonProperty(JSON_PROPERTY_MY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMyString(@javax.annotation.Nullable String myString) {
    this.myString = myString;
  }


  public OuterComposite myBoolean(@javax.annotation.Nullable Boolean myBoolean) {
    
    this.myBoolean = myBoolean;
    return this;
  }

  /**
   * Get myBoolean
   * @return myBoolean
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MY_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isMyBoolean() {
    return myBoolean;
  }


  @JsonProperty(JSON_PROPERTY_MY_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMyBoolean(@javax.annotation.Nullable Boolean myBoolean) {
    this.myBoolean = myBoolean;
  }


  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterComposite {\n");
    sb.append("    myNumber: ").append(toIndentedString(myNumber)).append("\n");
    sb.append("    myString: ").append(toIndentedString(myString)).append("\n");
    sb.append("    myBoolean: ").append(toIndentedString(myBoolean)).append("\n");
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

