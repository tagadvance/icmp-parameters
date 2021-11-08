package com.tagadvance.icmp;

import java.util.List;
import java.util.stream.Stream;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
final class People {

  @XmlElement(name = "person")
  private List<Person> people;

  public Stream<Person> getPeople() {
    return people.stream();
  }

  @Override
  public String toString() {
    return "People{" + "people=" + people + '}';
  }

}