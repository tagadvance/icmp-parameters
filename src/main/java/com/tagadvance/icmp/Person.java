package com.tagadvance.icmp;

import java.util.Optional;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
final class Person {

  @XmlAttribute
  private String id;
  @XmlElement
  private String name;
  @XmlElement
  private String uri;
  @XmlElement
  private String updated;

  public String getId() {
    return id;
  }

  public Optional<String> getName() {
    return Optional.ofNullable(name);
  }

  public Optional<String> getUri() {
    return Optional.ofNullable(uri);
  }

  public Optional<String> getUpdated() {
    return Optional.ofNullable(updated);
  }

  @Override
  public String toString() {
    return "Person{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", uri='"
        + uri + '\'' + ", updated='" + updated + '\'' + '}';
  }

}