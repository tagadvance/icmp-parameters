package com.tagadvance.icmp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
final class Range {

  @XmlElement
  private String value;
  @XmlElement(name = "registration_rule")
  private String registrationRule;

  Range() {

  }

  public String getValue() {
    return value;
  }

  public String registrationRule() {
    return registrationRule;
  }

  @Override
  public String toString() {
    return "Range{" + "value='" + value + '\'' + ", registrationRule='"
        + registrationRule + '\'' + '}';
  }
}