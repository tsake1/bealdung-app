package com.baeldung.pattern;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Widget {

  private final String name;
  private final int id;
}
