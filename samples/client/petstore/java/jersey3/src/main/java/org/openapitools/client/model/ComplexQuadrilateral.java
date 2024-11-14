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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import org.openapitools.client.JSON;


/**
 * ComplexQuadrilateral
 */
@JsonPropertyOrder({
  ComplexQuadrilateral.JSON_PROPERTY_SHAPE_TYPE,
  ComplexQuadrilateral.JSON_PROPERTY_QUADRILATERAL_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0-SNAPSHOT")
public class ComplexQuadrilateral {
  public static final String JSON_PROPERTY_SHAPE_TYPE = "shapeType";
  @jakarta.annotation.Nonnull
  private String shapeType;

  public static final String JSON_PROPERTY_QUADRILATERAL_TYPE = "quadrilateralType";
  @jakarta.annotation.Nonnull
  private String quadrilateralType;

  public ComplexQuadrilateral() { 
  }

  public ComplexQuadrilateral shapeType(@jakarta.annotation.Nonnull String shapeType) {
    this.shapeType = shapeType;
    return this;
  }

  /**
   * Get shapeType
   * @return shapeType
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_SHAPE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShapeType() {
    return shapeType;
  }


  @JsonProperty(JSON_PROPERTY_SHAPE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShapeType(@jakarta.annotation.Nonnull String shapeType) {
    this.shapeType = shapeType;
  }


  public ComplexQuadrilateral quadrilateralType(@jakarta.annotation.Nonnull String quadrilateralType) {
    this.quadrilateralType = quadrilateralType;
    return this;
  }

  /**
   * Get quadrilateralType
   * @return quadrilateralType
   */
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_QUADRILATERAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuadrilateralType() {
    return quadrilateralType;
  }


  @JsonProperty(JSON_PROPERTY_QUADRILATERAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuadrilateralType(@jakarta.annotation.Nonnull String quadrilateralType) {
    this.quadrilateralType = quadrilateralType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public ComplexQuadrilateral putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this ComplexQuadrilateral object is equal to o.
   */
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
    sb.append("class ComplexQuadrilateral {\n");
    sb.append("    shapeType: ").append(toIndentedString(shapeType)).append("\n");
    sb.append("    quadrilateralType: ").append(toIndentedString(quadrilateralType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

