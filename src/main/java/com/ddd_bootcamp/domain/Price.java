package com.ddd_bootcamp.domain;

import java.math.BigDecimal;
import java.util.Currency;

public class Price {

    private final BigDecimal amount;
    private final Currency currency;

    public Price(BigDecimal amount) {
        this.amount = amount;
        this.currency = Currency.getInstance("USD");
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}
