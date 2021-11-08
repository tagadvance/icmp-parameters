package com.tagadvance.icmp;

import java.io.IOException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;


/**
 * @see <a href="https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml">Internet Control Message Protocol (ICMP) Parameters</a>
 */
public class RegistryFactory {

  private static final Registry registry = createRegistry();

  private RegistryFactory() {
  }

  public static final Registry getRegistry() {
    return registry;
  }

  private static Registry createRegistry() {
    final var name = "/icmp-parameters.xml";
    try (final var in = RegistryFactory.class.getResourceAsStream(name)) {
      JAXBContext jContext =
          JAXBContext.newInstance(Registry.class, Xref.class);
      final var unmarshaller = jContext.createUnmarshaller();
      return (Registry) unmarshaller.unmarshal(in);
    } catch (IOException | JAXBException e) {
      throw new IllegalStateException(e);
    }
  }

}
