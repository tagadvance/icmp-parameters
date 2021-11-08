package com.tagadvance.icmp;

import java.time.LocalDate;
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
final class Registry {

  @XmlElement
  private String title;
  @XmlElement
  private String updated;
  @XmlAttribute
  private String id;
  @XmlElement(name = "xref")
  List<Xref> references;
  @XmlElement(name = "registration_rule")
  private String registrationRule;
  @XmlElement
  private String note;
  @XmlElement(name = "registry")
  private List<Registry> registries;
  @XmlElement(name = "range")
  private List<Range> ranges;
  @XmlElement(name = "records")
  private List<Record> records;
  @XmlElement
  private People people;

  Registry() {

  }

  public String getTitle() {
    return title;
  }

  public Optional<LocalDate> getUpdated() {
    if (updated == null) {
      return Optional.empty();
    }

    final var updated = LocalDate.parse(this.updated);

    return Optional.ofNullable(updated);
  }

  public String getId() {
    return id;
  }

  public Stream<Xref> getExternalReferences() {
    return Optional.ofNullable(references).orElseGet(Arrays::asList).stream();
  }

  public Optional<String> getRegistrationRule() {
    return Optional.ofNullable(registrationRule);
  }

  public Optional<String> getNote() {
    return Optional.ofNullable(note);
  }

  public Stream<Registry> getRegistries() {
    return Optional.ofNullable(registries).orElseGet(Arrays::asList).stream();
  }

  public Stream<Range> getRanges() {
    return Optional.ofNullable(ranges).orElseGet(Arrays::asList).stream();
  }

  public Stream<Record> getRecords() {
    return Optional.ofNullable(records).orElseGet(Arrays::asList).stream();
  }

  @Override
  public String toString() {
    return "Registry{" + "title='" + title + '\'' + ", updated='" + updated
        + '\'' + ", id='" + id + '\'' + ", references=" + references
        + ", registrationRule='" + registrationRule + '\'' + ", note='" + note
        + '\'' + ", registries=" + registries + ", ranges=" + ranges
        + ", records=" + records + ", people=" + people + '}';
  }

}