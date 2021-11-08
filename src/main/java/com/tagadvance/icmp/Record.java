package com.tagadvance.icmp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
final class Record {

  @XmlAttribute
  private String date;
  @XmlElement
  private String value;
  @XmlElement
  private String description;
  @XmlElement(name = "xref")
  List<Xref> references;

  Record() {

  }

  public Optional<String> getDate() {
    return Optional.ofNullable(date);
  }

  public String getValue() {
    return value;
  }

  public String getDescription() {
    return description;
  }

  public Stream<Xref> getReferences() {
    return Optional.ofNullable(references).orElseGet(Arrays::asList).stream();
  }

  @Override
  public String toString() {
    return "Record{" + "value='" + value + '\'' + ", description='"
        + description + '\'' + ", references=" + references + '}';
  }

}