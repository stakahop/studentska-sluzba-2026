package me.fit.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
public class Phone {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "phone_seq")
  @SequenceGenerator(name = "phone_seq", sequenceName = "phone_seq", allocationSize = 1)
  private Long id;

  private String number;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Phone phone)) return false;
    return Objects.equals(id, phone.id) && Objects.equals(number, phone.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number);
  }

  @Override
  public String toString() {
    return "Phone{" +
      "id=" + id +
      ", number='" + number + '\'' +
      '}';
  }
}
