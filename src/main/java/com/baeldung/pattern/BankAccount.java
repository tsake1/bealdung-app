package com.baeldung.pattern;

import lombok.extern.slf4j.Slf4j;

public class BankAccount {

  private String name;
  private String accountNumber;
  private String email;
  private boolean newsletter;

  public BankAccount(BankAccountBuilder builder) {
    this.name = builder.name;
    this.accountNumber = builder.accountNumber;
    this.email = builder.email;
    this.newsletter = builder.newsletter;
  }

  @Slf4j
  public static class BankAccountBuilder {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    public BankAccountBuilder(String name, String accountNumber) {
      this.name = name;
      this.accountNumber = accountNumber;
    }

    public BankAccountBuilder withEmail(String email) {
      this.email = email;
      return this;
    }

    public BankAccountBuilder wantNewsletter(boolean newsletter) {
      this.newsletter = newsletter;
      return this;
    }

    public BankAccount build() {
      log.info("created");
      return new BankAccount(this);
    }
  }

}
