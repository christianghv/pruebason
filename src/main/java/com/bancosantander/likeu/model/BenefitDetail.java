/*
 * Credits
 * The Credits API provides information about customer credit lines.
 *
 * OpenAPI spec version: 2.2.0
 * Contact: gipinacho@santander.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.bancosantander.likeu.model;

import java.util.Objects;
/**
 * BenefitDetail
 */

public class BenefitDetail {

  private java.util.Date hiringDate = null;

  private String contractKey = null;


  private java.util.Date activationDate = null;

  private String type = null;

  /**
   * Indicates the status of the benefit.   * &#x60;INITIAL&#x60; -  Indicates the start of benefit.   * &#x60;EVALUATION&#x60; - Indicates when the benefit is in Evaluation.   * &#x60;FINAL&#x60; - Indicates the final phase of benefit. 
   */

  public enum StatusEnum {
    INITIAL("INITIAL"),
    EVALUATION("EVALUATION"),
    FINAL("FINAL");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
  }

  private StatusEnum status = null;

  private java.util.Date lastEvaluationDate = null;

  private java.util.Date cutOfDate = null;

  private CardDetail card = null;

   /**
   * This date specifies the date of contracting the benefit. [ISO 8601] (https://www.iso.org/iso-8601-date-and-time-format.html
   * @return hiringDate
  **/
  
  public java.util.Date getHiringDate() {
    return hiringDate;
  }

  public void setHiringDate(java.util.Date hiringDate) {
    this.hiringDate = hiringDate;
  }

   /**
   * Indicates the key contract for the benefit
   * @return contractKey
  **/
  public String getContractKey() {
    return contractKey;
  }

  public void setContractKey(String contractKey) {
    this.contractKey = contractKey;
  }

   /**
   * This date specifies the date of activation of the benefit. [ISO 8601] (https://www.iso.org/iso-8601-date-and-time-format.html
   * @return activationDate
  **/
  public java.util.Date getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(java.util.Date activationDate) {
    this.activationDate = activationDate;
  }

   /**
   * Indicates the benefit type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

   /**
   * Indicates the status of the benefit.   * &#x60;INITIAL&#x60; -  Indicates the start of benefit.   * &#x60;EVALUATION&#x60; - Indicates when the benefit is in Evaluation.   * &#x60;FINAL&#x60; - Indicates the final phase of benefit. 
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * Indicates the last evaluation date for the benefit.[ISO 8601] (https://www.iso.org/iso-8601-date-and-time-format.html
   * @return lastEvaluationDate
  **/
  public java.util.Date getLastEvaluationDate() {
    return lastEvaluationDate;
  }

  public void setLastEvaluationDate(java.util.Date lastEvaluationDate) {
    this.lastEvaluationDate = lastEvaluationDate;
  }

   /**
   * This date specifies the date of finish of the benefit. [ISO 8601] (https://www.iso.org/iso-8601-date-and-time-format.html
   * @return cutOfDate
  **/
  public java.util.Date getCutOfDate() {
    return cutOfDate;
  }

  public void setCutOfDate(java.util.Date cutOfDate) {
    this.cutOfDate = cutOfDate;
  }

   /**
   * Get card
   * @return card
  **/
  public CardDetail getCard() {
    return card;
  }

  public void setCard(CardDetail card) {
    this.card = card;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitDetail benefitDetail = (BenefitDetail) o;
    return Objects.equals(this.hiringDate, benefitDetail.hiringDate) &&
        Objects.equals(this.contractKey, benefitDetail.contractKey) &&
        Objects.equals(this.activationDate, benefitDetail.activationDate) &&
        Objects.equals(this.type, benefitDetail.type) &&
        Objects.equals(this.status, benefitDetail.status) &&
        Objects.equals(this.lastEvaluationDate, benefitDetail.lastEvaluationDate) &&
        Objects.equals(this.cutOfDate, benefitDetail.cutOfDate) &&
        Objects.equals(this.card, benefitDetail.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hiringDate, contractKey, activationDate, type, status, lastEvaluationDate, cutOfDate, card);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitDetail {\n");
    
    sb.append("    hiringDate: ").append(toIndentedString(hiringDate)).append("\n");
    sb.append("    contractKey: ").append(toIndentedString(contractKey)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastEvaluationDate: ").append(toIndentedString(lastEvaluationDate)).append("\n");
    sb.append("    cutOfDate: ").append(toIndentedString(cutOfDate)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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