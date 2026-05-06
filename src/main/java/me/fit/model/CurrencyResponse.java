package me.fit.model;

import java.util.Objects;

public class CurrencyResponse {
  public String from;
  public String to;
  public double rate;
  public String date;
  public String source;
  public double value;
  public double totalValue;

  CurrencyResponse(String from, String to, double rate, String date, String source, double value, double totalValue) {
    this.from = from;
    this.to = to;
    this.rate = rate;
    this.date = date;
    this.source = source;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public double getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(double totalValue) {
    this.totalValue = totalValue;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof CurrencyResponse response)) return false;
    return Double.compare(rate, response.rate) == 0 && Double.compare(value, response.value) == 0 && Double.compare(totalValue, response.totalValue) == 0 && Objects.equals(from, response.from) && Objects.equals(to, response.to) && Objects.equals(date, response.date) && Objects.equals(source, response.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, rate, date, source, value, totalValue);
  }

  @Override
  public String toString() {
    return "CurrencyResponse{" +
      "from='" + from + '\'' +
      ", to='" + to + '\'' +
      ", rate=" + rate +
      ", date='" + date + '\'' +
      ", source='" + source + '\'' +
      ", value=" + value +
      ", totalValue=" + totalValue +
      '}';
  }
}
