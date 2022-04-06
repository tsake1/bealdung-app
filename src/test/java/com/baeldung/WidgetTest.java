package com.baeldung;

import static org.assertj.core.api.Assertions.assertThat;

import com.baeldung.pattern.Widget;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(
    classes = SpringBootRestApplication.class
)
@AutoConfigureMockMvc
public class WidgetTest {

  @Autowired
  private MockMvc mvc;


  @Test
  void givenTestWidget_when_then() {
    Widget testWidget = Widget.builder().name("foo").id(1).build();

    assertThat(testWidget.getName()).isEqualTo("foo");
    assertThat(testWidget.getId()).isEqualTo(1);
  }

}
