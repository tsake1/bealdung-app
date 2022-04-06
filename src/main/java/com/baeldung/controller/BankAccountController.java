package com.baeldung.controller;

import com.baeldung.pattern.BankAccount;
import com.baeldung.pattern.Widget;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController {

  BankAccount newAccount = new BankAccount
    .BankAccountBuilder("Jon", "22738022275")
    .withEmail("jon@example.com")
    .wantNewsletter(true)
    .build();

}
