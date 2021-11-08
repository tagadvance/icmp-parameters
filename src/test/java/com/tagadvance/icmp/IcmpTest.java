package com.tagadvance.icmp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IcmpTest {

  @BeforeEach
  void beforeEach() {

  }

  @Test
  void test() throws IOException {
    final var registry =
        Icmp.getAllRegistries().get("icmp-parameters-ext-class-2-if-roles");

    assertNotNull(registry);
  }

}
