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
 * CardDetail
 */

public class CardDetail {
  
  private AllOfCardDetailCurrentLimit currentLimit = null;

  
  private String displayNumber = null;

  
  private String type = null;

  /**
   * Indicates the status of the card.   * &#x60;ACTIVE&#x60; -  The card is in an active state and the customer can operate with it.   * &#x60;BLOCKED&#x60; - The card is blocked and the customer cannot used it. 
   */

  private StatusEnum status = null;

  private AllOfCardDetailPotentialLimit potentialLimit = null;

  private AllOfCardDetailLowerLimit lowerLimit = null;

  private AllOfCardDetailNextIncrease nextIncrease = null;

  private AllOfCardDetailPeriod period = null;

   /**
   * Available money in the credit card.
   * @return currentLimit
  **/
  public AllOfCardDetailCurrentLimit getCurrentLimit() {
    return currentLimit;
  }

  public void setCurrentLimit(AllOfCardDetailCurrentLimit currentLimit) {
    this.currentLimit = currentLimit;
  }

   /**
   * Card number anonymized
   * @return displayNumber
  **/
  public String getDisplayNumber() {
    return displayNumber;
  }

  public void setDisplayNumber(String displayNumber) {
    this.displayNumber = displayNumber;
  }

   /**
   * Indicates the card type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

   /**
   * Indicates the status of the card.   * &#x60;ACTIVE&#x60; -  The card is in an active state and the customer can operate with it.   * &#x60;BLOCKED&#x60; - The card is blocked and the customer cannot used it. 
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * Final limit in the credit card.
   * @return potentialLimit
  **/
  public AllOfCardDetailPotentialLimit getPotentialLimit() {
    return potentialLimit;
  }

  public void setPotentialLimit(AllOfCardDetailPotentialLimit potentialLimit) {
    this.potentialLimit = potentialLimit;
  }

   /**
   * indicates the lowest amount that can be given.
   * @return lowerLimit
  **/
  public AllOfCardDetailLowerLimit getLowerLimit() {
    return lowerLimit;
  }

  public void setLowerLimit(AllOfCardDetailLowerLimit lowerLimit) {
    this.lowerLimit = lowerLimit;
  }

   /**
   * Available money in the credit card.
   * @return nextIncrease
  **/
  public AllOfCardDetailNextIncrease getNextIncrease() {
    return nextIncrease;
  }

  public void setNextIncrease(AllOfCardDetailNextIncrease nextIncrease) {
    this.nextIncrease = nextIncrease;
  }

   /**
   * Indicates the period detail
   * @return period
  **/
  public AllOfCardDetailPeriod getPeriod() {
    return period;
  }

  public void setPeriod(AllOfCardDetailPeriod period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDetail cardDetail = (CardDetail) o;
    return Objects.equals(this.currentLimit, cardDetail.currentLimit) &&
        Objects.equals(this.displayNumber, cardDetail.displayNumber) &&
        Objects.equals(this.type, cardDetail.type) &&
        Objects.equals(this.status, cardDetail.status) &&
        Objects.equals(this.potentialLimit, cardDetail.potentialLimit) &&
        Objects.equals(this.lowerLimit, cardDetail.lowerLimit) &&
        Objects.equals(this.nextIncrease, cardDetail.nextIncrease) &&
        Objects.equals(this.period, cardDetail.period);
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
