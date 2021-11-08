package com.tagadvance.icmp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
final class Xref {

  @XmlAttribute
  private String type;
  @XmlAttribute
  private String data;

  Xref() {

  }

  public String getType() {
    return type;
  }

  public String getData() {
    return data;
  }

  @Override
  public String toString() {
    return "Xref{" + "type='" + type + '\'' + ", data='" + data + '\'' + '}';
  }

}
